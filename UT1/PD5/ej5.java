public class ej5 {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
         
        int dot = s.indexOf('.');
         
        System.out.println(dot + " digits " +
            "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
            " digits after decimal point.");
    }   
}
/*  1)
 *  3 digits before decimal point.
    2 digits after decimal point.
 */
/*
 * 2)
 * d representa el número al cual le queremos analizar cuántos dígitos decimales y cuántos enteros posee
 * s al inicilizarze guarda a d como un string para poder hacer uso en dot del índice donde se encuentra el punto 
 * luego se imprime por consola el índice del punto que como índice=length-1 corresponde a la cantidad de enteros en el número
 * por último se imprime cuantos números son decimales contando el largo, restándole 1 por el desfasaje
 */
