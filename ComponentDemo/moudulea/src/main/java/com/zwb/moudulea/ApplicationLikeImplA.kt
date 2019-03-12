package com.zwb.moudulea

import android.util.Log
import com.zwb.baselibrary.base.ApplicationLike

class ApplicationLikeImplA : ApplicationLike {
    override fun onCreate() {
        Log.e("info", "ApplicationLikeImplAAAAAAA  onCreate ")
    }
}