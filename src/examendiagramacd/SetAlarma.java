/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendiagramacd;

/**
 *
 * @author agarridogarcia
 */
public class SetAlarma {
    /**
     * 
     * @return ponerHora recibe el metodo  horadeSonar: recibe horas y minutos y devuelve la hora configurada.
     */
    
    public int ponerHora(int hora, int minutos){
        int horadeSonar =hora+minutos;
        System.out.println("Hora actual");
        return horadeSonar;
    }
    
    /**
     * @param recibe hora y minutos de la hora actual y la alarma configurada para que suene, las compara cuando coinciden suena
     */
    
    public void comparaHoraActualconAlarma(int horaActual,int horaAlarma){
        if(horaActual==horaAlarma)
            System.out.println("Coincide hora, va  asonar");
        else
            System.out.println("no coinciden horas");
        
    }
    
}
