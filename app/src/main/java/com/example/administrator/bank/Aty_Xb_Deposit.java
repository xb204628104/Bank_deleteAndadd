package com.example.administrator.bank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/7/31.
 */

public class Aty_Xb_Deposit extends Activity implements View.OnClickListener {
    //进入银行卡listview控件；
    private LinearLayout lldeposit_xb_into;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_xb_deposit);
        init();
        event();
    }

    private void init(){
        lldeposit_xb_into=findViewById(R.id.lldeposit_xb_into);
    }
    private void event(){
        lldeposit_xb_into.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lldeposit_xb_into:
                startActivity(new Intent(Aty_Xb_Deposit.this,MainActivity.class));
                break;
        }
    }
}
