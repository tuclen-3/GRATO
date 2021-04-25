package com.example.grato_gv.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.grato_gv.R;

public class MainActivity_welcome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truong_welcome);
        ImageView imageLogo = (ImageView) findViewById(R.id.logo_grato);
        imageLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

    }

}