package com.example.administrator.bank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Administrator on 2017/7/31.
 */

public class Aty_Xb_Addbank extends Activity implements View.OnClickListener {
    //添加按钮的控件
    private Button btaddbank_addok;
    //银行卡号的控件
    private EditText etaddbank_xb_bankid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_xb_addbank);
        init();
        event();
    }
    private void init(){
        btaddbank_addok=findViewById(R.id.btaddbank_addok);
        etaddbank_xb_bankid=findViewById(R.id.etaddbank_xb_bankid);
    }
    private void event(){
        btaddbank_addok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btaddbank_addok:
                //String bankcardid = etaddbank_xb_bankid.getText().toString().trim();
                Intent intent=new Intent(Aty_Xb_Addbank.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
