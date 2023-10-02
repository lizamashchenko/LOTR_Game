import lotr.King;

public class Demo {
    public static void main(String[] args) {
        King k1 = new King();
        King k2 = new King();

        k1.kick(k2);

        System.out.println(k1);
        System.out.println(k2);
    }
}
