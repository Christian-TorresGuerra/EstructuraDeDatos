package com.mycompany.ejemplosstringdouble;

public class EjemplosStringDouble {

    public static void main(String[] args) {
        System.out.println("Este programa imprime unos ejemplos que combinan string y double");
        String gansito = "Gansito";
        double preciodelgansito = 20.50;
        
        String chidas = "Chidas";
        double preciodelaschidas = 18.20;
        
        String boing = "Boing de mango";
        double precioBoing = 24.75;
        
        String dulceraro = "dulces no conocidos";
        double dulce = 10.2345;
        
        System.out.println("El precio del: " + gansito + "es de " + preciodelgansito);
        System.out.println("El precio de las " + chidas + " es de: " + preciodelaschidas);
        System.out.println("El precio del " + boing + " es de " + precioBoing);
        System.out.println("Si compras 17 " + dulceraro + "pagarás en total " + dulce*17);
    }
}
