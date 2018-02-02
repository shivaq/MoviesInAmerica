package banbutsu.kyoto.com.moviesinamerica.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import banbutsu.kyoto.com.moviesinamerica.R;
import banbutsu.kyoto.com.moviesinamerica.databinding.ActivityMainBinding;
import javax.inject.Inject;

public class MainActivity extends BaseActivity {

  @Inject
  Context context;
  public MainActivity() {
  }

  @Inject
  ViewModelProvider.Factory viewModelFactory;
  private MainViewModel viewModel;
  private ActivityMainBinding binding;

  ///////////////////////////  ライフサイクル達   /////////////////////////////////
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel.class);

  }
}
