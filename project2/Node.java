package project2;

public class Node<c>{
    private Node<c> next;
    private Node<c> previous;
    private c data;
    
    public Node(c data){
        this.setData(data);
        this.setNext(null);
        this.setPrevious(null);
    }

    /**
     * Getters and Setters  
     * Sets a doubly linked list
     */
    public c getData(){
        return data;
    }

    public void setData(c data){
        this.data = data;
    }

    public Node<c> getPrevious(){
        return previous;
    }

    public void setPrevious(Node<c> previous){
        this.previous = previous;
    }

    public Node<c> getNext(){
        return next;
    }

    //Creates Node moving forward
    //Makes new Node everytime for loop iterates

    public void setNext(Node<c> next){
        this.next = next;
    }
}
