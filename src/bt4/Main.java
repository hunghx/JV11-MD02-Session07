package bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        System.out.println("Trươc khi sap xep");
        studentManagement.showAll();

        studentManagement.sortByScore();

        System.out.println("Trươc sau sap xep");
        studentManagement.showAll();
        // Nhap thong tin sinh viên
        Student s = new Student();
        s.setStudentId(studentManagement.getNewStudentId());
        s.inputData(new Scanner(System.in));

        studentManagement.addStudent(s);
        studentManagement.showAll();

    }
}
