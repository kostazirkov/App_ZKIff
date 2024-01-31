package ru.startandroid.develop.second;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvName; // объявили переменную текстувую

    private EditText edName;

    private ImageButton imgButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvTextView);
        imgButton = findViewById(R.id.tvImageButton);
        edName = findViewById(R.id.tvPName);
    }

    public void onClick(View v)
    {
        if (edName.getText().length() == 0)
        {
            tvName.setText("Hello my КОСТЯ!!!");
        }
        else {
            tvName.setText("Hello my " + edName.getText());
        }
        tvName.setTextSize(50);
        tvName.setTextColor(Color.rgb(218,112,214));
        imgButton.setImageResource(R.drawable.angrycat);
    }
}