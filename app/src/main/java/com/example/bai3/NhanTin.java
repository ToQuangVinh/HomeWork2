package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class NhanTin extends AppCompatActivity {
    EditText edtTextText;
    ImageButton imgText;
    Button btnBack2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan_tin);
        edtTextText = findViewById(R.id.edtTextText);
        imgText = findViewById(R.id.imgText);
        btnBack2 = findViewById(R.id.btnBack2);
        imgText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nhantin = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+edtTextText.getText().toString()));
                startActivity(nhantin);
            }
        });
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}