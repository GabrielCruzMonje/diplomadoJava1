
package funcionesretorno;

public class TestFunciones {//inicia clase
    
   //se genera un objeto (la clase)
    
    public static MatematicasFunciones apuntadorMetodo=new MatematicasFunciones();
    
    public static void main(String[] args) {//inicia main        
        System.out.println("Suma es : "+MatematicasFunciones.suma(235, 455));
        
        System.out.println("Resta es : "+MatematicasFunciones.resta(235, 455));
        
        System.out.println("divi es : "+MatematicasFunciones.divi(235, 455));
        
        System.out.println("Multi es : "+MatematicasFunciones.multi(235, 455));
               
    }//termina main
    
}//termina clase
