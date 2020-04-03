package com.junhwa.aesexample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.junhwa.aesexample.Aes;
import com.junhwa.aesexample.R;

public class TestActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        try {
            String encrypted = Aes.encrypt(Aes.hexToByteArray("0f000101000000000000000000000000"));
            textView.setText(encrypted);
            textView2.setText(Aes.decrypt(Aes.hexToByteArray(encrypted)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
