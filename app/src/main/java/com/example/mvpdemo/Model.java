package com.example.mvpdemo;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

public class Model {
    callback callback;
    Model(callback c) {
        this.callback=c;
    }
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            callback.request(msg.arg1);

        }
    };

    public String getData()  {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    Thread.sleep(10000);
                    Message msg=handler.obtainMessage();
                    msg.arg1=1;
                    handler.sendMessage(msg);
                }
                catch (Exception e)
                {
                    System.out.println(e.toString());
                }
                System.out.println("================");

            }
        }).start();
        return "显示成功！";
    }
}
