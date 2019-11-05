package br.com.impacta.kotlin.carrosimpacta

import android.app.Application
import android.util.Log
import java.lang.IllegalStateException

open class CarrosAplication : Application(){

    private val TAG="CarrosAplication"

    override fun onCreate() {
        super.onCreate()
        appInstance=this
    }
companion object{
    private var appInstance:CarrosAplication?=null
    fun getInstance() {
        if (appInstance==null){
            throw IllegalStateException(
                "Configure a classe de Application no AndroidManifest.xml")
            return appInstance!!
        }
    }
}

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG,"CarrosAplication.onTerminate()")
    }
}