package Lesson5;

import java.util.TreeMap;

public class Ex004_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();//коллекция TreeMap позволяет хранить значения парами: ключ=значение. Но, пары упорядочиваются по ключу
        tMap.put(1,"один");
        System.out.println(tMap); //{1=один}
        tMap.put(6,"шесть");
        System.out.println(tMap); //{1=один, 6=шесть}
        tMap.put(4,"четыре");
        System.out.println(tMap); //{1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три");
        System.out.println(tMap); //{1=один, 3=три, 4=четыре, 6=шесть}
//        tMap.put(2,"два");
//        System.out.println(tMap); //{1=один, 2=два, 3=три, 4=четыре, 6=шесть}
//        tMap.put(10, "10");//добавить пару ключ, значение
//        tMap.get(1);//получить пару по ключу 1
//        tMap.remove(10); //удалить пару по ключу
//        tMap.descendingKeySet(); //получить только ключи
//        tMap.descendingMap(); //показать в обратном порядке
//        tMap.tailMap(); //показать значения больше чем
//        tMap.headMap(); //показать элементы меньше чем
//        tMap.lastEntry();
//        tMap.firstEntry();
    }
}
