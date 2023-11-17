import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number = scn.nextInt();
        String words = convertNumberToWords(number);
        System.out.println(number + " : " + words);
    }
    public static String convertNumberToWords(int number) {
        if (number < 0 || number > 999) {
            return "Invalid number";
        }

        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        int hundredsDigit = number / 100;
        int tensDigit = (number % 100) / 10;
        int unitsDigit = number % 10;

        String wordsHundreds = hundreds[hundredsDigit];
        String wordsTens = (tensDigit == 1) ? teens[unitsDigit] : tens[tensDigit] + " " + units[unitsDigit];

        String words = wordsHundreds + " " + wordsTens;


        return words.trim();
    }
}
