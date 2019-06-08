package demo03;

public class Test01 {
    public static void main(String[] args) {
        String s1="世界聚焦于你";
        StringBuffer s2=new StringBuffer(s1);
        String s3 = s2.toString();
        System.out.println("s3 = " + s3);
        s2.append(7777777).append('7').append(7.7777777);
        System.out.println(s2);
    }
}
