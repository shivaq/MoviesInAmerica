package banbutsu.kyoto.com.moviesinamerica.ui.common;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * A generic ViewHolder that works with a {@link ViewDataBinding}.
 * @param <T> The type of the ViewDataBinding.
 *
 * アダプタ でレイアウトファイル等から ViewDataBinding を実装してから、
 * コンストラクタに渡されてくる
 */
public class DataBoundViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

  public final T binding;

  public DataBoundViewHolder(T binding) {
    super(binding.getRoot());
    this.binding = binding;
  }
}
