package com.tupac.buenosmodales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // creo instancias de botones
    private Button gracias_btn;
    private Button estornudar_btn;
    // creo instancias de listener

    // Listener para el botón Gracias
    private View.OnClickListener graciasListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Muestro el mensaje "De nada"
            Toast.makeText(MainActivity.this, "De nada!",
                    Toast.LENGTH_LONG).show();
        }
    };

    // Listener para el botón Estornudar
    private View.OnClickListener estornudarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Muestro el mensaje "Salud!“
            Toast.makeText(MainActivity.this, "Salud!",
                    Toast.LENGTH_LONG).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //asocio instancias a la interfaz

        gracias_btn = (Button)findViewById(R.id.gracias_btn);
        estornudar_btn = (Button)findViewById(R.id.estornudar_btn);

        //Registro listener para cada botón

        gracias_btn.setOnClickListener(graciasListener);
        estornudar_btn.setOnClickListener(estornudarListener);



    }


}