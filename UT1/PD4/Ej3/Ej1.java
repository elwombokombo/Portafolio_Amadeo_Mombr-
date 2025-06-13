public class Ej1 {
    public static void main(String[] args) {
        //Comienzo código del ejercicio:
        String[] students = new String[10];
        String studentName = "Peter Parker";
        students[0] = studentName;
        studentName = null;
        //final
        System.out.println(students[0]);
        System.out.println(students);
        System.out.println(studentName);
    }
    /*El array sigue siendo referenciado como en su inicialización mas el String "Peter Parker" si bien ya no se referencia 
     * en studentName, sí lo hace en students[0] porque ahí se guarda la dirección de memoria del objeto y no una copia de texto.
     * Por esto mismo ninguna es candidata al Garbage Collector, ni siquiera studentName aunque se le asigne null 
     * porque al ser una variable local su borrado depende del stack.
     */

}
