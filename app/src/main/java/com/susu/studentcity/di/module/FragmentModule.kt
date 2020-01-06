package com.susu.studentcity.di.module

import com.susu.studentcity.ui.pages.MapFragment
import com.susu.studentcity.ui.pages.MenuFragment
import com.susu.studentcity.ui.pages.NewsFragment
import com.susu.studentcity.ui.pages.OthersFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeMenuFragment(): MenuFragment

    @ContributesAndroidInjector
    internal abstract fun contributeMapFragment(): MapFragment

    @ContributesAndroidInjector
    internal abstract fun contributeNewsFragmnent(): NewsFragment

    @ContributesAndroidInjector
    internal abstract fun contributeOthersFragment(): OthersFragment
}