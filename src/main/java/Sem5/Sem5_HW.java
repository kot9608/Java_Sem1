package Sem5;

import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap.
//         Программа также должна учитывать,
//         что во входной структуре будут повторяющиеся имена с разными телефонами,
//         их необходимо считать, как одного человека с разными телефонами.
//         Вывод должен быть отсортирован по убыванию числа телефонов.
public class Sem5_HW {
    public static void main(String[] args) {
//        List <String> list = new ArrayList<String>(); //это я пытался самостоятельно разобраться - не разобрался.
////        TreeMap<String, String> callbook = new HashMap<>();
//        TreeMap<String, String> callbook = new TreeMap<>();
//        callbook.put("Alex", "000");
//        String s2 = "222";
//        String s3 = "333";
////        callbook.compute();
//        callbook.compute("Alex", (key, value) -> value == null ? "0" : value + ";" + s2);
////        callbook.computeIfAbsent()
////        Map<String, List<String>>
//        System.out.println(callbook);
////        System.out.println(callbook.keySet());
////        System.out.println(callbook.values());
////        System.out.println(callbook);
////        System.out.println(callbook.get(1));
////        System.out.println(callbook.hashCode());

        HashMap<String, List<String>> map = new HashMap<>();
        mapAdd(map,"Ivan", "111");
        mapAdd(map,"Ivan", "222");
        mapAdd(map,"Petr", "333");
        mapAdd(map,"Petr", "444");
        System.out.println(map);

        ArrayList<String> list = new ArrayList<>();
        for (String s:map.keySet()) {
            list.add(s);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).size()-map.get(o2).size();
            }
        });
        System.out.println(list);
    }
    private static void mapAdd(HashMap <String, List<String>> map, String key, String value){
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }
}
