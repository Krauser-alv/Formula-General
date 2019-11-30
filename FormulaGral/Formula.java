
/**
 * Formula general
 *
 * @author Chávez Sánchez Kevin Edilberto
 * @version 2019 11 29 
 */
public class Formula
{
    //Area para declaracion de variables
   

    /**
     * Constructor de objetos de la clase Formula
     */
    public Formula()
    {
        
        
    }
    /**
     * Este metodo nos ayuda a obtener la raiz positiva de la formula general
     * @param necesita de 3 variables de tipo double a, b, c
     * @return double
     */
    public double obtenerX1(double a,double b,double c){
        double aux;
        double discriminante;
        
        discriminante = Math.pow(b,2)-(4*a*c);
        if (discriminante == 0){
            return (-b+(Math.sqrt(discriminante)))/(2*a);
        }else if (discriminante > 0){
            return (-b+(Math.sqrt(discriminante)))/(2*a);
        }else return 0;
    }
    /**
     * Este metodo nos ayuda a obtener la raiz negativa de la formula general
     * @param necesita de 3 variables de tipo double a, b, c
     * @return double
     */
    public double obtenerX2(double a,double b,double c){
        double aux;
        double discriminante;
                
        discriminante = Math.pow(b, 2)-(4*a*c);
        if (discriminante == 0){
            return (-b+(Math.sqrt(discriminante)))/(2*a);
        }else if (discriminante > 0){
            return (-b-(Math.sqrt(discriminante)))/(2*a);
        }else return 0;
    }
    
    
    
    
}
