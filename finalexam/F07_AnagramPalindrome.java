package finalexam;

import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();

            int[] freq = new int[26];
            countLetters(line, 0, freq);

            int oddCount = 0;
            for (int f : freq) {
                if (f % 2 == 1) {
                    oddCount++;
                }
            }

            System.out.println(oddCount <= 1 ? "Possible" : "Impossible");
        }
    }

    static void countLetters(String s, int idx, int[] freq) {
        if (idx >= s.length())
            return;

        char ch = s.charAt(idx);
        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            freq[ch - 'a']++;
        }
        countLetters(s, idx + 1, freq);
    }
}

/*
 * 輸入
 * Taco Cat
 * 
 * 輸出
 * Possible
 */
