package Sem4;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//1. Организовать ввод и хранение данных пользователей. ФИО, возраст, пол
//Сохранить эти данные
public class Sem4_HW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО, возраст, пол через зпт:  ");
        String user = in.nextLine();// считывает всю введенную строку
//        System.out.printf("Введённая строка:" + user);
        String[] userarr = user.split(", "); //создаем массив из введённой строки по разделителю зпт
        ArrayList<ArrayList> spisrab = new ArrayList<>();

        int i = 0;//счётчик для цикла
        while(!user.equals("q")) { //введенная строка не равна "q"
            ArrayList<String> tmp = new ArrayList<>();
            System.out.printf("Зашли в цикл, user=" + user);
            userarr=user.split(", ");
            for (int j=0; j < userarr.length; j++) {
                tmp.add(userarr[j]);
            }
//            System.out.println(tmp.get(0));
//            ArrayList<String []> spisrab = new ArrayList<>();
            spisrab.add(tmp);
            System.out.println();
            System.out.printf("ArrayList \n");
            System.out.println(spisrab);
//            Scanner in = new Scanner(System.in);
            System.out.print("Введите ФИО, возраст, пол через зпт:  ");
            user = "";
            user = in.nextLine();// считывает всю введенную строку
//            System.out.printf("Введённая строка:" + user);
//            i++;

        }
        System.out.printf("Выход");
        for (int k = 0; k < spisrab.size(); k++) { //цикл для вывода на печать
            System.out.println(spisrab.get(k).toString().replace("[", "")
                    .replace("]", ""));
//            String.join(",", array)
        }
//        System.out.println(spisrab.get(0).get(1));
//        spisrab.sort(Comparator.naturalOrder());
//        System.out.println(spisrab);
        System.out.println(spisrab.get(0).getClass().getName());
        ArrayList<String> tmpsort = new ArrayList<>();

        for (int q = 0; q < spisrab.size(); q++) {
            if (Integer.parseInt(spisrab.get(q).get(1).toString())>Integer.parseInt(spisrab.get(q+1).get(1).toString())) {
                tmpsort.add(spisrab.get(q).toString());
                spisrab.set(q,spisrab.get(q+1));//изменит значение в 0 индексе на 11. Изменит, а не добавить
                spisrab.set(q+1,tmpsort);//изменит значение в 0 индексе на 11. Изменит, а не добавить
//                System.out.println(tmpsort);
//                System.out.println(spisrab);
                tmpsort.clear();
                q++;
            }
            q++;

        }//скобка цикла фор
        System.out.printf("Итоговый отсортированный список: "+ spisrab);
        }

//        for (int out = spisrab.size() - 1; out >= 1; out--){  //Внешний цикл
//            for (int inz = 0; inz < out; inz++){       //Внутренний цикл
//                String []res=spisrab.get(inz).toString().split();
//                System.out.println(res[1]);
//                if(spisrab.get(in)(1) > spisrab.get(in+1)(1))            //Если порядок элементов нарушен
////                    toSwap(in, in + 1);             //вызвать метод, меняющий местами
//                    ArrayList<String> tmp1 = new ArrayList<>();
//                    tmp1 = spisrab.get(in);
//                    spisrab(in)=spisrab(in+1);
//                    spisrab(in+1)=tmp1;
//            }
//        }
//    }

//        in.close();

//        list.add(1);
//        ArrayList<Integer> list1 = new ArrayList<>();


    }//скобка psvm, открыта в 8 строке











//}//главная закрывающая скобка, открывается в 4 строке
