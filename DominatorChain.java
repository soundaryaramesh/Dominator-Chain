import java.util.ArrayList;

public class DominatorChain {

    public static void main(String[] args) {
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
      
    /* zero specifies the root of the graph */ 
      g.dominatorChain1(0);
      
      g.printDominators();
      g.displayVertices();
      
        }
      
    }
    


