/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.proyectoautomovil;

import ec.edu.espoch.proyectoautomovil.clases.Automovil;
import ec.edu.espoch.proyectoautomovil.enumeraciones.Color;
import ec.edu.espoch.proyectoautomovil.enumeraciones.TipoAutomovil;
import ec.edu.espoch.proyectoautomovil.enumeraciones.TipoCombustible;

/**
 *
 * @author jordy
 * @author carla
 */
public class ProyectoAutomovil {

    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Toyota", "Hilux", 8, TipoCombustible.DIESEL, TipoAutomovil.COMPACTO, 4, 5, 280, Color.NEGRO,100);
    
        miAuto.mostrarDetalles();
        miAuto.acelerarAuto(20);
        miAuto.desacelerarAuto(50);
        
        float distancia = 200;
        float tiempoEstimado = miAuto.calcularTiempoEstimadoLlegada(distancia);
        if (tiempoEstimado != -1) {
            System.out.println("Tiempo estimado de llegada a " + distancia + " km: " + tiempoEstimado + " horas");
        }
        
        miAuto.frenarAuto();
        
        
    }
}
