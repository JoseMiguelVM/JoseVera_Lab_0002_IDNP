package com.example.registro;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Datos> listaDatos = new ArrayList<>();

    // Metodo para guardar los objetos en una lista
    public void GuardarEnLista(View v){
        // Creo objetos Java y lo vinculo con el layout
        EditText DatoApellidoPaterno = findViewById(R.id.DatoApellidoPaterno);
        EditText DatoApellidoMaterno = findViewById(R.id.DatoApellidoMaterno);
        EditText DatoNombres = findViewById(R.id.DatoNombres);
        EditText DatosFechaNacimiento = findViewById(R.id.DatosFechaNacimiento);
        EditText DatosColegio = findViewById(R.id.DatosColegio);
        EditText DatosCarrera = findViewById(R.id.DatosCarrera);

        // Agrego un ele,ento a mi ArrayList (creo un nuevo objeto Datos y lo agrego)
        listaDatos.add(new Datos(
                DatoApellidoPaterno.getText().toString(),
                DatoApellidoMaterno.getText().toString(),
                DatoNombres.getText().toString(),
                DatosFechaNacimiento.getText().toString(),
                DatosColegio.getText().toString(),
                DatosCarrera.getText().toString()
        ));

        // Imprimimos en el logCat la informacion registrada del objeto
        Log.d(TAG, "Estudiante Registrado: "+ DatoApellidoPaterno.getText()+", "+DatoApellidoMaterno.getText()+", "+DatoNombres.getText()+", "+DatosFechaNacimiento.getText()+", "+DatosColegio.getText()+", "+DatosCarrera.getText());
        // Se muestra un mensaje de registro
        Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show();

        // Limpiamos la caja de texto
        DatoApellidoPaterno.setText("");
        DatoApellidoMaterno.setText("");
        DatoNombres.setText("");
        DatosFechaNacimiento.setText("");
        DatosColegio.setText("");
        DatosCarrera.setText("");
    }

    public void VerLista(View v){
        // Se muestra un mensaje de vista de datos
        Toast.makeText(this, "Vista de estudiantes en el LogCat", Toast.LENGTH_SHORT).show();
        // Imprimimos en el logCat la informacion registrada de los objetos guardados en la Lista
        for(int i=0;i<listaDatos.size();i++){
            Log.d(TAG, "\nEstudiante Vista: "+ listaDatos.get(i));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}