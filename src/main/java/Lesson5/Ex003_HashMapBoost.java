package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(9); //словарь(массив) размером в 9 строк. Если знаешь - указывай сразу. Если не знаешь - не трогай
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f); // 9 = колво элементов, 1.0 - до какого количество процентов заполнения нужно дойти, чтобы увеличить размер словаря. В данном случае оно дойдёт до 100%, и только после увеличится. 0.7 - 70%

    }
}
