/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominatorchain;

import java.util.ArrayList;

/**
 *
 * @author soundaryaramesh
 */
public class DominatorChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Graph 1
        Graph g=new Graph(13,12);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(1,5);
        g.addEdge(4,5);
        g.addEdge(4,6);
        g.addEdge(4,7);
        g.addEdge(5,7);
        g.addEdge(6,8);
        g.addEdge(6,9);
        g.addEdge(7,8);
        g.addEdge(7,9);
        g.addEdge(8,10);
        g.addEdge(9,11);
        g.addEdge(10,12);
        g.addEdge(11,12);
      //Graph 2
     /*Graph g=new Graph(8,6);
       g.addEdge(0,1);
       g.addEdge(0,2);
       g.addEdge(1,3);
       g.addEdge(2,3);
     g.addEdge(3,4);
     g.addEdge(4,5);
     g.addEdge(5,6);
     g.addEdge(5,7);*/
       // g.addEdge(12,13);
        //g.display();
      //Graph 3
     /* Graph g=new Graph(9,7);
      g.addEdge(0,1);
      g.addEdge(0,2);
      g.addEdge(0,3);
      g.addEdge(1,4);
      g.addEdge(2,4);
      g.addEdge(3,4);
      g.addEdge(6,5);
      g.addEdge(6,8);
      g.addEdge(5,7);
      g.addEdge(8,7);*/
     //Graph 4
    /* Graph g=new Graph(5,4);
     g.addEdge(0,1);
     g.addEdge(1,2);
     g.addEdge(2,3);
     g.addEdge(3,4);*/
      
     
      g.dominatorChain1(0);
      /*g.dominatorChain1(1);
      g.dominatorChain1(2);
      g.dominatorChain1(3);
      g.dominatorChain1(4);
      g.dominatorChain1(5);
      g.dominatorChain1(6);
      g.dominatorChain1(7);
      g.dominatorChain1(8);*/
      
      g.printDominators();
      g.displayVertices();
      
        }
      
    }
    


