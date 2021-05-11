package com.example.flexfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class FeedbackTreinoActivity extends AppCompatActivity {

    private SeekBar seekBarFeedback;
    private SeekBar seekBarRecomendacao;
    private TextView textFeedback;
    private TextView textRecomendacao;
    private Button buttonEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_treino);

        seekBarFeedback = findViewById(R.id.seekBarFeedback);
        textFeedback = findViewById(R.id.textFeedback);
        seekBarRecomendacao = findViewById(R.id.seekBarRecomendacao);
        textRecomendacao = findViewById(R.id.textRecomendacao);
        buttonEnviar= findViewById(R.id.buttonEnviar);

        seekBarFeedback.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textFeedback.setText(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarRecomendacao.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textRecomendacao.setText(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}