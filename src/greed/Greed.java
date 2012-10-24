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
        for (int i = 0; i < rolls.length; i++)
            if (rolls[i] == 1)
                return 100;

        return 0;
    }
}
