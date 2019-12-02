package com.example.mvpdemo;

import android.content.Context;

public  class   presneter implements callback {
    iView con;
    Model m;
    presneter p;
    presneter()
    {

    }
    presneter(iView con)
    {

        this.con=con;
        m=new Model(this);
    }

    public String getData()
    {
        return  m.getData();

    }
    public void showData()
    {
        con.showToast(getData());
    }

    @Override
    public void request(int s) {
        switch(s)
        {
            case 1:
                showData();
        }
    }
    public void  Destroy()
    {
        m=null;
        con=null;
    }
    public static presneter  getPresenter(iView con)
    {
        return new presneter(con);

    }
}
