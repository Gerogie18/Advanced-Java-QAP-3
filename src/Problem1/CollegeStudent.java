package Problem1;

public class CollegeStudent extends Student {
    protected String myMajor;
    protected int myYear;

    public CollegeStudent (String name, int age, String gender, int id, double GPA, String major, int year) {
        super (name, age, gender, id, GPA);
        this.myMajor = major;
        if (year >= 1) {
            this.myYear = year;
        } else {
            throw new IllegalArgumentException("Year must be greater than one");
        }
    }

    public String getMyMajor() {
        return myMajor;
    }

    public void setMyMajor(String major) {
        this.myMajor = major;
    }

    public int getMyYear() {
        return myYear;
    }

    public void setMyYear(int year) {
        if (year >= 1) {
            this.myYear = year;
        } else {
            throw new IllegalArgumentException("Year must be greater than one");
        }
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "myMajor='" + myMajor + '\'' +
                ", myYear=" + myYear +
                super.toString() +
                '}';
    }
}
