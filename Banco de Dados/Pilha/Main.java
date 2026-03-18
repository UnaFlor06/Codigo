public class Main{
    public static void main(String[] args) throws Exception {
        Stac s = new Stac(5);
        s.push(10);
        s.push(12);
        s.push(3);
        s.pop();
        s.stacPrint();
    }
}