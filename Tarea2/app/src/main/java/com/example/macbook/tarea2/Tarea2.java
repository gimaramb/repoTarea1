package com.example.macbook.tarea2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Tarea2 extends Activity {
    private int contador;
    private int num1;
    private String op;
    private int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea2);
    }

    public void clickedButton(View view){

       //Ahora vamos a recuperar el texto del boton que llama al método, y lo vamos a escribir en
        //un textView
        contador++;
        TextView textView = (TextView) findViewById(R.id.textViewResultado);
        if(view instanceof Button){

            Button button = (Button) view;
            textView.setText(button.getText());
            if(contador==1){
                //corresponde a el primer numero
                num1 = Integer.parseInt(textView.getText().toString());
                textView.setText(" "+num1);
            }
            else if(contador==2){
                //corresponde a la operacion

                op = textView.getText().toString();
                textView.setText(" "+op);
            }
            else if(contador == 3) {
                //corresponde al segundo numero

                num2 = Integer.parseInt(textView.getText().toString());
                textView.setText(" " + num2);


                }
            else{
                textView.setText("El resultado es: "+realizarOperacion(num1, op, num2));
                contador = 0;
            }
        }



    }

    public int realizarOperacion(int num1, String op, int num2){
        int resultado;

        if (op.equals("+")){

            resultado = num1+num2;

        }
        else if(op.equals("-")){

            resultado = num1 - num2;
        }
        else if(op.equals("x")){

            resultado = num1*num2;
        }
        else
        {
            resultado = num1/num2;
        }

        return resultado;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tarea2, menu);
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
}
