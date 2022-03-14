/*
 Ejercicio de Documentación
 * Empleados - Versión sin documentar
 */
package Ejercicios_ED;
/**
 * Clase Empleado
 * gestiona la informacion personal de un empleado
 * @author Luis Perez <lperezhurtado97@gmail.com>
 * @version 14-03-2022
 */
public class Empleado {

    //Atributos
    /**
     * nombre empleado
     */
    private String nombre;
    /**
     * Variable para apellido empleado
     */
    private String apellido;
    /**
     * Variable para edad empleado
     */
    private int edad;
    /**
     * Variable para salario del empleado
     */
    private double salario;

    //Metodos publicos
    /**
     * Metodo que realiza un aumento en salario si edad es mayor a 40
     * @param sueldoPlus: cantidad del aumento
     * @return boolean aumento, para saber si se ha realizado el aumento o no
     */
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    //Metodos privados
    /**
     * Metodo para comprobar si el objeto empleado tiene nombre o por defecto es
     * un campo vacio
     * @return false si no tiene nombre
     *         true si lo tiene
     */
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }

    //Constructores
    /** COnstructor sin parametros, crea un empleado sin datos*/
    public Empleado() {
        this("", "", 0, 0);
    }

    /**
     * Constructor con parametros, crea un empleado con sus correspondietes datos
     * @param nombre: nombre del empleado
     * @param apellido: apellido del empleado
     * @param edad: edad del empleado
     * @param salario: salario del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
