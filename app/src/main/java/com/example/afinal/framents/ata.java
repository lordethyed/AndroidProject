package com.example.afinal.framents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.afinal.R;

import de.hdodenhof.circleimageview.CircleImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.afinal.R;
import com.example.afinal.authentification.loginActivity;
import com.example.afinal.test;
import com.example.afinal.test_apa;

public class ata extends Fragment {

    View view;
    ImageButton  btn_telegram,btn_instagram;

    ImageView user_image;

    Button do_test_btn, call_btn ,message_btn;
    Activity context;

    TextView phoneNumber;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        context = getActivity();

        view = inflater.inflate(R.layout.ata, container, false);
        btn_telegram = (ImageButton) view.findViewById(R.id.tele_iv);
        btn_instagram = (ImageButton) view.findViewById(R.id.insta_iv);
        user_image = (ImageView) view.findViewById(R.id.user_image);
        phoneNumber = (TextView) view.findViewById(R.id.phoneNumber);
        call_btn = (Button) view.findViewById(R.id.call_btn);
        message_btn = (Button) view.findViewById(R.id.message_btn);


        call_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber.getText()));
                startActivity(intent);
            }
        });

        message_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:" + phoneNumber.getText());
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello you are welcome to project");
                startActivity(intent);
            }
        });



        btn_telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://web.telegram.org/k/");
            }
        });

        btn_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/");
            }
        });

        Glide
                .with(this)
                .load("data:image/jpeg;base64,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")
                .centerCrop()
                .placeholder(R.drawable.adam_icon)
                .into(user_image);


        return view;

    }

    @Override
    public void onStart() {
        super.onStart();
        do_test_btn = (Button) view.findViewById(R.id.do_test_btn);
        do_test_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (context, test.class);
                startActivity(intent);
            }
        });
    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}


