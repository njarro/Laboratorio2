/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.AdministradorAportante;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mapii
 */
public class ControladorAdmAportante {
    private AdministradorAportante vista;

    ControladorAdmAportante() {
        this.vista=new AdministradorAportante();
        this.vista.getMenuItem1().setOnAction(new Evento());
    }

    public AdministradorAportante getVista() {
        return vista;
    }

    public void setVista(AdministradorAportante vista) {
        this.vista = vista;
    }

    private class Evento 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controlador1 controlador = new 
                Controlador1();
           Scene escena =
                   controlador.getVista().getScene();
           stage.setTitle("Escena 1");
           stage.setScene(escena);
        }
        
    }
    
    
}
