/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ups.msof.tarea1grupo3;

import ups.msof.tarea1grupo3.controlador.Controlador;
import ups.msof.tarea1grupo3.modelo.ActivoFijoBuilder;
import ups.msof.tarea1grupo3.vista.Vista;

/**
 *
 * @author flopezs
 */
public class Tarea1Grupo3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ActivoFijoBuilder modelo=new ActivoFijoBuilder();
       // Modelo modelo=new Modelo();
        Vista view=new Vista();
        Controlador controlador=new Controlador(view,modelo);
        controlador.iniciar();
        view.setVisible(true);
    }
}
