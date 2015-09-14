package uan.mendez.marco.caradepapa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;


public class juego_CaraPapa extends AppCompatActivity  {

    CheckBox ojos,bigote,boca,brazos,cejas,cuerpo,gafas,nariz,orejas,pies,sombrero;
    ImageView ojo,big,boc,bra,cej,cue,gaf,nar,ore,pie,som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego__cara_papa);

        iniciar_checbox();
        imagenes();

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

    public void imagenes()
    {
        ImageView ojo = (ImageView) findViewById(R.id.ojos);

        ImageView big = (ImageView) findViewById(R.id.bigote);

        ImageView boc = (ImageView) findViewById(R.id.boca);

        ImageView bra = (ImageView) findViewById(R.id.brazos);

        ImageView cej = (ImageView) findViewById(R.id.cejas);

        ImageView cue = (ImageView) findViewById(R.id.cuerpo);

        ImageView gaf = (ImageView) findViewById(R.id.gafas);

        ImageView nar = (ImageView) findViewById(R.id.nariz);

        ImageView ore = (ImageView) findViewById(R.id.orejas);

        ImageView pie = (ImageView) findViewById(R.id.pies);

        ImageView som = (ImageView) findViewById(R.id.sombrero);

    }


    private void vis_ojos(View v) {

        if(ojos.isChecked())
        {
            ojo.setVisibility(ImageView.VISIBLE);
        }
        else{
            ojo.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_bigote(View v) {

        if(bigote.isChecked())
        {
            big.setVisibility(ImageView.VISIBLE);
        }
        else{
            big.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_boca(View v) {

        if(boca.isChecked())
        {
            boc.setVisibility(ImageView.VISIBLE);
        }
        else{
            boc.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_brazos(View v) {

        if(brazos.isChecked())
        {
            bra.setVisibility(ImageView.VISIBLE);
        }
        else{
            bra.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_ceja(View v) {

        if(cejas.isChecked())
        {
            cej.setVisibility(ImageView.VISIBLE);
        }
        else{
            cej.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_cuerpo(View v) {

        if(cuerpo.isChecked())
        {
            cue.setVisibility(ImageView.VISIBLE);
        }
        else{
            cue.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_gafas(View v) {

        if(gafas.isChecked())
        {
            gaf.setVisibility(ImageView.VISIBLE);
        }
        else{
            gaf.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_nariz(View v) {

        if(nariz.isChecked())
        {
            nar.setVisibility(ImageView.VISIBLE);
        }
        else{
            nar.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_orejas(View v) {

        if(orejas.isChecked())
        {
            ore.setVisibility(ImageView.VISIBLE);
        }
        else{
            ore.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_pies(View v) {

        if(pies.isChecked())
        {
            pie.setVisibility(ImageView.VISIBLE);
        }
        else{
            pie.setVisibility(ImageView.INVISIBLE);
        }
    }

    private void vis_sombrero(View v) {

        if(sombrero.isChecked())
        {
            som.setVisibility(ImageView.VISIBLE);
        }
        else{
            som.setVisibility(ImageView.INVISIBLE);
        }
    }

}
