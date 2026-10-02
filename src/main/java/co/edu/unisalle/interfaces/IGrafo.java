package co.edu.unisalle.interfaces;

import java.util.List;

public interface IGrafo {


        //G = {V, E}
        void agregarNodo(int valor); // pre: el valor no debe estar ya en el grafo
        void agregarArista(int origen, int destino); // pre: nodos deben existir

        void mostrarMatrizAdyacencia(); // Muestra la matriz de adyacencia
        void mostrarListaAdyacencia(); // Muestra la lista de adyacencia

        void bfs(int inicio); // pre: el nodo inicio debe existir
        void dfs(int inicio); // pre: el nodo inicio debe existir

        // Devuelven el camino simple entre origen y destino; lista vacía si no existe.
        List<Integer> caminoMasCorto(int origen, int destino);
        List<Integer> caminoMasLargo(int origen, int destino);


}
