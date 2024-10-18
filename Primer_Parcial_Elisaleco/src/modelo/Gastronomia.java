/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Mateo Elisaleco
 */
public class Gastronomia extends Servicio {
    
    private String gastronomia;
    private double precio;
    private int diaSemDesc;

    public Gastronomia(String codServ, double porcentajeDesc, boolean enProm,String gastronomia, double precio, int diaSemDesc) {
        super(codServ, porcentajeDesc, enProm);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }

    
    
        @Override    
    public double calcularPrecioFinal(LocalDate dia)
    {
        int diaSemanaActual = dia.getDayOfWeek().getValue();
        if(enPromocion && (diaSemanaActual == diaSemDesc ))
        {
            return precio * (1 - porcentajeDescuento / 100);
        }
        else{return precio;}
    }
    
}