package inheritance;

public class GradedActivity {
    protected double score;
    protected String name;

    public GradedActivity() {
        // Default constructor
    }

    public GradedActivity(String n) {
        this.name = n;
    }

    public void setScore(double s) {
        this.score = s;
    }

    public double getScore() {
        return this.score;
    }

    public char getGrade() {
        return ' ';
    }
}
