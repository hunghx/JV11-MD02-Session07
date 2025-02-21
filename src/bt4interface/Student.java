package bt4interface;

import java.util.Scanner;

public class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student that) {
        /// chi ra so sanh theo cái gì
        if(this.getAverageScore() > that.getAverageScore()){
            return -1;
        }else if (this.getAverageScore() < that.getAverageScore()){
            return 1;
        }else {
            // chỉ đinh tiêu chí thứ 2 nếu tiêu chí 1 ko đung nx
            return Integer.compare(that.getStudentId(), this.getStudentId());
        }
//        return Double.compare(this.getAverageScore(),that.getAverageScore());
    }

    private int studentId;
    private String studentName;
    private double averageScore;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(int studentId, String studentName, double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageScore = averageScore;
    }

    public Student() {
    }

    public void inputData(Scanner scanner){
        System.out.println("Nhap name : ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhap DTB : ");
        this.averageScore = Double.parseDouble(scanner.nextLine());
    }
}
