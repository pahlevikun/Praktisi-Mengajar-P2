package id.pahlevikun.praktisimengajar.w2.configuration;

import androidx.appcompat.app.AppCompatActivity;
import id.pahlevikun.praktisimengajar.w2.BaseActivity;
import id.pahlevikun.praktisimengajar.w2.databinding.ActivityConfigurationBinding;

import android.os.Bundle;

public class ConfigurationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityConfigurationBinding binding = ActivityConfigurationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}