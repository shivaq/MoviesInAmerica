package banbutsu.kyoto.com.moviesinamerica.data;

import android.content.Context;
import android.content.SharedPreferences;
import banbutsu.kyoto.com.moviesinamerica.di.qualifier.PreferenceInfo;
import javax.inject.Inject;

/**
 * Created by Yasuaki on 2018/02/02.
 */
public class PreferencesHelper {

  private final SharedPreferences sharedPreferences;

  @Inject
  PreferencesHelper(Context context, @PreferenceInfo String preferenceFileName) {
    sharedPreferences =
        context.getSharedPreferences(preferenceFileName, Context.MODE_PRIVATE);
  }}
