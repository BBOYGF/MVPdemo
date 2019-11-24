package com.example.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements iView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1=findViewById(R.id.button1);
        final presneter p=new presneter(this);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.showData();
            }
        });


    }
    @Override
    public void showToast(String s)
    {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
