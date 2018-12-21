package com.dicoding.assosiate.mykuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonMobile;
    private Button mButtonProfile;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonMobile = (Button) findViewById(R.id.mobile);
        mButtonMobile.setOnClickListener(this);

        mButtonProfile = (Button) findViewById(R.id.profile);
        mButtonProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mobile:
                Intent moveIntent = new Intent(MainActivity.this, ListQuizActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.profile:
                Intent moveIntent1 = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(moveIntent1);
                break;
        }
    }
}
