package com.example.unhify.ui.promos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.unhify.R;

public class PromosFragment extends Fragment {

    private PromosViewModel promosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        promosViewModel =
                ViewModelProviders.of(this).get(PromosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_promos, container, false);
        final TextView textView = root.findViewById(R.id.promo1);
        promosViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}