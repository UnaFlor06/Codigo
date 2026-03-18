public class LinkedList {
    public No start;
    public int size;
    public int counter;

    public LinkedList(){
        this.start = null;
        this.size = 0;
    }
    public void insertHead(int data){
        No newNo = new No(data);
        newNo.next = start;
        start = newNo;
        size++;
    }
    public void removeHead(){
        if(start == null){
            return;
        }
        start = start.next;
    }
    public boolean removeEnd(int data){
       if(start == null){
        System.out.println("Menor, não tem nós");
        return false;
       }
       No newNo =start;
       while(newNo.next != null){
        if(newNo.next.data == data){
            newNo.next = newNo.next.next;
            size--;
            return true;
            }
        }
        return false;
    }
    public boolean search(int data){
        No newNo = start;
        while(newNo != null){
            if(newNo.data == data){
                System.out.println("Valor encontrado " + newNo.data);
                return true;
            }
            newNo = newNo.next;
        }
        return false;
    }
    public void insertEnd(int data){
        No newNo = new No(data);
        if(start == null){
            start = newNo;
        }
        else{
            No temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
        temp.next = newNo;
        }
        size++;
    }
    public void infoPrint(){
        No temp = start;
        System.out.println("Linked List");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    
}
