package avl_tree;

public class Tree {
    AVL_tree_obj root;
    
    public Tree(){
        root = null;
    }
    
    public void InsertNewElement(int element){
        root = InsertNewElementRecursive(element, root);
    }
    
    public AVL_tree_obj InsertNewElementRecursive(int element, AVL_tree_obj r){
        if(r == null)
            return new AVL_tree_obj(element, null, null);
        else if(element < r.inf)
            r.sx = InsertNewElementRecursive(element, r.sx);
        else
            r.dx = InsertNewElementRecursive(element, r.sx);
        return r;
    }
    
    public void PrintTheTree(){
        PrintTheTreeRecursive(root);
    }
    
    public void PrintTheTreeRecursive(AVL_tree_obj r){
        if(r == null)
            return;
        
        
        PrintTheTreeRecursive(r.sx);
        System.out.print(" " + r.inf + " ");
        PrintTheTreeRecursive(r.dx);
        
        
    }
}
