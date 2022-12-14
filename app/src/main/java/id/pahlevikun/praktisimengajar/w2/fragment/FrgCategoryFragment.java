package id.pahlevikun.praktisimengajar.w2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import id.pahlevikun.praktisimengajar.w2.R;
import id.pahlevikun.praktisimengajar.w2.databinding.FragmentFrgCategoryBinding;

public class FrgCategoryFragment extends Fragment {

    private FragmentFrgCategoryBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentFrgCategoryBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnDetailCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(
                        R.id.frame_container,
                        FrgCategoryDetailsFragment.newInstance(
                                "Lifestyle",
                                "This category will contain lifestlye products"
                        ),
                        FrgCategoryDetailsFragment.class.getSimpleName()
                );
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }


    public static FrgCategoryFragment newInstance() {
        return new FrgCategoryFragment();
    }
}
