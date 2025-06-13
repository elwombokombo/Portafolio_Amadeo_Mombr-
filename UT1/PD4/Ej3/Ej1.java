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


}
