public class Main {
    public static void main(String[] args) {
        // Create GraduateStudent object
        GraduateStudent gs = new GraduateStudent(
            "Alice", 24, 101, 89.5, "Computer Science"
        );

        // Display complete details
        System.out.println("Graduate Student Details:");
        gs.displayGraduateStudent();
    }
}
