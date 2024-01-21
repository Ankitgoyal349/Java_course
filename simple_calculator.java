import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter 1st number =");
            int a =sc.nextInt();
            System.out.println("Enter 2nd number =");
            int b = sc.nextInt();
            System.out.println("Enter Operator(+,-,*,/,%)");

            char operator;

            operator = sc.next().charAt(0);
            int addition = a+b;
            int subtraction = a-b;
            int mul = a*b;
            int division = a/b;
            int remainder = a%b;

            switch (operator){
                case '+':
                    System.out.println("Addition of 2 number is " +addition);
                    break;

                case '-':
                    System.out.println("Subtraction of given numbers is "+subtraction);
                    break;
            
                case '*':
                    System.out.println("Multiplication of given numbers is "+mul);
                    break;

                case '/':
                    System.out.println("Division of given numbers is "+division);
                    break;

                case '%':
                    System.out.println("Reamainder is "+remainder);
                    break;
                default:
                    System.out.println("INvalid operator");
            }



        }
    }
}
