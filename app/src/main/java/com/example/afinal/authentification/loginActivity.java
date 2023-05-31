package com.example.afinal.authentification;


import static com.example.afinal.database.StoreDataBase.COLUMN_EMAIL;
import static com.example.afinal.database.StoreDataBase.COLUMN_NAME;
import static com.example.afinal.database.StoreDataBase.COLUMN_PASSWORD;
import static com.example.afinal.database.StoreDataBase.TABLE_NAME;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.afinal.MainActivity;
import com.example.afinal.R;
import com.example.afinal.database.StoreDataBase;

import java.util.Locale;

public class loginActivity extends AppCompatActivity {

    Button loginBtn, registrationBtn;
    EditText et_email,et_password;
    StoreDataBase storeDataBase;
    SQLiteDatabase sqLiteDatabase;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        loginBtn = findViewById(R.id.loginBtn);
        registrationBtn = findViewById(R.id.registrationBtn);
        storeDataBase = new StoreDataBase(this);
        sqLiteDatabase = storeDataBase.getWritableDatabase();


        registrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrationIntent = new Intent(loginActivity.this, registrationActivity.class);
                startActivity(registrationIntent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("Write this Line");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("Write this Line");
                    return;
                }



                String uEmail  = et_email.getText().toString();
                String uPass  = et_password.getText().toString();

                Cursor loginCursor = sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME+" WHERE "
                        + COLUMN_EMAIL+"=? AND "+COLUMN_PASSWORD+"=?", new String[]{uEmail, uPass});

                if(loginCursor != null && loginCursor.getCount() > 0){
                    loginCursor.moveToFirst();
                    @SuppressLint("Range") String userName = loginCursor.getString(loginCursor.getColumnIndex(COLUMN_NAME));

                    Toast.makeText(loginActivity.this, "Welcome " + userName, Toast.LENGTH_LONG).show();

                    Intent registrationIntent = new Intent(loginActivity.this, MainActivity.class);

                    registrationIntent.putExtra("name", userName);
                    registrationIntent.putExtra("email", uEmail);
                    registrationIntent.putExtra("password", uPass);

                    startActivity(registrationIntent);
                }else{
                    Toast.makeText(loginActivity.this, "Wrong password or email", Toast.LENGTH_SHORT).show();
                }


            }

        });


    }


    public void tildiOzgertu(String localeCode){
        Resources resources = getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1){
            config.setLocale(new Locale(localeCode.toLowerCase()));
        }else{
            //noinspection deprecation
            config.locale = new Locale(localeCode.toLowerCase());
        }

        //noinspection deprecation
        resources.updateConfiguration(config, dm);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.kaz_lang){
            tildiOzgertu("kk");
            Intent intent = getIntent();
            finish();
            startActivity(intent);

        }
        else if (item.getItemId() == R.id.rus_lang){
            tildiOzgertu("ky");
            Intent intent = getIntent();
            finish();
            startActivity(intent);

        }
        else if (item.getItemId() == R.id.ang_lang){
            tildiOzgertu("en");
            Intent intent = getIntent();
            finish();
            startActivity(intent);

        }

        return true;
    }
}