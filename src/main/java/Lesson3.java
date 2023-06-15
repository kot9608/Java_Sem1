import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class Lesson3 {
//    public static void main(String[] args) {
//        Object o =1; GetType(o);
//        o=1.2; GetType(o);
//    }
//    static void GetType(Object obj) {
//        System.out.println(obj.getClass().getName());
//    }

//    public static void main(String[] args) {
//        System.out.println(Sum(1, 2));
//        System.out.println(Sum(1.0, 2));
//    }
//    static Object Sum(Object a, Object b) {
//        if (a instanceof Double && b instanceof Double) {
//            return (Object) ((double) a + (double) b);
//        } else if (a instanceof Integer && b instanceof Integer) {
//                return (Object) ((Integer)a + (Integer) b);
//        } else return 0;
//    }

//        public static void main(String[] args) {
//        int[] a = new int[]{1, 9};
//        int[] b = new int[3];
//        System.arraycopy(a, 0, b, 0, a.length);
//        for (int i : a) {System.out.printf("%d ", i);}
//        System.out.println();
//        for (int j : b) {System.out.printf("%d ", j);}
//    }

//static int[] AddItem(int[] array, int item) {
//    int length = array.length;
//    int[] temp = new int[length + 1];
//    System.arraycopy(array, 0, temp, 0, length);
//    temp[length] = item;
//    return temp;
//}
//
//    public static void main(String[] args) {
//        int[] a = new int[]{0, 9};
//        for (int i : a) {System.out.printf("%d", i);}
//        System.out.println();
//        a = AddItem(a, 2);
//        a = AddItem(a, 3);
//        for (int j : a) {System.out.printf("%d", j);}
//    }

//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        //ArrayList list = new ArrayList();
//        list.add(2809);
//        list.add("2809");
//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(123);
//        for (Object o: list){
//            System.out.println(o);
//        }
//    }


//    public static void main(String[] args) {
//        int day =29;
//        int month=9;
//        int year=1990;
//        Integer[] date = {day, month,year};
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d);
//    }


//    public static void main(String[] args) {
//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder [] date = new StringBuilder[] {day, month, year};
//        List<StringBuilder> d = Arrays.asList(day, month, year);
//        System.out.println(d); // [29, 9, 1990]
//        day = new StringBuilder("09");
//        System.out.println(d); // [29, 09, 1990]
//    }


//    public static void main(String[] args) {
//        Character value = null;
//        List<Character> list1 = List.of('S','e','r','g', 'e', 'y');
//        System.out.println(list1);
//        list1.remove(1);
//    }


//    public static void main(String[] args) {
//        Character value = null;
//        List<Character> list1 = new ArrayList<Character>();
//        list1.add('S');
//        list1.add('e');
//        list1.add('r');
//        System.out.println(list1);
//        list1.remove(1);
//        System.out.println(list1);
//
//    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,12,123,1234,12345);
        for (int item: list){ //цикл форич. item - название переменной, которая принимает значение из коллекции list
            System.out.println(item); //действие, которое нужно сделать в цикле
        }
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while  (col.hasNext()){
            System.out.println(col.next());
            col.next();
            col.remove();
        }
    }



}
