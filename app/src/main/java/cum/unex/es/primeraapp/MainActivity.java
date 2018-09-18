package cum.unex.es.primeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnBotonSimple = (Button)findViewById(R.id.miboton);
        btnBotonSimple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                TextView tx = (TextView) findViewById(R.id.mensaje);
                tx.setText("He perdido");
            }
            });
        final Button btnBotonSimple2 = (Button)findViewById(R.id.boton2);
        btnBotonSimple2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                TextView tx = (TextView) findViewById(R.id.mensaje);
                tx.setText("Joder Berna joder");
            }
        });
    }

}
