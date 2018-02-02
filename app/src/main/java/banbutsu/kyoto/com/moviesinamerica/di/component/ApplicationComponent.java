package banbutsu.kyoto.com.moviesinamerica.di.component;

import android.app.Application;
import banbutsu.kyoto.com.moviesinamerica.MyApplication;
import banbutsu.kyoto.com.moviesinamerica.di.module.ActivityBuilderModule;
import banbutsu.kyoto.com.moviesinamerica.di.module.ApplicationModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import javax.inject.Singleton;

/**
 * Created by Yasuaki on 2018/02/02.
 *
 * ActivityBuilderModule: 各 AndroidComponent をまとめた Module
 */

@Singleton
@Component(modules = {
    AndroidInjectionModule.class,
    ApplicationModule.class,
    ActivityBuilderModule.class})
public interface ApplicationComponent {

  // Component に Instance を紐付ける
  @Component.Builder
  interface Builder {

    @BindsInstance
    Builder application(Application application);

    ApplicationComponent build();
  }

  void inject(MyApplication myApplication);
}