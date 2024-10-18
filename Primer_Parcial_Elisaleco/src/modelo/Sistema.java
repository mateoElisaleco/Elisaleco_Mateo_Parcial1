/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Servicio;
/**
 *
 * @author Mateo Elisaleco
 */
public class Sistema {
    private List<Servicio> lstServicio; 
    
    public Servicio traerServicio(String codServicio)
    {
     for(Servicio servicio : lstServicio)
     {
         if (servicio.getCodServicio().equals(codServicio))
         {
             return servicio;
         }
     }
         return null;
    }
    
    public List<Servicio> traerServicio(boolean enPromocion) {
        List<Servicio> serviciosEnPromocion = new ArrayList<>();
        for (Servicio servicio : lstServicio) {
            if (servicio.getEnPromocion() == enPromocion) {
                serviciosEnPromocion.add(servicio);
            }
        }
        return serviciosEnPromocion;
    }  
    
    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia)
    {
        List<Servicio> serviciosEnPromocionDelDia = new ArrayList<>();
        for(Servicio servicio : lstServicio)
        {
            if(servicio.getEnPromocion() == enPromocion )
            {
                serviciosEnPromocionDelDia.add(servicio);
            }
        }
        return serviciosEnPromocionDelDia;
    }
    
    public void agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, 
            String gastronomia, double precio, int diaSemDesc) 
            throws ServicioYaExisteException
    {
        for (Servicio servicio : lstServicio) {
            if (servicio.getCodServicio().equals(codServicio)) {
                throw new ServicioYaExisteException("El servicio con código " + codServicio + " ya existe.");
                
            }
        }    
       Gastronomia g = new Gastronomia(codServicio, porcentajeDescuento, enPromocion,gastronomia,precio,diaSemDesc);
        lstServicio.add(g);
             
       
    
    }
       
                
    public void agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje,double precioPorNoche)
    throws ServicioYaExisteException
    {
            for (Servicio servicio : lstServicio) 
            {
                if (servicio.getCodServicio().equals(codServicio)) {
                throw new ServicioYaExisteException("El servicio con código " + codServicio + " ya existe.");
                }
            }
              
        Hospedaje h = new Hospedaje(codServicio,porcentajeDescuento,enPromocion,hospedaje,precioPorNoche);
        lstServicio.add(h);
    }
    
}


