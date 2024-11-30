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
 */
public class ProyectoAutomovil {

    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Toyota", "Corolla", 8, TipoCombustible.GASOLINA, TipoAutomovil.COMPACTO, 4, 5, 180, Color.NEGRO,40);
    
        
    }
}
