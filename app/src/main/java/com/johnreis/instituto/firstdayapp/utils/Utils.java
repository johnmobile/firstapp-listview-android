package com.johnreis.instituto.firstdayapp.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Instituto on 16/02/2017.
 */

public class Utils {
    static void print(String message){
        System.out.println(message);
    }

    static void toast(Context context, String message){
        Toast toast = new Toast(context);
        toast.setText(message);
        toast.show();
    }
}
