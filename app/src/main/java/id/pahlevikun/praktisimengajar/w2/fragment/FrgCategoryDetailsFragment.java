package id.pahlevikun.praktisimengajar.w2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import id.pahlevikun.praktisimengajar.w2.databinding.FragmentFrgCategoryDetailsBinding;

public class FrgCategoryDetailsFragment extends Fragment {

    private FragmentFrgCategoryDetailsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentFrgCategoryDetailsBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewsWithArguments();
    }

    private void initViewsWithArguments() {
        if (getArguments() != null) {
            String title = getArguments().getString(KEY_TITLE);
            String description = getArguments().getString(KEY_DESCRIPTION);
            binding.tvCategoryName.setText(title);
            binding.tvCategoryDescription.setText(description);
        }
    }

    public static FrgCategoryDetailsFragment newInstance(String title, String description) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TITLE, title);
        bundle.putString(KEY_DESCRIPTION, description);
        FrgCategoryDetailsFragment fragment = new FrgCategoryDetailsFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    private static final String KEY_TITLE = "key.extra.title";
    private static final String KEY_DESCRIPTION = "key.extra.description";
}
