package banbutsu.kyoto.com.moviesinamerica.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import banbutsu.kyoto.com.moviesinamerica.R;
import javax.inject.Inject;

public class MainFragment extends Fragment {

  @Inject
  ViewModelProvider.Factory factory;

  private MainViewModel viewModel;

  private static final String ARG_PARAM1 = "param1";
  private static final String ARG_PARAM2 = "param2";

  public MainFragment() {
    // Required empty public constructor
  }

  /**
   * Use this factory method to create a new instance of
   * this fragment using the provided parameters.
   *
   * @return A new instance of fragment MainFragment.
   */
  public static MainFragment newInstance() {
    return new MainFragment();
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_main, container, false);
  }


}
