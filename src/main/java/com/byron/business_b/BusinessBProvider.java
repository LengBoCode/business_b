package com.byron.business_b;

import com.byron.base.router.BaseProvider;
import com.byron.business_b.actions.SayHelloAction;

public class BusinessBProvider extends BaseProvider {
    @Override
    protected void registerAction() {
        actions.put("business_b_say_hello_action", new SayHelloAction());
    }
}
