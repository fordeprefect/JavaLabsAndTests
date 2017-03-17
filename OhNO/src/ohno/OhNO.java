package ohno;

public class OhNO {

    public static void main(String[] args) {
     
        System.out.println("Starting Main method");
        m1();
        System.out.println("End Main method");
    }
    
    static void m1() {
    try { 
        System.out.println("Method One - m1");
        m2();
    }
    catch(ArithmeticException err){
        System.out.println(err.getMessage());
    }
    }
    
    static void m2() {
        
        int x = 10;
        int y = 0;
        double z = x/y;
        
        System.out.println(z);
        System.out.println("Method Two - m2");
    } 
    
}
