package Aggregation;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;
    
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void printInfo()
    {
        System.out.println("Course Name: " + courseName + 
        "\nInstructor: " + instructor.getFirstName() + " " + instructor.getLastName()
        + "\nOffice: " + instructor.getOfficeNumber()
        + "\nTextbook: " + textbook.getTitle()
        + "\nTextbook author " + textbook.getAuthor()
        + "\nTextbook publisher " + textbook.getPublisher());
    }
}
