package greed;

public class Greed
{
    private static final int MAX_FACE_VALUE = 6;

    private int[] faceValueCounts = new int[MAX_FACE_VALUE + 1];
    private int score = 0;

    public void roll(int[] rolls)
    {
        countDice(rolls);
    }

    private void countDice(int[] rolls)
    {
        for (int i = 0; i < rolls.length; i++)
            faceValueCounts[rolls[i]]++;
    }

    public int score()
    {
        scoreTriples();
        scoreSingleOnes();
        scoreSingleFives();

        return score;
    }

    private void scoreTriples()
    {
        for (int faceValue = 1; faceValue <= MAX_FACE_VALUE; faceValue++)
            scoreTriple(faceValue);
    }

    private int scoreTriple(int faceValue)
    {
        if (triplePresent(faceValue))
        {
            score += tripleBonus(faceValue);
            faceValueCounts[faceValue] -= 3;
        }
        return score;
    }

    private boolean triplePresent(int faceValue)
    {
        return faceValueCounts[faceValue] >= 3;
    }

    private int tripleBonus(int faceValue)
    {
        if (faceValue == 1)
            return 1000;
        return faceValue * 100;
    }

    private void scoreSingleOnes()
    {
        score += faceValueCounts[1] * 100;
    }

    private void scoreSingleFives()
    {
        score += faceValueCounts[5] * 50;
    }
}
