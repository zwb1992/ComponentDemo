package com.zwb.moudulec

import android.util.Log
import com.zwb.baselibrary.base.ApplicationLike

class ApplicationLikeImplC : ApplicationLike {
    override fun onCreate() {
        Log.e("info", "ApplicationLikeImplCCCC  onCreate ")
    }
}