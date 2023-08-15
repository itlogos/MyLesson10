package ua.com.fox;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence : ");
        String sentence = scanner.nextLine();
        int worldCount = countWorld(sentence);
        System.out.println("Count world : " + worldCount);
        worldCount = countWorld2(sentence);
        System.out.println("Count world : " + worldCount);
        scanner.close();
    }

    public static int countWorld(String sentence) {
        //First
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static int countWorld2(String sentence){
        //Second
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        return tokenizer.countTokens();
    }

}
