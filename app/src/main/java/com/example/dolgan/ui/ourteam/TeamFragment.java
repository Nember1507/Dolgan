package com.example.dolgan.ui.ourteam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.dolgan.databinding.FragmentServicesBinding;
import com.example.dolgan.databinding.FragmentTeamBinding;
import com.example.dolgan.ui.services.ServicesViewModel;

public class TeamFragment extends Fragment {

    private TeamViewModel teamViewModel;
    private FragmentTeamBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        teamViewModel =
                new ViewModelProvider(this).get(TeamViewModel.class);

        binding = FragmentTeamBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTeam;
        teamViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
