/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author mapii
 */
public class AdminitradorDatos {
    private static AdminitradorDatos 
                     administradorDatos;
    public ObservableList<Promotor> data=FXCollections.observableArrayList(
        new Promotor("Gabriel","Riascos","Descubrimiento cientifico","1.000.00"),
        new Promotor("Julio","Ojeda","Nueva Marca","800.000"),
        new Promotor("Sebastian","Delgado","Produccion en masa","600.000"),
        new Promotor("Nicolas","Jarro","Descubrimiento cientifico","400.00")
        );
    public static AdminitradorDatos getAdministradorDatos(){
      if (administradorDatos == null)
          administradorDatos = new AdminitradorDatos();
      return administradorDatos;
    }
    public void imprimir() throws IOException{
        File archivoSalida=new File("Promotores.txt");
        if(archivoSalida.exists()){
            Scanner input =new Scanner(archivoSalida);
            while(input.hasNext()){
                String nombre=input.next();
                String apellido=input.next();
                String dinero=input.next();
                String tipo=input.next();
                Promotor pr =new Promotor(nombre,apellido,dinero,tipo);
                data.add(pr);
            }
        archivoSalida.delete();
                //Salida
                PrintStream salida=null;
                salida=new PrintStream(archivoSalida);
                for(Promotor item:data){
                    salida.println(item.getNombre());
                    salida.println(item.getApellido());
                    salida.println(item.getDinero());
                    salida.println(item.getTipo());
                }
                salida.flush();
                salida.close();
        }
    }
}
