public class Parte1 {
    public enum Seleccion{
        ARGENTINA, BOLIVIA, BRASIL, CHILE, COLOMBIA, ECUADOR, PARAGUAY, PERÚ, URUGUAY, VENEZUELA
    }
    Seleccion seleccion;

    public Parte1(Seleccion seleccion) {
        this.seleccion = seleccion;
    }
    
    public void Clasifiacion() {
        switch (seleccion) {
            case VENEZUELA:
                System.out.println("Repechaje");
                break;
            case PERÚ: case CHILE: case BOLIVIA:
                System.out.println("Afuera del Mundial");
                break;    
            default:
                System.out.println("Clasificado para el Mundial");
                break;
        }
    }

    public static void main(String[] args) {
        Parte1 Seleccion1=new Parte1(Seleccion.COLOMBIA);
        Parte1 Seleccion2=new Parte1(Seleccion.CHILE);
        Parte1 Seleccion3=new Parte1(Seleccion.VENEZUELA);
        Parte1 Seleccion4=new Parte1(Seleccion.URUGUAY);
        Seleccion1.Clasifiacion();
        Seleccion2.Clasifiacion();
        Seleccion3.Clasifiacion();
        Seleccion4.Clasifiacion();
    }
}
