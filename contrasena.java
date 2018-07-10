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
public class contrasena {
    public void newpassword(){
         Scanner teclado = new Scanner(System.in);
	int contra = 0;
	int inten = 1;
	int maxi = 3;
        int contador=0;
        System.out.println("       Bienvenido a la Agenda Electronica.. Iniciar Sesion");
        System.out.println();
        
        
	while((contra!=26) && (inten<maxi)){
           
            System.out.println("Introduzca su Contraseña !Porfavor!");
            System.out.print("=>");
            contra = teclado.nextInt();
            
            if (inten==1){
                if( contra==26){
                    
                    System.out.println("********************************************");
                    System.out.println();
                    contador++;
                    System.out.println("Bienvenido eres el usuario#"+contador);
                    System.out.println();
                    System.out.println("********************************************");
                    
                   principal callprincipal = new principal();
                   callprincipal.newpincipal();
                   
                   
                } else{
                     System.out.println("Contraseña Incorrecta \033[31m(Solo tienes 3 intentos!!)");
     
                    System.out.println("\033[30m********************************************");
                    System.out.println();
                    inten++; 
                }
                
               
                  
            }else if (inten==2){
                 if( contra==26){
                     System.out.println("********************************************");
                     System.out.println();
                     
                     
                    System.out.println("Bienvenido eres el usuario#"+contador);
                    System.out.println();
                    System.out.println("********************************************");
                    contador++;
                    principal callprincipal = new principal();
                    callprincipal.newpincipal();
                    
                  
                } else{
                      System.out.println("Contraseña Incorrecta \033[31m(Vuelva a intentarlo dentro de 2 minutos)");
		
		inten = inten - maxi;
                try{
                    Thread.sleep(2*60*1000);
                }catch(InterruptedException ex){}
                System.out.println("\033[30m********************************************");
                   System.out.println();
                   inten ++;
                 }
                   
                   
              
            }else{
                if(contra==26){
                    
                   System.out.println("********************************************");
                   System.out.println();
                   
                    contador++;
                    System.out.println("Bienvenido eres el usuario#"+contador);
                    System.out.println();
                    System.out.println("********************************************");
                   
                   principal callprincipal = new principal();
                   callprincipal.newpincipal();
                   
                    
                } else{
                    System.out.println("contraseña incorrecta \033[31m(Vuelva a intentarlo hasta mas tarde)");
		
		inten = inten - maxi;
                try{
                    Thread.sleep(2*160*10000);
                }catch(InterruptedException ex){}
                inten ++;
                 System.out.println("\033[30m********************************************");
                }
		
            }
            
            }
            
             
 
        }
    }

