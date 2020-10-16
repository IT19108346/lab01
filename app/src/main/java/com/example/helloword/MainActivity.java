package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Button btn;
    TextView txtMessage;
    String myExtra = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnOK);
        txtMessage = findViewById(R.id.txtName);


    }

    @Override
    protected void onResume() {
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //txtMessage.setText("Hi All");
                Intent intent = new Intent(MainActivity.this,second.class);
                intent.putExtra("MAIN_EXTRA",myExtra);
                startActivity(intent);

            }
        });
    }
}