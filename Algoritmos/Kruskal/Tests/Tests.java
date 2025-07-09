import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import uy.edu.ucu.aed.TArista;
import uy.edu.ucu.aed.TGrafoNoDirigido;
import uy.edu.ucu.aed.UtilGrafos;

public class Tests {

    @Test
    public void testKruskal() {
        String verticesPath = getClass().getClassLoader().getResource("verticesBEA.txt").getPath();
        String aristasPath = getClass().getClassLoader().getResource("aristasBEA.txt").getPath();

        // Decodificar la ruta en caso de espacios o acentos
        try {
            verticesPath = java.net.URLDecoder.decode(verticesPath, "UTF-8");
            aristasPath = java.net.URLDecoder.decode(aristasPath, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        TGrafoNoDirigido grafoNoDirigido = UtilGrafos.cargarGrafo(verticesPath, aristasPath, true);
        TGrafoNoDirigido mst = grafoNoDirigido.Kruskal();

        assertNotNull(mst);
    }

    @Test
    public void testKruskalImprimirMST() {
        String verticesPath = getClass().getClassLoader().getResource("verticesBEA.txt").getPath();
        String aristasPath = getClass().getClassLoader().getResource("aristasBEA.txt").getPath();

        try {
            verticesPath = java.net.URLDecoder.decode(verticesPath, "UTF-8");
            aristasPath = java.net.URLDecoder.decode(aristasPath, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        TGrafoNoDirigido grafoOriginal = UtilGrafos.cargarGrafo(verticesPath, aristasPath, true);
        System.out.println("Vertices cargados: " + grafoOriginal.getVertices().size());
        System.out.println("Aristas cargadas: " + grafoOriginal.getLasAristas().size());

        TGrafoNoDirigido mst = grafoOriginal.Kruskal();

        assertNotNull(mst);

        System.out.println("Arbol generador minimo (Kruskal):");
        double costoTotal = 0;
        for (TArista a : mst.getLasAristas()) {
            System.out.println(a.getEtiquetaOrigen() + " - " + a.getEtiquetaDestino() + ": " + a.getCosto());
            costoTotal += a.getCosto();
        }

        System.out.println("Costo total del MST: " + costoTotal/2);
    }

    @Test
    public void testCantidadDeAristasEnMST() {
        String verticesPath = getClass().getClassLoader().getResource("verticesBEA.txt").getPath();
        String aristasPath = getClass().getClassLoader().getResource("aristasBEA.txt").getPath();

        try {
            verticesPath = java.net.URLDecoder.decode(verticesPath, "UTF-8");
            aristasPath = java.net.URLDecoder.decode(aristasPath, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        TGrafoNoDirigido grafo = UtilGrafos.cargarGrafo(verticesPath, aristasPath, true);
        TGrafoNoDirigido mst = grafo.Kruskal();

        int cantidadVertices = grafo.getVertices().size();
        int cantidadAristasMST = mst.getLasAristas().size();

        assertEquals(cantidadVertices - 1, cantidadAristasMST/2, 
            "El MST debe tener exactamente n - 1 aristas");
    }

    @Test
    public void testCostoEsperadoMST() {
        String verticesPath = getClass().getClassLoader().getResource("verticesBEA.txt").getPath();
        String aristasPath = getClass().getClassLoader().getResource("aristasBEA.txt").getPath();

        try {
            verticesPath = java.net.URLDecoder.decode(verticesPath, "UTF-8");
            aristasPath = java.net.URLDecoder.decode(aristasPath, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        TGrafoNoDirigido grafo = UtilGrafos.cargarGrafo(verticesPath, aristasPath, true);
        TGrafoNoDirigido mst = grafo.Kruskal();

        double costoTotal = 0;
        for (TArista a : mst.getLasAristas()) {
            costoTotal += a.getCosto();
        }

        // ⚠️ Cambia este valor por el correcto si sabés cuál es
        double costoEsperado = 13.0;

        assertEquals(costoEsperado, costoTotal/2, 0.01, 
            "El costo total del MST no coincide con el esperado");
    }
}
