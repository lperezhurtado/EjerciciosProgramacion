
package UD7_Excepciones.BloqueC;

public class Ej1 {
    
    public static void imprimePositivo(int p) throws Exception{
        
        if(p < 0){
            throw new Exception("El numero es negativo, no positivo");
        }
        
        else{
            System.out.println("Valor: " + p);
        }
        
    }
    
    public static void imprimeNegativo(int n) throws Exception{
        
        if(n >= 0){
            throw new Exception("El numero es positivo, no negativo");
        }
        
        else{
            System.out.println("Valor: " + n);
        }
        
    }
    
    public static void main(String [] args) throws Exception{ 
        
        int numero = 0;
        
        try{
        imprimeNegativo(5);
        
        
        }
        
        catch(Exception e){
            
            e.printStackTrace();
        }
        
    }

}
    

    

