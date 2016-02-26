package org.softcommunity.ejemploleday;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTitulo,tvResultado;
    EditText etPalabra;
    Button btnLimpiar, btnAdivina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvTitulo = (TextView)findViewById(R.id.tvTitulo);
        tvResultado = (TextView)findViewById(R.id.tvResultado);
        etPalabra= (EditText)findViewById(R.id.etPalabra);
        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnAdivina = (Button)findViewById(R.id.btnAdivina);

        btnAdivina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String palabra = etPalabra.getText().toString();
                if(palabra.equals("Perro") || palabra.equals("perro")){
                    tvResultado.setText("Lo Adivinaste campeon!");
                }else{
                    tvResultado.setText("Sigue intentando");
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
