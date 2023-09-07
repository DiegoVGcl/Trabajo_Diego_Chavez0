package cl.example.trabajo_diego_chvez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {



    ImageButton btvolverazul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

            Intent intent = new Intent(this,MainActivity.class);
            btvolverazul=(ImageButton) findViewById(R.id.btVolver);

            btvolverazul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(intent);
                }
            });


        }
}