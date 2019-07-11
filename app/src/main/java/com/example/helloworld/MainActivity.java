package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1 = findViewById(R.id.tv1);
        final Switch change =  findViewById(R.id.change);
        final ImageView imageView = findViewById(R.id.imageView);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("时间在底部");
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
                String date=sdf.format(new Date());
                Toast.makeText(MainActivity.this,date,Toast.LENGTH_SHORT).show();
            }
        });


        change.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    change.setText("开启");
                    imageView.setImageResource(R.mipmap.bg);

                }
                else {
                    change.setText("关闭");
                    imageView.setImageResource(R.mipmap.ic_launcher_round);

                }

            }
        });
    }
}
