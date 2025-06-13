/*
 * Dada la siguiente clase, llamada “ContenedorDeNumeros”, escribe un programa que 
 * cree una instancia de la clase, inicialice sus dos variables miembro y luego muestre el
 * valor de cada una de ellas.
 */

public class NumberHolder {

    public static class ContenedorDeNumeros{
        public int anInt;
        public float aFloat;
    }

    public static void main(String[] args) {
        ContenedorDeNumeros contenedor=new ContenedorDeNumeros();
        contenedor.anInt=7;
        contenedor.aFloat=3.5F;
        System.out.println("El valor del entero es: "+contenedor.anInt);
        System.out.println("El valor del décimal es: "+contenedor.aFloat);
    }
}
