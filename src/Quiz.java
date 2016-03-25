import java.util.ArrayList;

/**
 * Created by Christian on 3/25/16.
 * Quizzes can have a score between 0 and l00. Scores higher and lower are not allowed
 */
public class Quiz extends Data implements Measurable
{
    private double numGrade;
    private String letterGrade;

    /**
     * Create a new quiz with given number grade and corresponding letter grade
     * @param numGrade double between 0-100
     */
    public Quiz(double numGrade)
    {
        this.numGrade = numGrade;
        letterGrade = makeLetterGrade(numGrade);
    }

    public double getMeasure()
    {
        return numGrade;
    }

    /**
     * Assigns a letter grade value based on what the numerical grade of the quiz is.
     * @param numGrade the number grade value
     * @return the letter grade value
     */
    public String makeLetterGrade(double numGrade)
    {
        String letterGrade = "";
        try
        {
            if (numGrade < 0 || numGrade > 100 )
            {
                throw new ScoreNotValidException();
            }
        }
        catch (ScoreNotValidException e)
        {
            System.out.println("You entered an invalid test score!");
            setNumGrade(0);
        }
        if (numGrade < 70)
        {
            letterGrade = "F";
        }
        if (numGrade == 70)
        {
            letterGrade = "D";
        }
        if (isBetween(70,73,numGrade))
        {
            letterGrade = "C-";
        }
        if (isBetween(73,77,numGrade))
        {
            letterGrade = "C";
        }
        if (isBetween(76,80,numGrade))
        {
            letterGrade = "C+";
        }
        if (isBetween(79,83,numGrade))
        {
            letterGrade = "B-";
        }
        if (isBetween(82,87,numGrade))
        {
            letterGrade = "B";
        }
        if (isBetween(86,90,numGrade))
        {
            letterGrade = "B+";
        }
        if (isBetween(89,93,numGrade))
        {
            letterGrade = "A-";
        }
        if (isBetween(92,97,numGrade))
        {
            letterGrade = "A";
        }
        if (isBetween(96,101,numGrade))
        {
            letterGrade = "A+";
        }
        return letterGrade;
    }

    /**
     * determine if a number is between two other numbers
     * @param low the lowest point
     * @param high the highest point
     * @param num the check number
     * @return true if the number is between low and high
     */
    public boolean isBetween(double low, double high, double num)
    {
        if (num > low && num < high)
        {
            return true;
        }
        return false;
    }

    /**
     * get the number grade as a double
     * @return
     */
    public double getNumGrade()
    {
        return numGrade;
    }

    /**
     * get the letter grade for the quiz
     * @return
     */
    public String getLetterGrade()
    {
        return letterGrade;
    }

    /**
     * set the numerical grade
     * @param score
     */
    public void setNumGrade(double score)
    {
        numGrade = score;
    }

    /**
     * create four quizzes and display the highest score and the average score
     * @param args
     */
    public static void main(String[] args)
    {
        Quiz q1 = new Quiz(-1);
        Quiz q2 = new Quiz(81);
        Quiz q3 = new Quiz(90);
        Quiz q4 = new Quiz(100);
        Measurable[] quizzes = new Measurable[]{q1,q2,q3,q4};
        System.out.println("The letter grade for q2 is: " + q2.makeLetterGrade(q2.getNumGrade()));
        System.out.println("The average score is: " + average(quizzes));
        System.out.println("The highest score is: " + Quiz.toString(max(quizzes)));
    }

    /**
     * Returns a string version of the quiz object that contains the number grade and the letter grade
     * @param m measurable object
     * @return
     */
    public static String toString(Measurable m)
    {
        Quiz q = (Quiz) m;
        return Double.toString(q.getNumGrade()) + " " + q.getLetterGrade();

    }
}

