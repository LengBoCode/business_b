package com.byron.business_b;

import android.content.Context;
import android.widget.Toast;

import com.byron.base.BaseUtils;

public class BUtils {
    public static void sayHello(Context context) {
        Toast.makeText(context, "hello "+ BaseUtils.getBaseHello(), Toast.LENGTH_LONG).show();
    }
}
