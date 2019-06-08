package kehou;

public class Test03 {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2="abc";
        String s3="a"+"b"+"c";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println( s3.equals(s2));
    }
}
