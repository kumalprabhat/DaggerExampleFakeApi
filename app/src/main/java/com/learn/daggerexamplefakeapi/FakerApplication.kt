package com.learn.daggerexamplefakeapi

import android.app.Application
import com.learn.daggerexamplefakeapi.di.ApplicationComponent
import com.learn.daggerexamplefakeapi.di.DaggerApplicationComponent

class FakerApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}