package Problem1;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        this.myName = name;
        if (age >= 4) {
            this.myAge = age;
        } else {
            throw new IllegalArgumentException("Not of age to enroll or teach");
        }
        if (gender.length() == 1 && (gender.equalsIgnoreCase("X") ||
                gender.equalsIgnoreCase("F") ||
                gender.equalsIgnoreCase("M"))) {
            this.myGender = gender.toUpperCase();
        } else {
            throw new IllegalArgumentException("Not valid character entry, X, M and F only valid characters");
        }
    }

    protected String getMyName() {
        return myName;
    }

    protected void setMyName(String myName) {
        this.myName = myName;
    }

    protected int getMyAge() {
        return myAge;
    }

    protected void setMyAge(int myAge) {
        if (myAge >= 4) {
            this.myAge = myAge;
        } else {
            throw new IllegalArgumentException("Not of age to enroll or teach");
        }
    }

    protected String getMyGender() {
        return myGender;
    }

    protected void setMyGender(String gender) {
        if (gender.length() == 1 && (gender.equalsIgnoreCase("X") ||
                gender.equalsIgnoreCase("F") ||
                gender.equalsIgnoreCase("M"))) {
            this.myGender = gender.toUpperCase();
        } else {
            throw new IllegalArgumentException("Not valid character entry, X, M and F only valid characters");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", gender=" + myGender +
                '}';
    }
}