package com.byron.business_b.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.byron.base.router.Response;
import com.byron.base.router.Dispatcher;
import com.byron.business_b.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_main);

        findViewById(R.id.jumpToA).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Dispatcher.request(
                        "business_a",  // receiver名称
                        "business_a_open_activity_action", // 执行的动作
                        new Response() {  // 结果回调
                            @Override
                            public void response(Object... params) {

                            }
                        },
                        MainActivity.this);  // 传入参数
            }
        });
    }
}
