package com.wingzapp.wingz.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.wingzapp.wingz.NotesActivity;
import com.wingzapp.wingz.QuestionPaperActivity;
import com.wingzapp.wingz.R;
import com.wingzapp.wingz.SyllabusActivity;
import com.wingzapp.wingz.TimeTableActivity;

public class HomeFragment extends Fragment {
    private LinearLayout[] liner = new LinearLayout[4];
    TextView name;
    DatabaseReference host;
    String id = FirebaseAuth.getInstance().getCurrentUser().getUid();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

// Initialization of buttons
        Button be_ques = root.findViewById(R.id.be_ques);
        Button be_notes = root.findViewById(R.id.be_notes);
        Button be_tt = root.findViewById(R.id.be_tt);
        Button be_syll = root.findViewById(R.id.be_syll);
        ImageButton[] buts = new ImageButton[4];
        ImageButton res = root.findViewById(R.id.result_btn);
        host = FirebaseDatabase.getInstance().getReference().child("Student");
        name=root.findViewById(R.id.user_name);
        read();



        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl();
            }
        });
        for (int i = 0; i < buts.length; i++) {
            buts[i] = root.findViewById(R.id.but1 + i);
            liner[i] = root.findViewById(R.id.line1 + i);
            buts[i].setOnClickListener(butHandler);

        }

        // BE/BTech segement .

        be_ques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), QuestionPaperActivity.class);
                startActivity(intent);
            }
        });
        be_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NotesActivity.class);
                startActivity(intent);
            }
        });
        be_syll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SyllabusActivity.class);
                startActivity(intent);
            }
        });
        be_tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TimeTableActivity.class);
                startActivity(intent);
            }
        });


        return root;
    }

    private void read() {
        host.child(id).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String fullname = dataSnapshot.child("Fullname").getValue(String.class);
                name.setText(fullname);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void openUrl() {
        Uri uri=Uri.parse("https://rtmnuresults.org");
        Intent launchweb=new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchweb);
    }

    private View.OnClickListener butHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.but1:
                    liner[0].setVisibility(View.VISIBLE);
                    liner[1].setVisibility(View.GONE);
                    liner[2].setVisibility(View.GONE);
                    liner[3].setVisibility(View.GONE);
                    break;
                case R.id.but2:
                    liner[0].setVisibility(View.GONE);
                    liner[1].setVisibility(View.VISIBLE);
                    liner[2].setVisibility(View.GONE);
                    liner[3].setVisibility(View.GONE);
                    break;
                case R.id.but3:
                    liner[0].setVisibility(View.GONE);
                    liner[1].setVisibility(View.GONE);
                    liner[2].setVisibility(View.VISIBLE);
                    liner[3].setVisibility(View.GONE);
                    break;
                case R.id.but4:
                    liner[0].setVisibility(View.GONE);
                    liner[1].setVisibility(View.GONE);
                    liner[2].setVisibility(View.GONE);
                    liner[3].setVisibility(View.VISIBLE);
                    break;

            }
        }


    };

}
