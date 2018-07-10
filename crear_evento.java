/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class crear_evento {
    public void creae(){
        
     eventos a [] = new eventos [1];
     
      
        Scanner teclado=new Scanner(System.in);
        int seleccion = 0;
        
        String titulo;
        String deta;
        String ubicacion;
        String error=" \033[31mDatos Invalidos";
        int dia = 0;
        int año=0;
        int mes=0;
        int hora=0;
        int minutos=0;
        int fin=0;
        int nfin=0;
        
     
     
        for (int i = 0; i < a.length; i++) {
            
            System.out.println("Ingresar Datos \033[31m(Llene los siguientes campos)");
        System.out.println();
        
        System.out.println("Titulo del Evento");
        System.out.print("\033[30m=> ");
        titulo=teclado.nextLine();
        
        System.out.println();
        
        System.out.println("Detalles del Evento");
        System.out.print("\033[30m=> ");
        deta=teclado.nextLine();
        
        System.out.println();
     
        System.out.println("Ubicacion del Evento");
        System.out.print("\033[30m=> ");
        ubicacion=teclado.nextLine();
        
        System.out.println();
        
        
        
     
        while(dia<=31 && mes<=12 && año<2019){
       
            System.out.println("Ingrese el dia \033[31m(numero de el dia)");
            System.out.print("\033[30m=> ");
            dia=teclado.nextInt();
            System.out.println();
            
            System.out.println("Ingrese el mes \033[31m(numero de el mes)");
            System.out.print("\033[30m=> ");
            mes=teclado.nextInt();
            System.out.println();
            
            System.out.println("Ingrese el año \033[31m(numero de el año)");
            System.out.print("\033[30m=> ");
            año=teclado.nextInt();
            System.out.println();
        
          
            System.out.println();
        
            if(dia<=31 && mes<=12 && año <=2019){
                 System.out.println(dia+"/"+mes+"/"+año);
                 System.out.println();
                 
                    break;
      
                }else{
                System.out.println("\033[31mHa ingresado una dia fecha invalida");
             
              System.out.println("********************************************");
              System.out.println();
      
            }
        
        }
        
        
        
         System.out.println("********************************************");
        
        
         
            while(hora<=23 && minutos <= 59){
        
                System.out.println("Hora inicio del Evento \033[31m(Solo numero de hora)");
                System.out.print("\033[30m=>");
                hora=teclado.nextInt();
                System.out.println("Ingrese minuttos");
                System.out.print("\033[30m=>");
                minutos=teclado.nextInt();
        
                if (hora<=23 && minutos <= 59){
                    System.out.println(hora+":"+minutos);
                    System.out.println();
                    break;
                         
                }else{
                    System.out.println("\033[31mhora Invalida");
                    System.out.println("********************************************");
                    System.out.println();
                    }  
            }
        
        
   
        
        
        while(fin<=23 && nfin<=59){
           
         System.out.println("Hora Fin del Evento \033[31m(Solo la hora)");
         System.out.print("\033[30m=> ");
         fin=teclado.nextInt();
         
         System.out.println("Ingrese minutos");
         System.out.print("\033[30m=> ");
         nfin=teclado.nextInt();
         
         if (fin <=23 && fin<=59){
             
             if(hora<=fin){
                 System.out.println(fin+":"+nfin);
                System.out.println();
                break;
                
                
             }else{
                 System.out.println("\033[31mhora inicio y fin no coinciden");
                 System.out.println("\033[30m********************************************");
                 System.out.println();
             }
             
              }else{
                 System.out.println("hora invalidad");
                 System.out.println("\033[30m********************************************");
                 System.out.println();
                }
        }
        
        System.out.println("\033[30m********************************************");
        System.out.println();
        System.out.println("         Datos Introducidos".toUpperCase());
        System.out.println();
            
        System.out.println("Titulo del Evento =  "+ titulo );
        System.out.println("fecha del evento =  "+dia+"/"+mes+"/"+año);
        System.out.println("Detalles del Evento =  "+deta);
        System.out.println("Ubicaciion del Evento =  "+ubicacion);
          if (hora<=23 && minutos<=69){
             System.out.println("Hora Inicio del Evento =  "+hora+":"+minutos);
       }else{
           System.out.println("\033[31mHora Inicio del Evento =  "+error);
        }
        if (fin<=23 && nfin<=59){
           
               System.out.println("Hora Fin del Evento =  "+fin+":"+nfin); 
          
        }else{
            System.out.println("Hora Inicio del Evento =  "+ error);
        }
       
          
        System.out.println();
        System.out.println("\033[30m********************************************");
           
        System.out.println("¿Su informacion es correcta?  \033[31m( 1= SI / 2= NO)");
        System.out.print("\033[30m=> ");
        seleccion=teclado.nextByte();
      
        if (seleccion==1){
            
            System.out.println("Su informacion se Guardo con exito".toUpperCase());
            System.out.println();
            System.out.println("********************************************");
           
            principal callprincipal = new principal();
            callprincipal.newpincipal();
         
            }else if (seleccion==2){
            

            principal callprincipal = new principal();
            callprincipal.newpincipal();
            
            System.out.println("********************************************");
            
        
            
       }else if (seleccion==3){
            contrasena callcontrasena =new contrasena();
        callcontrasena.newpassword();
        
        System.out.println("********************************************");
        System.out.println();
       }
        
        a[i] = new eventos (titulo,deta,ubicacion,dia,año,mes,hora,minutos,fin,nfin);
            
        }
         System.out.println("Mostrar Eventos");
         System.out.println("");
        for (int i = 0; i < a.length; i++) {
        System.out.println( "Titulo del Evento:" + a[i].getTitulo()+"\n"+ "Detalles del Evento:"+ a[i].getDeta()+"\n"+ "Ubicacion del Evento:"+a[i].getUbi()+"\n"+ "Dia del Evento:"+ a[i].getDia()+"\n"+ "Mes del Evento:"+a[i].getMes()+"\n"+ " Año del Evento:"+a[i].getAño()+"\n" +"Hora de Inicio del Evento:"+ a[i].getHora()+"\n"+"Ingresar Minutos: "+ a[i].getMinutos()+"\n"+"Hora fin del Evento:"+ a[i].getFin()+"\n"+"Ingrese minutos:" +a[i].getNfin()+"\n");
        }
        
        
        System.out.println("********************************************");
        System.out.println();
            
            
         principal callprincipal = new principal();
         callprincipal.newpincipal();
            
        System.out.println("********************************************");
        System.out.println();
       
            
    }
    
  
  

    
}
