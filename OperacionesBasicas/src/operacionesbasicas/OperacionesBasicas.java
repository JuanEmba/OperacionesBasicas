
package operacionesbasicas;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    int valor1 = 10, valor2 = 8;
    float suma, resta, multiplicación, division;

    
    public void Suma (int valor1, int valor2) {
    //Reliza el cálculo de la suma
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
    }
    
    public void Resta (int valor1, int valor2) {
    //Reliza el cálculo de la resta
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
    }
    
    public void Multiplicacion (int valor1, int valor2) {
    //Reliza el cálculo de la multiplicación
        multiplicación = valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicación);
    }
    
    public void Division (int valor1, int valor2) {
    //Reliza el cálculo de la división
        division = valor1 / valor2;
        System.out.println("La division es: " + division);
    }
    
   
    
    
    public static void main(String[] args) {        
        OperacionesBasicas operaciones = new OperacionesBasicas();
        operaciones.Suma(10,6);
        operaciones.Resta(34,6);
        operaciones.Division(2,2);
        operaciones.Multiplicacion(4,4);
    }
    
   
}
