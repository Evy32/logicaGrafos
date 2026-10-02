package co.edu.unisalle;

import co.edu.unisalle.interfaces.IGrafo;
import co.edu.unisalle.modelo.Grafo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando con grafos ....");

        Map<String, List<String>> graph = new HashMap<>();

        graph.put("Tunja", new ArrayList<>());
        graph.put("Bogotá", new ArrayList<>());
        graph.put("Yopal", new ArrayList<>());
        graph.put("Bucaramanga", new ArrayList<>());

        // La relación funciona en ambos sentidos
        graph.get("Tunja").add("Tunja");
        graph.get("Bogotá").add("Candelaria");
        graph.get("Bogotá").add("Chapinero");
        graph.get("Bogotá").add("Norte");
        graph.get("Bucaramanga").add("Bucaramanga");
        graph.get("Yopal").add("Yopal");

        System.out.println(graph);

        System.out.println("************************************************************************************************");


        IGrafo grafo = new Grafo();

        // Crear nodos
        grafo.agregarNodo(1);
        grafo.agregarNodo(2);
        grafo.agregarNodo(3);
        grafo.agregarNodo(4);
        grafo.agregarNodo(5);
        grafo.agregarNodo(6);

        // Crear conexiones (aristas)
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(2, 5);
        grafo.agregarArista(3, 1);
        grafo.agregarArista(4, 6);
        grafo.agregarArista(5, 5);
        grafo.agregarArista(6, 5);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 2);

        // Visualización y recorridos
        grafo.mostrarMatrizAdyacencia();
        grafo.mostrarListaAdyacencia();
        grafo.bfs(1);
        grafo.dfs(1);
        System.out.println("Camino más corto de 1 a 6: " + grafo.caminoMasCorto(1, 6));
        System.out.println("Camino más largo de 1 a 6: " + grafo.caminoMasLargo(1, 6));

    }
}
