package id.pahlevikun.praktisimengajar.w2.bundle;

import android.os.Bundle;

import androidx.annotation.NonNull;
import id.pahlevikun.praktisimengajar.w2.BaseActivity;
import id.pahlevikun.praktisimengajar.w2.databinding.ActivityBundleBinding;

public class BundleActivity extends BaseActivity {

    private ActivityBundleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBundleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState != null) {
            String value = savedInstanceState.getString(KEY);
            binding.etBundle.setText(value);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String value = binding.etBundle.getText().toString();
        outState.putString(KEY, value);
    }

    private static final String KEY = "key";
}