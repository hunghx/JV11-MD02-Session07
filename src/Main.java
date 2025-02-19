import ra.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // vi dụ về Wrapper Class : lớp bao bọc
        int a = 10; // primitives
        Integer b = Integer.valueOf(a); // non-primitives - autoboxing
        float c ;
        Float f = 5.7f;
        c = f.floatValue();// unboxing


        // autoboxing (tự dộng bao boc), unboxing (mở bao bọc)

        // khởi tao dối tượng manager
        CRUDManager<Course> courseCRUDManager = new CRUDManager<>();
        CRUDManager<Classes> classesCRUDManager = new CRUDManager<>();
        CRUDManager<Student> studentCRUDManager = new CRUDManager<>();

        System.out.println(StringCustom.concat("Hung", "Ho"));
        System.out.println(StringCustom.concat(2,2));
        System.out.println(StringCustom.concat(2.2,2.2));
        System.out.println(StringCustom.concat(true, false));
        System.out.println(StringCustom.concat(new Date(), new Date()));
    }
}