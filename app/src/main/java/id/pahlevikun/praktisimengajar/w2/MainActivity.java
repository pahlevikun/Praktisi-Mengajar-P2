package id.pahlevikun.praktisimengajar.w2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.pahlevikun.praktisimengajar.w2.bundle.BundleActivity;
import id.pahlevikun.praktisimengajar.w2.configuration.ConfigurationActivity;
import id.pahlevikun.praktisimengajar.w2.databinding.ActivityMainBinding;
import id.pahlevikun.praktisimengajar.w2.fragment.FrgFragmentActivity;
import id.pahlevikun.praktisimengajar.w2.layout.SpecificLayoutActivity;
import id.pahlevikun.praktisimengajar.w2.lifecycle.LifecycleActivity1;
import id.pahlevikun.praktisimengajar.w2.mvp.MvpActivity;
import id.pahlevikun.praktisimengajar.w2.rotate.OrientationActivity;
import id.pahlevikun.praktisimengajar.w2.touch.TouchActivity;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        intViews();
    }

    private void intViews() {
        initCta(binding.btnTouch, TouchActivity.class);
        initCta(binding.btnLifecycleActivity, LifecycleActivity1.class);
        initCta(binding.btnFragmentActivity, FrgFragmentActivity.class);
        initCta(binding.btnOrientation, OrientationActivity.class);
        initCta(binding.btnBundle, BundleActivity.class);
        initCta(binding.btnConfiguration, ConfigurationActivity.class);
        initCta(binding.btnSpecificLayout, SpecificLayoutActivity.class);
        initCta(binding.btnMvp, MvpActivity.class);
    }

    private <T> void initCta(View view, Class<T> target) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, target));
            }
        });
    }
}