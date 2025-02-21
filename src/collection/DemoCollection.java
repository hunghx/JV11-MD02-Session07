package collection;

import java.util.*;

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


        Set<String> listName = new HashSet<>(); // có phải 1 Collection, h trợ trong việc xử lý trùng lặp
        listName.add("Hunghx");
        listName.add("Namtx");
        listName.add("Sonpm");
        listName.add("DongNX");
// Set ko cho phe trung lă giá trị, nếu cố tinình thêm vào thì sẽ không thực hiện

        System.out.println(listName);
        // ko hỗ trợ truy xuất theo vị trí
        // Không h trợ thay đổi giá trị theo vị trí
        // Xoa
        listName.remove("Hunghx");
        System.out.println(listName);

        List<String> listNames = new ArrayList<>(listName);
        // Map là nhanh khách của Collection , Lưu trữ cặp Key(ko trùng lặp) - Value
        Map<String, String> dirctionary = new HashMap<>();
        dirctionary.put("word", "từ vựng");
        dirctionary.put("cat", "con mèo");
        dirctionary.put("dog", "con chó");
        dirctionary.put("dog", "xúc xích"); // put dùng dể thêm va cập nhat phan tử theo key
        System.out.println(dirctionary);
        // lấy gia tri theo key
        System.out.println(dirctionary.get("cat"));
        // kiểm tra tôn tai
        System.out.println("Tư word co ton tai trong map hay ko : "+dirctionary.containsKey("word"));
        System.out.println("Nghĩa con meo ton tai trong map hay ko : "+dirctionary.containsValue("con mèo"));

        // duyệt map
        for (String key : dirctionary.keySet()){
            System.out.println(key+" : "+ dirctionary.get(key));
        }
        // dyệt value
        for (String value: dirctionary.values()){
            System.out.println(value);
        }
        // duyệt theo entry: Căp K và V
        for (Map.Entry<String, String> entry: dirctionary.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

    }
}
