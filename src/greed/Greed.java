package greed;

public class Greed
{
    private int[] rolls;

    public void roll(int[] rolls)
    {
        this.rolls = rolls;
    }

    public int score()
    {
        if (rolls[0] == 1)
            return 100;
        if (rolls[1] == 1)
            return 100;
        return 0;
    }
}
