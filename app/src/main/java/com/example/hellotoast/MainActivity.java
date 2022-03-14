package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView mShowCount;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this,"Hello Toast!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount = mCount + 1;
        if(mShowCount!=null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}