package com.susu.studentcity.di.module

import com.susu.studentcity.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeNavigateActivity(): MainActivity
}