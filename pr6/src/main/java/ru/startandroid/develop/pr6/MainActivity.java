package ru.startandroid.develop.pr6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    EditText etInput;
    Button bControl;
    int guess;
    boolean gameFinished;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = (TextView) findViewById(R.id.textView);
        etInput = (EditText) findViewById(R.id.editTextNumber);
        bControl = (Button) findViewById(R.id.button);
        guess = (int) (Math.random() * 100);
        gameFinished = false;
    }

    public void OnClick(View v) {
        if (!gameFinished) {
            int inp = Integer.parseInt(etInput.getText().toString());
            if (inp > guess){
                tvInfo.setText("Перелет!");
                etInput.setText("");}
            if (inp < guess){
                tvInfo.setText("Недолет!");
                etInput.setText("");}
            if (inp == guess) {
                tvInfo.setText("В точку!");
                bControl.setText("Сыграть еще");
                gameFinished = true;
            }
        } else {
            etInput.setText("");
            guess = (int) (Math.random() * 100);
            bControl.setText("Ввести значение:");
            tvInfo.setText("Попробуйте угадать число (1 - 100)");
            gameFinished = false;
        }
    }
}