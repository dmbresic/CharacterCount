import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string and I will count the characters: ");
        String userInput = sc.nextLine();

        CountChar counter = new CountChar();

        System.out.println(counter.countChar(userInput));
    }
}
