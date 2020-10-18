package com.wingzapp.wingz.ui.competitive;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.wingzapp.wingz.R;

public class CompetitiveFragment extends Fragment {

Button gate,gre,cat,gmat,tofel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_competitive, container, false);
        init(root);

        gate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        return root;
    }

    private void init(View root) {
        gate= (Button) root.findViewById(R.id.gate);
        gre= (Button) root.findViewById(R.id.gre);
        gmat= (Button) root.findViewById(R.id.gmat);
        cat= (Button) root.findViewById(R.id.cat);
        tofel= (Button) root.findViewById(R.id.tofel);
    }
}

