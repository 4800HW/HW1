package Aggregation;

public class driver {
    
    public static void main(String[] args)
    {
        Instructor instructor = new Instructor("Nima", "Davarpanah", 50);
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course course = new Course("Software Engineering", instructor, textbook);
        course.printInfo();
    }
}
