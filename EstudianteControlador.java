/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlestudiante;

import java.util.ArrayList;

/**
 *
 * @author UCC20300
 */
public class EstudianteControlador {
    ArrayList<Estudiante> stds = new ArrayList();
    public void agregar(Estudiante nuevo_estudiante){
        stds.add(nuevo_estudiante);
    }
    public void listar(){
        for(int i=0; i<stds.size();i++){
            stds.get(i).verDatos();
        }
    }
}

// Cambio Realizado por luz
//cambio realizado
// Cambio Realizado por Luz 
