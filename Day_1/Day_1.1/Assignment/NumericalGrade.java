import java.util.Scanner;
class NumericalGrade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        float percentage=sc.nextFloat();
        scanner.close();
        if(percentage >= 70){
            System.out.println(" Your grade is : A");
        }else if(percentage >=60 && percentage <= 69){
            System.out.println(" Your grade is : B");
        }else if(percentage >= 50 && percentage <= 59){
            System.out.println(" Your grade is : C");
        }else if(percentage >= 40 && percentage <= 49){
            System.out.println(" Your grade is : D");
        }else{
            System.out.println(" You are fail.");
        }
    }
}