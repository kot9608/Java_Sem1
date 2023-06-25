package Sem5;

import java.util.HashMap;

public class Sem5_HW_2var {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.merge("Petr", "333", (o, n) -> o==null ? n:o+" "+n);
        map.merge("Ivan", "111", (o, n) -> o==null ? n:o+" "+n);
        map.merge("Ivan", "222", (o, n) -> o==null ? n:o+" "+n);

//        map.merge("Petr", "444", (o, n) -> o==null ? n:o+" "+n);
        map.merge("Ivan", "555", (o, n) -> o==null ? n:o+" "+n);




        System.out.println(map);
    }
}
