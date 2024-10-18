/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

public class Hospedaje extends Servicio {
    
    private String hospedaje;
    private double precioPorNoche;

    public Hospedaje(String codServi, double porcentajeDesc, boolean enProm,String hospedaje, double precioPorNoche) {
        super(codServi, porcentajeDesc, enProm);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }
    
    @Override    
    public double calcularPrecioFinal(LocalDate dia)
    {
        int diaSemanaActual = dia.getDayOfWeek().getValue();
        if(enPromocion && (diaSemanaActual < 6))
        {
            return precioPorNoche * (1 - porcentajeDescuento / 100);
        }else{return precioPorNoche;}
    }
    
}

