package com.example.mii_reivin.ciscovideocall;

import android.util.Log;
import com.alicecallsbob.assist.sdk.config.AssistConfig;
import com.alicecallsbob.assist.sdk.config.impl.AssistConfigBuilder;
import com.alicecallsbob.assist.sdk.core.AssistError;
import com.alicecallsbob.assist.sdk.core.AssistListener;

public class AssistListenerImpl implements AssistListener {
    @Override
    public void onSupportError(AssistError assistError, String s) {

    }

    @Override
    public void onSupportEnded(boolean b) {
        if (!b) {
            //Display
        }
    }

}
