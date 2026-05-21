import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        char op = sc.next().charAt(0);
        int result = 0;

        if(op == '+'){
             result = num1+ num2;
        }
        else if(op=='-'){
            result = num1 - num2;

        }
        else if(op == '*'){
            result = num1 * num2 ;
        }
        else if (op == '/'){
            result = num1 / num2;
        }
        else{
            System.out.println("invalid operation");
        }
        System.out.println(result);

    }
}
