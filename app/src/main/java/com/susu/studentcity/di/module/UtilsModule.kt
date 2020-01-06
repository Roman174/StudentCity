package com.susu.studentcity.di.module

import android.content.Context
import com.susu.studentcity.utils.UserInfo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UtilsModule {
    @Singleton
    @Provides
    fun provideUserInfo(context: Context) = UserInfo(context)
}