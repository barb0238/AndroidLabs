package com.cst335.barb0238;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),getResources().getString(R.string.toast_message), Toast.LENGTH_LONG).show();}
        });
        Switch s = (Switch)findViewById(R.id.switc);

        s.setChecked(true);
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
                String text;
                if (isChecked){
                    text ="The switch is now on";
                }
                else{
                    text ="The switch is now off";
                }
                Snackbar snacc = Snackbar.make(s, text,  Snackbar.LENGTH_LONG);
                snacc.setAction("Undo", click->cb.setChecked(!isChecked));
                snacc.show();
            }
        });

    }
}