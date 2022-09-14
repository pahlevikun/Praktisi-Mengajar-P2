package id.pahlevikun.praktisimengajar.w2.rotate;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import id.pahlevikun.praktisimengajar.w2.BaseActivity;
import id.pahlevikun.praktisimengajar.w2.databinding.ActivityOrientationBinding;

public class OrientationActivity extends BaseActivity {

    private ActivityOrientationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrientationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTextBasedOnConfig(getResources().getConfiguration());
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setTextBasedOnConfig(newConfig);
    }

    private void setTextBasedOnConfig(@NonNull Configuration newConfig) {
        int orientation = newConfig.orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            binding.tvOrientation.setText("Landscape");
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            binding.tvOrientation.setText("Portrait");
        }
    }
}