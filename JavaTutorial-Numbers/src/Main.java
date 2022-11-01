import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number");
        int third = Integer.valueOf(scanner.nextLine());
double div = (double) (first+second)/third;
int sum = first+second+third;
int p = first*second*third;
int dif = first-second-third;
        System.out.println(first + " + " + second + " + "+ third + " = " + sum);
        System.out.println(first + " - " + second + " - "+ third + " = " + dif);
        System.out.println(first + " * " + second + " * "+ third + " = " + p);
        System.out.println("(" + first + " + " + second + ")" + " / "+ third + " = " + div);

    }
}