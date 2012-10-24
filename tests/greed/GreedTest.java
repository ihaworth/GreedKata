package greed;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreedTest
{
    private Greed greed = new Greed();

    @Test
    public void aBadHandScoresZero()
    {
        roll(2, 3, 4, 6, 2);
        assertThatScoreIs(0);
    }

    @Test
    public void aSingleOneScores100()
    {
        roll(1, 3, 4, 6, 2);
        assertThatScoreIs(100);
    }

    private void roll(int die1, int die2, int die3, int die4, int die5)
    {
        greed.roll(new int[] {die1, die2, die3, die4, die5});
    }

    private void assertThatScoreIs(int expectedScore)
    {
        assertThat(greed.score(), equalTo(expectedScore));
    }
}
