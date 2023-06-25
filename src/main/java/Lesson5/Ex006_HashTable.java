package Lesson5;

import java.util.Hashtable;
import java.util.Map;

public class Ex006_HashTable {
    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();//устаревший брат коллекции HashMap - единственный плюс - не может хранить null в ключе. Но и в этом случае, лучше в HashMap реализовать доп. проверку, чем использовать Hashtable
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table);//{2=один, 1=два, 11=один один}
        //table.put(null,"один") //упадет в ошибку
    }
}
