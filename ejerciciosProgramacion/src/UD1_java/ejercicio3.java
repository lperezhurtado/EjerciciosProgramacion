package UD1_java;

public class ejercicio3
{
            public static void main(String[] args) {
                double precio = 100.0;
                double IVA = 0.21;
                double ivaprecio = precio * IVA;
                System.out.println("Precio : " + precio);
                System.out.println("Precio con IVA: " + (precio + ivaprecio));
            }

}