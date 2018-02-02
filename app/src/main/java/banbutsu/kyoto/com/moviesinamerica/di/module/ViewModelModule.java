package banbutsu.kyoto.com.moviesinamerica.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import banbutsu.kyoto.com.moviesinamerica.di.qualifier.ViewModelKey;
import banbutsu.kyoto.com.moviesinamerica.ui.MainViewModel;
import banbutsu.kyoto.com.moviesinamerica.ui.common.ViewModelFactory;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Yasuaki on 2018/02/02.
 */

@Module
public abstract class ViewModelModule {

  @Binds
  @IntoMap
  @ViewModelKey(MainViewModel.class)
  public abstract ViewModel bindMainViewModel(MainViewModel mainViewModel);

  @Binds
  public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}