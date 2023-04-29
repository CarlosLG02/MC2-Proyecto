
package Algoritmo;

/**
 *
 * @author danyw
 */
public class Grafo {
    private final String inicio = "graph {", inicioA = "digraph {", fin = "}";
    public static final int GRAFO = 0, ARBOL = 1;
    private String aristas;
    
    public Grafo () {
        Grafo grafo = new Grafo (GRAFO, -1);
    }
    
    public Grafo (int type, int orden){
        aristas = "";
    }
}
