package com.example;

public class Alumno {
    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Amadeo");
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println(recorrer(alumno.getNombreAdmiracion()));
        System.out.println(getValor());
        System.out.println(getPrimerCaracter(alumno.nombre));
        System.out.println(paraAString(4));
    }

    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = { 6, 16, 26, 36, 46, 56, 66, 76 };
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        return (palabra.charAt(0));
    }

    public static String paraAString(int a) {
        return String.valueOf(a);
    }
}


