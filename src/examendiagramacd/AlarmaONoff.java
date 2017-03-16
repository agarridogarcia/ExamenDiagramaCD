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
public class AlarmaONoff {
    /**
     * @param ala creo objeto ala para llamar a la clase SetAlarma
     */
    SetAlarma ala=new SetAlarma();
    
    /**
     * 
     * @return activarAlarma devuelve true si está activa
     */
    
    public boolean activarAlarma(){
        System.out.println("Alarma encendida");
        return true;
    }
    /**
     * 
     * @return desactivarAlarma devuelve false si está desactivada
     */
    public boolean desactivarAlarma(){
        System.out.println("Alarma apagada");
        return false;
        
    }
    /**
     * @param sonarAlarma llama al metodo compararHoraActualconAlarma si coinciden las horas suena
     */
    public void sonarAlarma(){
        ala.comparaHoraActualconAlarma(10, 3);
       
    }
}
