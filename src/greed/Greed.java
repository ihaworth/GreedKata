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

        score += faceValueCounts[1] * 100;
        score += faceValueCounts[5] * 50;

        return score;
    }
}
