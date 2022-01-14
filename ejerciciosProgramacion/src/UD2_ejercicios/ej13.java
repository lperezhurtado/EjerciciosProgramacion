package UD2_ejercicios;

public class ej13
{
    public static void main(String[] args){
        boolean a = 25 > 20 && 13 > 5;
        boolean b = 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2;
        boolean c = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        boolean d = 10 <= 2 * 5 && 3 < 4 || ! (8 > 7) && 3 * 2 <= 4 * 2 - 1;
        
        System.out.println("a) "+a);
        System.out.println("b) "+b);
        System.out.println("c) "+c);
        System.out.println("d) "+d);
    }
}