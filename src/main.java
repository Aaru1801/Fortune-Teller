import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1-10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 1) {
            System.out.println("Enjoy the good luck your friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
    }
}