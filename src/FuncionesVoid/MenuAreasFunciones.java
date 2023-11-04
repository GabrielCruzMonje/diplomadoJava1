
package FuncionesVoid;

import java.util.Scanner;

public class MenuAreasFunciones {//inicia clase
    //metodos de visibilidad globlal  el ambito debera ser publi static para los elemntos
    public static MenuAreasFunciones apuntadorMetodo= new MenuAreasFunciones();
    public static Scanner entradaDato = new Scanner(System.in);
      public static int menu;//variable local
     //funcion calcular area cuadrado  
    public void areaCuadrado(){
        //entrada declaracion de variables y entrada de datos
        System.out.println("Captura lado: ");
        float lado=entradaDato.nextFloat();
        //proceso
        float areaCuadradoR=lado*lado;
        //salida
        System.out.println("Area  cuadrado es  : "+areaCuadradoR);
    }//termina funcion area cuadrado
    
      //funcion calcular area rectangulo
    public void areaRectangulo(){
        System.out.println("Captura el valor de la base:");
        float base=entradaDato.nextFloat();
        System.out.println("Captura el valor de la Altura:");
        float altura=entradaDato.nextFloat();
        float areaRectanguloR=base*altura;
        System.out.println("Area es rectangulo es :"+areaRectanguloR);
    }//termina funcion area rectangulo
    
    //funcion menuAreas
     //funcion menu areas
    public void menuAreas(){
         do{//inicia do
        System.out.println("Menu areas (Selcciona)\n1. Area cuadrado\n2. Area Rectangulo\n3. Salir");
           menu=entradaDato.nextInt();
           switch(menu){
               case 1:apuntadorMetodo.areaCuadrado(); break;
               case 2:apuntadorMetodo.areaRectangulo();break;
               case 3:System.out.println("HA finalizado programa");break;
               default:System.out.println("Opcion invalida solo tengo \n1. o  2. \n");break;
           }//termina switch
           }while(menu!=3);
    }//termina funcion menu area
    
    
    
        
    public static void main(String[] args) {//inica main
        //llamada o invocacion
        //1. realizar un objeto para llamar a la funcion (funcion tipo apuntador por la clase)
        // MenuAreasFunciones apuntadorMetodo=new MenuAreasFunciones();
         //2. El objeto apuntador  lama a la funcion       
        // apuntadorMetodo.areaCuadrada();     
         //apuntadorMetodo.areaRectangulo();
         
      apuntadorMetodo.menuAreas();   
    }//termina main
         
}//termina clase
