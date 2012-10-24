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
        greed.roll(new int[] {2, 3, 4, 6, 2});
        assertThat(greed.score(), equalTo(0));
    }
}
