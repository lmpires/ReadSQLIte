package com.example.lauramarra.readsqlite;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainActivity extends ActionBarActivity {

    TextView textView;
    MyDBHandler dbHandler;
    EditText codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codigo = (EditText) findViewById(R.id.codigo);

        textView = (TextView) findViewById(R.id.view);
        getFields();
    }

    public void getFields() {


        dbHandler = new MyDBHandler(this, null, null, 1);

        BufferedReader bufferedReader = null;
        String codigo, nome;
        Materia materia;

        try {
            String sCurrentLine = null;
            bufferedReader = new BufferedReader(new InputStreamReader(getAssets().open("123.txt")));

            while ((sCurrentLine = bufferedReader.readLine()) != null) {

                //if (sCurrentLine != null);
                String[] message = sCurrentLine.split(",");

                codigo = message[0];
                nome = message[1];


                //textView.setText("Código: " + codigo + "\n" + "nome: " + nome + "\n" );

                materia = new Materia(codigo, nome);
                dbHandler.addMateria(materia);

                printDatabase();



                //e = db2.insertRecord(faculty1, deparment1, name1, officeNumber1, phone1, email1, email1);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        textView.setText(dbString);
    }

    //Delete items
    public void deleteButtonClicked(View view){
        String inputText = codigo.getText().toString();
        dbHandler.delMateria(inputText);
        printDatabase();
        codigo.setText("");
    }

}



