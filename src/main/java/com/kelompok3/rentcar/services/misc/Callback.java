package com.kelompok3.rentcar.services.misc;

interface OnCallBack {
    void onCallBack();    
}

public class Callback{
    private OnCallBack onCallBack;

    public void registerCallbackEventListener(OnCallBack onCallBack){
        this.onCallBack = onCallBack;
    }

    public void call(){
        new Thread(new Runnable() {
            public void run(){
                if(onCallBack != null){
                    onCallBack.onCallBack();
                }
            }
        }).start();
    }
}
