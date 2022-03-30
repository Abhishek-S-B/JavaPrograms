package Java.OOPS;

public class inheritance {
    public static void main(String[] args) {
        father f = new son();
        f.property(100);
    }
}
class father {
    public void property(int evaluation) {
        System.out.println(evaluation);
    }
}
class son extends father {
    @Override
    public void property(int evaluation) {
        super.property(evaluation);
        System.out.println(101);
    }
}