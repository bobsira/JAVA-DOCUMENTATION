package chp18;

/**
 * Created by bobsira on 7/19/17.
 */
public class Student {
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
}
