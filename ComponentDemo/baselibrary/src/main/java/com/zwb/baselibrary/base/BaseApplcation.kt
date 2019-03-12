package com.zwb.baselibrary.base

import android.app.Application
import java.util.*


open class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val loader = ServiceLoader.load(ApplicationLike::class.java)
        val mIterator = loader.iterator()
        while (mIterator.hasNext()) {
            mIterator.next().onCreate()
        }
    }
}