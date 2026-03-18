import java.util.concurrent.ThreadLocalRandom;
public class Dado {
    public static int D12(){
        return ThreadLocalRandom.current().nextInt(1, 13);
    }
    public static int D20(){
        return ThreadLocalRandom.current().nextInt(1, 21);
    }

}
