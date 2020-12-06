package javaCore.Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Words {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Арбуз");
        words.add("Веранда");
        words.add("Гора");
        words.add("Степь");
        words.add("Ива");
        words.add("Гираскоп");
        words.add("Ель");
        words.add("Лес");
        words.add("Велосипед");
        words.add("Дамкрат");
        words.add("Фирма");
        words.add("Мишура");
        words.add("Дом");
        words.add("Гром");
        words.add("Ель");
        words.add("Гора");
        words.add("Гром");
        words.add("Дом");
        words.add("Луна");
        words.add("Сарай");

        System.out.printf("Вся коллекция слов составляет: %n" + words);


        Set<String> stringSet = new LinkedHashSet<>(words);
        System.out.printf("%nУникальные слова это:%n " + stringSet);

        HashMap<String, Integer> doubleWords = new HashMap<>();
        Integer doubleWord = null;
        for (String i : words) {
            doubleWord = doubleWords.get(i);
            doubleWords.put(i, doubleWord == null ? 1 : doubleWord + 1);
        }
        System.out.printf("%nКоличество слов в списке%n" + doubleWords);
    }
}
