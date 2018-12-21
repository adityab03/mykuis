package com.dicoding.assosiate.mykuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;

public class ListQuizActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonQuiz;
    private Button mButtonQuiz1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_quiz);

        mButtonQuiz = (Button) findViewById(R.id.Quiz);
        mButtonQuiz.setOnClickListener(this);

        mButtonQuiz1 = (Button) findViewById(R.id.Quiz1);
        mButtonQuiz1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Quiz:
                Intent moveIntent = new Intent(ListQuizActivity.this, QuizActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.Quiz1:
                Intent moveIntent1 = new Intent(ListQuizActivity.this, QuizActivity1.class);
                startActivity(moveIntent1);
                break;
        }
    }
}
