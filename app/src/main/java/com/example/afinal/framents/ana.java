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
import com.example.afinal.test_ana;

public class ana extends Fragment {

    View view;
    ImageButton  btn_telegram,btn_instagram;

    ImageView user_image;

    Button do_test_btn, call_btn ,message_btn;
    Activity context;

    TextView phoneNumber;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        context = getActivity();

        view = inflater.inflate(R.layout.ana, container, false);
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
                Intent intent = new Intent (context, test_ana.class);
                startActivity(intent);
            }
        });
    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}


