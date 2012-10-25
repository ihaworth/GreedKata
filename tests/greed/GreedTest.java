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

    @Test
    public void aSingleOneOnTheSecondDieScores100()
    {
        roll(3, 1, 4, 6, 2);
        assertThatScoreIs(100);
    }

    @Test
    public void twoOnesScore200()
    {
        roll(1, 1, 4, 6, 2);
        assertThatScoreIs(200);
    }

    @Test
    public void aSingleFiveScores50()
    {
        roll(5, 3, 4, 6, 2);
        assertThatScoreIs(50);
    }

    @Test
    public void tripleOnesScore1000()
    {
        roll(1, 1, 1, 6, 2);
        assertThatScoreIs(1000);
    }

    @Test
    public void fourOnesScore1100()
    {
        roll(1, 1, 1, 1, 2);
        assertThatScoreIs(1100);
    }

    @Test
    public void tripleTwosScore200()
    {
        roll(2, 2, 2, 6, 3);
        assertThatScoreIs(200);
    }

    @Test
    public void tripleThreesScore300()
    {
        roll(3, 3, 3, 6, 2);
        assertThatScoreIs(300);
    }

    @Test
    public void tripleFoursScore400()
    {
        roll(4, 4, 4, 6, 2);
        assertThatScoreIs(400);
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
