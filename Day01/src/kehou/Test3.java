package kehou;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
     /*   代码实现：
        (1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
        (2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
        (3)如：010 是对称的，3223 是对称的，123123 不是对称的；
        (4)最终打印该数组中对称字符串的个数。

        注：判断对称可用reverse(),将此字符序列用其反转形式取代。
        TIP提示: 涉及知识点 StringBuilder类的使用（reverse()方法）*/
          String [] arr={"010","3223","666","7890987","123123"};
          int count=0;
        System.out.println("符合条件的个数有:");
        for (int i = 0; i < arr.length; i++) {
            StringBuffer s1=new StringBuffer(arr[i]);
            StringBuffer s2 = s1.reverse();
            String s3 = s2.toString();
            if (s3.equals(arr[i])){
                count++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n总共有"+count+"个");

    }
}
