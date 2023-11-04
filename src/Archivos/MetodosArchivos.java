
package Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; //libreria para escribir entrada y salida de l archivo
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MetodosArchivos {//inicia clase
    //defdinicion de variables  
    String nom;//variable para nombre del archivo
    String linea;//identificar lineas de escritura ene le archivo
    
    //funcion para solicitar el nombre del archivo 
    public void nombreA(){
        System.out.println("\nIngrese el nombre del archivo a generar: \n");
        Scanner arje=new Scanner(System.in);
        nom = arje.next();
        System.out.println("\nel nombre de tu archivo es: \n"+nom+".txt");   
    }//termina funcion para soloictar el nombre del archivo
    
    //funcion para ingresar texto
    public void texto(){
        System.out.println("\nCapture el texto que desea agregar en elk archivo: \n");
        Scanner arje= new Scanner(System.in);
        linea=arje.nextLine();
    }//termina funcion texto
    
    //funcion para escribir el texto en el archivo
    public void escribir(String ruta, String cadena){
        File archivo = new File(ruta);//se lee el archivo y ruta
        //estructura de control paqraa tratamiento de errores try-catch  trata de hacer, si hay un error local
        try{
            FileWriter escribirArchivo=new FileWriter(archivo,true);//escribe en el archivo
            BufferedWriter buffer=new BufferedWriter(escribirArchivo);//lee ele archivo
            buffer.write(cadena);//escrine la linea que recibe
            buffer.newLine();//crea una nueva linea
            buffer.close();//cierra la funcion escritura
        }//termina try
         catch(Exception e){
            System.out.println("Error en el archivo o codigo verifica: "+e);
        }//termina catch  
    
    }//termina funcion escribir
     
     //funcion para leer el conternido del archivo
     public String leer(String ruta){//inicia funcion leer
     //tipo de datos dinamicos arrayList almacena valores y lo sorocesa
     ArrayList array = new ArrayList();
     String linea = "";
     String retornar = "";
     File archivo = new File (ruta);//leeer la ruta y ek archivo
         try {//inicia try
           FileReader leerArchivo = new FileReader(archivo);//sentencia para leer el archivo
           BufferedReader buffer = new BufferedReader(leerArchivo);
           while((linea = buffer.readLine())!=null){//inicia while
             retornar += linea +"\n";
           }//termina while
            buffer.close();
         } catch (Exception e) {//inicia cath
             System.out.println("\nError verifica instrucciones!!!!");
         }//termina catch
  
     return retornar;
     }//termina funcion leer
     
     
}//termina clase
