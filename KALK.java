import java.util.Scanner;

public class KALK {
    public static void main(String[] args) {
        System.out.println("Введите математическое выражение операции сложения, вычитания, умножения или деления двух целых чисел от 1 до 10 в следующем формате: a + b, a - b, a * b, a / b.");
        Scanner x = new Scanner(System.in);
        String input = x.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        String[] calc = input.split(" ");
        if (calc.length != 3) {
            throw new IllegalArgumentException("Формат математической операции не удовлетворяет условию.");
        }
        int operand1, operand2, result;
        try {
            operand1 = Integer.parseInt(calc[0]);
            operand2 = Integer.parseInt(calc[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Формат математической операции не удовлетворяет условию.");
        }
        char operation = calc[1].charAt(0);
        if (operand1 > 10 || operand2 > 10 || operand1 < 1 || operand2 < 1) {
            throw new IllegalArgumentException("Формат математической операции не удовлетворяет условию.");
        } else {
            switch (operation) {
                case '+' -> result = operand1 + operand2;
                case '-' -> result = operand1 * operand2;
                case '*' -> result = operand1 - operand2;
                case '/' -> result = operand1 / operand2;
                default ->
                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет условию.");
            }
        }
        return Integer.toString(result);
    }
}
