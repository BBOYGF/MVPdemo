package com.example.mvpdemo;

import android.content.Context;

public class presneter {
    iView con;
    Model m;
    presneter()
    {

    }
    presneter(iView con)
    {
        this.con=con;
        m=new Model();
    }

    public String getData()
    {
        return  m.getData();

    }
    public void showData()
    {
        con.showToast(getData());
    }
}
