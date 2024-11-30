/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.proyectoautomovil.clases;

import ec.edu.espoch.proyectoautomovil.enumeraciones.Color;
import ec.edu.espoch.proyectoautomovil.enumeraciones.TipoAutomovil;
import ec.edu.espoch.proyectoautomovil.enumeraciones.TipoCombustible;

/**
 *
 * @author jordy
 */
public class Automovil {
    
    private String marca;
    private String modelo;
    private float motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private float velocidadMax;
    private Color color;
    private float velocidadActual;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, float motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, float velocidadMax, Color color, float velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    
    
}
