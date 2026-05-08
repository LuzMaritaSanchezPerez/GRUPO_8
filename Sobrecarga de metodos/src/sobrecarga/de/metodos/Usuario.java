package sobrecarga.de.metodos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class Usuario {
    static int id=0;
    String nombre;
    String clave; 
    String correo;
    /* El constructor de la clase Usuario esta sobrecargado */ 
    Usuario( ) 
    { 
        id=id+1;
        nombre = null; 
        clave = "123"; 
        correo = null;
    }     
    Usuario(String nombre, String clave, String correo) 
    {
        this.nombre = nombre; 
        this.clave = clave; 
        this.correo = correo; 
        id=id+1; 
    }
    Usuario(Usuario usr)
    { 
        nombre = usr.getNombre();
        clave = usr.getClave(); 
        correo = usr.getCorreo(); 
        id = usr.getId(); 
    } 
    void setNombre(String n) 
    { 
        nombre = n;
    } 
    String getNombre() 
    {
        return nombre; 
    } 
    /* El metodo setClave() está sobrecargado */ 
    void setClave(String c) 
    {
        clave = c; 
    }
    void setClave(int c)
    {
        clave = Integer.toString(c); 
    } 
    String getClave() 
    {
        return clave; 
    }
    void setCorreo(String d)
    {
        correo = d; 
    }
    String getCorreo() 
    {
        return correo; 
    }
    void setId(int i)
    {
        id = i; 
    }
    int getId() 
    {
        return id;
    }
    void imprimeUsuario() 
    {
        System.out.println("\nNombre: " + nombre ); 
        System.out.println("\nIdentificador: " + id );
        System.out.println("\nClave: " + clave );
        System.out.println("\nCorreo: " + correo ); 
    } 
}
