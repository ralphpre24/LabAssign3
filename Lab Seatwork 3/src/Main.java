public class Main {
    public static void main(String[] args) {
        // Create Adaptee Objects
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        // Create Adapter Objects
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        // Integrate Systems
        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }
}