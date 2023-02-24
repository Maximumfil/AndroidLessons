package ru.mirea.filimonenkomi.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonClicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_clicker);

        TextView tv = findViewById(R.id.tvOut);
        TextView myTextView = (TextView) findViewById(R.id.tvOut);
        myTextView.setText("New text");
        View btnItsNotMe = findViewById(R.id.btnItsNotMe);

        CheckBox checkBox = findViewById(R.id.check_box);

        View.OnClickListener oclBtnItsNotMe;
        oclBtnItsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              myTextView.setText ("Мой номер в списке = 19");
              checkBox.setChecked(true);
            }
        };
        btnItsNotMe.setOnClickListener(oclBtnItsNotMe);
    }
}