package Basics;
public class l002_Strings {
    public static void main(String[] args){

        // String is a special datatype in JAVA which is used to define a sequence of characters.
        // Having a storage width equal to 2.14 billion.
        
        String myName = "My name is kuldeep";
        String myAge = "My Age is 21 years";
        String myPlace = "I am from India";
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(myPlace);

        String myInfo = myName + myAge + myPlace;
        System.out.println(myInfo);
        System.out.println(myName + " " + myAge + " " + myPlace);

        //String is immutable
        //The string is immutable means that we cannot change the object itself,
        //but we can change the reference to the object.
        //The string is made final to not allow others to extend it and destroy its immutability.
        myName = myAge + myName; // old String is deleted and new string is formed 
        System.out.println(myName);

        int myInt = 100; // compiler see this 100 as "100"
        myAge = myAge + myInt; 
        System.out.println(myAge);



        
    }
}
