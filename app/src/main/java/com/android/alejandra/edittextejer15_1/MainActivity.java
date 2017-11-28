package com.android.alejandra.edittextejer15_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.android.alejandra.edittextejer15_1.model.Contacto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contacto> listaContactos = new ArrayList<Contacto>();
    //xml
    private EditText nombre,
            apellidos,
            telefono,
            email,
            direccion,
            comentarios;
    private AutoCompleteTextView acTvComunidad;
    private Button btAniadir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initReferencias();

        setAutoCompleteTextView();
        setListenerNombre();

    }


    /**
     * Método que obtiene las referencias de los objetos XML
     */
    private void initReferencias() {
        nombre = (EditText) findViewById(R.id.etNombre);
        apellidos=(EditText)findViewById(R.id.etApellidos);
        telefono=(EditText)findViewById(R.id.etTelefono);
        email=(EditText)findViewById(R.id.etEmail);
        direccion=(EditText)findViewById(R.id.etDireccion);
        comentarios=(EditText)findViewById(R.id.etComentarios);
        acTvComunidad = (AutoCompleteTextView) findViewById(R.id.acTvComunidad);
        btAniadir = (Button) findViewById(R.id.btAniadir);
    }


    /**
     * Método que asigna el adaptador al AutoCompleteTextView
     */
    private void setAutoCompleteTextView() {
        //creo adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                getResources().getStringArray(R.array.comunidades));
        //asigno adaptador
        acTvComunidad.setAdapter(adapter);
    }

    /**
     * Método que asigna el listener TextChangedListener al EditTextNombre
     */
    private void setListenerNombre() {
        nombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0 && btAniadir.getVisibility() == View.GONE)
                    btAniadir.setVisibility(View.VISIBLE);
                else if (s.length() == 0 && btAniadir.getVisibility() == View.VISIBLE)
                    btAniadir.setVisibility(View.GONE);


            }
        });
    }


    /**
     * Método que se ejecuta al pulsar el botón Añadir
     */
    public void aniadirContacto(View v) {
        listaContactos.add(new Contacto(
                nombre.getText().toString(),
                apellidos.getText().toString(),
                email.getText().toString(),
                direccion.getText().toString(),
                acTvComunidad.getText().toString(),
                comentarios.getText().toString(),
                telefono.getText().toString()
        ));
        mostrarLogLista(listaContactos);

    }

    /**Muestra la lista de contactos que se le pase en el LogCat
     *
     * @param lista  lista a mostrar
     */
    private void mostrarLogLista(List<Contacto> lista){
        for (Contacto contacto : lista) {
            Log.i("APLICACIÓN CONTACTOS",contacto.toString());

        }
    }
}
