class NarrowingConversion{
    public static void main(String args[]){
        
        System.out.println("========================== Double to long =====================================");

        double value3=100.03d;
        System.out.println(value3);
        long value4=(long)value3; //conversion is required for conversion
        System.out.println(value4);

        System.out.println("========================== float to int =====================================");

        float value5=100.03f;
        System.out.println(value5);
        int value6=(int)value5; //conversion is required for conversion
        System.out.println(value6);

        System.out.println("========================== long to int =====================================");

        long value7=12345L;
        System.out.println(value7);
        int value8=(int)value7; //conversion is required for conversion
        System.out.println(value8);
    }
}