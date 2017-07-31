package com.example.administrator.bank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/7/31.
 */

public class Aty_Xb_Residue extends Activity implements View.OnClickListener {
    //提现的控件
    private LinearLayout llresidue_xb_tixian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_xb_residue);
        init();
        event();
    }

    private void init(){
        llresidue_xb_tixian=findViewById(R.id.llresidue_xb_tixian);
    }
    private void event(){
        llresidue_xb_tixian.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llresidue_xb_tixian:
                startActivity(new Intent(Aty_Xb_Residue.this,Aty_Xb_Deposit.class));
                break;
        }

    }
}
