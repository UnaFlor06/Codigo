public class banco {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.insertHead(10);
        list.insertHead(30);
        list.insertHead(50);
        list.insertEnd(25);
        
        list.removeHead();
        list.search(30);
        
        list.infoPrint();
        
    }
}
