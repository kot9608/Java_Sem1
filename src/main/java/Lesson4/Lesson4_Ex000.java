package Lesson4;

import java.util.PriorityQueue;

public class Lesson4_Ex000 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();//наивысший приоритет имеет  наименьшее значение
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());//извлечение значения из колллекции
        System.out.println(pq.poll());//извлечение значения из колллекции
        System.out.println(pq.poll());//извлечение значения из колллекции
        System.out.println(pq.poll());//извлечение значения из колллекции
        System.out.println(pq.poll());//когда уже нечего извлекать - возвращает null

    }
}
