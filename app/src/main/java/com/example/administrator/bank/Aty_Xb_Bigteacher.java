package com.example.administrator.bank;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.bank.utils.DensityUtil;


/**
 * Created by Administrator on 2017/7/26 0026.
 */

public class Aty_Xb_Bigteacher extends Activity implements View.OnClickListener {
    //分享的按钮
    private ImageView imteacher_xb_shape;
    //分享qq的按钮
    private LinearLayout ll_xb_shareqq;
    //Textview 改变文字的控件
    private TextView tvteacher_xb_guanli;
    //ll余额的控件,bank的控件
    private LinearLayout ll_xb_into_bank,ll_xb_into_yuer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_xb_bigteacher);
        init();
        event();
        Intent intent = getIntent();
        if (intent!=null){
            String data = intent.getStringExtra("data");
            if ("1".equals(data)){
                tvteacher_xb_guanli.setText("协会管理");
            }
        }
    }
    public void init(){

        imteacher_xb_shape=findViewById(R.id.imteacher_xb_shape);
        tvteacher_xb_guanli=findViewById(R.id.tvteacher_xb_guanli);
        ll_xb_into_bank=findViewById(R.id.ll_xb_into_bank);
        ll_xb_into_yuer=findViewById(R.id.ll_xb_into_yuer);
    }
    public void event(){
        imteacher_xb_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2();
            }
        });

        ll_xb_into_yuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Aty_Xb_Bigteacher.this,Aty_Xb_Residue.class);
                startActivity(intent);
            }
        });
        ll_xb_into_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Intent intent=new Intent(Aty_Xb_Bigteacher.this,MainActivity.class);
                startActivity(intent);*/
            }
        });
    }
    private void show2() {
        Dialog bottomDialog = new Dialog(this, R.style.BottomDialog);
        View contentView = LayoutInflater.from(this).inflate(R.layout.dialog_content_circle, null);
        ll_xb_shareqq=contentView.findViewById(R.id.ll_xb_shareqq);
        ll_xb_shareqq.setOnClickListener(this);
        bottomDialog.setContentView(contentView);
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) contentView.getLayoutParams();
        params.width = getResources().getDisplayMetrics().widthPixels - DensityUtil.dp2px(this, 16f);
        params.bottomMargin = DensityUtil.dp2px(this, 8f);
        contentView.setLayoutParams(params);
        bottomDialog.getWindow().setGravity(Gravity.BOTTOM);
        bottomDialog.getWindow().setWindowAnimations(R.style.BottomDialog_Animation);
        bottomDialog.setCanceledOnTouchOutside(true);
        bottomDialog.show();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_xb_shareqq:
                Toast.makeText(this, "已经分享成功", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
