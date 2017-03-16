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
public class Display {
    /**
     * @param set creo objeto ala para llamar a la clase SetHora
     * @param alar creo objeto ala para llamar a la clase SetAlarma
     */
    
    SetHora set=new SetHora();
    SetAlarma alar=new SetAlarma();
    
    /**
     * @param mostarHoraActual llama a la clase SetHora para mostrar la hora
     */
    public void mostrarHoraActual(){
        set.ponerHoraActual();
        
        
    }
    /**
     * @param mostarAlarmaActivada llama a la clase SetAlarma para mostrar la hora
     */
    
    public void mostrarAlarmaActivada(){
        alar.ponerHora(10, 3);
        
        
    }
    
    
}
