// Student Class
class Student {
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        setAge(age);  // validation applied here
        this.grade = grade;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    // Setter for Age with validation
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative! Setting to default 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // No direct setter for grade → must use upgradeGrade()
    public void upgradeGrade(boolean knowledgeCheck) {
        if (knowledgeCheck) {
            if (grade.equals("C")) grade = "B";
            else if (grade.equals("B")) grade = "A";
            else if (grade.equals("A")) 
                System.out.println("Already at highest grade!");
        } else {
            System.out.println("Knowledge check failed, grade not upgraded.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

// Library Class
class Library {
    private String[] books;
    private int capacity;
    private int count;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new String[capacity];
        this.count = 0;
    }

    public void addBook(String book) {
        if (count < capacity) {
            books[count++] = book;
            System.out.println(book + " added to library.");
        } else {
            System.out.println("Library full! Cannot add " + book);
        }
    }

    public void showBooks() {
        System.out.println("Library Books:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}

// Main Class
public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Divyanshi", -5, "C"); // invalid age → handled
        s1.displayInfo();

        s1.upgradeGrade(false); // knowledge check fails
        s1.upgradeGrade(true);  // passes → grade upgraded
        s1.displayInfo();

        Library lib = new Library(3);
        lib.addBook("Java Programming");
        lib.addBook("Data Structures");
        lib.addBook("OOP Concepts");
        lib.addBook("Extra Book"); // won't add, library full

        lib.showBooks();
    }
}
