package kehou;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test07 {
    public static void main(String[] args) throws ParseException {
       /* 请用代码实现:
        用程序判断2018年2月14日是星期几。
        TIP提示:涉及知识点 Calendar类方法的使用
*/
        SimpleDateFormat s1=new SimpleDateFormat("yyyy年MM月dd日");
        Calendar c1=Calendar.getInstance();
        c1.set(Calendar.YEAR,2018);
       c1.set(Calendar.MONTH,2-1);
       c1.set(Calendar.DATE,3);
        int i = c1.get(Calendar.DAY_OF_WEEK);
        System.out.println("这一天是星期:"+i);
    }
}
