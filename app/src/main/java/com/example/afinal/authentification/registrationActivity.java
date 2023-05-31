package com.example.afinal.authentification;

import static com.example.afinal.database.StoreDataBase.COLUMN_EMAIL;
import static com.example.afinal.database.StoreDataBase.COLUMN_NAME;
import static com.example.afinal.database.StoreDataBase.COLUMN_PASSWORD;
import static com.example.afinal.database.StoreDataBase.TABLE_NAME;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.afinal.R;
import com.example.afinal.database.StoreDataBase;

public class registrationActivity extends AppCompatActivity {

    EditText et_email, et_username, et_password;
    Button registrationBtn2;

    StoreDataBase storeDataBase;
    SQLiteDatabase sqLiteDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        et_email = findViewById(R.id.et_email);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        registrationBtn2 = findViewById(R.id.registrationBtn2);
        storeDataBase = new StoreDataBase(this);
        sqLiteDatabase = storeDataBase.getWritableDatabase();

        registrationBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("Write this Line");
                    return;
                }
                if(TextUtils.isEmpty(et_username.getText())){
                    et_username.setError("Write this Line");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("Write this Line");
                    return;
                }

                ContentValues values = new ContentValues();
                values.put(COLUMN_NAME, et_username.getText().toString());
                values.put(COLUMN_EMAIL, et_email.getText().toString());
                values.put(COLUMN_PASSWORD, et_password.getText().toString());
                sqLiteDatabase.insert(TABLE_NAME, null, values);



                Intent registrationIntent = new Intent(registrationActivity.this, loginActivity.class);
                startActivity(registrationIntent);
            }

        });
    }
}