package com.wingzapp.wingz.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.wingzapp.wingz.Contactus;
import com.wingzapp.wingz.Login;
import com.wingzapp.wingz.R;
import com.wingzapp.wingz.appInfo;

public class ProfileFragment extends Fragment {

//    casting
    TextView contact, logout, name, number, email, appInfo;
    DatabaseReference host;
    String id = FirebaseAuth.getInstance().getCurrentUser().getUid();


//    On Create Method
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

//        id of component

        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        contact = root.findViewById(R.id.contact);
        name = root.findViewById(R.id.name);
        number = root.findViewById(R.id.number);
        email = root.findViewById(R.id.email);
        appInfo = root.findViewById(R.id.appInfo);
        logout = root.findViewById(R.id.logout);

//        firebase data access
        host = FirebaseDatabase.getInstance().getReference().child("Student");
        read();

//      onclick for contact
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Contactus.class);
                startActivity(intent);
            }
        });


      appInfo.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(getActivity(), com.wingzapp.wingz.appInfo.class);
              startActivity(intent);
          }
      });


//      onclick for logout
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getActivity(), Login.class));
                getActivity().finish();
            }
        });

        return root;
    }


//      method for open url of website
//    private void openurl() {
//        Uri uri=Uri.parse("https://wingzapp.blogspot.com");
//        Intent launchweb=new Intent(Intent.ACTION_VIEW, uri);
//        startActivity(launchweb);
//    }


//    read method for firebase access and display data
    private void read() {

        host.child(id).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String fullname = dataSnapshot.child("Fullname").getValue(String.class);
                String phone = dataSnapshot.child("Mobile").getValue(String.class);
                String mail = dataSnapshot.child("Email").getValue(String.class);
                name.setText(fullname);
                number.setText(phone);
                email.setText(mail);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}