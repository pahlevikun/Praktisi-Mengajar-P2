package id.pahlevikun.praktisimengajar.w2.layout;

import android.os.Bundle;

import id.pahlevikun.praktisimengajar.w2.BaseActivity;
import id.pahlevikun.praktisimengajar.w2.databinding.ActivitySpecificLayoutBinding;

public class SpecificLayoutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySpecificLayoutBinding binding = ActivitySpecificLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}