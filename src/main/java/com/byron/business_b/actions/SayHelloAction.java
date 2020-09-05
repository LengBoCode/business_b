package com.byron.business_b.actions;

import android.content.Context;
import android.util.Log;

import com.byron.base.router.BaseAction;
import com.byron.base.router.Response;

public class SayHelloAction extends BaseAction {
    @Override
    public void execute(Response response, Object... params) {
        Log.i("SayHelloAction", "执行");
    }
}
