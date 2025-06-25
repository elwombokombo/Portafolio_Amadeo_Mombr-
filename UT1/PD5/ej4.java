public class ej4 {
    public static void main(String[] args) {
    // this program requires two
    // arguments on the command line
    if (args.length == 2) {
        // convert strings to numbers
        float a = (Float.valueOf (args[0])).floatValue();
        float b = (Float.valueOf(args[1])).floatValue();
        // do some arithmetic
        System.out.println("a + b = " +
        (a + b));
        System.out.println("a - b = " +
        (a - b));
        System.out.println("a * b = " +
        (a * b));
        System.out.println("a / b = " +
        (a / b));
        System.out.println("a % b = " +
        (a % b));
        } else {
            System.out.println("This program " +
            "requires two command-line arguments.");
        }
    }
}
/*1) Salida por consola de los valores 13.4 66.1
 *  a + b = 79.5
    a - b = -52.699997
    a * b = 885.7399
    a / b = 0.20272315
    a % b = 13.4
 */
/*2)
 * Se debería de cambiar la inicialización de a y b por int y usar Integer.parseInt
 */