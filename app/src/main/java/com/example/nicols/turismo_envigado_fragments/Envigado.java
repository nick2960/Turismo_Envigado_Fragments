package com.example.nicols.turismo_envigado_fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class Envigado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envigado);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Publicidad fragmentpublicidad = new Publicidad();
        fragmentTransaction.add(android.R.id.content, fragmentpublicidad).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_envigado, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        FragmentManager fragmentmanager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentmanager.beginTransaction();

        //noinspection SimplifiableIfStatement
        if (id == R.id.actionf_publicidad) {
            Publicidad fragmentpublicidad = new Publicidad();
            fragmentTransaction.replace(android.R.id.content, fragmentpublicidad).commit();
        } else if (id == R.id.actionf_hoteles) {
            Hoteles fragmenthoteles = new Hoteles();
            fragmentTransaction.replace(android.R.id.content, fragmenthoteles).commit();
        } else if (id == R.id.actionf_bares) {
            Bares fragmentbares = new Bares();
            fragmentTransaction.replace(android.R.id.content, fragmentbares).commit();
        } else if (id == R.id.actionf_turismo) {
            Turismo fragmentturismo = new Turismo();
            fragmentTransaction.replace(android.R.id.content, fragmentturismo).commit();
        } else if (id == R.id.actionf_demografia) {
            Demografia fragmentdemografia = new Demografia();
            fragmentTransaction.replace(android.R.id.content, fragmentdemografia).commit();
        } else if (id == R.id.actionf_acercade) {
            Acercade fragmentacercade = new Acercade();
            fragmentTransaction.replace(android.R.id.content, fragmentacercade).commit();
        }
        return super.onOptionsItemSelected(item);
    }
}
