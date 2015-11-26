/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

import console.JPrompt;
import java.util.ArrayList;

/**
 *
 * @author bruno.meireles
 */
public class GrafoController {
    
    private Grafo grafo;
    public int Ordem;
    public int Tamanho;

    public int getOrdem() {
        return Ordem;
    }

    public void setOrdem(int Ordem) {
        this.Ordem = Ordem;
    }

    public int getTamanho() {
        return Tamanho;
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
    
    public GrafoController(){
        
        grafo = new Grafo();
        listaVertices = new ArrayList<Vertice>();
        listaAresta = new ArrayList<Aresta>();
        
    }
    
    public int obterOrdemGrafo(Grafo p_grafo){
       
       this.grafo = p_grafo;
       Ordem = grafo.getMapaVertices().size();
       return Ordem;
    }
    
     public int obterTamanhoGrafo(Grafo p_grafo){
       
       this.grafo = p_grafo;
       Tamanho = grafo.getArestasGraficas().size();
       return Tamanho;      
    }
     
     public void obterCentralidadeProximidade(Grafo p_grafo){
         //ListaVertices
         int centralidade = 0;
         int ordemFormula = 0;
         int mediaGeodesica = 0;
         this.grafo = p_grafo;
        
         for (Vertice vert : grafo.getMapaVertices().values() ){
            
             mediaGeodesica = calculaMediaGeodesicaVertice(vert,grafo);
             ordemFormula = getOrdem() -1;

             centralidade= ordemFormula/mediaGeodesica;
             
             //Add Vertice(Centralidade)
             //listaVertice.Add(vertice);
         }
//      Collections.sort(listaVertices);
//      JPrompt.printPane("Primeiro : " + listaVertices.get(0));
// 	JPrompt.printPane("Segundo : " + listaVertices.get(1));
// 	JPrompt.printPane("Segundo : " + listaVertices.get(2));
         
     }
     
     public int calculaMediaGeodesicaVertice(Vertice p_vertice, Grafo grafo){
         
        double fracaoGeodesica = 0;
        int nGeodesica = grafo.getMapaVertices().keySet().size(); 
        int somatorioGeodesica = 0;
        double mediaGeodesica = 0;
        
        fracaoGeodesica = 1 / (0.5 * nGeodesica *(nGeodesica + 1));

//        for (ParVertice p: Largura.getListaParVertices()){
//            somatorioGeodesica += p.getGeodesica();
//        }
        
        mediaGeodesica = fracaoGeodesica * somatorioGeodesica; 
        
        //Vai ter que retornar a media geodesica para o vertice atual;
         return 0;
     }
    
}
