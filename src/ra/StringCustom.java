package ra;

public class StringCustom {
    public static <T> String concat(T string1, T string2){
        return string1.toString() +"-"+ string2.toString();
    }
}
