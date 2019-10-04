package com.ddm.maincrud.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.ddm.maincrud.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

        switch (item.getItemId()){
            case R.id.action_alteracao_usuario:
                startActivity(new Intent(this,AlteracaoUsuarioActivity.class));
                return true;
            case R.id.action_cadastro_de_usuario:
                startActivity(new Intent(this,CadastroDeUsuarioActivity.class));
                return true;
            case R.id.action_excluir_usuario:
                startActivity(new Intent(this,ExcluirUsuarioActivity.class));
                return true;
            case R.id.action_lista_usuarios:
                startActivity(new Intent(this,ListaUsuariosActivity.class));
                return true;
            case R.id.action_login:
                startActivity(new Intent(this,LoginActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
