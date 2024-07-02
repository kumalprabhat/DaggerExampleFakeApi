package com.learn.daggerexamplefakeapi.di

import com.learn.daggerexamplefakeapi.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}