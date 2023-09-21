/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.msof.tarea1grupo3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import ups.msof.tarea1grupo3.modelo.ActivoFijoBuilder;
import ups.msof.tarea1grupo3.vista.Vista;

/**
 *
 * @author flopezs
 */
public class Controlador implements ActionListener{
    private Vista view;
    private ActivoFijoBuilder modelo;
    
    public Controlador (Vista view, ActivoFijoBuilder modelo)
    {
        this.view=view;
        this.modelo=modelo;
        this.view.jButtonGrabar.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Activo Fijo");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed (ActionEvent e){
       
        this.modelo=new ActivoFijoBuilder(view.jTextCodigo.getText(),
                view.jTextNombre.getText(),
        Double.parseDouble(view.jTextPrecio.getText())) 
                .addUbicacion(view.jTextUbicacion.getText())
                .addNumeroExistentes(Integer.parseInt(
                        view.jTextExistentes.getText()))
                .addMarca(view.jTextMarca.getText())
                .addProveedor(view.jTextProveedor.getText())
                .addVidaUtilAnios(Integer.parseInt(
                        view.jTextVidaUtil.getText()));
       // view.jTextListado.setText(String.valueOf(modelo.build().toString()));
            DefaultTableModel plantilla=(DefaultTableModel)
                    view.jTableListado.getModel();
            plantilla.addRow(new Object[]{ view.jTextCodigo.getText(),
                view.jTextNombre.getText(),
        view.jTextPrecio.getText(),view.jTextUbicacion.getText(),
            view.jTextExistentes.getText(),view.jTextMarca.getText(),
            view.jTextProveedor.getText(),
            view.jTextVidaUtil.getText()} );
            limpiar();
    }
    
    public void limpiar(){
        view.jTextCodigo.setText("0");
        view.jTextNombre.setText("-");
        view.jTextPrecio.setText("0.0");
        view.jTextUbicacion.setText("-");
        view.jTextExistentes.setText("0");
        view.jTextMarca.setText("-");
        view.jTextProveedor.setText("-");
        view.jTextVidaUtil.setText("0");
    }
}
