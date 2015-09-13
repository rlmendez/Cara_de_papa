package uan.mendez.marco.caradepapa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.CheckBox;


public class juego_CaraPapa extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego__cara_papa);

        CheckBox ojos = (CheckBox) findViewById(R.id.id_ojos);
        ojos.setOnClickListener((OnClickListener) this);

        CheckBox bigote = (CheckBox) findViewById(R.id.id_bigote);
        bigote.setOnClickListener((OnClickListener) this);

        CheckBox boca = (CheckBox) findViewById(R.id.id_boca);
        boca.setOnClickListener((OnClickListener) this);

        CheckBox brazos = (CheckBox) findViewById(R.id.id_brazos);
        brazos.setOnClickListener((OnClickListener) this);

        CheckBox cejas = (CheckBox) findViewById(R.id.id_cejas);
        cejas.setOnClickListener((OnClickListener) this);

        CheckBox cuerpo = (CheckBox) findViewById(R.id.id_cuerpo);
        cuerpo.setOnClickListener((OnClickListener) this);

        

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_juego__cara_papa, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
