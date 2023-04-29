package Algoritmo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author carlo
 */
public final class Grafo {
    private final String inicio = "graph {", inicioA = "digraph {", fin = "}";
    public static final int GRAFO = 0, ARBOL = 1;
    private static final String  RUTA = "src/main/java/ipc1a/matecompu/";
    private String aristas;
    
    public Grafo () {
        Grafo grafo = new Grafo (GRAFO, -1);
    }
    
    public Grafo (int type, int orden){
        aristas = "";
        
        if (type == GRAFO) {
            try {
                try (FileWriter fichero = new FileWriter(RUTA + "aristas.dot")) {
                    fichero.write(textoFormato(GRAFO, -1));
                }
            } catch (IOException e) {}
            
            try {
                Process proceso = Runtime.getRuntime().exec("C:\\Program Files\\Graphviz\\bin\\dot.exe -Tpng aristas.dot -o grafo.png", null, new File(RUTA));
                BufferedReader entrada = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

                String linea;
                while ((linea = entrada.readLine()) != null) {
                    System.out.println(linea);
                }
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if (type == ARBOL) {
            try {
                try (FileWriter fichero = new FileWriter(RUTA + "aristas.dot")) {
                    fichero.write(textoFormato(ARBOL, orden));
                }
            } catch (IOException e) {}
            
            try {
                Process proceso = Runtime.getRuntime().exec("C:\\Program Files\\Graphviz\\bin\\dot.exe -Tpng aristas.dot -o arbol.png", null, new File(RUTA));
                BufferedReader entrada = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

                String linea;
                while ((linea = entrada.readLine()) != null) {
                    System.out.println(linea);
                }
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    public String textoFormato(int type, int orden){
        if (type == GRAFO){
            for (String[] s : Vertice.getAristasGrafo()) {
                aristas += s[0] + " -- " + s[1] + ";";
            }
            //aristas = "a -- b;";
            return inicio + aristas + fin;
        }else if (type == ARBOL){
            for (String[] s : Vertice.getAristasArbol(orden)) {
                aristas += s[0] + " -- " + s[1] + ";";
            }
            System.out.println("Desde textoFormato en Grafo");
            return inicio + aristas + fin;
        }
        
        return aristas;
    }
}