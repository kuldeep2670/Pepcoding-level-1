// the automatic conversion of primitive data types into its equivalent wrapper type is known as boxing.
// the opposite operation is called unboxing.
// So java programmer does not need to write the conversion code.

package Za_array_arraylist_linkedlist;

import java.util.ArrayList;

// class IntegerClass {
//     private int myIntValue;

//     public IntegerClass(int myIntValue) {
//         this.myIntValue = myIntValue;
//     }

//     public int getMyIntValue() {
//         return myIntValue;
//     }

//     public void setMyIntValue(int myIntValue) {
//         this.myIntValue = myIntValue;
//     }
// }

public class l004_autoBoxing_and_unboxing {
    public static void main(String[] args) {
        // String[] stringArray = new String[10];
        // int[] intArray = new int[10];
        // ArrayList<String> stringArrayList = new ArrayList<>();
        // //ArrayList<Integer> intArrayList = new ArrayList<>(); // arraylist type cannot be of primitive type

        // ArrayList<IntegerClass> intArrayList = new ArrayList<IntegerClass>();
        // intArrayList.add(new IntegerClass(15));

        // int myNewInt = 12;
        // Integer myInt = 10; //integer in a wrapper class
        // //Integer myInt1 = new Integer(10); //unnecessary boxing in this



        //Array list using autoboxing
        ArrayList<Integer> myIntArrayList = new ArrayList<>();
        
        for(int i = 0; i <= 10; i++){
            myIntArrayList.add(i); //unnecessary boxing or autoboxing
        }

        for(int i = 0; i<= 10; i++){
            System.out.println(i + " is " + myIntArrayList.get(i)); // unboxing 
        }

        ArrayList<Double> myDoubleList = new ArrayList<Double>();
        for(double d = 0.0; d <= 10.0 ; d+=0.5){
            myDoubleList.add(d);
        }

        for(int i = 0; i< myDoubleList.size(); i++){
            System.out.println(myDoubleList.get(i)); 
        }
        

    }

}
