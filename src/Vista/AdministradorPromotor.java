/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.AdminitradorDatos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
/**
 *
 * @author mapii
 */
public class AdministradorPromotor implements Vista{
private Scene escena;
private MenuItem menuItem1;
    public AdministradorPromotor() {
       BorderPane Pane = new BorderPane();
        Label l=new Label("Proximamente");
        l.setFont(new Font("Arial", 70));
        Pane.setCenter(l);
        Menu menu = new Menu("Opciones");
        this.menuItem1 = new
        MenuItem("Menu principal");
        MenuBar menuBar = new MenuBar();
        menu.getItems().add(menuItem1);
        menuBar.getMenus().add(menu);
        Pane.setTop(menuBar);
        this.escena = new Scene(Pane,1000, 650);
    }

    public MenuItem getMenuItem1() {
        return menuItem1;
    }

    public void setMenuItem1(MenuItem menuItem1) {
        this.menuItem1 = menuItem1;
    }


    @Override
    public Scene getScene() {
        return this.escena; 
    }
    
}
