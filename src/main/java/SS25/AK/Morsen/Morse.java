package SS25.AK.Morsen;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    public static String charToMorseCode(char c) {
        String morseCode =
                switch (c) {
                    case 'A' -> ".-";
                    case 'B' -> "−...";
                    case 'C' -> "−.-.";
                    case 'D' -> "-..";
                    case 'E' -> ".";
                    case 'F' -> "..-.";
                    case 'G' -> "--.";
                    case 'H' -> "....";
                    case 'I' -> "..";
                    case 'J' -> ".---";
                    case 'K' -> "_._";
                    case 'L' -> ".-..";
                    case 'M' -> "--";
                    case 'N' -> "-.";
                    case 'O' -> "---";
                    case 'P' -> ".--.";
                    case 'Q' -> "--.-";
                    case 'R' -> ".-.";
                    case 'S' -> "...";
                    case 'T' -> "-";
                    case 'U' -> "..-";
                    case 'V' -> "...-";
                    case 'W' -> ".--";
                    case 'X' -> "-..-";
                    case 'Y' -> "-.--";
                    case 'Z' -> "--..";
                    default -> throw new RuntimeException("Unexpected value: " + c);
                };
        return morseCode;
    }

    public Map<String, String> getMorseCodeMap() {
        char ch;
        String alphabet;
        Map<String, String> map = new HashMap<>();
        for (ch = 'A'; ch <= 'Z'; ch++) {
            alphabet = String.valueOf(ch);
            map.put(alphabet, charToMorseCode(ch));
        }
        return map;
    }

    public String zeichenketteToMorse(String s) {
        char[] word = s.toCharArray();
        String result = "";
        for (char ch : word) {
            result += charToMorseCode(ch) + " ";
        }
        return result;
    }
}
