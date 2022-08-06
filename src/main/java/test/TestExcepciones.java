package test;

import static eccepciones.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        //int resultado = 0;

        //try {
        //    resultado = division(10,0);
        //}
        //catch (Exception exception){
        //    System.out.println("Ocurrio un error");
        //    exception.printStackTrace(System.out);
        //}
        
        int x = 19;
        int y = 18;
        
        String resultado = x>y? "Soy mayor de edad" : "Soy menor de edad";
        System.out.println("resultado = " + resultado);
    }
}
