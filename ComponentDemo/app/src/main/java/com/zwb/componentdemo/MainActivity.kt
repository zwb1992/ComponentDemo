package com.zwb.componentdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.zwb.moudulecexport.RouterPath
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt1.setOnClickListener {
            ARouter.getInstance().build(RouterPath.PATH_MOUDULEC_MAIN).navigation()
        }
    }
}
