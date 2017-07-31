package com.example.administrator.bank;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<Bank> list;
    private long fristTime=0;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add= (Button) findViewById(R.id.btadd);
        listView= (ListView) findViewById(R.id.lv);
        list=new ArrayList<Bank>();
        for (int i = 0; i <10 ; i++) {
            Random random=new Random();
            int i1 = random.nextInt(9);
            Bank bank=new Bank();
            bank.setIdCard("1001 1252 1001 2318 254"+i1);
            list.add(bank);
        }


        BankBaseAdapter bankBaseAdapter=new BankBaseAdapter(this,list);
        listView.setAdapter(bankBaseAdapter);
        listView.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.setHeaderTitle("");
                contextMenu.add(0, 0, 0, "删除银行卡");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Bank> list1=new ArrayList<Bank>();
                for (int i = 0; i <10 ; i++) {
                    Random random=new Random();
                    random.nextInt(9);
                    Bank bank=new Bank();
                    bank.setIdCard("1001 1252 1001 231");
                    list1.add(bank);
                }
                BankBaseAdapter bankBaseAdapter=new BankBaseAdapter(MainActivity.this,list1);
                listView.setAdapter(bankBaseAdapter);
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            long secondTime = System.currentTimeMillis();
            if (secondTime-fristTime>2000){
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                //W.t("");
                fristTime=secondTime;
                return true;
            }else {
                moveTaskToBack(true);
                //System.exit(0);
            }
        }
        return super.onKeyDown(keyCode, event);
    }

   /* @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                long secondTime = System.currentTimeMillis();
                if (secondTime-fristTime>2000){
                    Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                    //W.t("");
                    fristTime=secondTime;
                    return true;
                }else {
                    moveTaskToBack(true);
                    //System.exit(0);
                }
                break;
        }
        return super.onKeyUp(keyCode, event);
    }*/

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        //list.remove(0);
        //Toast.makeText(this, "点击了长按菜单里面的第"+item.getItemId()+"个项目", Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
}
