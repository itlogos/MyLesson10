package ua.com.fox;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String sentence = "Привет мир привет всем";  // исходное предложение
        System.out.println("Наиболее часто встречающееся слово: " + findMostCommon(sentence));  // вывод результата
    }

    public static String findMostCommon(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence.toLowerCase());  // преобразуем строку в токены, предварительно переведя ее в нижний регистр
        String[] words = new String[tokenizer.countTokens()];  // массив для слов
        int i = 0;
        while (tokenizer.hasMoreTokens()) {  // цикл по всем токенам
            words[i++] = tokenizer.nextToken();  // сохраняем каждое слово в массив
        }

        int maxCount = 0;  // максимальное количество повторений
        String mostCommonWord = "";  // самое часто встречающееся слово
        for (i = 0; i < words.length; i++) {  // цикл по всем словам
            int count = 0;  // текущее количество повторений слова
            for (int j = 0; j < words.length; j++) {  // вложенный цикл для подсчета повторений
                if (words[i].equals(words[j])) {  // если слова совпадают
                    count++;  // увеличиваем счетчик повторений
                }
            }
            if (count > maxCount) {  // если текущее слово встречается чаще, чем предыдущий рекордсмен
                maxCount = count;  // обновляем максимальное количество повторений
                mostCommonWord = words[i];  // сохраняем текущее слово как самое часто встречающееся
            }
        }

        return mostCommonWord;  // возвращаем результат
    }

}
