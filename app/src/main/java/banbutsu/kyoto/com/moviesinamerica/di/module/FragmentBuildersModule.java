package banbutsu.kyoto.com.moviesinamerica.di.module;

import banbutsu.kyoto.com.moviesinamerica.ui.MainFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Yasuaki on 2018/02/02.
 */

@Module
public abstract class FragmentBuildersModule {
  @ContributesAndroidInjector
  public  abstract MainFragment contributeMainFragment();

}
