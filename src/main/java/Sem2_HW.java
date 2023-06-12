import java.util.Arrays;
import java.util.Locale;

public class Sem2_HW {

//    Дана строка sql-запроса "select * from students where ".
//    Сформируйте часть WHERE этого запроса, используя StringBuilder.
//    Данные для фильтрации приведены ниже в виде json-строки.
//    Если значение null, то параметр не должен попадать в запрос.
//    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//    Образец: "select * from students where name="Ivanov" and country="Russia" and city="Moscow"


    public static void main(String[] args) {
        String s = "select * from students where ";
        StringBuilder res = new StringBuilder(s);
        String wh = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//        System.out.println(wh);
        System.out.println();
        //System.out.println(where(wh));
        System.out.println();
        System.out.printf("Результат работы метода: " + where(wh));
        System.out.printf("SQL-запрос: " + (res.append(where(wh))));
    }
    public static StringBuilder where(String s){
        StringBuilder where = new StringBuilder(s);
        where.deleteCharAt(where.indexOf("{")); //удалил открывающую скобку
        where.deleteCharAt(where.indexOf("}")); //удалил закрывающую скобку
        System.out.printf("Убрали скобки в начале и в конце: " + where);
        System.out.println();
        while ((where.indexOf("\""))>-1) {
            where.replace(where.indexOf("\""), where.indexOf("\"")+1, "");
        }
        String wherestr = where.toString();
        String [] FilterArr = wherestr.split(",");
        StringBuilder WhereRes = new StringBuilder();
        for (String str:FilterArr) {
            String [] tmpArr = str.split((":"));
            if (tmpArr[1].equalsIgnoreCase("null")){
                continue;
            }
            String restmp=String.format(" and %s = '%s'",tmpArr[0], tmpArr[1]);
            WhereRes.append(restmp);
        }
        WhereRes.delete(0,4);
        return WhereRes;
    }


    public static int x2(int num){
        return num*2;
    }


}
