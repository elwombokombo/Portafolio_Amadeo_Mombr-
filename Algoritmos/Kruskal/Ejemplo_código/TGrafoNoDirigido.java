
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import uy.edu.ucu.aed.IGrafoNoDirigido;

public class TGrafoNoDirigido extends TGrafoDirigido implements IGrafoNoDirigido {
    @Override
        public TGrafoNoDirigido Kruskal() {
            // Paso 1: inicializar estructura Union-Find
            Map<Comparable, Comparable> padre = new HashMap<>();
            for (TVertice v : this.getVertices().values()) {
                padre.put(v.getEtiqueta(), v.getEtiqueta()); // MAKE-SET
            }

            // Paso 2: ordenar las aristas por costo
            LinkedList<TArista> aristasOrdenadas = new LinkedList<>(lasAristas);
            aristasOrdenadas.sort((a1, a2) -> Double.compare(a1.getCosto(), a2.getCosto()));

            // Paso 3: construir el MST
            TAristas mstAristas = new TAristas();

            for (TArista arista : aristasOrdenadas) {
                Comparable origen = arista.getEtiquetaOrigen();
                Comparable destino = arista.getEtiquetaDestino();

                if (!enMismoConjunto(padre, origen, destino)) {
                    unirConjuntos(padre, origen, destino); // UNION
                    mstAristas.add(arista); // Agregar arista al MST
                }
            }

            return new TGrafoNoDirigido(this.getVertices().values(), mstAristas);
        }

    // Método auxiliar para encontrar la raíz de un vértice en la estructura Union-Find
    private Comparable encontrarRaiz(Map<Comparable, Comparable> padre, Comparable vertice) {
        if (!padre.get(vertice).equals(vertice)) {
            padre.put(vertice, encontrarRaiz(padre, padre.get(vertice))); // compresión de caminos
        }
        return padre.get(vertice);
    }
    // Método auxiliar para verificar si dos vértices están en el mismo conjunto
    // usando la estructura Union-Find
    private boolean enMismoConjunto(Map<Comparable, Comparable> padre, Comparable u, Comparable v) {
        return encontrarRaiz(padre, u).equals(encontrarRaiz(padre, v));
    }
    // Método auxiliar para unir dos conjuntos en la estructura Union-Find
    private void unirConjuntos(Map<Comparable, Comparable> padre, Comparable u, Comparable v) {
        Comparable raizU = encontrarRaiz(padre, u);
        Comparable raizV = encontrarRaiz(padre, v);
        padre.put(raizU, raizV); // unir (no se usa por rango, pero es funcional)
    }    
}
