import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the first string");
        String text = reader.nextLine();
        System.out.println("enter the second string");
        String string = reader.nextLine();
        if(text.equals(string)){
            System.out.println("same");
        }
        else{
            System.out.println("different");
        }



        }
    }
