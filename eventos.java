/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class eventos {
    eventos a [] = new eventos [1];
    private String titulo;
    private String deta;
    private String ubi;
    private int dia;
    private int año;
    private int mes;
    private int hora;
    private int minutos;
    private int fin;
    private int nfin;
    
 public eventos(){
     
     titulo = "";
     deta = "";
     ubi = "";
     dia = 0;
     año = 0;
     mes = 0;
     hora = 0;
     minutos = 0;
     fin = 0;
     nfin = 0;
     
     
     
     
     
 }
 
 public eventos(String t,String d,String ub,int di, int a, int me,int ho,int mi,int fi,int nfi){
     
     titulo = t;
     deta = d;
     ubi = ub;
     dia = di;
     año = a;
     mes = me;
     hora = ho;
     minutos = mi;
     fin = fi;
     nfin = nfi;
     
 }

    public String getTitulo() {
        return titulo;
      
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDeta() {
        return deta;
    }

    public void setDeta(String deta) {
        this.deta = deta;
    }

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getNfin() {
        return nfin;
    }

    public void setNfin(int nfin) {
        this.nfin = nfin;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }
       
      
        Scanner teclado=new Scanner(System.in);
        int seleccion;
        
        
        
      
        
        
        
      
        
    }
        
        
        
    
    

