package Date1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        String brithday="1999年3月3日";
        String nowday ="2019年3月14日";

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日");
        Date d1 =sdf.parse(brithday);
        Date d2=sdf.parse(nowday);
         long t1=d1.getTime();
         long t2=d2.getTime();
         long t3=(t2-t1)/(1000*60*60*24);
        System.out.println("已经存活了:"+t3);

    }
}
