
package UD6_POO.articulos;

public class Main {
    
    public static void main(String[] args) {
        
        Articulo art1 = new Articulo();
        
        art1.nombre = "pantalon";
        art1.precio = 100;
        art1.cuantosQuedan = 10;
        
        System.out.println(art1.nombre+" - "+"Precio: "+art1.precio+" - "+"PVP: "+art1.precio*art1.iva);
        
    }
}
