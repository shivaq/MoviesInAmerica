package banbutsu.kyoto.com.moviesinamerica.di.qualifier;

import android.arch.lifecycle.ViewModel;
import dagger.MapKey;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Yasuaki on 2018/02/02.
 */
@Target({ElementType.METHOD})// このアノテーション適用対象を制限
@Retention(RetentionPolicy.RUNTIME)
@MapKey// @IntoMap でマップされる対象の Key を指定
public @interface ViewModelKey {
  Class<? extends ViewModel> value();
}
