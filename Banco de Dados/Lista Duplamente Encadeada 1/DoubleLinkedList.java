public class DoubleLinkedList {

    Node head;
    Node tail;
    int size;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isNull(){
        return head == null;
    }
    public void insertHead(int data){
        Node newNode = new Node(data);
        if(isNull()){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void removeHead(){
        if(isNull()){
            System.out.println("Lista vazia");
            return;
        }
        if(head == tail || size == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public void removeTail(){
        if(isNull()){
            System.out.println("Lista vazia");
            return;
        }
        if(head == tail || size == 1){
            head = null;
            tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    public void anyRemove(int data){
        if(isNull()){
            System.out.println("Lista vazia");
            return;
        }
        Node current = head;
        while(current != null){
            if(current.data == data){
                if(current == head){
                    removeHead();
                    return;
                }
                if(current == tail){
                    removeTail();
                }
                Node before = current.prev;
                Node after = current.next;
                before.next = after;
                after.prev = before;
                size--;
            }
            current = current.next;
        }
    }
    public void anyInsert(int data, int position){
        if(position < 0 || position > size){
            System.out.println("Posição inválida");
            return;
        }
        if(position == 0){
            insertHead(data);
            return;
        }
        if(position == size){
            insertTail(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 0; i < position; i++){
            temp = temp.next;
        }
        Node previous = temp.prev;
        previous.next = newNode;
        newNode.prev = previous;
        newNode.next = temp;
        temp.prev = newNode;
        size++;
    }
    public void insertTail(int data){
        Node newNode = new Node(data);
        if(isNull()){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void infoList(){
        if(isNull()) System.out.println("Lista");
        Node newNode = head;
        while(newNode != null){
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
    }
    public boolean search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                System.out.println("Elemento encontrado: " + temp.data);
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        System.out.println("Elemento não encontrado");
        return false;
    }
    public void printFromHead(){
        if(isNull()){
            System.out.println("Lista vazia");
            return;
        }
        Node temp = head;
        System.out.println("Lista: ");
        while(temp != null){
            System.out.println("O elemento é: " + temp.data);
            temp = temp.next;
        }
    }
    public void printFromTail(){
        if(isNull()){
            System.out.println("Lista vazia");
            return;
        }
        Node temp = tail;
        System.out.println("Lista: ");
        while(temp != null){
            System.out.println("O elemento é: " + temp.data);
            temp = temp.prev;
        }
    }
}