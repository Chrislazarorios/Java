/*
 * Linked List is a chain of linked nodes
 * Every node has two parts, data(number,string, etc) and a pointer to the nex node (box split in two) (data | pointer)
 * Linked Lists allow to getSize(), find(data), add(data), remove(data)
 */
package LinkedList;

/**
 * First node is the root node, if you add a new node before the first one, the new node becomes the root
 * Last node has no pointer, instead it has data and a null
 * When you remove a node, you just take away the pointer from the node pointing at it, excluding that node from the chain of linked nodes
 */

/**
 * Pros : Insert or remove anywhere in list without shifting elements. Insert, Remove : 0(1)
 * Cons : Not Sortable. Not stored in contiguous memory. Must traverse list to find an element. Find : 0(n)
 */

public class LinkedList {
    Node root;
    int size;
    
    public LinkedList() {
        root = new Node();
        size = 0;
    }
    
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        System.out.println("Tamaño inicial de la lista LL (deberia ser 0):");
        System.out.println(LL.getSize());
        LL.add(8);
        System.out.println("Tamaño de la lista LL despues de agregar el dato 8 (deberia ser 1):");
        System.out.println(LL.getSize()); 
        LL.add(17);
        LL.add(5);
        LL.add(10);
        System.out.println("Tamaño de la lista LL despues de agregar 4 datos (deberia ser 4)");
        System.out.println(LL.getSize());
        System.out.println("Busco el nodo que posee el dato 17 (deberia devolver el dato 17):");
        System.out.println(LL.find(17).getData()); // method .find returns the number of the node that contains the data we are looking for, but if we add .getData it returns the data stored in that node
        LL.remove(5);
        System.out.println("Tamaño de la lista LL despues de borrar el nodo que posee el dato 5 (deberia ser 3):");
        System.out.println(LL.getSize());
        System.out.println("Resultado de buscar el nodo que posee el dato 5 (deberia retornar null):");
        System.out.println(LL.find(5));
    }
    
    
    public void setSize(int s) {
        this.size = s;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public Node add(int data) {
        Node newNode = new Node(data, root);
        this.root = newNode;
        this.size++;
        
        return newNode;        
    }
    
    public Node find(int data) {
        Node thisNode = this.root;
        
        while(thisNode != null) {
            if(thisNode.getData() == data){
                return thisNode;
            }
            else{
                thisNode = thisNode.getNextNode();
            }
            
        }
        return null;
    }
    
    public boolean remove(int data) { //return true if succesful and false if it fails to find node that has the data we are looking for
        Node thisNode = this.root; // pointer to actual node
        Node prevNode = null; // pointer to previous node, starts as null because root node has no previous node
        
        while(thisNode != null) { // as long as it doesn't reach the end of the array
            if(thisNode.getData() == data){ // compares the data we are looking for with the data stored in each node, if we find it
                prevNode.setNextNode(thisNode.getNextNode()); //pointer to previous node is set to next node, avoiding the node that has the data we looked for
                this.setSize(this.getSize()-1); // resizes the array minus one
                return true; //if succesfully removes node
            }
            else { // if that node doesn't have the data we are looking for
                prevNode = thisNode; // pointer to previous node is set to actual node
                thisNode = thisNode.getNextNode(); // and pointer to actual node is set to next node, this way it keeps going through the array to find the data we are looking for
            }
        }
              
        return false; //if it fails to find data in the array
    }
    
    


// Private Node class INSIDE public class LinkedList
private class Node {
    private Node nextNode;
    private int data;
    
    // 0-arg constructor, 1-arg constructor, 2-arg constructor
    //Three constructors : 0 - No arguments constructor, 1 - One argument constructor, 2 - Two arguments constructor
    
    private Node() { // No arguments constructor
            
    }
    
    private Node(int val) { // One argument constructor, adds data
        data = val;
    }
    
    private Node(int val, Node next) { //Two argument constructor, adds data and a next node
        data = val;
        nextNode = next;
    }
    
    private void setData(int val) { // Sets data in node, Setters are always private/public VOIDS and have a VARIABLE as ARGUMENT, which after user introduces data its setted into an OBJECT(THIS.OBJECTNAME)
        this.data = val;
    }
    
    private int getData() { // Gets data from node, Getters always RETURN a THIS.OBJECTNAME and have NO ARGUMENTS
        return this.data;
    }
    
    private void setNextNode(Node n) {
        this.nextNode = n;
    } 
    
    private Node getNextNode(){
        return this.nextNode;
    }
    
}

} // end of public class LinkedList


