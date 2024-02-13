/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Helper;
import Logica_Negocio.Paciente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Cedula, Nombre, Telefono;
        
        int num_Pacientes=0;
        int retorno=0;
        int caracter_e=0;
        
        int retorno1=0;
        int caracter_e1=0;
        
        int retorno2=0;
        int caracter_e2=0;
        
        
        
        
        
        
        Scanner scan = new Scanner (System.in);
        ArrayList<Paciente> Listapacientes = new ArrayList<>();
        
        
        Paciente objPaciente;
        
        
        
        
        
        
        System.out.println("Digite la cantidad de pacientes a registrar");
        num_Pacientes = scan.nextInt();
        
        scan.nextLine();
        
        for (int i = 0; i < num_Pacientes; i++) {
            
            
            
            
            
            
            
            
            //cedula
            System.out.println("Digite la cedula del paciente");
            Cedula = scan.nextLine();
            
            
            while (Cedula.equals(""))
            {
                System.out.println("Digite la cedula del paciente");
            Cedula = scan.nextLine();
            retorno1 = Helper.RetornarValor1(Cedula);
            caracter_e1 = Helper.RetornarCE1(Cedula);
            
            }
            
            
            retorno1 = Helper.RetornarValor1(Cedula);
            caracter_e1 = Helper.RetornarCE1(Cedula);
            
          while (retorno1!=0 || Cedula.equals("") || caracter_e1!=0)
           
            {
            
            System.out.println("Digite la cedula del paciente");
            Cedula = scan.nextLine();
            retorno1 = Helper.RetornarValor1(Cedula);
            caracter_e1 = Helper.RetornarCE1(Cedula); 
            
            }
            
            //Fin cedula
            
            
            
            
            
            
            //nombre
            System.out.println("Digite el nombre del paciente");
            Nombre = scan.nextLine();
            
            while (Nombre.equals(""))
            {
                 System.out.println("Digite el nombre del paciente");
            Nombre = scan.nextLine();
            retorno = Helper.RetornarValor(Nombre);
            caracter_e = Helper.RetornarCE(Nombre);
            
            }
           
            
            retorno = Helper.RetornarValor(Nombre);
            caracter_e = Helper.RetornarCE(Nombre);
            
          while (retorno!=0 || Nombre.equals("") || caracter_e!=0)
           
            {
            
            System.out.println("Digite el nombre del paciente");
            Nombre = scan.nextLine();
            retorno = Helper.RetornarValor(Nombre);
            caracter_e = Helper.RetornarCE(Nombre); 
            
            }
            
            //fin nombre
            
            
            
            
            
            //telefono
            
            System.out.println("Digite el telefono del paciente");
            Telefono = scan.nextLine();
            
            
            while (Telefono.equals(""))
            {
                System.out.println("Digite el telefono del paciente");
            Telefono = scan.nextLine();
            retorno2 = Helper.RetornarValor2(Telefono);
            caracter_e2 = Helper.RetornarCE2(Telefono);
            
            }
            
            
            retorno2 = Helper.RetornarValor2(Telefono);
            caracter_e2 = Helper.RetornarCE2(Telefono);
            
          while (retorno2!=0 || Telefono.equals("") || caracter_e2!=0)
           
            {
            
            System.out.println("Digite el telefono del paciente");
            Telefono = scan.nextLine();
            retorno2 = Helper.RetornarValor2(Telefono);
            caracter_e2 = Helper.RetornarCE2(Telefono); 
            
            }
            
            //fin telefono
            
            
            
            
            
            
            
            
            
            objPaciente = new Paciente (Cedula, Nombre, Telefono);
            Listapacientes.add(objPaciente);   
    }
        
        for (int i = 0; i < Listapacientes.size(); ++i) { 
            
            System.out.println("La cedula del paciente es:"+"\t"+ Listapacientes.get(i).getCedula());
            System.out.println("El nombre del paciente es:"+"\t"+ Listapacientes.get(i).getNombre());
            System.out.println("El telefono del paciente es:"+"\t"+ Listapacientes.get(i).getTelefono());
        }
        
    }
       
        
        
}
        

    

