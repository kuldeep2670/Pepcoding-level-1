public class l006_Parsing_Value_From_String {
    public static void main(String[] args){
        String myStringValue = "2500";
        System.out.println(myStringValue);

        // myStringValue = myStringValue + 1;
        // System.out.println(myStringValue);

        // to convert string into int or double
        int myIntValue = Integer.parseInt(myStringValue);
        System.out.println(myIntValue);

        myIntValue = myIntValue + 2;
        System.out.println("new value:" + myIntValue);

        String newString = "100.11";
        System.out.println(newString);

        double myDoubleValue = Double.parseDouble(newString);
        System.out.println(myDoubleValue+0.09);
    }
}
