import java.util.*;

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) System.out.println(" - " + d.name);
        System.out.println("Faculties:");
        for (Faculty f : faculties) System.out.println(" - " + f.name);
    }

    // Composition: deleting university deletes departments
    void deleteUniversity() {
        departments.clear(); // Departments gone with university
        System.out.println("University " + name + " deleted. Departments removed.");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        University u = new University("GLA University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Electrical");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Brown");

        u.addDepartment(d1);
        u.addDepartment(d2);
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showDetails();
        u.deleteUniversity(); // removes departments
        u.showDetails();      // faculties still exist
    }
}
