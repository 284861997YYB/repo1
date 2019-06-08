package demo01;

public class Test {
    public static void main(String[] args) {
        Person s1=new Person( "clearlove7",27);
        Person s2=new Person("简自豪",26);
        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1);
        System.out.println(s1.equals(s2));
    }
}
