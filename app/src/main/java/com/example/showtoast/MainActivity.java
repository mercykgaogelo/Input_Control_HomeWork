package com.example.showtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnSubmit();
    }

    public void checkBox(View view) {
        boolean isChecked = ((CheckBox) view).isChecked();
        switch (view.getId()){

            case R.id.syrup:
                if(isChecked)
                    displayCheckedMessage("Topping:Chocolate syrup");
                break;
            case R.id.sprinkles:
                if(isChecked)
                    displayCheckedMessage("Topping: Sprinkles");
                break;
            case R.id.nuts:
                if(isChecked)
                    displayCheckedMessage("Topping:Crushed nuts");
                break;
            case R.id.cherries:
                if(isChecked)
                    displayCheckedMessage("Topping:Cherries");
                break;
            case R.id.orio:
                if(isChecked)
                    displayCheckedMessage("Topping: Orio cookie crumbles");
                break;

            default:
                break;
        }
    }

    private void displayCheckedMessage(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void OnSubmit() {
     CheckBox    chocolate = findViewById(R.id.syrup);
        CheckBox    sprinkles = findViewById(R.id.sprinkles);
        CheckBox   nuts = findViewById(R.id.nuts);
        CheckBox    cherries = findViewById(R.id.cherries);
        CheckBox    orio = findViewById(R.id.orio);

        Button selectButton = findViewById(R.id.button_toast);
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer message = new StringBuffer();
                message.append("Topping:");
                if (chocolate.isChecked()){
                    message.append("\nChocolate");
                }
                if (sprinkles.isChecked()){
                    message.append("\nSprinkles");
                }
                if (nuts.isChecked()){
                    message.append("\nNuts");
                }
                if (cherries.isChecked()){
                    message.append("\nCherries");
                }
                if (orio.isChecked()){
                    message.append("\nOrio");

                }

                Toast.makeText(getApplicationContext(), message,
                        Toast.LENGTH_SHORT).show();

            }
        });






    }
}