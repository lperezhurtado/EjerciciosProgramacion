
package UD6_POO.rectangulo;

public class Main {
    
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;
        
        int perimetro = 2*((Math.max(r1.x1,r1.x2)-Math.min(r1.x1, r1.x2))+(Math.max(r1.y1,r1.y2)-Math.min(r1.y1, r1.y2))); 
        int area = ((Math.max(r1.x1,r1.x2)-Math.min(r1.x1, r1.x2))*(Math.max(r1.y1,r1.y2)-Math.min(r1.y1, r1.y2)));
        
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;
        
        int perimetro2 = 2*((Math.max(r2.x1,r2.x2)-Math.min(r2.x1, r2.x2))+(Math.max(r2.y1,r2.y2)-Math.min(r2.y1, r2.y2))); 
        int area2 = ((Math.max(r2.x1,r2.x2)-Math.min(r2.x1, r2.x2))*(Math.max(r2.y1,r2.y2)-Math.min(r2.y1, r2.y2)));
        
        System.out.println("Perimetro r1: "+perimetro);
        System.out.println("Area r1: "+area);
        
        System.out.println("Perimetro r2: "+perimetro2);
        System.out.println("Area r2: "+area2);
        
    }
    
    
}
