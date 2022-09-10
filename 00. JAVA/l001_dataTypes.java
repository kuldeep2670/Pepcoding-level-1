public class l001_dataTypes{
    public static void main(String[] args){
        //Integer
        //Maximum value permissible to integer
        int maxRange = Integer.MAX_VALUE;
        int minRange = Integer.MIN_VALUE;
        System.out.println("Integer Max Value " + maxRange);
        System.out.println("Integer Min Value " + minRange);
        // overflow of integer values
        // int value1 = maxRange + 1;
        // int value2 = minRange - 1;
        // System.out.println(value1);
        // System.out.println(value2);
        // 2147483647
        // -2147483648
        // -2147483648
        // 2147483647   overflow and underflow occurs 

        //Byte
        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;
        System.out.println("Byte Max Value " + maxValue);
        System.out.println("Byte Min Value " + minValue);

        //Short
        short maxVal = Short.MAX_VALUE;
        short minVal = Short.MIN_VALUE;
        System.out.println("Short Max Value " + maxVal);
        System.out.println("Short Min Value " + minVal);

        //Long
        long maxvalue = Long.MAX_VALUE;
        long minvalue = Long.MIN_VALUE;
        System.out.println("Long Max Value " + maxvalue);
        System.out.println("Long Min Value " + minvalue);

        //casting -- converting a number form on data type to a different one is called casting in java
        byte newByteValue = (byte)(maxValue/2); 
        System.out.println(newByteValue);
        short newValue = (short)(maxVal/2);
        System.out.println(newValue);

        //Challenge
        //declare threee variables and initialise then with some valid values.
        //one of int, one of type byte and one of type short.
        //finally creat a variable of type long which is equal to 1000 times the sum of the above three.
        int n1 = 10;
        byte n2 = 15;
        short n3 = 5;
        long longsum = 1000*(n1 + n2 + n3); // long can take the values
        System.out.println(longsum);
        short shortsum = (short)(1000*(n1 + n2 + n3));
        System.out.println(shortsum);

        //FLOAT
        float floatMaxValue = Float.MAX_VALUE;
        float floatMinValue = Float.MIN_VALUE;
        System.out.println("Float Max Value " + floatMaxValue);
        System.out.println("Float Min Value " + floatMinValue);
        
        //double
        double doubleMaxValue = Double.MAX_VALUE;
        double doubleMinValue = Double.MIN_VALUE;
        System.out.println("Double Max Value " + doubleMaxValue);
        System.out.println("Double Min Value " + doubleMinValue);

        // int a = 10;
        // float b = 10.0f; //if want to write float value we have to write f after the value
        // double c  = 10.0d; //d is not necessary but writing it is a good approach

        //Floating Point Precision
        int intValue = 22/7;
        float floatValue = 22f / 7f; //writing f gives you the precise value
        double doubleValue = 22d / 7d; //double gives you more precise value 
        System.out.println("Int value:" + intValue);
        System.out.println("Float value:" + floatValue); //Float value:3.142857
        System.out.println("Double value:" + doubleValue); //Double value:3.142857142857143

        //CHAR
        char myChar = 'A';
        System.out.println(myChar);
        //unicode
        char myUnicode = '\u0041'; //unicode for 'A'
        System.out.println(myUnicode);
        
        //BOOLEAN - true or false
        boolean flag = false;
        if(flag == true){
            System.out.println("Flag is true");
        }else{
            System.out.println("Flag is false");
        }
        
        

        
    }
}