import java.util.Random;
import java.util.Arrays;//для вывода массива на экран

public class Main {
    public static void main(String[] args) {
        //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2001); //это кидалка случайных чисел!)
        System.out.printf("Задание 1. Выброшенное случайное целое число от 0 до 2000 = %s", i);
        System.out.println();
        System.out.println("Задание 1. Выброшенное случайное целое число от 0 до 2000 = " + i);


        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        String i_binary = Integer.toBinaryString(i);//преобразовали число в двоичный вид

        System.out.println("Преобразовал выброшенное случайное целое число " + i + " в двоичный код = " + i_binary);
        int sbm = -1; //объявил переменную для сохранения Номера старшего значащего бита в числе

        for (int j = i_binary.length(); j>= 0; j--) {
            if (i_binary.charAt(i_binary.length()-j)-'0' == 1) { //преобразовал char в int и сравнил с 1
                System.out.println("Номер старшего значащего бита в числе " + i_binary + " = " + j);
                sbm=j;
                j=0;
            }

        }
        System.out.println(sbm);
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        short shmax = Short.MAX_VALUE;
        System.out.println("Short.MAX_VALUE " + shmax);
        int count=0;//счетчик количества кратных чисел
        for (int w = i; w<=shmax; w++) { //считаем размер будущего массива
            if (w%sbm==0) {
                count++;
            }
        }

        int [] m1 = new int[count]; //создали массив нужного размера
        for(int e=0; e<m1.length;e++) {
            for (int r = i; r<=shmax; r++) { //считаем размер будущего массива
                if (r%sbm==0) {
                    m1[e]=r;
                    e++;
                }
            }
        }
        System.out.println(Arrays.toString(m1));
        System.out.printf("все кратные" + sbm + "числа в диапазоне от " +  i + " до Short.MAX_VALUE(" + shmax +") выведены в массиве = " + (Arrays.toString(m1)));

//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int shmin = Short.MIN_VALUE;
        System.out.println();

        System.out.println(shmin);

        int countz=0;//счетчик количества некратных чисел
        for (int z = shmin; z<=i; z++) { //считаем размер будущего массива
            if (z%sbm!=0) {
                countz++;
            }
        }
        System.out.println(countz);

        int [] m2 = new int[countz]; //создали массив нужного размера
        for(int x=0; x<m2.length;x++) {
            for (int c = shmin; c<=i; c++) { //считаем размер будущего массива
                if (c%sbm!=0) {
                    m2[x]=c;
                    x++;
                }
            }
        }
        System.out.println(Arrays.toString(m2));


    }
}


        //        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

//        Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//                *Пункты реализовать в разных методах

//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)
//        boolean aBoolean = false;

//        System.out.println(aBoolean);





