package study.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gender);
    }
    public void abrirlogin(View view) {
        Intent intent = new Intent(Gender.this, Gender.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(Gender.this, Age.class);
        startActivity(intent);
    }

}