import java.util.Scanner;

public class Sem2 {
    public static void main(String[] args) {
//        Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = in.nextLine();
        StringBuilder builder = new StringBuilder(str2);
//        builder.reverse();
        str2 = builder.reverse().toString();
        if(str1.equals(str2)) System.out.println("Да");
        else System.out.println("Нет");



//        StringBuilder builder = new StringBuilder("3+53=56");
//        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder("3+53=56");
        int x = builder1.indexOf("=");
        builder1.replace(x,x+1," равно ");
        System.out.println(builder1);


    }
}



//3+53=56

