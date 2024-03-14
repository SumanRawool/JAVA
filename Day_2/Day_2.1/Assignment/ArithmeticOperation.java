class ArithmeticOperation{
    public static void main1(String[] args){
        System.out.println(" ---------- Addition ---------- ");

        int num1=10;
        long num2=1000L;
        System.out.println("Addition of int and long is: "+(num1+num2));

        float num3=10.3f;
        int num4=10;
        System.out.println("Addition of float and int is: "+(num3+num4));

        double num5=1200.35d;
        long num6=1000;
        System.out.println("Addition of double and long is: "+(num5+num6));

        char a='a'; //it will give ascii value 97
        char b='b'; //it will give ascii value 98
        System.out.println("Addition of char and char is: "+(a+b));//here addition of ascii value will done.
    }
     public static void main2(String[] args){
        System.out.println(" ---------- Division ---------- ");

        int num1=10;
        long num2=1000L;
        System.out.println("Division of int and long is: "+(num1-num2));

        float num3=10.3f;
        int num4=10;
        System.out.println("Division of float and int is: "+(num3-num4));

        double num5=1200.35d;
        long num6=1000;
        System.out.println("Division of double and long is: "+(num5-num6));

        char a='a'; //it will give ascii value 97
        char b='b'; //it will give ascii value 98
        System.out.println("Division of char and char is: "+(a-b));//here division of ascii value will done.
    }
    public static void main(String[] args){
        System.out.println(" ---------- multiplication ---------- ");

        int num1=10;
        long num2=1000L;
        System.out.println("Division of int and long is: "+(num1*num2));

        float num3=10.3f;
        int num4=10;
        System.out.println("Division of float and int is: "+(num3*num4));

        double num5=1200.35d;
        long num6=1000;
        System.out.println("Division of double and long is: "+(num5*num6));

        char a='a'; //it will give ascii value 97
        char b='b'; //it will give ascii value 98
        System.out.println("Division of char and char is: "+(a*b));//here multiplication of ascii value will done.
    }
}