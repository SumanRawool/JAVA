class WideningConversion{
    public static void main(String args[]){

        System.out.println("========================== Int to double ======================================");

        int value1=100;
        System.out.println(value1);
        double value2=value1;
        System.out.println(value2);

        System.out.println("========================== float to int =====================================");

        long value9=12345L;
        System.out.println(value9);
        float value10=value9; 
        System.out.println(value10);

         System.out.println("========================== Char to int =====================================");

        char value11='A';
        System.out.println(value11);
        int value12=value11; //It will give ascii number
        System.out.println(value12);
    }
}