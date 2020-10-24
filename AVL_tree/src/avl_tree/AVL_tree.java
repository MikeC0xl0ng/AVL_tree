package avl_tree;

/**
 *
 * @author Mykola Bodliev
 */

import java.util.Scanner;
public class AVL_tree {

    public static void main(String[] args) {
    Tree alberoBinario = new Tree();
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert the values to put into the AVL tree:");
    System.out.println("*if you want to stop insert '-1'");
    boolean cont;
    int input;
    do{
        input = sc.nextInt();
        if(input != -1){
            alberoBinario.InsertNewElement(input);
            cont = true;
        }
        else
            cont = false;
    }while(cont);
    alberoBinario.PrintTheTree();

        
    }
    
}
