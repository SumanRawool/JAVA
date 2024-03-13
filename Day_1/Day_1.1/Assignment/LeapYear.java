import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year =sc.nextInt();
        Boolean isLeapYear=false;
        if(year % 4 == 0){
            isLeapYear=true;
            if(year % 100 == 0){
                if(year % 400 ==0){
                    isLeapYear=true;
                }else{
                    isLeapYear=false;
                }
            }
        }else{
            isLeapYear=false;
        }
        if(!isLeapYear){
            System.out.println(year+" : Not leap year");
        }else{
            System.out.println(year+" : leap year");
        }
    }
}