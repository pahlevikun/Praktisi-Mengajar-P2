package id.pahlevikun.praktisimengajar.w2.touch;

import android.os.Bundle;
import android.view.MotionEvent;

import id.pahlevikun.praktisimengajar.w2.BaseActivity;
import id.pahlevikun.praktisimengajar.w2.R;
import id.pahlevikun.praktisimengajar.w2.databinding.ActivityTouchBinding;

public class TouchActivity extends BaseActivity {

    private ActivityTouchBinding binding;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTouchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        updateTextCount(count);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        count++;
        updateTextCount(count);
        return super.onTouchEvent(event);
    }

    private void updateTextCount(int count) {
        binding.tvCount.setText(getString(R.string.touch_text_count, Integer.toString(count)));
    }
}