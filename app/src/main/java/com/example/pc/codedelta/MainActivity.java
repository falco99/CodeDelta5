package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText etHeader;
Button bCheck,bDevelopers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // some testing comment
        //gradle update check
       bCheck = findViewById(R.id.bCheck);
       etHeader = findViewById(R.id.etHeader);
        etHeader.setKeyListener(null);
        etHeader.setEnabled(false);



        bCheck.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this,LoginActivity.class);
              MainActivity.this.startActivity(intent);
          }
      });
    }
}
