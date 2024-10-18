/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primer_parcial_elisaleco;
import java.time.LocalDate;
import modelo.Sistema;
import modelo.ServicioYaExisteException;
import modelo.Gastronomia;
import modelo.Hospedaje;
/**
 *
 * @author Mateo Elisaleco
 */



public class Primer_Parcial_Elisaleco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("1-1");
        try {
            Gastronomia g1 = new Gastronomia("4892",15.0,true,"hamcrio",180.0,4);
        }catch( Exception e)
        {
            System.out.println(e);
        }

       
        System.out.println("1-2");
        try {
            Gastronomia g2 = new Gastronomia("489235",15.0,true,"hamcrio",180.0,4);
        }catch( Exception e)
        {
            System.out.println(e);
        }
        
                System.out.println("1-3");
        try {
            Hospedaje h1 = new Hospedaje("2872",10.0,true,"cabana3",1500.0);
        }catch( Exception e)
        {
            System.out.println(e);
        }
        System.out.println("1-4");
        try {
            Hospedaje h1 = new Hospedaje("287282",10.0,true,"cabana",1500.0);
        }catch( Exception e)
        {
            System.out.println(e);
        }    
    
                System.out.println("2-1");
        try {
            Gastronomia g1 = new Gastronomia("489235",15.0,true,"Hamburguesa criolla",180.0,4);
        }catch( Exception e)
        {
            System.out.println(e);
        }

       
    }
    
}
