//Clase cliente, para probar los metodos
public class test01
{
    /**
     * Este método se encarga de iniciar la ejecución del programar
     * Éste es el método principal del proyecto
     * @param args[] ignorar-
     * @return void
     */
    public static void main(String []args){
        Formula test = new Formula();
        
        StdOut.println("Formula General");
        
        StdOut.println("x1: ");
        StdOut.println(test.obtenerX1(2,9,10));// RESULTADO -2
        
        StdOut.println("x2: ");
        StdOut.println(test.obtenerX2(2,9,10));// RESULTADO -2.5 = (-5/2)
        
        StdOut.println();
        StdOut.println("x1: ");
        StdOut.println(test.obtenerX1(5,7,2));// RESULTADO (-2/5) = -0.4
        
        StdOut.println("x2: ");
        StdOut.println(test.obtenerX2(5,7,2));// RESULTADO -1
        

        
    }
}
