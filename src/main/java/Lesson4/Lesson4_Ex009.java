package Lesson4;

import java.util.LinkedList;
import java.util.Queue;

public class Lesson4_Ex009 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();//создание Queue
        queue.add(1);//добавление значения в конец списка Queue
        queue.add(2);//добавление значения в конец списка Queue
        queue.add(3);//добавление значения в конец списка Queue
        queue.remove(); //удаляет первый элемент(0 индекс) - первый пришел, первый ушел
        System.out.println(queue);
        //если удалять элемент из списка в котором уже ничего нет - будет ошибка
    }
}
