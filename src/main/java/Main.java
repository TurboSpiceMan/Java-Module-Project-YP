import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int guestCounter;

    public static void main(String[] args) {
        System.out.println("Введите количество гостей.");
        //Проверка ввода
        while(true) {
            do {
                try {
                    String persons = scanner.next();
                    guestCounter = Integer.parseInt(persons);
                    break;
                }
                catch (Exception e){
                    System.out.println("Введено некоректное значение. Повторите ввод:");
                }
            }
            while(true);
            if (guestCounter <= 1) {
                System.out.println("Введено некоректное значение. Повторите ввод:");
            } else {
                break;
            }
        }
        Calculator calculator = new Calculator();
        calculator.toCount();
        scanner.close();
    }

}