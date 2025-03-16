package Problem1;

public class Student extends Person {

    protected int myIdNum;
    protected double myGPA;

    public Student (String name, int age, String gender, int idNum, double GPA) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = GPA;
    }

    public int getMyIdNum() {
        return myIdNum;
    }

    public void setMyIdNum(int myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "  Id:" + myIdNum +
                ", GPA:" + myGPA +
                super.toString();
    }
}
