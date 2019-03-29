package com.example.seekbarcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBarRed, seekBarGreen, seekBarBlue;
    private TextView tvRed, tvGreen, tvBlue;
    int positionRed = 0;
    int positionGreen = 0;
    int positionBlue = 0;
    String text = "";
    View view;
    public LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setupSeekBars();
        view = this.getWindow().getDecorView();
    }

    private void initWidgets() {
        background = findViewById(R.id.back);

        seekBarRed = findViewById(R.id.seekRed);
        seekBarGreen = findViewById(R.id.seekGreen);
        seekBarBlue = findViewById(R.id.seekBlue);

        tvRed = findViewById(R.id.tvRed);
        tvGreen = findViewById(R.id.tvGreen);
        tvBlue = findViewById(R.id.tvBlue);
    }

    public void setupSeekBars() {
        // RED SEEK BAR
        text = getString(R.string.red) + seekBarRed.getProgress() +  "/" + seekBarRed.getMax();
        tvRed.setText(text);

        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                positionRed = progress;
                background.setBackgroundColor(Color.rgb(positionRed, positionGreen, positionBlue));
                text = getString(R.string.red) + seekBarRed.getProgress() +  "/" + seekBarRed.getMax();
                tvRed.setText(text);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this, "SeekBar red is not in focus", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                text = getString(R.string.red) + seekBarRed.getProgress() +  "/" + seekBarRed.getMax();
                tvRed.setText(text);
                //Toast.makeText(MainActivity.this, "SeekBar red is not in focus", Toast.LENGTH_SHORT).show();
            }
        });

        // GREEN SEEK BAR
        text = getString(R.string.green) + seekBarGreen.getProgress() +  "/" + seekBarGreen.getMax();
        tvGreen.setText(text);

        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                positionGreen = progress;
                background.setBackgroundColor(Color.rgb(positionRed, positionGreen, positionBlue));
                text = getString(R.string.green) + seekBarGreen.getProgress() + "/" + seekBarGreen.getMax();
                tvGreen.setText(text);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this, "SeekBar green is not in focus", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                text = getString(R.string.green) + seekBarGreen.getProgress() +  "/" + seekBarGreen.getMax();
                tvGreen.setText(text);
                //Toast.makeText(MainActivity.this, "SeekBar green is not in focus", Toast.LENGTH_SHORT).show();
            }
        });

        // BLUE SEEK BAR
        text = getString(R.string.blue) + seekBarBlue.getProgress() +  "/" + seekBarBlue.getMax();
        tvBlue.setText(text);

        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                positionBlue = progress;
                background.setBackgroundColor(Color.rgb(positionRed, positionGreen, positionBlue));
                text = getString(R.string.blue) + seekBarBlue.getProgress() + "/" + seekBarBlue.getMax();
                tvBlue.setText(text);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this, "SeekBar blue is not in focus", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                text = getString(R.string.blue) + seekBarBlue.getProgress() + "/" + seekBarBlue.getMax();
                tvGreen.setText(text);
                //Toast.makeText(MainActivity.this, "SeekBar blue is not in focus", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
