package com.susu.studentcity.di.component

import android.app.Application
import com.susu.studentcity.MainApplication
import com.susu.studentcity.di.module.ActivityModule
import com.susu.studentcity.di.module.AppModule
import com.susu.studentcity.di.module.FragmentModule
import com.susu.studentcity.di.module.UtilsModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjection
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        FragmentModule::class,
        UtilsModule::class
    ]
)

interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MainApplication)
}