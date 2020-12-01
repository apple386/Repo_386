package Nikulin.lesson4.task1;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Acer", "Alcatel", "Apple", "Asus", "Caterpillar",
                "Google", "HP", "HTC", "Huawei", "Lenovo",
                "Samsung", "LG", "Microsoft", "Apple", "Samsung",
                "Samsung", "Apple", "Microsoft", "Apple", "LG"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
