package ej5.pkg1;

public class Ej51 {

    public static void main(String[] args) {
        /* Evaluar la Función Y= 5X^4 + 2X^3 + 3X^2 + 7 para el valor de 
        a) X=1 */
        
        System.out.println("Ingrese el valor de X  y presione ENTER: ");
        double x = 1;
        //double y= (5* (Math.pow(x,4)))+(2*(Math.pow(x,3)))+(3*(Math.pow(x,2)));
        double y = 5 * Math.pow(x, 4) + 2 * Math.pow(x, 3) + 3 * Math.pow(x, 2) + 7;
        System.out.println("El valor de Y para X =" + x + "es: "  + y);
        
    }
    
}
