package demos;

import Problem1.*;

public class Demo1 {
    public static void main(String[] args) {
        Person personExample = new Person("Wanda Smythe", 29, "F");
        Student studentExample = new Student("Paige Lyndsey", 16, "X", 4378642, 2.7f);
        Teacher teacherExample = new Teacher("Ted Wong", 32, "M","Chemistry", 50000.0);
        CollegeStudent collegeStudentExample = new CollegeStudent("Wendy Baker", 21, "F", 123533, 3.5f, "Anthropology", 1);

        System.out.println();
        System.out.println(personExample);
        System.out.println();
        System.out.println(studentExample);
        System.out.println();
        System.out.println(teacherExample);
        System.out.println();
        System.out.println(collegeStudentExample);
    }

}