package com.example.flexfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackTreinoActivity extends AppCompatActivity {

    private SeekBar seekBarFeedback;
    private SeekBar seekBarRecomendacao;
    private TextView textFeedback;
    private TextView textRecomendacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_treino);

        seekBarFeedback = findViewById(R.id.seekBarFeedback);
        textFeedback = findViewById(R.id.textFeedback);
        seekBarRecomendacao = findViewById(R.id.seekBarRecomendacao);
        textRecomendacao = findViewById(R.id.textRecomendacao);

        seekBarFeedback.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textFeedback.setText(String.valueOf(progress));

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

                textRecomendacao.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void buttonEnviarOnClick(View view){
        Intent intentTreino = new Intent(FeedbackTreinoActivity.this, TreinarActivity.class);
        startActivity(intentTreino);
        Toast.makeText(this, "Enviaremos seu Feedback, obrigado!", Toast.LENGTH_SHORT).show();
    }

}