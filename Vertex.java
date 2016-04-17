/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominatorchain;

/**
 *
 * @author soundaryaramesh
 */
public class Vertex {
    
   
    int vertex_no;
    int index;
    int flag;
    int min_index;
    int max_index;
    int capacity;
    int remove_vertex;
    
    public Vertex(int id){
        vertex_no=id;
        index=-1;
        min_index=-1;
        max_index=-1;
        flag=-1;
        
    }
    void setIndex(int id){
        index=id;
    }
    void setFlag(int f){
        flag=f;
    }
    void setMinValue(int m){
        min_index=m;
    }
    void setMaxValue(int m){
        max_index=m;
    }
    
}
