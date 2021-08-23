package com.example.finalcm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.Console;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView tvBoton;
    String fechaNacimiento;
    TextView c1, c2, c3, c4, c5, c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvBoton = findViewById(R.id.btnRegistrar);
        spinner = findViewById(R.id.spinner);

        ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
        usuarios.add(new Usuarios("Ingeniería Aeroespacial", 1));
        usuarios.add(new Usuarios("Ingeniería Ambiental", 2));
        usuarios.add(new Usuarios("Ingeniería Civil", 3));
        usuarios.add(new Usuarios("Ingeniería en Computación\n", 4));
        usuarios.add(new Usuarios("Ingeniería Geomática", 5));
        usuarios.add(new Usuarios("Ingeniería Geofísica", 6));
        usuarios.add(new Usuarios("Ingeniería Geológica", 7));
        usuarios.add(new Usuarios("Ingeniería de Minas y Metalurgia", 8));
        usuarios.add(new Usuarios("Ingeniería Eléctrica Electrónica", 9));
        usuarios.add(new Usuarios("Ingeniería Mecánica ", 10));
        usuarios.add(new Usuarios("Ingeniería en Telecomunicaciones", 11));
        usuarios.add(new Usuarios("Ingeniería Industrial ", 12));
        usuarios.add(new Usuarios("Ingeniería Mecatrónica", 13));
        usuarios.add(new Usuarios("Ingeniería en Sistemas Biomédicos", 14));
        usuarios.add(new Usuarios("Ingeniería Petrolera", 15));



        ArrayAdapter<Usuarios> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, usuarios);
        spinner.setAdapter(adapter);
       /* spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/

        tvBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, actividad2.class);
                c1= findViewById(R.id.tvptNombres);
                c2 = findViewById(R.id.tvptApellidos);
                c3= findViewById(R.id.tvnNoCuenta);
                c4=findViewById(R.id.tvdFechaNac);
                c5=findViewById(R.id.etdMes);
                c6=findViewById(R.id.etdAnio);

                Usuarios usuario = (Usuarios) spinner.getSelectedItem();
                String mensaje = usuario.getCarrera();



                String cad1=c1.getText().toString();
                String cad2=c2.getText().toString();
                String cad3=c3.getText().toString();
                String cad4=c4.getText().toString();
               // String cad5=s1.getText().toString();
                // String cad6=c6.getText().toString();



                i.putExtra("dato01", cad1);
                i.putExtra("dato02", cad2);
                i.putExtra("dato03", cad3);
                i.putExtra("dato04", cad4);
                i.putExtra("dato05", mensaje);

                startActivity(i);
            }
        });
    }
}