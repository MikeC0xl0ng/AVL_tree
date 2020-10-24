package avl_tree;

public class AVL_tree_obj {
    int inf;
    AVL_tree_obj sx;
    AVL_tree_obj dx;
    
    public AVL_tree_obj(){
        inf = 0;
        sx = null;
        dx = null;
    }
    
    public AVL_tree_obj(int newInfo, AVL_tree_obj newsx, AVL_tree_obj newdx){
        inf = newInfo;
        sx = newsx;
        dx = newdx;
    } 
}
