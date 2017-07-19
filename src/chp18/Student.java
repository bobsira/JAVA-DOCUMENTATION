package chp18;


import java.util.Comparator;

/**
 * Created by bobsira on 7/19/17.
 */
public class Student implements Comparable<Student> {
    public static Comparator<Student> idComperator = new Comparator<Student>() {

        @Override
        public int compare(Student st1, Student st2) {
            return (int) (st1.getId() - st2.getId());
        }
    };
    public static Comparator<Student> currentYearComperator = new Comparator<Student>() {

        @Override
        public int compare(Student st1, Student st2) {
            return (int) (st1.getCurrentYearOfStudy() - st2.getCurrentYearOfStudy());
        }
    };
    private int id;
    private String name;
    private int currentYearOfStudy;

    public Student(int id, String name, int currentYearOfStudy) {
        this.id = id;
        this.name = name;
        this.currentYearOfStudy = currentYearOfStudy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCurrentYearOfStudy() {
        return currentYearOfStudy;
    }

    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name
                + ", Current Year Of Study=" + this.currentYearOfStudy + "]";
    }

    @Override
    public int compareTo(Student stud) {
        return (this.id - stud.id);
    }
}
