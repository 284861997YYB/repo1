package kehou;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
     /*   请用代码实现:
        现有一个字符数组{'i','t','c','a','s','a'}，请使用System类中的arraycopy()方法在控制台输出“itcast”。
    （提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）
        TIP提示: 涉及知识点 System类arraycopy方法的使用*/

        char[] c1=new char[]{'i','t','c','a','s','e'};
        System.out.println("原数组为:"+Arrays.toString(c1));
        char[] c2=new char[]{'i','t','c','a','s','e'};
        System.arraycopy(c1,0,c2,5,1);
        System.out.println("覆盖后的数组为:"+Arrays.toString(c2));
    }
}
