package banbutsu.kyoto.com.moviesinamerica.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import banbutsu.kyoto.com.moviesinamerica.R;

public class MainActivity extends BaseActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
      setFragment();
    }
  }

  private void setFragment() {
    FragmentManager manager = getSupportFragmentManager();
    manager.beginTransaction().add(R.id.main_container, MainFragment.newInstance())
        .commit();
  }
}