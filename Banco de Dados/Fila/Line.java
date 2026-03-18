public class Line {
    Node head;
    Node tail;
    int num;

    public Line(){
        this.head = null;
        this.tail = null;
        this.num = 0;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        num++;
    }
    public int peek(){
        return head.data;
    }
    public void remove(){
        if(head == null){
            System.out.println("Sem nós");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
        }
        else{

            head = head.next;
            head.prev = null;
        }
    }
        public void removeInsert(Stac c){
        if(head == null){
            System.out.println("Sem nós");
            return;
        }
        c.push(head.data);
        if(head == tail){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        
    }
}
