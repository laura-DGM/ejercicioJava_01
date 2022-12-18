
package ejercicio1poo;

 
public class valorFaltante {
     public void valorFaltante(int [] datos){
        int i=1 ;
       boolean n1=false,n2=false,n3=false,n4=false,n5=false;
       while (i<6){
           if (datos[i-1] ==1){
                System.out.print("1 esta en la posicion:"+(i-1)+"\n");
                n1=true;
           } 
           if (datos[i-1] ==2){
                System.out.print("2 esta en la posicion:"+(i-1)+"\n");
                n2=true;
           } 
           if (datos[i-1] ==3){
                System.out.print("3 esta en la posicion:"+(i-1)+"\n"); 
                n3=true;
           } 
           if (datos[i-1] ==4){
                System.out.print("4 esta en la posicion:"+(i-1)+"\n");                        
                n4=true;
           } 
           if (datos[i-1] ==5){
               System.out.print("5 esta en la posicion:"+(i-1)+"\n"); 
               n5=true;
           }
           i++;                
        }
        if (n1==false){System.out.print("no esta el valor 1 ");}
        if (n2==false){System.out.print("no esta el valor 2 ");}
        if (n3==false){System.out.print("no esta el valor 3 ");}
        if (n4==false){System.out.print("no esta el valor 4 ");}
        if (n5==false){System.out.print("no esta el valor 5 ");}    
        
    } 
    
}
