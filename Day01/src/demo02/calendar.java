package demo02;

import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR,1999);
        instance.set(Calendar.MONTH,4-1);
        instance.set(Calendar.DATE,3);
        int i = instance.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(i);
        System.out.println("================");

        instance.set(1999,3-1,1);
        instance.add(Calendar.DATE,-1);
        int i1 = instance.get(instance.DATE);
        System.out.println(i1);
        if (i1==28){
            System.out.println("不是闰年");
        }else {
            System.out.println("是闰年");
        }


    }
}
