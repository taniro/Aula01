package br.eaj.tads.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("INIT_APP", "Inicializou");

        texto = findViewById(R.id.texto);
        texto.setText("Bom dia!");

        edit = findViewById(R.id.edit);
        edit.setText("Hello");

        /*

        View.OnClickListener meu_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto_edit = edit.getText().toString();
                texto.setText(texto_edit);
            }
        };

        Button btLogin = findViewById(R.id.botao);
        btLogin.setOnClickListener(meu_listener);

        */

        Button btLogin = findViewById(R.id.botao);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto_edit = edit.getText().toString();
                texto.setText(texto_edit);

                Toast.makeText(MainActivity.this, texto_edit, Toast.LENGTH_SHORT).show();

                Log.i("BATATINHA", "O texto digitado foi: " + texto_edit);
            }
        });

    }

    /*
    public void bananinha_clique(View v){

        EditText edit = findViewById(R.id.edit);
        String texto_edit = edit.getText().toString();

        TextView texto = findViewById(R.id.texto);
        texto.setText(texto_edit);
    }
    */
}
