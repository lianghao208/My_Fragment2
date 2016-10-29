package com.example.administrator.my_fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //switch (v.getId()){
            //case R.id.button:
                //初始化要加载的碎片对象
                AnotherRightFragment fragment = new AnotherRightFragment();
                //初始化碎片管理对象
                android.app.FragmentManager fragmentManager = getFragmentManager();
                //初始化碎片事务对象
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //调用碎片事务的replace方法替换碎片布局
                transaction.replace(R.id.right_layout, fragment);
                //加入返回栈，在按返回键时可返回原来的碎片
                transaction.addToBackStack(null);
                //提交事务
                transaction.commit();

                //break;
            //default:break;
        //}
    }
}



