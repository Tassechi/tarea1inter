package tarea1inter.com.tarea1inter;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.viewdialog,null);
                TextView tv_personalizado = view.findViewById(R.id.tv_personalizado);

                EditText editText = findViewById(R.id.edit);
                tv_personalizado.setText(editText.getText().toString());
                AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
                builder.setView(view)
                        .setNegativeButton("Cerrar",null);
                Dialog dialog = builder.create();
                dialog.show();
            }
        });



    }
}
