public class App {
    public static void main(String[] args) throws Exception{

        DoubleLinkedList list = new DoubleLinkedList();

        list.insertHead(7);
        list.insertHead(9); 
        list.insertTail(14);
        list.insertTail(17);
        list.insertTail(20);
        list.search(7);
        list.anyInsert(24, 4);
        list.anyRemove(24);
        list.printFromHead();
        list.printFromTail();
        
    }
}
