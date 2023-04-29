package Algoritmo;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Vertice implements Cloneable {
    private final String origen;
    private ArrayList<String> alcances;
    private static final String REFERENCIA = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMÑNOPQRSTUVWXYZ";
    private static final ArrayList<Vertice> vertices = new ArrayList<>();
    private static final ArrayList<String> aristasGrafo = new ArrayList<>();
    private static ArrayList<String[]>  aristas;
    public static int ASCENDENTE = 0, DESCENDENTE = 1;
    
    private Vertice(String origen, String destino){
        this.origen = origen;
        alcances = new ArrayList<>();
        this.alcances.add(destino);
    }

    @Override
    public Vertice clone() {
        try {
            return (Vertice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    
    private static ArrayList<Vertice> verticesCopia() {
        ArrayList<Vertice> copia = new ArrayList<>();
        for (Vertice v : vertices) {
            copia.add(v.clone());
        }
        return copia;
    }
    
    private static ArrayList<String> alcancesCopia(ArrayList<String> alcances) {
        ArrayList<String> copia = new ArrayList<>();
        for (String s : alcances) {
            copia.add(String.valueOf(s));
        }
        return copia;
    }
    
    private static boolean existVertice (String vertice){
        for (Vertice v : vertices) {
            if (v.origen.equals(vertice)) {
                return true;
            }
        }
        return false;
    }
    
    private static void addAlcance (String origen, String destino) {
        for (Vertice v : vertices) {
            if (v.origen.equals(origen)) {
                v.alcances.add(destino);
            }
        }
    }
    
    private static ArrayList<String> orden(Vertice vertice, int orden){
        ArrayList<String> alcances = alcancesCopia(vertice.alcances), ordenado = new ArrayList<>();
        if (orden == ASCENDENTE){
            for (int i = 0; i < 54; i++) {
                int index = alcances.indexOf(String.valueOf(REFERENCIA.charAt(i)));
                if (index != -1) {
                    ordenado.add(alcances.get(index));
                }
            }
        }
        
        if (orden == DESCENDENTE){
            for (int i = 53; i >= 0; i--) {
                int index = alcances.indexOf(String.valueOf(REFERENCIA.charAt(i)));
                if (index != -1) {
                    ordenado.add(alcances.get(index));
                }
            }
        }
        return ordenado;
    }

    private static boolean alcancesVacios(ArrayList<Vertice> vertices, String origen){
        for (Vertice v : vertices) {
            if (v.origen.equals(origen) && v.alcances.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    private static ArrayList<Vertice> verticesOrdenados(int orden) {
        ArrayList<Vertice> verticesCopia = verticesCopia();
        ArrayList<Vertice> verticesOrdenados = new ArrayList<>();
        
        if (orden == ASCENDENTE) {
            for (int i = 0; i < 54; i++) {
                for (Vertice v : verticesCopia) {
                    if(v.origen.equals(String.valueOf(REFERENCIA.charAt(i)))){
                        verticesOrdenados.add(v);
                        int index = verticesOrdenados.size() - 1;
                        verticesOrdenados.get(index).alcances = orden(verticesOrdenados.get(index), orden);
                    }
                }
            }
        }
        
        if (orden == DESCENDENTE){
            for (int i = 53; i >= 0; i--) {
                for (Vertice v : verticesCopia) {
                    if(v.origen.equals(String.valueOf(REFERENCIA.charAt(i)))){
                        verticesOrdenados.add(v);
                        int index = verticesOrdenados.size() - 1;
                        verticesOrdenados.get(index).alcances = orden(verticesOrdenados.get(index), orden);
                    }
                }
            }
        }
        return verticesOrdenados;
    }
    
    public static boolean conexo() {
        return (aristas.size() + 1) == vertices.size();
    }
    
    public static boolean repetido(String origen, String destino) {
        for (Vertice v : vertices){
            if (v.origen.equals(origen) || v.origen.equals(destino)) {
                for (String d : v.alcances){
                    if (d.equals(destino) || d.equals(origen)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static void clear() {
        vertices.clear();
        aristasGrafo.clear();
        aristas.clear();
    }
    
    public static ArrayList<String> getAristas () {
        ArrayList<String> aGrafo = new ArrayList<>();
        for (String s : aristasGrafo) {
            String [] a = s.split(",");
            aGrafo.add(a[0] + " -- " + a[1]);
        }
        return aGrafo;
    }
    
    public static void addVertice (String origen, String destino) {
        aristasGrafo.add(origen + "," + destino);
        if (existVertice(origen)) {
            addAlcance(origen, destino);
        }else {
            vertices.add(new Vertice(origen, destino));
        }
        
        if (existVertice(destino)) {
            addAlcance(destino, origen);
        }else {
            vertices.add(new Vertice(destino, origen));
        }
    }
 
    public static ArrayList<String[]> getAristasGrafo() {
        ArrayList<String[]> aristas = new ArrayList<>();
        
        for (String arista : aristasGrafo){
            aristas.add(arista.split(","));
        }
        
        return aristas;
    }
    
    public static ArrayList<String[]> getAristasArbol(int orden) {
        String partida, llegada = "";
        ArrayList<Vertice> verticesOrdenados = verticesOrdenados(orden);
        ArrayList<String> verticeU = new ArrayList<>();
        aristas = new ArrayList<>();
        
        if (!verticesOrdenados.isEmpty()) {
            verticeU.add(verticesOrdenados.get(0).origen);
        }
        
        while(!verticeU.isEmpty()) {
            partida = verticeU.get(verticeU.size() - 1);
            for (Vertice v : verticesOrdenados) {
                if (v.origen.equals(partida)) {
                    llegada = v.alcances.get(0);
                    if (!alcancesVacios(verticesOrdenados, llegada)) {
                        verticeU.add(llegada);
                    }
                    aristas.add(new String[]{partida, llegada});
                    break;
                }
            }
            
            for (Vertice v : verticesOrdenados) {
                v.alcances.remove(partida);
                v.alcances.remove(llegada);

                if (v.alcances.isEmpty()) {
                    verticeU.remove(v.origen);
                }
            }
        }
        return aristas;
    }
}
