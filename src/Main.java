import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть строку: ");
        String input = scanner.nextLine();


        StringBuilder result = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);


            if (i % 2 == 0) {

                result.append(Character.toUpperCase(currentChar));
            } else {

                result.append(Character.toLowerCase(currentChar));
            }
        }


        System.out.println("Результат: " + result.toString());
    }
}
