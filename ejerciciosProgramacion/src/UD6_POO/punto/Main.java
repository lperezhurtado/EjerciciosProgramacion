
package UD6_POO.punto;

public class Main {
    
    public static void main(String[] args) {
        
        ProgramaPunto punt1 = new ProgramaPunto();
        punt1.x=5;
        punt1.y=0;
        
        ProgramaPunto punt2 = new ProgramaPunto();
        punt2.x=10;
        punt2.y=10;
        
        ProgramaPunto punt3 = new ProgramaPunto();
        punt3.x=-3;
        punt3.y=7;
        
        System.out.println("cooredanas 1: "+ punt1.x+","+punt1.y);
        System.out.println("cooredanas 2: "+ punt2.x+","+punt2.y);
        System.out.println("cooredanas 3: "+ punt3.x+","+punt3.y);
        
    }
}
