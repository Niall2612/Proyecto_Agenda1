/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author Cliente
 */
public class ver {
    public void mostrar(){
        
        eventos a [] = new eventos[1];
        
        
         for (int i = 0; i < a.length; i++) {
        System.out.println( "Titulo del Evento:" + a[i].getTitulo()+"\n"+ "Detalles del Evento:"+ a[i].getDeta()+"\n"+ "Ubicacion del Evento:"+a[i].getUbi()+"\n"+ "Dia del Evento:"+ a[i].getDia()+"\n"+ "Mes del Evento:"+a[i].getMes()+"\n"+ " Año del Evento:"+a[i].getAño()+"\n"+ "Hora de Inicio del Evento:"+ a[i].getHora()+"\n"+"Ingresar Minutos: "+ a[i].getMinutos()+"\n"+ a[i].getFin()+"Hora fin del Evento:"+ "Ingrese minutos:" + a[i].getNfin()+"\n");
        }
        
        System.out.println("********************************************");
            System.out.println();
    }
    
}
