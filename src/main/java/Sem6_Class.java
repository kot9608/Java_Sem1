//        Вам нужно написать класс имитирующий работу hashset и хранящий int

import java.util.*;

public class Sem6_Class {
    public static void main(String[] args) {
        MySet myobj = new MySet();
        System.out.println(myobj.add(1));
//        System.out.println(myobj.contains(1));
        System.out.println(myobj.add(2));
        System.out.println(myobj.add(1));
        System.out.println(myobj.get(1));
        System.out.println(myobj.isEmpty());
//        System.out.println(myobj.del(1));
//        System.out.println(myobj.del(2));
//        System.out.println(myobj.del(1));
        System.out.println(myobj.isEmpty());
//       [0,1,2,3,4,5,6]
        Iterator<Integer>iterator= myobj.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);

        }


    }
}
class MySet {
//    private List <Integer> mylist = new ArrayList<>();
    private HashMap<Integer, Object> myDB = new HashMap<>();
    private static final Object MYOBJ = new Object();
    public boolean add(int elem){ //метод, который добавляет в mylist новый элемент
        return myDB.put(elem, MYOBJ)==null;
    }
    public boolean del(int elem) { //метод, который удаляет заданный элемент
        return myDB.remove(elem)==MYOBJ;
    }

    public boolean isEmpty () {  //метод, который вернёт true, если он пустой, и false, если есть хоть один элемент
        return myDB.isEmpty();
    }

    public boolean contains (int elem) {
        return myDB.containsKey(elem);
    }

    public int get (int index) {//метод, чтобы вернуть значение по индексу
        Object[] a=myDB.keySet().toArray();
        return (int) a[index];
    }

    public Iterator<Integer> iterator(){
        return myDB.keySet().iterator();
    }






}