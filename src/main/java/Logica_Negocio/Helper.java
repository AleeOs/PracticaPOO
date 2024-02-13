/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Alexis
 */

// Nombre
public class Helper {
    
    public static int RetornarValor(String Nombre){
    
        int numero=0;
        int letra=0;
        
        for (int j = 0; j < Nombre.length(); j++){
         boolean flag = Character.isDigit(Nombre.charAt(j));
         if (flag){
             
             numero++;
             
         }
         else {
             
             letra++;
         }
         
        }
        
     return numero;
     
    }
        
    
    // nuevo codigo

public static int RetornarCE (String Nombre)
{
     int ce = 0;

    ArrayList<Character> Iscaracteres = new ArrayList<>();
        
        Iscaracteres.add('@');
        Iscaracteres.add('~');
        Iscaracteres.add('/');
        Iscaracteres.add(';');
        Iscaracteres.add(':');
        Iscaracteres.add('"');
        Iscaracteres.add('!');
        Iscaracteres.add(' ');
        Iscaracteres.add('.');
        
        
         for (int j = 0; j < Nombre.length(); j++){
        boolean flag = Character.isLetter(Nombre.charAt(j));
        
        if(!flag) {
        }
            for (int i = 0; i < Iscaracteres.size(); i++)
            {
            if (Iscaracteres.get(i).compareTo(Nombre.charAt(j)) ==0)
            {
                
            ce++;
            
            }
            }
         
         }

           return ce; 
}

    //fin codigo nuevo
    //fin nombre
    

















        

   

        
            
        
        
                







//cedula
  public static int RetornarValor1(String Cedula){
    
        int numero1=0;
        int letra1=0;
        
        for (int j = 0; j < Cedula.length(); j++){
         boolean flag = Character.isDigit(Cedula.charAt(j));
         if (flag){
             
             numero1++;
             
         }
         else {
             
             letra1++;
         }
         
        }
        
     return letra1;
     
    }
        
public static int RetornarCE1 (String Cedula)
{
    int ce = 0;

    ArrayList<Character> Iscaracteres = new ArrayList<>();
        
        Iscaracteres.add('@');
        Iscaracteres.add('~');
        Iscaracteres.add('/');
        Iscaracteres.add(';');
        Iscaracteres.add(':');
        Iscaracteres.add('"');
        Iscaracteres.add('!');
        Iscaracteres.add(' ');
        
        
         for (int j = 0; j < Cedula.length(); j++){
        boolean flag = Character.isDigit(Cedula.charAt(j));
        
        if(!flag) {
        }
            for (int i = 0; i < Iscaracteres.size(); i++)
            {
            if (Iscaracteres.get(i).compareTo(Cedula.charAt(j)) ==0)
            {
                
            ce++;
            
            }
            }
         
         }

           return ce; 
}

        //fin cedula














//telefono 

public static int RetornarValor2(String Telefono){
    
        int numero2=0;
        int letra2=0;
        
        for (int j = 0; j < Telefono.length(); j++){
         boolean flag = Character.isDigit(Telefono.charAt(j));
         if (flag){
             
             numero2++;
             
         }
         else {
             
             letra2++;
         }
         
        }
        
     return letra2;
     
    }
        
public static int RetornarCE2 (String Telefono)
{
    int ce = 0;

    ArrayList<Character> Iscaracteres = new ArrayList<>();
        
        Iscaracteres.add('@');
        Iscaracteres.add('~');
        Iscaracteres.add('/');
        Iscaracteres.add(';');
        Iscaracteres.add(':');
        Iscaracteres.add('"');
        Iscaracteres.add('!');
        Iscaracteres.add(' ');
        
        
         for (int j = 0; j < Telefono.length(); j++){
        boolean flag = Character.isDigit(Telefono.charAt(j));
        
        if(!flag) {
        }
            for (int i = 0; i < Iscaracteres.size(); i++)
            {
            if (Iscaracteres.get(i).compareTo(Telefono.charAt(j)) ==0)
            {
                
            ce++;
            
            }
            }
         
         }

           return ce; 
}


}

//fin telefono
    
    





    
        
    
       
     
    
    
    

