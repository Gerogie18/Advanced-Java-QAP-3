package Problem1;

public class Teacher extends Person {
    protected String mySubject;
    protected double mySalary;

    public Teacher (String name, int age, String gender, String subject, double salary) {
        super (name, age, gender);
        this.mySubject = subject;
        if (salary >= 0) {
            this.mySalary = salary;
        }else {
            throw new IllegalArgumentException("Salary must be larger than 0");
        }
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public double getMySalary() {
        return mySalary;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "mySubject='" + mySubject + '\'' +
                ", mySalary=" + String.format("%.2f", mySalary) +
                "} " + super.toString();
    }
}
