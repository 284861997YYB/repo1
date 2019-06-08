package kehou;

public class Test2 {
    public static void main(String[] args) {
       /* 请使用代码实现
        分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，
        计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。
        TIP提示: 涉及知识点 StringBuilder类的使用*/
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
          String a ="";
          a+="1";
        }long s2 = System.currentTimeMillis();
        System.out.println("+=程序共耗时:"+(s2-s1)+"毫秒");
        long s3 = System.currentTimeMillis();
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < 9999; i++) {
               stringBuffer.append(1);
        }
        long s4 = System.currentTimeMillis();
        System.out.println("StringBuffer程序共耗时:"+(s4-s3)+"毫秒");



    }
}
