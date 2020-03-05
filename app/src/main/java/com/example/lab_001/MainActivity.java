package com.example.lab_001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;
    private CheckBox cb5;
    private CheckBox cb6;
    private CheckBox cb7;
    private CheckBox cb8;
    private CheckBox cb9;
    private CheckBox cb10;
    private ImageView im1;
    private ImageView im2;
    private ImageView im3;
    private ImageView im4;
    private ImageView im5;
    private ImageView im6;
    private ImageView im7;
    private ImageView im8;
    private ImageView im9;
    private ImageView im10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1=(CheckBox)findViewById(R.id.rbtn1);
        cb2=(CheckBox)findViewById(R.id.rbtn2);
        cb3=(CheckBox)findViewById(R.id.rbtn3);
        cb4=(CheckBox)findViewById(R.id.rbtn4);
        cb5=(CheckBox)findViewById(R.id.rbtn5);
        cb6=(CheckBox)findViewById(R.id.rbtn6);
        cb7=(CheckBox)findViewById(R.id.rbtn7);
        cb8=(CheckBox)findViewById(R.id.rbtn8);
        cb9=(CheckBox)findViewById(R.id.rbtn9);
        cb10=(CheckBox)findViewById(R.id.rbtn10);

        im1=(ImageView)findViewById(R.id.im2);
        im2=(ImageView)findViewById(R.id.im3);
        im3=(ImageView)findViewById(R.id.im4);
        im4=(ImageView)findViewById(R.id.im5);
        im5=(ImageView)findViewById(R.id.im6);
        im6=(ImageView)findViewById(R.id.im7);
        im7=(ImageView)findViewById(R.id.im8);
        im8=(ImageView)findViewById(R.id.im9);
        im9=(ImageView)findViewById(R.id.im10);
        im10=(ImageView)findViewById(R.id.im11);


        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im1.setVisibility(View.VISIBLE);
                } else {
                    im1.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im2.setVisibility(View.VISIBLE);
                } else {
                    im2.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im3.setVisibility(View.VISIBLE);
                } else {
                    im3.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im4.setVisibility(View.VISIBLE);
                } else {
                    im4.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im5.setVisibility(View.VISIBLE);
                } else {
                    im5.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im6.setVisibility(View.VISIBLE);
                } else {
                    im6.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im7.setVisibility(View.VISIBLE);
                } else {
                    im7.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im8.setVisibility(View.VISIBLE);
                } else {
                    im8.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im9.setVisibility(View.VISIBLE);
                } else {
                    im9.setVisibility(View.INVISIBLE);
                }
            }
        });

        cb10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    im10.setVisibility(View.VISIBLE);
                } else {
                    im10.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
