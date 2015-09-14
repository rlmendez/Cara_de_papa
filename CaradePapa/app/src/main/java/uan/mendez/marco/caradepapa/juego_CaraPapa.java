package uan.mendez.marco.caradepapa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;


public class juego_CaraPapa extends AppCompatActivity  {

    CheckBox ojos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego__cara_papa);

        iniciar_checbox();
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


    public void iniciar_checbox()
    {
        CheckBox ojos = (CheckBox) findViewById(R.id.id_ojos);

        CheckBox bigote = (CheckBox) findViewById(R.id.id_bigote);

        CheckBox boca = (CheckBox) findViewById(R.id.id_boca);

        CheckBox brazos = (CheckBox) findViewById(R.id.id_brazos);

        CheckBox cejas = (CheckBox) findViewById(R.id.id_cejas);

        CheckBox cuerpo = (CheckBox) findViewById(R.id.id_cuerpo);

        CheckBox gafas = (CheckBox) findViewById(R.id.id_gafas);

        CheckBox nariz = (CheckBox) findViewById(R.id.id_nariz);

        CheckBox orejas = (CheckBox) findViewById(R.id.id_orejas);

        CheckBox pies = (CheckBox) findViewById(R.id.id_pies);

        CheckBox sombrero = (CheckBox) findViewById(R.id.id_sombrero);

    }

    public void vis_ojos(View v)
    {
        ImageView ojo = (ImageView) findViewById(R.id.ojos);

        if(ojos.isChecked())
        {
            ojo.setVisibility(ImageView.VISIBLE);
        }
        else{
            ojo.setVisibility(ImageView.INVISIBLE);
        }
    }


}
