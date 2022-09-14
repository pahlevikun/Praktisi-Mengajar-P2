package id.pahlevikun.praktisimengajar.w2.fragment;

import android.os.Bundle;

import androidx.fragment.app.FragmentManager;
import id.pahlevikun.praktisimengajar.w2.BaseActivity;
import id.pahlevikun.praktisimengajar.w2.R;
import id.pahlevikun.praktisimengajar.w2.databinding.ActivityFrgFragmentBinding;

public class FrgFragmentActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFrgFragmentBinding binding = ActivityFrgFragmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fragmentManager = getSupportFragmentManager();
        FrgCategoryFragment fragment = FrgCategoryFragment.newInstance();
        fragmentManager
                .beginTransaction()
                .add(R.id.frame_container, fragment, FrgCategoryFragment.class.getSimpleName())
                .commit();
    }
}