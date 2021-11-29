package com.shaw.Adapt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AdaptDemo {
    public static void main(String[] args) throws ParseException {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
        Calendar calendar = new GregorianCalendar();
        Date payDay = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        payDay = sdf.parse(sdf.format(payDay));
        calendar.setTime(payDay);
//        calendar.add(Calendar.DATE,-1);
        payDay = calendar.getTime();
        Date nowDate=new Date(); //取时间
        calendar.setTime(nowDate);
        calendar.add(Calendar.DATE,-1); //把日期往后增加一天,整数  往后推,负数往前移动
        nowDate=calendar.getTime(); //这个时间就是日期往后推一天的结果
//        toPayItem.setDueDate(zssd002Result.getZzlpayday());
        System.out.println(payDay);
        System.out.println(nowDate);
        if (payDay.before(nowDate)) {
//            toPayItem.setStatus("20");
            System.out.println("逾期了");
//            overdueAmount = overdueAmount.add(toPayItem.getToPayAmount());
        }
    }
}
