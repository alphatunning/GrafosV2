/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author brusg
 */
public class BuscaController {
    
    private Grafo G;
    private ArrayList<Vertice> listaVisitados;
    private ArrayList<Item> listaExplorados;
    private int SomaGeodesica;

    public int getSomaGeodesica() {
        return SomaGeodesica;
    }

    private void incrementSomaGeodesica(int geodesica){
        SomaGeodesica += geodesica;
    }
       
    public BuscaController(Grafo G) {
        this.G = G;
        listaVisitados = new ArrayList<Vertice>();
        listaExplorados = new ArrayList<Item>();
    }

    public ArrayList<Item> getListaExplorados() {
        return listaExplorados;
    }
       
    public void BuscaLargura(Vertice v){ 
        //Inicializar F
        List<Vertice> Fila = new LinkedList<Vertice>();
        listaVisitados = new ArrayList<Vertice>();
        String UltimoVerticeNivel;
        int nivel = 0;
        
        //Marcar v com a cor cinza
        listaVisitados.add(v);
        //Item j = new Item(v.getItem());
        //j.setCores("gray"); 
        //this.listaExplorados.add(j);
        
        
        //Colocar v no final de F
        Fila.add(v); //Quem tá na fila é a galera que tá esperando pra explorar
        //todos os seus vértices adjacentes.
        UltimoVerticeNivel = v.getID();
        
        nivel = 1;
        //Enquanto F não vazio:
        while (!Fila.isEmpty()){
            
            //u = primeiro elemento de F
            String u = Fila.get(0).getID(); 
            
            //Para cada vértice w adjacente a u:
            for (Vertice w : G.getVerticesAdjacentes(u)){
                
                //Se w não foi visitado:
                if (!listaVisitados.contains(w)){
                                      
                    
                    incrementSomaGeodesica(nivel);
                    
                    //j = new Item(w.getItem());
                    //j.setCores("red,white"); 
                    //this.listaExplorados.add(j);
                    
                                        
                    //Marcar w com a cor cinza
                    
                    listaVisitados.add(w);    
                    //j = new Item(w.getItem());
                    //j.setCores("gray"); 
                    //this.listaExplorados.add(j);
                    
                    //Colocar w no final de F
                    Fila.add(w);
                }
            }    
            
            //Marcar u com cor Preta
            //j = new Item(Fila.get(0).getItem());
            //j.setCores("black"); 
            //this.listaExplorados.add(j);
            
            //Se o primeiro da fila for o último vértice do nivel anterior 
            //é porque a fila estará prestes a removê-lo e mudar de nível
            if (Fila.get(0).getID().equals(UltimoVerticeNivel)){
                nivel++;
                UltimoVerticeNivel = Fila.get((Fila.size()-1)).getID();
            }
            
            //Retirar u de F
            Fila.remove(0); 
            
        }
    }
}
