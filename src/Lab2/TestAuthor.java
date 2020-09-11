package Lab2;

public class TestAuthor {
    public static void main(String args[]) {
        Author obj1 = new Author("NgocPho", "ngocpho123@gmail.com", 'm');
        System.out.println(obj1.toString());

        Author obj2 = new Author();
        System.out.println(obj2.toString());
        obj2.setEmail("phongoc2000.com");
        System.out.println(obj2.toString());
    }
}