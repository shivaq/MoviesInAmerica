package banbutsu.kyoto.com.moviesinamerica;

import android.app.Activity;
import android.app.Application;
import banbutsu.kyoto.com.moviesinamerica.di.component.DaggerApplicationComponent;
import com.facebook.stetho.Stetho;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import javax.inject.Inject;
import timber.log.Timber;

/**
 * Created by Yasuaki on 2018/02/02.
 */
public class MyApplication extends Application implements HasActivityInjector {

  @Inject
  DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

  @Override
  public void onCreate() {
    super.onCreate();
    DaggerApplicationComponent.builder()
        .application(this)
        .build()
        .inject(this);

    // for timber
    if (BuildConfig.DEBUG) {
      Timber.uprootAll();
      Timber.plant(new Timber.DebugTree());
    }
    // for stetho
    Stetho.InitializerBuilder initializerBuilder =
        Stetho.newInitializerBuilder(this);
    initializerBuilder.enableWebKitInspector(
        Stetho.defaultInspectorModulesProvider(this));
    initializerBuilder.enableDumpapp(
        Stetho.defaultDumperPluginsProvider(this)
    );
    Stetho.Initializer initializer = initializerBuilder.build();
    Stetho.initialize(initializer);
  }



  @Override
  public DispatchingAndroidInjector<Activity> activityInjector() {
    return dispatchingAndroidInjector;
  }
}
