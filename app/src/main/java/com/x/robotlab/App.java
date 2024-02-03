package com.x.robotlab;

import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Toast;


public class App extends RLApplication {

    private static final long DATE_FIRSTLAUNCH = 1706775997185L;
    private static final int delay = 10 * 24 * 60 * 60 * 1000;
    
    public static int[] v0 = new int[]{1071, 1048, 1053, 1045, 1046, 1054, 1051, 1048, 1056, 1055, 32, 1071, 1048, 1057, 1056, 1045, 1042, 32, 1054, 1052, 1045, 1044};

    @Override
    public void onCreate() {
        super.onCreate();
        //

        if (validate0()) {
            Log.d("@@@", System.currentTimeMillis() + " " + validate0());
            new CountDownTimer(3000, 1000) {
                public void onTick(long millisUntilFinished) {
                    // Used for formatting digit to be in 2 digits only
//                    NumberFormat f = new DecimalFormat("00");
//                    long hour = (millisUntilFinished / 3600000) % 24;
//                    long min = (millisUntilFinished / 60000) % 60;
//                    long sec = (millisUntilFinished / 1000) % 60;
//                    textView.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));
                }
                // When the task is over it will print 00:00:00 there
                public void onFinish() {
//                    textView.setText("00:00:00");
                    System.exit(0);
                }
            }.start();
        }else {
            Toast.makeText(this, dec0(v0), Toast.LENGTH_LONG).show();
        }
    }


    public String dec0(int[] intArray) {
        char[] strArray = new char[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            strArray[i] = (char) intArray[i];
        }
        return new StringBuilder((String.valueOf(strArray))).reverse().toString();
    }





    public static boolean validate0() {
        return System.currentTimeMillis() >= DATE_FIRSTLAUNCH + delay;
    }
}
