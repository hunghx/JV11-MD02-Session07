package bt4interface;

public interface IStudentManagement {
    void showAll();
    void addStudent(Student student);
    void removeStudent(int studentId);
    void sortByScore();
    int getNewStudentId();
    Student findStudentById(int studentId);
    double getAverageScore();
}
