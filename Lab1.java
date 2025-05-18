//Lab 1
import java.util.Scanner;
public class Operation{
    public static void main(String[] args) {
        float n1, n2, sum, sub, mul, div;
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter two numbers");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        sum = n1 + n2;
        sub = n1 - n2;
        mul = n1 * n2;
        div = n1 / n2;
        System.out.println("Sum :" + sum);
        System.out.println("Subtraction :" + sub);
        System.out.println("Multiplication :" + mul);
        System.out.println("Division :" + div);
        scanner.close();
    }
}
