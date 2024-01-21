import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        try(Scanner sc = (new Scanner(System.in))){
            
            // int a = sc.nextInt();
            // int b = sc.nextInt();
    
    
            // if(a==b){
            //     System.out.println("Given nummbers are equal");
            // } else if (a>b) {
            //     System.out.println("a is greater");
            // } else{
            //     System.out.println("b is greater");
            // }

            int button = sc.nextInt();

            switch (button) {
                case 1 :
                    System.out.println("Hello world");
                    break;
                case 20 :
                    System.out.println("jai shree ram");
                    break;
                case 3 :
                    System.out.println("har har mahadev");
                    break;
                default:
                    System.out.println("invalid button");
            }

        }

    }
}
