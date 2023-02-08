package com.example.mis_aplicaciones_fixv2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {
	  public ListView mis_aplicaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        mis_aplicaciones = (ListView) findViewById (R.id.mis_aplicaciones);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.lista_aplicaciones,android.R.layout.simple_list_item_1);
        mis_aplicaciones.setAdapter(adaptador);
        mis_aplicaciones.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int posicion, long arg3) {
		String value = (String)mis_aplicaciones.getItemAtPosition(posicion);
        if (posicion == 0){
            llamada();
        }
        if (posicion == 1){
            foto ();
        }
        if (posicion == 2){
            mensaje();
        }
        if (posicion == 3){
            email();
        }
        if (posicion == 4){
            navegador();
        }
		
	}
	 private void foto() {
	        // TODO Auto-generated method stub
	        Intent intentFoto = new Intent("android.media.action.IMAGE_CAPTURE");
	        startActivity (intentFoto);
	    }
	 private void llamada () {
		 Intent llamada = new Intent (this,Llamadas.class);
		    startActivity (llamada);

	 }
	 private void email () {
		 Intent Email= new Intent (this,Email.class);
		    startActivity (Email);

	 }
	 private void mensaje () {
		 Intent Mensaje= new Intent (this,Mensaje.class);
		    startActivity (Mensaje);

	 }
	 private void navegador () {
		 Intent navegador= new Intent (this,Web_favoritas.class);
		    startActivity (navegador);

	 }
    
}
