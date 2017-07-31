package com.example.administrator.bank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/31.
 */

public class Aty_Xb_FristOne extends Activity implements View.OnClickListener {
    /**
     * 完成的按钮,用于登录
     */
    private Button bt_xb_login;
    //随便看看按钮
    private Button bt_xb_radrom;
    //大师注册按钮
    private Button bt_xb_bigshi;
    //忘记密码
    private TextView tv_xb_forget;
    //立即注册
    private TextView tv_xb_login;
    //用户名的控件
    private EditText et_xb_phonenum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        even();
    }
    public void init(){
        bt_xb_login= (Button) findViewById(R.id.bt_xb_login);
        bt_xb_radrom= (Button) findViewById(R.id.bt_xb_radrom);
        bt_xb_bigshi= (Button) findViewById(R.id.bt_xb_bigshi);
        tv_xb_forget= (TextView) findViewById(R.id.tv_xb_forget);
        tv_xb_login= (TextView) findViewById(R.id.tv_xb_login);
        et_xb_phonenum= (EditText) findViewById(R.id.et_xb_phonenum);
    }
    //控件的点击事件
    public void  even(){
        bt_xb_login.setOnClickListener(this);
        bt_xb_radrom.setOnClickListener(this);
        bt_xb_bigshi.setOnClickListener(this);
        tv_xb_forget.setOnClickListener(this);
        tv_xb_login.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //信息无误时登录
            case R.id.bt_xb_login:
                String s = et_xb_phonenum.getText().toString().trim();
                startActivity(new Intent(Aty_Xb_FristOne.this,Aty_Xb_Bigteacher.class)
                        .putExtra("data",s));
                break;
            //随便看看的时候点击
            case R.id.bt_xb_radrom:
                break;
            //大师注册的时候点击
            case R.id.bt_xb_bigshi:
                break;
            //当忘记密码的时候点击
            case R.id.tv_xb_forget:
                startActivity( new Intent(Aty_Xb_FristOne.this,Aty_Xb_Forgetpwd.class));
                break;
            case R.id.tv_xb_login:
                startActivity(new Intent(Aty_Xb_FristOne.this,Aty_Xb_Enroll.class));
                break;
        }
    }

}
