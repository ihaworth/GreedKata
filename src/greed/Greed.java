package greed;

public class Greed
{
    private static final int MAX_FACE_VALUE = 6;

    private int[] rolls;
    private int[] faceValueCounts;

    private int score;

    public void roll(int[] rolls)
    {
        this.rolls = rolls;
    }

    public int score()
    {
        score = 0;

        faceValueCounts = new int[MAX_FACE_VALUE + 1];

        for (int i = 0; i < rolls.length; i++)
            faceValueCounts[rolls[i]]++;

        for (int faceValue = 1; faceValue <= 5; faceValue++)
            scoreTriple(faceValue);

        score += faceValueCounts[1] * 100;
        score += faceValueCounts[5] * 50;

        return score;
    }

    private int scoreTriple(int faceValue)
    {
        if (faceValueCounts[faceValue] >= 3)
        {
            score += tripleBonus(faceValue);
            faceValueCounts[faceValue] -= 3;
        }
        return score;
    }

    private int tripleBonus(int faceValue)
    {
        if (faceValue == 1)
            return 1000;
        return faceValue * 100;
    }
}

