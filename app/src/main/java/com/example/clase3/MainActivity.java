package com.example.clase3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
    }

    public void ok (View view){
        String n1=et1.getText().toString();
        String n2=et2.getText().toString();
        String n3=et3.getText().toString();
        String n4=et4.getText().toString();
        Toast notificacion=Toast.makeText(this,(n1+" "+n2+" "+n3+" "+n4),Toast.LENGTH_LONG);
        notificacion.show();

    }
}
