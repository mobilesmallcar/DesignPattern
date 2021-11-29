package com.shaw;

import java.time.Duration;
import java.time.LocalDateTime;

public class index {
    //30.33.幂指数,35（2）小问 47（4小问）
    //bn+1 = 2bn =2^(n) b1 = 2^n*1
    public static void main(String[] args){
//        FileInputStream
//        String s = new String("1234");
//        s = s.substring(0,3);
//        System.out.println(s);
        String s = new String("UPDATE t_ware_reissue_return SET member_sap_code='9000000024' WHERE sap_batch_code='';");
        System.out.println(s.length());
        Duration duration = Duration.between(LocalDateTime.now().MIN, LocalDateTime.now().MIN.plusMonths(11));
        System.out.println(duration.toDays());
        System.out.println(LocalDateTime.now().MAX);
    }
}
