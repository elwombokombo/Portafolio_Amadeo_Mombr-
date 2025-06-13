import java.awt.Rectangle; //Se debía importar la clase

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect;   /*Esta sentencia por sí sola genera un error ya que solo declara 
                            y no inicializa la variable myRect*/ 
        myRect= new Rectangle();//Se inicializa con la creación de un objeto la variable
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.width*myRect.height); /*Anteriormente myRect.area() en lugar de la multiplicación, 
                                                                                la clase Rectangle no contiene un .area*/
    }

}
