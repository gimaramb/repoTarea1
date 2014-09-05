package com.example.macbook.tarea3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends Activity {

    int contact = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick (View view){
        // me falta identificar si se apretó el boton rojo o el azul
        String boton = " ";
        if(view instanceof Button) {

            Button button = (Button) view;
            boton = button.getText().toString();
        }
        if(boton.equals("blue")){
            Intent i = new Intent(this, MyActivityBlue.class);
            startActivityForResult(i, contact);
        }
        else if(boton.equals("red")){
            String o = "soy red";
            Intent i = new Intent(this, MyActivity2.class);
            startActivityForResult(i, contact);
        }



    }


}
