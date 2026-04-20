class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Student extends Person {
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int age, int rollNumber, double marks) {
        super(name, age); // Call to base class constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    void displayStudent() {
        displayPerson(); // inherited method
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

// Further derived class
class GraduateStudent extends Student {
    String specialization;

    // Constructor
    GraduateStudent(String name, int age, int rollNumber, double marks, String specialization) {
        super(name, age, rollNumber, marks); // call Student constructor
        this.specialization = specialization;
    }

    // Method to display graduate student details
    void displayGraduateStudent() {
        displayStudent(); // inherited method
        System.out.println("Specialization: " + specialization);
    }
}
