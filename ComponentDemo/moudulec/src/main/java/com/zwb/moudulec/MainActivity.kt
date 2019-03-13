package com.zwb.moudulec

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.zwb.moudulecexport.RouterPath

@Route(path = RouterPath.PATH_MOUDULEC_MAIN)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.moudulec_activity_main)
        Log.e("info","cccccccccccccccc")
    }
}
