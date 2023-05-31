package com.example.afinal.framents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.afinal.R;
import com.example.afinal.test;
import com.example.afinal.test_apa;

public class apa extends Fragment {

    View view;
    ImageButton  btn_telegram,btn_instagram;

    ImageView user_image;

    Button do_test_btn, call_btn ,message_btn;
    Activity context;

    TextView phoneNumber;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        context = getActivity();

        view = inflater.inflate(R.layout.apa, container, false);
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
                Intent intent = new Intent (context, test_apa.class);
                startActivity(intent);
            }
        });
    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}


