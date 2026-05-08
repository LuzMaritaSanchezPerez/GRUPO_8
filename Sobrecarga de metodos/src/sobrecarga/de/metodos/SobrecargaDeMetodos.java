/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga.de.metodos;
/**
 *
 * @author DELL
 */
public class SobrecargaDeMetodos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PROGRAMA USUARIO");
        
        /* Se declaran TRES objetos de la clase Usuario */
        Usuario usr1,usr2,usr3;
        
        /* Se utiliza el constructor por omisión */
        usr1 = new Usuario();
        System.out.println("\n--------Usuario 1 --------\n");
        usr1.imprimeUsuario();
        
        /* Se utiliza el segundo constructor de Usuario*/
        usr2 = new Usuario("Eduardo","257555","edu@hotmail.com");
        System.out.println("\n--------Usuario 2 --------\n");
        usr2.imprimeUsuario();
        
        /* Se utiliza el tercer constructor de Usuario */
        usr3 = new Usuario(usr2);
        System.out.println("\n--------Usuario 3 --------\n");
        usr3.imprimeUsuario();
        usr1.setClave("12345");
        usr2.setClave(12345);
        System.out.println("\n--------Usuario 1 --------\n");
        usr1.imprimeUsuario();
        System.out.println("\n--------Usuario 3 --------\n");
        usr2.imprimeUsuario();
        System.out.println("\n--------Usuario 3 --------\n");
        usr2.imprimeUsuario();
    }   
}
