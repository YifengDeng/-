package com.leaveword.demo.Utils;

import java.sql.Timestamp;

public class CommonTools {



    public static boolean isEmpty(String string){
        if (string == null)
            return true;
        if (string.isEmpty())
            return true;
        if (string == ""|| string.equals(""))
            return true;
        return false;


    }

    public static Timestamp getCurrentTime(){
        return new Timestamp(System.currentTimeMillis());
    }
}
