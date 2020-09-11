
package Lab1;

public class TestDog {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1(){
        Dog d1 = new Dog("Pyp", 4);
        d1.toInfor();
        Dog d2 = new Dog("Pypy");
        d2.toInfor();
    }

    public static void test2(){
        Dog d3 = new Dog(1);
        d3.toInfor();
        Dog d4 = new Dog();
        d4.toInfor();
    }
}
