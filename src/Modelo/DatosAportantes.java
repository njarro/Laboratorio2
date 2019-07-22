/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mapii
 */
public class DatosAportantes {
    private static DatosAportantes 
                     datosAportantes;
    public ArrayList<Aportantes> aportantes;

    public DatosAportantes() {
        this.aportantes=new ArrayList<>();
    }
    
    public static DatosAportantes getDatosAportantes(){
      if (datosAportantes == null)
          datosAportantes = new DatosAportantes();
      return datosAportantes;
    }
    public void imprimir() throws IOException{
        File archivoSalida=new File("Aportantes.txt");
        
            Scanner input =new Scanner(archivoSalida);
            while(input.hasNext()){
                String nombre=input.next();
                String apellido=input.next();
                String tarjeta=input.next();
                Aportantes ap =new Aportantes(nombre,apellido,tarjeta);
                aportantes.add(ap);
            }
        archivoSalida.delete();
                //Salida
                PrintStream salida=null;
                salida=new PrintStream(archivoSalida);
                for(Aportantes item:aportantes){
                    salida.println(item.getNombre());
                    salida.println(item.getApellido());
                    salida.println(item.getNumerot());
                    
                }
                salida.flush();
                salida.close();
    }
}
