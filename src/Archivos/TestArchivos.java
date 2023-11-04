
package Archivos;

import java.util.Scanner;

public class TestArchivos {//Inicia clase
    
    public static void main(String[] args) {//inicia main
        int opcion=0;
        MetodosArchivos miArchivo=new MetodosArchivos();
        
        do{//inicia do-while
            System.out.println("Ingresa una opcion\n1.- Solicitar nombre del archivo"
                               +"\n2.- Ingrese texto del archivo\n"
                                +"\n3.- Agrege mas texto al archivo\n"
                                 +"\n4.- Leer-Consultar texto del archivo\n"
                                  +"\n5.- Salir\n"); 
            Scanner arje=new Scanner(System.in);
            opcion=arje.nextInt();
            String ruta="C:\\Users\\HP\\Documents\\NetBeansProjects\\Sesion5JavaCruz\\src\\Archivos"+miArchivo.nom+".txt";
            
            switch(opcion){
                case 1:miArchivo.nombreA();  break;
                case 2:miArchivo.texto(); miArchivo.escribir(ruta, miArchivo.linea);
                      break;
                case 3:
                       miArchivo.texto();  
                       miArchivo.escribir(ruta, miArchivo.linea);
                       break;
                case 4:System.out.println(miArchivo.leer(ruta));  break;
                case 5: System.out.println("\nFinalizo Programa"); break;
                default: System.out.println("\nopcion invalida: Solo tengo Opcion: 1.- \n2.- \n3.- \n4.- \n5.- "); break;
            
            }//termina switch
        }//termina do-while
          while(opcion<5);
       
    }//termina main
   
}//termina clase
