package com.hook.debuger;

import android.util.Log;

public class InjectLog {
    public static void PrintFunc(){
        Log.d("InjectLog","InjectLogByNull\n");
        Thread thread=Thread.currentThread();
        StackTraceElement[] stackTraceElement=thread.getStackTrace();
        if(stackTraceElement!=null){
            for(int i=0;i<stackTraceElement.length;i++){
                Log.d("InjectLog","=====================================\n");
                Log.d("InjectLog","\nId:\t"+ i +"\n");
                Log.d("InjectLog","\nClassName:\t"+ stackTraceElement[i].getClassName()+"\n");
                Log.d("InjectLog","\nMethodName:\t"+ stackTraceElement[i].getMethodName()+"\n");
                Log.d("InjectLog","\nFileName:\t"+ stackTraceElement[i].getFileName()+"\n");
                Log.d("InjectLog","=====================================\n");
            }
        }
        Log.d("InjectLog","\n==========================================================================\n");
    }
}
