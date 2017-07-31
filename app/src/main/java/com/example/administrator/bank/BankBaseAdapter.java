package com.example.administrator.bank;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */

public class BankBaseAdapter extends BaseAdapter {
    private Context context;

    public BankBaseAdapter(Context context, List<Bank> list) {
        this.context = context;
        this.list = list;
    }

    private List<Bank> list;
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int poss, View view, ViewGroup viewGroup) {
        MyviewHorld myviewHorld=null;
        if (view==null){
            myviewHorld=new MyviewHorld();
            view=View.inflate(context,R.layout.item,null);
            myviewHorld.textView=view.findViewById(R.id.textview);
            myviewHorld.fm=view.findViewById(R.id.fm);
            view.setTag(myviewHorld);
        }else {
            myviewHorld= (MyviewHorld) view.getTag();
            Bank bank = list.get(poss);
            myviewHorld.textView.setText(bank.getIdCard().toString());

        }

        myviewHorld.fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog alertDialog = new AlertDialog.Builder(context).

                        setMessage("删除银行卡").
                        setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                list.remove(poss);
                                notifyDataSetChanged();
                            }
                        }).
                        setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).
                        create();
                alertDialog.show();
            }
        });

        return view;
    }

}
class MyviewHorld{
    public TextView textView;
    public FrameLayout fm;
}