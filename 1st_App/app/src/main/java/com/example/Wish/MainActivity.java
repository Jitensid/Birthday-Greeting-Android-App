package com.example.Wish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name_entry;
    private EditText age_entry;
    private TextView name_view;
    private TextView age_view;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_entry = findViewById(R.id.name_entry);
        age_entry = findViewById(R.id.age_entry);
        name_view = (TextView)findViewById(R.id.name_view);
        age_view = (TextView)findViewById(R.id.age_view);
        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify_input(name_entry.getText().toString(),age_entry.getText().toString());
            }
        });


    }

    private void verify_input(String entered_name ,String entered_age){

        if( (entered_name != null && !entered_name.isEmpty()) && (entered_age !=null && !entered_age.isEmpty()) )

            {   entered_name = entered_name + "!!!";
                Intent intent = new Intent(MainActivity.this, GreetingActivity.class);
                intent.putExtra("Happy_Birthday",entered_name);
                startActivity(intent);

        }
            else {
            Toast.makeText(MainActivity.this, "Fields Cannot be Empty", Toast.LENGTH_SHORT).show();
            return;
        }

    }

}




