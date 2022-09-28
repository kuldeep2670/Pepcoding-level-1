// Java inner class is a class which is declared inside the class or interface.
// Inner classes are used to logically group classes and interfaces in one place so that
// it can be maintained and read more efficiently.

package Zb_abstractFeaturesOfJAVA;

class Quad{
    public int a;
    public int b;
    public int c;
    public double d;

    
    public Quad(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void calc(){
        d = (Math.pow(b, 2)) - 4*a*c;
        
    }
    public class Disc {
        public void cal(){
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("The +ve root: " + x1);
            System.out.println("The -ve root: " + x2);

        }
    }
    
}

public class l002_innerClass {
    public static void main(String[] args) {
        Quad qc = new Quad(1, 3, 2); // outerClass outerObj = new outerClass();
        qc.calc();

        Quad.Disc dc = qc.new Disc(); // outerclass.innerClass innerObj = outerObj.new innerClass();

        dc.cal();
    
    }
    

}
