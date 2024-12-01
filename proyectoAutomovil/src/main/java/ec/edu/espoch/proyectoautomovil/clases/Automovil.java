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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public float getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(float velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(float velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public void acelerarAuto() {
        float incremento=0;
        if (velocidadActual +incremento > velocidadMax) {
            System.out.println("No se puede acelerar más allá de la velocidad máxima de " + velocidadMax + " km/h.");
        } else {
            velocidadActual += incremento;
            System.out.println("Velocidad actual después de acelerar: " + velocidadActual + " km/h.");
        }           
    }
    public void desacelerarAuto() {
        float decremento=0;
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        } else {
            velocidadActual -= decremento;
            System.out.println("Velocidad actual después de desacelerar: " + velocidadActual + " km/h.");
        }
    }
    
    public void frenarAuto() {
        velocidadActual = 0;
        System.out.println("El automóvil ha frenado. Velocidad actual: " + velocidadActual + " km/h");
    } 
    
    public float calcularTiempoEstimadoLlegada() {
        float distancia=100;
        if (velocidadActual == 0) {
            System.out.println("El automóvil está detenido.");
        }
        return distancia / velocidadActual;
    }
}
