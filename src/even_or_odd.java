import java.util.Scanner;

public class even_or_odd {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Give a number :");
        int n = num.nextInt();
        if (n % 2 == 0)
        {
            System.out.println("number is even");


        }
        else

        {
            System.out.println("number is odd");

        }
    }
}