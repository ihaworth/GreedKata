package greed;

public class Greed
{
    private static final int MAX_FACE_VALUE = 6;

    private int[] rolls;

    public void roll(int[] rolls)
    {
        this.rolls = rolls;
    }

    public int score()
    {
        int score = 0;

        int[] faceValueCounts = new int[MAX_FACE_VALUE + 1];

        for (int i = 0; i < rolls.length; i++)
            faceValueCounts[rolls[i]]++;

        if (faceValueCounts[1] >= 3)
        {
            score += 1000;
            faceValueCounts[1] -= 3;
        }

        if (faceValueCounts[2] >= 3)
        {
            score += 200;
            faceValueCounts[2] -= 3;
        }

        score += faceValueCounts[1] * 100;
        score += faceValueCounts[5] * 50;

        return score;
    }
}
