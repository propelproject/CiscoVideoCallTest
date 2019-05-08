package com.example.mii_reivin.ciscovideocall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alicecallsbob.assist.sdk.config.AssistConfig
import com.alicecallsbob.assist.sdk.config.impl.AssistConfigBuilder
import com.alicecallsbob.assist.sdk.core.Assist
import com.alicecallsbob.assist.sdk.core.AssistCore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var uui: String = "5465737420555549";

        //Starting a Support Session

        var builder: AssistConfigBuilder = AssistConfigBuilder(applicationContext).setAgentName("agent1")
        builder.setServerHost("127.0.0.1")

        lateinit var config:AssistConfig

        try {
            config = builder.build()
            Assist.startSupport(config, application, AssistListenerImpl())

        } catch (ex: NumberFormatException)  {
            Log.d("maintest", ex.toString())

        }

    }
}

