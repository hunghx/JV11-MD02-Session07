package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoCollection {
    public static void main(String[] args) {
        // List Collection
        List<Integer> numbers = new ArrayList<>();
        // them phan tu va collection
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2,5);
        // list:  1, 2, 5, 3, 4
        System.out.println(numbers);
        // Thay đổi gia trị theo vi tri
        numbers.set(2, 10);
        // list:  1, 2, 10, 3, 4
        System.out.println(numbers);
        // Xoa phàn tử
        numbers.remove(Integer.valueOf(2));
        numbers.remove(2);
        //List : 1,2,3,4
        System.out.println(numbers);
        // Tim kiếm phần tuwr
        System.out.println("Phan tu 5 có ton tai trong danh sach ko : ");
        boolean check = numbers.contains(1);
        System.out.println(check);
        // Duyet danh sach
//        for (int i = 0; i < numbers.size() ; i++) {
//            System.out.println(numbers.get(i));
//        }
//        for (Integer element: numbers){
//            System.out.println(element);
//        }
//        Iterator<Integer> iter = numbers.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
        numbers.forEach((element)->{
            System.out.println(element);
        });

        // lấy ra vị trí theo giá tri
        int index = numbers.indexOf(100);
        System.out.println(" vị tri cua gia tri 10 trong list là "+ index);

        // Áp dụng cu pháp làm việc với String
    }
}
