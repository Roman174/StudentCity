package com.susu.studentcity.di.module

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(app: Application): Context = app.baseContext

    @Provides
    @Singleton
    fun provideLayoutInflater(context: Context): LayoutInflater = LayoutInflater.from(context)
}