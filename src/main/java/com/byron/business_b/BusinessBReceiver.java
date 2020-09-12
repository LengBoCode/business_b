package com.byron.business_b;

import com.byron.base.router.BaseReceiver;
import com.byron.business_b.actions.SayHelloAction;

public class BusinessBReceiver extends BaseReceiver {
    @Override
    protected void registerAction() {
        actions.put("business_b_say_hello_action", new SayHelloAction());
    }
}
