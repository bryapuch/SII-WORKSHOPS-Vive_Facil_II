package ec.edu.espol.workshops;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        String ageIn = "";
        String estado="";
        String sexo="";
        boolean credencial=false;
        String estadoOption="";
        String credencialOption="";
        String sexoOption="";
        System.out.println("***CAR INSURANCE***");
        System.out.println("_________________________");
        boolean edadInvalida=true;
        boolean sexoInvalido=true;
        boolean estadoInvalido=true;
        boolean credencialInvalida=true;

        while(edadInvalida){
            System.out.println("Ingrese la edad: ");
            Scanner ageEscaner = new Scanner (System.in, "UTF-8"); //Creación de un objeto Scanner
            ageIn = ageEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner 
            if(isNumeric(ageIn)){
                edadInvalida=false;
            }else{
                System.out.println("Edad inválida");
            }
            ageEscaner.close();
        }
        while(sexoInvalido){
            System.out.println("Escoja el sexo (1 ó 2): ");
            System.out.println("1) Masculino");
            System.out.println("2) Femenino");
            Scanner sexoEscaner = new Scanner (System.in); //Creación de un objeto Scanner
            sexoOption = sexoEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner 
            if(validarEstado(sexoOption)){
                sexoInvalido=false;
            }else{
                System.out.println("Ingrese 1 ó 2 solamente");
            }
            sexoEscaner.close();
            
        }
        while(estadoInvalido){
            System.out.println("Escoja el estado civil (1 ó 2)");
            System.out.println("1) Casado");
            System.out.println("2) No casado");
            Scanner estadoEscaner = new Scanner (System.in); //Creación de un objeto Scanner
            estadoOption = estadoEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner 
            if(validarEstado(estadoOption)){
                estadoInvalido=false;
            }else{
                System.out.println("Ingrese 1 ó 2 solamente");
            }
            estadoEscaner.close();
        }
        while(credencialInvalida){
            System.out.println("Ingrese la verificación del carnet de conducir: ");
            System.out.println("1) Credencial válida");
            System.out.println("2) Credencial no válida");
            Scanner credencialEscaner = new Scanner (System.in); //Creación de un objeto Scanner
            credencialOption = credencialEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner 
            if(validarEstado(credencialOption)){
                credencialInvalida=false;
            }else{
                System.out.println("Ingrese una opción válida");
            }
            credencialEscaner.close();
            
        }
        if(estadoOption.equals("1")){
            estado="Casado";
        }else{
            estado="No Casado";
        }
        if(sexoOption.equals("1")){
            sexo="M";
        }else{
            sexo="F";
        }
        if(credencialOption.equals("1")){
            credencial=true;
        }else{
            credencial=false;
        }
        CarInsurance cotizacion= new CarInsurance(Integer.parseInt(ageIn), sexo,estado, credencial);
        System.out.println(cotizacion.datosValidos());

    }

    

    private static boolean validarEstado(String estadoCivil) {
        if(estadoCivil.equals("1")||estadoCivil.equals("2")){
            return true;
        }
        return false;
    }
    


    private static boolean isNumeric(String ageIn) {
        try {
            Integer.parseInt(ageIn);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }


}

