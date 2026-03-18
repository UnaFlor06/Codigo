public class Main{
    public static void main(String[] args) {
        Line F = new Line();
        Stac c = new Stac(10);
        F.addFirst(10);
        F.addFirst(20);
        F.addFirst(30);
        F.addFirst(40);
        F.addFirst(50);
        F.addFirst(60);
        F.addFirst(70);
        F.addFirst(80);
        F.addFirst(90);
        F.addFirst(100);
        

        System.out.println(F.head.data);
        System.out.println(F.tail.data);

        F.removeInsert(c);
        F.removeInsert(c);
        
                System.out.println(F.head.data);
                System.out.println(c.head.data);


    }
}