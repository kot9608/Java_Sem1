//package Sem4;
//
//import java.util.Scanner;
////1. Организовать ввод и хранение данных пользователей. ФИО, возраст, пол
////Сохранить эти данные
//public class Sem4_ClassWork {
////    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        System.out.println("Введите ФИО, возраст, пол в одну строку через пробел ");
////        String str1 = in.nextLine();
////                while(str1!="Exit"){
////
////        }
////    }
//}
//
//
//
//import java.util.ArrayList;
//        import java.util.Scanner;
//
//public class User {
//    private String name;
//    private int age;
//    private String gender;
//
//    public User(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<User> users = new ArrayList<>();
//        User user1 = new User("Иванов Иван Иванович", 25, "мужской");
//        User user2 = new User("Петрова Анна Сергеевна", 30, "женский");
//        User user3 = new User("Сидоров Петр Николаевич", 40, "мужской");
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите ФИО: ");
//        String name = scanner.nextLine();
//        System.out.print("Введите возраст: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Введите пол: ");
//        String gender = scanner.nextLine();
//
//        User user = new User(name, age, gender);
//        users.add(user);
//
//        for (User u : users) {
//            System.out.println(u.name + ", " + u.age + " лет, " + u.gender);
//        }
//    }
//}