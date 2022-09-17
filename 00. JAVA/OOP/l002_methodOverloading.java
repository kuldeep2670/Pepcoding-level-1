// Method oveloading
//-->Method overloading is the process which allows the programmer to have multiple methods with the 
//   same method name which differs on the basis of arguments or the argument types . It is also an 
//   implementation of 'compile time polymorphism'

package OOP;
public class l002_methodOverloading {
    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    static void add(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
    public static void main(String[] args){
        int sum = add(10,5);
        System.out.println(sum);
        add(5,10,14);
    }
}
// Pointers for method overloading
// 1. We cannot overload a return type
// 2. although we can overload static methods, the arguments have to be different
// 3. We cannot oveload two methods if they only differ  by a static method
// 4. like other static methods, the main() method can also be oveloaded
