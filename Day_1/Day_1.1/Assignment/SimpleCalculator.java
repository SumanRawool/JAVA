import java.util.Scanner;
class SimpleCalculator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter correct operator (+,-,*,/ ): ");
        char operator=sc.next().charAt(0);
        System.out.println("Enter first number :");
        int firstnumber=sc.nextInt();
        System.out.println("Enter second number :");
        int secondnumber=sc.nextInt();
        switch(operator){
            case '+':
                System.out.print("Addition of Two number is: "+(firstnumber + secondnumber));
                break;
            case '-':
                System.out.print("Addition of Two number is: "+(firstnumber - secondnumber));
                break;
            case '*':
                System.out.print("Addition of Two number is: "+(firstnumber * secondnumber));
                break;
            case '/':
                System.out.print("Addition of Two number is: "+(double)(firstnumber / secondnumber));
                break;
            default:
                System.out.print("Please enter correct operator");
        }
    }
}