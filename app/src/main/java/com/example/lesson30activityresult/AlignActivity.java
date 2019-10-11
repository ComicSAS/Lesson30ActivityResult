package com.example.lesson30activityresult;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import static android.view.Gravity.CENTER;
import static android.view.Gravity.END;
import static android.view.Gravity.LEFT;
import static android.view.Gravity.RIGHT;
import static android.view.Gravity.START;

public class AlignActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLeft, btnCenter, btnRight;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_align);

        btnLeft = findViewById(R.id.btnLeft);
        btnCenter = findViewById(R.id.btnCenter);
        btnRight = findViewById(R.id.btnRight);

        btnLeft.setOnClickListener(this);
        btnCenter.setOnClickListener(this);
        btnRight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        intent = new Intent();
        switch (v.getId()) {
            case R.id.btnLeft:
                intent.putExtra("alignment", START);
                break;
            case R.id.btnCenter:
                intent.putExtra("alignment", CENTER);
                break;
            case R.id.btnRight:
                intent.putExtra("alignment", END);
                break;
        }
        setResult(RESULT_OK, intent);
        finish();
    }
}
