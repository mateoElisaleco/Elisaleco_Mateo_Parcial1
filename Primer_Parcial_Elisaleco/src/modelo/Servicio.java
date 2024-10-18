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
abstract class Servicio {
    protected String codServicio;
    protected double porcentajeDescuento;
    protected boolean enPromocion;

    public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion) {
        this.codServicio = codServicio;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
    }
    
    
    public abstract double calcularPrecioFinal(LocalDate dia); 

    public String getCodServicio() {
        return codServicio;
    }

    public boolean getEnPromocion() {
        return enPromocion;
    }
    
}

class Gastronomia extends Servicio {
    
    private String gastronomia;
    private double precio;
    private int diaSemDesc;

    public Gastronomia(String codServ, double porcentajeDesc, boolean enProm,String gastronomia, double precio, int diaSemDesc, String codServicio, double porcentajeDescuento, boolean enPromocion) {
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


