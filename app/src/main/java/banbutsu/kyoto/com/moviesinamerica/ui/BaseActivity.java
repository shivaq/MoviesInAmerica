package banbutsu.kyoto.com.moviesinamerica.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import dagger.android.AndroidInjection;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import javax.inject.Inject;

/**
 * Created by Yasuaki on 2018/02/02.
 */
public class BaseActivity extends AppCompatActivity implements HasSupportFragmentInjector {

  @Inject
  DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);
  }

  @Override
  public DispatchingAndroidInjector<Fragment> supportFragmentInjector() {
    return dispatchingAndroidInjector;
  }
}