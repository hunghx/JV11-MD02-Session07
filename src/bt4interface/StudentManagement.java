package bt4interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManagement implements IStudentManagement {
    private List<Student> studentList =  new ArrayList<>();
    public StudentManagement(){
        studentList.add(new Student(1,"Nguyen Van A",9.8));
        studentList.add(new Student(5,"Nguyen Van F",8.2));
        studentList.add(new Student(2,"Nguyen Van C",7.8));
        studentList.add(new Student(4,"Nguyen Van E",7.8));
        studentList.add(new Student(3,"Nguyen Van B",8.2));
    }
    @Override
    public void showAll(){
        if (studentList.isEmpty()){
            System.out.println("-------------Danh sach trônng-------------");
            return;
        }
        // hiển thi tat ca danh sach sinh vien
        System.out.println("+---+---------------+-----+");
        System.out.printf("|%3s|%-15s|%-5s|\n","ID","NAME","AVG");
        System.out.println("+---+---------------+-----+");
        for (Student s : studentList){
            System.out.printf("|%3d|%-15s|%-5.2f|\n",s.getStudentId(),s.getStudentName(),s.getAverageScore());
            System.out.println("+---+---------------+-----+");
        }
    }
    @Override
    public void addStudent(Student student){
       studentList.add(student);
    }
    public void removeStudent(int studentId){
        Student studentDelete = findStudentById(studentId); // tìm sinh viên cần xóa
        if(studentDelete !=null){
            studentList.remove(studentDelete);
            System.out.println("Xoa thanh cong");
        }else {
            System.out.println("Ko tim thay id ");
        }
    }
    @Override
    public Student findStudentById(int studentId){
        for (Student s : studentList){
            if(s.getStudentId() == studentId){
                // day la phan tu can tim
                return s;
            }
        }
        return null;
    }
    @Override
    public  double getAverageScore(){
        double sum = 0;
        for (Student s : studentList){
            sum+= s.getAverageScore();
        }
        return sum/studentList.size();
    }
    @Override
    public void sortByScore(){
        // Cách 1 : sử dụng Interface Comparable
       // khi đ kế thưa Comparable
        Collections.sort(studentList); // phương thưc dung săn trong Collection

        // Cách 2 : Su dụng interface Comparator

//        Collections.sort(studentList, (o1,o2)->Double.compare(o1.getAverageScore(),o2.getAverageScore()));
//        Collections.sort(studentList, (o1,o2)->o1.getStudentName().compareTo(o2.getStudentName()));
//        Collections.sort(studentList, (o1,o2)->Integer.compare(o2.getStudentId(),o1.getStudentId()));
    }
@Override
    public int getNewStudentId(){
        int maxId = 0;
        for (Student s : studentList){
            if(s.getStudentId() > maxId){
                maxId = s.getStudentId();
            }
        }
        return maxId + 1;
    }
}
