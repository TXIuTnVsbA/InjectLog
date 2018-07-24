package com.hook.testsmali;

import android.util.Log;
public class InjectLog
{
    public static void PrintFunc()
    {
        Thread cur_thread = Thread.currentThread();
        StackTraceElement stack[] = cur_thread.getStackTrace();
        Log.d("InjectLog", stack[3].toString() + "[" + cur_thread.getId() + "]");
    }
}
