package com.zwb.baselibrary.base

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.zwb.baselibrary.BuildConfig
import java.util.*


open class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {           // These two lines must be written before init, otherwise these configurations will be invalid in the init process
            ARouter.openLog()    // Print log
            ARouter.openDebug()   // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
        }
        ARouter.init(this) // As early as possible, it is recommended to initialize in the Application
        val loader = ServiceLoader.load(ApplicationLike::class.java)
        val mIterator = loader.iterator()
        while (mIterator.hasNext()) {
            mIterator.next().onCreate()
        }
    }
}