package com.example.finalcm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class actividad2 extends AppCompatActivity {
    TextView tvDatos;
    TextView tvDatos2;
    TextView tvDatos3;
    TextView tvDatos4;
    ImageView foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        recibirDatos();

    }
    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String d1 = extras.getString("dato01");
        String d2 = extras.getString("dato02");
        String d3 = extras.getString("dato03");
        String d4 = extras.getString("dato04");
        String d5 = extras.getString("dato05");

        if(d5.equals("Ingeniería Aeroespacial")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.aeroespacial);
        }
        else if(d5.equals("Ingeniería Ambiental")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.ambiental);
        }
        else if(d5.equals("Ingeniería Civil")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.civil);
        }
        else if(d5.equals("Ingeniería en Computación")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.computacion);
        }
        else if(d5.equals("Ingeniería Geomática")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.geomatica);
        }
        else if(d5.equals("Ingeniería Geofísica")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.geofisica);
        }
        else if(d5.equals("Ingeniería Geológica")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.geologica);
        }
        else if(d5.equals("Ingeniería de Minas y Metalurgia")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.minas);
        }
        else if(d5.equals("Ingeniería Eléctrica Electrónica")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.electrica);
        }
        else if(d5.equals("Ingeniería Mecánica")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.mecanica);
        }
        else if(d5.equals("Ingeniería en Telecomunicaciones")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.telecom);
        }
        else if(d5.equals("Ingeniería Industrial ")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.industrial);
        }
        else if(d5.equals("Ingeniería Mecatrónica")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.mecatronica);
        }
        else if(d5.equals("Ingeniería en Sistemas Biomédicos")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.bio);
        }
        else if(d5.equals("Ingeniería Petrolera")){
            foto = findViewById(R.id.ivFoto);
            foto.setImageResource(R.drawable.petrolera);
        }







        tvDatos = findViewById(R.id.tvDatos);
        tvDatos2 = findViewById(R.id.tvDatos2);
        tvDatos3 = findViewById(R.id.tvdatos3);
        tvDatos4 = findViewById(R.id.tvdatos4);

        tvDatos.setText(d1+ " "+d2);
        tvDatos2.setText(d3);
        tvDatos3.setText(d4);
        tvDatos4.setText(d5);

    }

    //Metodo para boton regresar
   public void Regresar(View view){
       Intent regresar = new Intent(this, MainActivity.class);
       startActivity(regresar);


    }
}