import java.util.Scanner;

public class calculator {
    static int scanNumber() {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        return number;
    }

    static String scanOperations() {
        Scanner num = new Scanner(System.in);
        String operations = num.nextLine();
        return operations;

    }

    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Введите первую переменную: ");
        int num1 = scanNumber();
        System.out.println("Введите действие: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите вторую переменную: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

}
