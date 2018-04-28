package tarea1inter.com.tarea1inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    EditText txt1, txt2;
    Button btn;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);

        btn = (Button) findViewById(R.id.btn);


        resultado = (TextView) findViewById(R.id.resultado);

        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String n1 = txt1.getText().toString();
        String n2 = txt2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);

        int rta=0;

        switch (v.getId()){
            case R.id.btn:
                rta=entero1+entero2;
                break;

        }
        resultado.setText(""+rta);
    }

}
