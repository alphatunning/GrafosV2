/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

import console.JPrompt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author bruno.meireles
 */
public class GrafoController {
    
    private Grafo grafo;
    public int Ordem;
    public int Tamanho;
    private Hashtable<Vertice, Double> HashVerticesCP;
    private ArrayList<Map.Entry<Vertice, Double>> HashList;
    
    public GrafoController(Grafo pGrafo){
        grafo = pGrafo;
    }
    
    public int getOrdem() {
        Ordem = grafo.getMapaVertices().size();
        return Ordem;
    }

    public void setOrdem(int Ordem) {
        this.Ordem = Ordem;
    }

    public int getTamanho() {
       Tamanho = grafo.getArestasGraficas().size();
       return Tamanho;      
    }

    public String getTopNCP(int N) {
        
        String mensagem = "";
               
        for (int i = 0; i < N; i++) {
            mensagem += "Top " + (i + 1) + " CP: " 
                    + HashList.get(i).getKey().getID() + " - " 
                    + HashList.get(i).getKey().getValor() + " - "
                    + HashList.get(i).getValue() + "\n";
        }
                
        return mensagem;
    }

    public void RankearCP() {
        
        HashVerticesCP = new Hashtable<Vertice, Double>();
        
        for (Vertice v : grafo.getMapaVertices().values()){

             HashVerticesCP.put(v, calcularCP(v));

        }

        HashList = new ArrayList(HashVerticesCP.entrySet());
        
        Collections.sort(HashList, new Comparator<Map.Entry<Vertice, Double>>(){

            @Override
            public int compare(Map.Entry<Vertice, Double> o1, Map.Entry<Vertice, Double> o2) {
               return o2.getValue().compareTo(o1.getValue());
            }
        }
        );
               
    }

    public Double calcularCP(Vertice v){
        
        return (getOrdem() - 1) / (double)Geodesica(v);
        
    }
    
    public int Geodesica(Vertice v){
        
        BuscaController Busca = new BuscaController(this.grafo);
                
        Busca.BuscaLargura(v);
        
        return Busca.getSomaGeodesica();
                          
    }
            
    
    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }
    public ArrayList <Vertice> listaVertices;
    public ArrayList <Aresta> listaAresta;

    public Grafo getG() {
        return grafo;
    }

    public void setG(Grafo G) {
        this.grafo = G;
    }

    public ArrayList<Vertice> getListaVertices() {
        return listaVertices;
    }

    public void setListaVertices(ArrayList<Vertice> listaVertices) {
        this.listaVertices = listaVertices;
    }

    public ArrayList<Aresta> getListaAresta() {
        return listaAresta;
    }

    public void setListaAresta(ArrayList<Aresta> listaAresta) {
        this.listaAresta = listaAresta;
    }
            
}