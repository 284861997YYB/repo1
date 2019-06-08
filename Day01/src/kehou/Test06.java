package kehou;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test06 {
    public static void main(String[] args) throws ParseException {
     /*   请用代码实现:
        使用SimpleDateFormat类,把2038-03-04转换为2038年03月04日。

        TIP提示:涉及知识点 DateFormat类方法的使用*/
        SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = s1.parse("2083-03-04");
        SimpleDateFormat s2=new SimpleDateFormat("yyyy年MM月dd日");
        String format = s2.format(parse);
        System.out.println(format);
    }
}
