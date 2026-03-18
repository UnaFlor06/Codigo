public class Stac {
    Node head;
    int size;
    int num;

    public Stac(int size){
        this.head = null;
        this.size = size;
        this.num = 0;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(num >= size){
            System.out.println("Está cheia");
        }
        else{
            newNode.next = head;
            head = newNode;
            num++;
        }
    }
    public void peek(){
        Node current = head;
        if(head == null){
            System.out.println("Está vazio");
        }
        else{
            System.out.println(current.data);
        }
        Node temp = head;
        while(temp != null){
            
        }
    }
    public void pop(){
        if(head == null){
            System.out.println("Pilha vazia");
            return;
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            num--;
        }
    }
    public void isEmpty(){
        if(head == null){
            System.out.println("A pilha está vazia");
        }
        else{
            System.out.println("Não estão está cheia");
        }
    }
    public void stacPrint(){
        Node newNode = head;
        while(newNode != null){
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
    }
    public void invetedStacPrint(){
        
    }
    public void evenInvertedDataPrint(){
        
    }
}
