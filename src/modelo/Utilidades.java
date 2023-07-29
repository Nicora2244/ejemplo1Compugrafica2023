/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author nicolas.ramirez_ara
 */
public class Utilidades {
    
    public static boolean guardarArchivos(LinkedList<Cliente> listaC){
        boolean t=false;
        try{
            
            String nombreArchivo = "Clientes.txt";
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (Cliente cliente: listaC){
                writer.write(cliente.toString()+"\n");
            }
            writer.close();
            fileWriter.close();
            t=true;
        }catch (IOException e){
            e.printStackTrace();
        }
        
        return t;
    }
    
    public static LinkedList<Cliente> guardarArchivo(){
           
}