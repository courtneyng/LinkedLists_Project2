package project2;

/**
* Abstract Data Type LinkedString
* @author: Courtney Ng
* @version: 1.2.0
*/
public class LinkedString{
    private Node<Character> head; //Creates []
    private int count=0; //Keeps count of the size
    

    public LinkedString(){
        this(new char[0]);
    }

    public LinkedString(char[] arr){
        if(arr.length == 0){
            //return;
            head = new Node<Character>(arr[0]);
            Node<Character> current = head;
            count++;

            for(int i=1; i<arr.length; i++){
                current.setNext(new Node<Character>(arr[i]));
                count++;
                current.getNext().setPrevious(current);
                current = current.getNext();
            } 
        }
    }

    //Makes second link string for concat
    public LinkedString(String a){
        this(a.toCharArray());
    }

    /**
     * 
     * @param index - The index of the node
     * @return - Returns what is in the node
     */
    public char charAt(int index){
        Node<Character> current = head;
        //System.out.println(count);
        for(int i=0;i<count;i++){
            if(i==index){
                break;
            }
            else{
                current = current.getNext();
            }
        }
        return current.getData();
    }

    //Puts everything in the two strings into an object
    /**
     * 
     * @param b - LinkedString
     * @return - Returns new concatenated LinkedString
     */
    public LinkedString concat(LinkedString b){
        String var = "";
        Node<Character> back = this.head;
        for(int i=0;i<this.length();i++){
            var = var + back.getData();
            back = back.getNext();
        }
        for(int i=0;i<b.length();i++){
            var = var + back.getData();
            back = back.getNext();
        }
        return new LinkedString(var);
    }

    /**
     * 
     * @return - If the Node is empty,
     * Returns true only if the length of the linked string is 0
     */
    public boolean isEmpty(){
        if(this.length() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //Returns the length of the linked string
    public int length(){
        return this.count;
    }

    /**
     * 
     * @param begin - The starting/beginning index
     * @param end - The ending index
     * @return - Returns a new linked string that is a substring 
     * of the linked string
     */
    public LinkedString substring(int begin, int end){
        String str = "";
        Node<Character> current = head;
        int sum=0; //Keeps a count
        while(sum != begin){
            current = current.getNext();
            sum++;
        }
        for(int i=begin;i<end;i++){
            str = str + current.getData();
            current = current.getNext();
        }
        return new LinkedString(str);
    }
}