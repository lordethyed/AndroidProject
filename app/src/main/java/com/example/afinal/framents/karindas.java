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
import com.example.afinal.test_karindas;

public class karindas extends Fragment {

    View view;
    ImageButton  btn_telegram,btn_instagram;

    ImageView user_image;

    Button do_test_btn, call_btn ,message_btn;
    Activity context;

    TextView phoneNumber;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        context = getActivity();

        view = inflater.inflate(R.layout.secondbrother, container, false);
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
                .load("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoHCBUVFRYWFRUZGRgYHBgcGBocGBwYGBkcHBoZGRgYHBocIS4lHB4rHxkcJjomKy8xNjU1HCQ7QDs0Py40NTEBDAwMEA8QHhISHDQhISE0MTQ0MTQxNDE0NDQ0NDQxNDQ0NDQxNDQ0MTQxNDQ0NDE0NDE0NDQxNDQxND80PzExP//AABEIASwAqAMBIgACEQEDEQH/xAAcAAEAAQUBAQAAAAAAAAAAAAAABQECAwQGBwj/xABAEAACAQIDBAcECAYBBAMAAAABAgADEQQSIQUxQVEGImFxgZGhEzJCsQcUUlOSwdHSFjNicrLwgqLh4vEjJML/xAAYAQEBAQEBAAAAAAAAAAAAAAAAAgEDBP/EAB0RAQEBAQACAwEAAAAAAAAAAAABAhEhMQMSUUH/2gAMAwEAAhEDEQA/AMkREtBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERARM2GpZ7+92dUkHn1t0znZxtofT9CZvKz7RpRL6lJl3j9JZMaREQERAgIgRArERApERAREQEREBERAGMImc3O7gP94zFiGsp7dPObuzE0EvMc93+JGkoFr/l+YmWm0tVrEHkQeIPmNfKVddT3n/dZqf4uxFEOCDIF1IJB3jSTyPIvaaWe/MD9Jml5rUiIkLIiICIiBWIiBSIiAiIgIiICIiBq49rBe+/kJJ7Kdcu/WQe28Uafsz1SrOFZWG8HUajUarwI3zf2cGZARSB03ipvIXiCml2136A8Z0zfDnqeU/L1bXd4aAehI9TNBWcHSlpfS9QA2zDkp+G/jaXM+IY3y0l53Lv9q5sAo4j8PbCY3XsSLDfykPtXFIKiUr3cq7EDXKBktcg79TpvFhzm6uFdtHqHuQezHDiCWt1b+9xMidqYVUxNEKLD2dUntJenc34mNelZ9r4iJzdCIiAiUJlRAqIgRApERAREQEREBETS2pjBTQnjwHOBz/S3FZnR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")
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
                Intent intent = new Intent (context, test_karindas.class);
                startActivity(intent);
            }
        });
    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}


