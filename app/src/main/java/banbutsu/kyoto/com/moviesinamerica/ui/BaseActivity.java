package banbutsu.kyoto.com.moviesinamerica.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import dagger.android.AndroidInjection;

/**
 * Created by Yasuaki on 2018/02/02.
 */
public class BaseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);
  }
}