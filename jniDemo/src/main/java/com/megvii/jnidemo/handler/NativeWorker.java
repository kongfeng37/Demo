package com.megvii.jnidemo.handler;

public class NativeWorker {
    static {
        System.loadLibrary("jnidemo");
    }

    public native void sayHello();
}
