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
        int score = 0;

        for (int i = 0; i < rolls.length; i++)
            if (rolls[i] == 1)
                score += 100;

        return score;
    }
}
