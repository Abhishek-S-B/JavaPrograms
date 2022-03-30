package Java.OOPS;

public class overloading {
    public static void main(String[] args) {
        overLoad ol = new overLoad(2,3);
        ol.add();
        ol.add(1,2);
    }
}
class overLoad {
    public overLoad(int a, int b) {
        System.out.println(a + " " + b);
    }
    public void add() {
        System.out.println("No Arguments.");
    }
    public void add (int a, int b) {
        System.out.print(a+b);
    }
}
