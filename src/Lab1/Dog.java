package Lab1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 1;
    }

    public Dog(int age) {
        this.name = "pypy";
        this.age = age;
    }

    public Dog() {
        name = "pupy";
        age = 3;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int intoHumanAge() {
        return this.age * 7;
    }

    public void toInfor() {
        System.out.println("-----------------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Human age: " + this.intoHumanAge());
    }
}
