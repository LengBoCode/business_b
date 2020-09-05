package com.byron.business_b.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.byron.base.router.Response;
import com.byron.base.router.RouterUtils;
import com.byron.business_b.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_main);

        findViewById(R.id.jumpToA).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                RouterUtils.request(
                        "business_a",
                        "business_a_open_activity_action",
                        new Response() {
                            @Override
                            public void response(Object... params) {

                            }
                        },
                        MainActivity.this);
            }
        });
    }
}
