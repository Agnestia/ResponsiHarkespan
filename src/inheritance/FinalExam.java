package inheritance;

public class FinalExam extends GradedActivity {
    protected int numberOfQuestions;
    protected int numberMissed;
    protected double pointsPerQuestion;

    public FinalExam(int questions, int missed) {
        // Constructor
    }

    public double getPointsPerQuestion() {
        return 0;
    }

    public int getNumberMissed() {
        return 0;
    }
}
