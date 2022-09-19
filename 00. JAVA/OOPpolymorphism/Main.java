// "polymorphism" allows you to define one interface and have multiple implementations. 
// The word “poly” means many and “morphs” means forms, So it means many forms.

// Types of polymorphism
// In Java polymorphism is mainly divided into two types: 

// 1. "Compile-time Polymorphism"
//       It is also known as static polymorphism. 
//       This type of polymorphism is achieved by function overloading or operator overloading. 
//       Note: But Java doesn’t support the Operator Overloading.

// 2. Runtime Polymorphism
//       It is also known as Dynamic Method Dispatch. 
//       It is a process in which a function call to the overridden method is resolved at Runtime. 
//       This type of polymorphism is achieved by Method Overriding.
//       Method overriding, on the other hand, occurs when a derived class has a definition for one 
//       of the member functions of the base class. That base function is said to be overridden.

package OOPpolymorphism;

class Cricket{
    public String FormatName;
    public Cricket(String formatName) {
        FormatName = formatName;
    }
    public String rule(){
        return "Cricket is played between two teams";
    }
}
class testMatch extends Cricket{
    public testMatch() {
        super("test match");
    }
    public String rule(){
        return "Played for 5 days, no fixed no of overs for a team";
    }
}
class oneDay extends Cricket{
    public oneDay(){
        super("one day international");
    }
    // public String rule(){
    //     return "played for 1 day, 50 0vers per team";
    // }
    @Override
    public String rule(){
        return "played for 1 day, 50 0vers per team";
    }
}
class T20 extends Cricket{
    public T20(){
        super("T20 international");
    }

    @Override
    public String rule(){
        return "played for 1 day, 20 0vers per team";
    }
}
class Ipl extends Cricket{
    public Ipl(){
        super("IPL");
    }
    public String rule(){
        return "played for 1 day, 20 0vers per team but not international";
    }
}
class gullyCricket extends Cricket{
    public gullyCricket(){
        super("gully cricket");
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i =1; i<= 10;i++){
            Cricket cricket = randomMatch();
            System.out.println("format type" + i + " is " + cricket.FormatName);
            System.out.println("the rule is " + cricket.rule());
        }
    }
    public static Cricket randomMatch(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("the random number is " + randomNumber);
        switch(randomNumber){
            case 1: return new testMatch();
                
            case 2: return new oneDay();
                
            case 3: return new T20();
               
            case 4: return new Ipl();
                
            case 5: return new gullyCricket();
                
            default: return null;
        }
    }
}
