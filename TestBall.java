package Lab1;

public class TestBall {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1(){
        Ball sw1 = new Ball("ngoc", 7);
        System.out.println(sw1);
        Ball sw2 = new Ball("minh");
        System.out.println(sw2);
    }

    public static void test2(){
        Ball sw3 = new Ball(8);
        sw3.setname("hoang");
        System.out.println(sw3);
        Ball sw4 = new Ball();
        System.out.println(sw4);
    }
}