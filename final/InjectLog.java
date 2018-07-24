package com.hook.debuger;

import android.util.Log;

public class InjectLog {
    public static void printFunc() {
        Thread thread = Thread.currentThread();
        StackTraceElement[] stackTraceElement = thread.getStackTrace();
        Log.d("InjectLog", "InjectLogByNull\n");
        if (stackTraceElement != null) {
            Log.d("InjectLog", "=====================================\n");
            try {
                Log.d("InjectLog", "\nId:\t" + thread.getId() + "\n");
                Log.d("InjectLog", "\nClassName:\t" + stackTraceElement[3].getClassName() + "\n");
                Log.d("InjectLog", "\nMethodName:\t" + stackTraceElement[3].getMethodName() + "\n");
                Log.d("InjectLog", "\nFileName:\t" + stackTraceElement[3].getFileName() + "\n");
            } catch (Exception e) {
                Log.d("InjectLog", "\nId:\t" + thread.getId() + "\n");
                Log.d("InjectLog", "\nError:\n" + e.toString() + "\n");
            }
            Log.d("InjectLog", "=====================================\n");
        }
    }
}
