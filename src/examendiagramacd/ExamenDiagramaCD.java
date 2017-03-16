/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendiagramacd;

import javax.swing.JOptionPane;

/**
 * 
 * @author agarridogarcia
 */
public class ExamenDiagramaCD {

    /**
     * Esta clase se usa como menú con un switch
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int opcion = 0;
        SetHora seth=new SetHora();
        SetAlarma alarm=new SetAlarma();
        AlarmaONoff ala= new AlarmaONoff();
        
    
    
    
    
   
  
         
         do{
             try{
                 opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1 Poner hora actual \n2 Configurar hora alarma \n3 Activar alarma  \n4 desactivar alarma \n5 Apagar altavoz \n7 Salir"));
                 
             }catch(Exception ex){
                 System.out.println(ex.getMessage());
                 opcion=0;
             }
            switch(opcion){
            case 1:seth.ponerHoraActual();
                break;
            case 2:alarm.ponerHora(10, 45);
                break;
            case 3:ala.activarAlarma();
                break;
            case 4:ala.desactivarAlarma();
                break;
            case 5:ala.sonarAlarma();
                break;
            
            
            case 6:System.exit(0);
                
            
    }
    
}while(opcion<7);
    }
    }
    
