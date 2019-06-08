package kehou;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
    public static void main(String[] args) {
        /*请用代码实现:
        获取当前的日期,并把这个日期转换为指定格式的字符串,如 2088-08-08 08:08:08

        TIP提示:涉及知识点 Date类的使用*/
        Date d1=new Date();
        SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = s1.format(d1);
        System.out.println(format);

    }
}
