// A "value type" holds the data within its own memory.

// A "reference type" contains a pointer to another memory location that holds the real data.

package Za_array_arraylist_linkedlist;

import java.util.Arrays;

public class l001_referenceType_and_valueTypes {
    public static void main(String[] args){
        //<---------------value types------------------>
        int firstInt = 9;
        int secontInt = firstInt;
 
        System.out.println("the first int value is " + firstInt);
        System.out.println("the second int value is " + secontInt);
        
        secontInt = secontInt + 1;
        System.out.println("the new first int value is " + firstInt);
        System.out.println("the new second int value is " + secontInt);


        //<---------------- reference types -------------------->
        int [] myFirstArray = new int[7]; 
        int [] mySecondArray = myFirstArray;
        System.out.println("my first array: " + Arrays.toString(myFirstArray));
        System.out.println("my second array: " + Arrays.toString(mySecondArray));

        mySecondArray[5] = 1;
        System.out.println("my updated first array: " + Arrays.toString(myFirstArray));
        System.out.println("my updated second array: " + Arrays.toString(mySecondArray));

        modifyArray(mySecondArray);
        System.out.println("my modifies first array: " + Arrays.toString(myFirstArray));
        System.out.println("my modifies second array: " + Arrays.toString(mySecondArray));


        mySecondArray = new int[7];
        mySecondArray[0] = 10;
        System.out.println("my latest first array: " + Arrays.toString(myFirstArray));
        System.out.println("my latest second array: " + Arrays.toString(mySecondArray));


    }
    public static void modifyArray(int [] arr){
        arr[2] = 1;
    }
}
