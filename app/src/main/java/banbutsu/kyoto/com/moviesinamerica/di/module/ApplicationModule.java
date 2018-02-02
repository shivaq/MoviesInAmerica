package banbutsu.kyoto.com.moviesinamerica.di.module;

import android.app.Application;
import android.content.Context;
import banbutsu.kyoto.com.moviesinamerica.di.qualifier.DatabaseInfo;
import banbutsu.kyoto.com.moviesinamerica.di.qualifier.PreferenceInfo;
import banbutsu.kyoto.com.moviesinamerica.util.Constants;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Yasuaki on 2018/02/02.
 */
@Module(includes = ViewModelModule.class)// includes で ViewModelModule も 組み込まれた
public class ApplicationModule {

  @Provides
  @Singleton
  Context provideContext(Application application) {
    return application;
  }
  /************************** PreferencesHelper ****************************/
  @Provides
  @PreferenceInfo
  String providePreferenceName() {
    return Constants.PREF_FILE_NAME;
  }

  /************************** DataBase **************************************/
  @Provides
  @DatabaseInfo
  String provideDatabaseName() {
    return Constants.DB_NAME;
  }

}
