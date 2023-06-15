import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Sem3_HW {
//    Пусть дан произвольный список целых чисел.
//
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); //создал лист1, с типом данных Integer
        for (int i = 0; i<10; i++){ //цикл фор
            list1.add(new Random().nextInt(11)); //добавляет в конец лист1 рандомное значение от 0 до 10(11 не входит)
            //list1.add(i);
        }
        System.out.printf("ArrayList размером 10 элементов, заполнен от 0 до 10 "+list1);
        System.out.println();
        System.out.printf("ArrayList без четных значений: " + DelEvenNum(list1));
        System.out.println();
        System.out.printf("ArrayList минимальное значение: " + SearchMin(list1));
        System.out.println();
        System.out.printf("ArrayList максимальное значение: " + SearchMax(list1));
        System.out.println();
        System.out.printf("ArrayList размером 10 элементов, заполнен от 0 до 10 "+list1);
        System.out.println();
        System.out.printf("ArrayList размером 10 элементов, заполнен от 0 до 10 "+SearchMean(list1));
    }

    public static ArrayList DelEvenNum (ArrayList<Integer> arr){ //Метод для удаления из ArrayList чётных чисел
        ArrayList<Integer> ResDelEvenNum = new ArrayList<>();//новый массив для вывода туда только нечетных значений
        for (int i = 0; i < arr.size(); i++) { //самый обычный цикл фор с 0 до размера списка
            if (arr.get(i)%2!=0){ //если элемент списка с индексом i делится на 2 с остатком
                ResDelEvenNum.add(arr.get(i));
            }
    }
    return ResDelEvenNum;//метод возвращает массив без четных значений
    }

    public static int SearchMin (ArrayList<Integer> arr) { //метод поиска самого маленького элемента массива
        ArrayList<Integer> TmpSearchMin = new ArrayList<>();//новый массив
        for (int i = 0; i < arr.size(); i++) {
            TmpSearchMin.add(arr.get(i));
        }
        TmpSearchMin.sort(Comparator.naturalOrder());//отсортирует элементы списка arr в порядке возрастания
        return TmpSearchMin.get(0);//возвращает самый маленький элемент
    }

    public static int SearchMax (ArrayList<Integer> arr) {//метод поиска самого большого элемента массива
        ArrayList<Integer> TmpSearchMax = new ArrayList<>();//новый массив
        for (int i = 0; i < arr.size(); i++) {
            TmpSearchMax.add(arr.get(i));
        }
        TmpSearchMax.sort(Comparator.naturalOrder());//отсортирует элементы списка arr в порядке возрастания
        return TmpSearchMax.get(arr.size()-1);//возвращает самый большой элемент
    }


    public static double SearchMean (ArrayList<Integer> arr) {//метод поиска среднего значения среди элементов массива
        double sum =0;//переменная для хранения суммы элементов массива
        for (int i = 0; i < arr.size(); i++) {//цикл, чтобы посчитать сумму элементов массива
            sum+=arr.get(i);
        }
        System.out.printf("Сумма элементов массива = "+sum);
        System.out.println();
        return sum/arr.size();
    }



}//скобка закрытия всего класса, открывается в 1 строке
