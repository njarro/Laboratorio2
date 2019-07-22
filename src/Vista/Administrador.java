/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author mapii
 */
public class Administrador implements Vista {
    private Scene escena;
    private  MenuItem menuItem2;
    private MenuItem menuItem1;
    private MenuItem menuItem3;
    public Administrador() {
        BorderPane Pane = new BorderPane();
        //Menu
        Menu menu = new Menu("Opciones");
        this.menuItem1 = new
        MenuItem("Gestion promotores");
        this.menuItem2 = new
        MenuItem("Gestion aportantes");
        this.menuItem3 = new
        MenuItem("Menu principal");
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menu.getItems().add(menuItem3);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        Label subastas =new Label("SUBASTAS POO");
        subastas.setFont(new Font("Arial", 60));
        Pane.setCenter(subastas);
        Pane.setTop(menuBar);
        this.escena = new Scene(Pane, 1000, 650);
    }

    public MenuItem getMenuItem2() {
        return menuItem2;
    }

    public void setMenuItem2(MenuItem menuItem2) {
        this.menuItem2 = menuItem2;
    }

    public MenuItem getMenuItem1() {
        return menuItem1;
    }

    public void setMenuItem1(MenuItem menuItem1) {
        this.menuItem1 = menuItem1;
    }

    public MenuItem getMenuItem3() {
        return menuItem3;
    }

    public void setMenuItem3(MenuItem menuItem3) {
        this.menuItem3 = menuItem3;
    }

    @Override
    public Scene getScene() {
        return this.escena; 
    }
    }
    
   
    

