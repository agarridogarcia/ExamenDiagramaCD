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
public class SetHora {
    /**
     * @param hora 
     * @param minutos
     * @param HoraActual
     */
    int hora;
    int minutos;
    int horaActual;
    /**
     * 
     * @return horaActual devuelve hora y usa metodos incrementarHora() e incrementarMinutos()
     */
    
    public int ponerHoraActual(){
        horaActual=incrementarHora();
        incrementarMinutos();
        return  horaActual;
        
    }
    /**
     * 
     * @return incrementarHora devuelve una hora más
     */
    public int incrementarHora(){
        System.out.println("Hora incrementada");
        return hora++;
    }
     /**
     * 
     * @return incrementarHora devuelve un minuto más
     */
    
    public int incrementarMinutos(){
        System.out.println("Minuto incrementado");
        return minutos++;
    }
    
    
}
