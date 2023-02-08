package com.example.mis_aplicaciones_fixv2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class Email extends Activity implements OnClickListener {
	public Button enviar;
	public Spinner lista;
	public EditText mensaje,asunto,email;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_email);
		enviar = (Button) findViewById (R.id.Enviar);
		lista = (Spinner) findViewById (R.id.Listaemail);
		mensaje = (EditText) findViewById (R.id.Mensajetexto);
		email = (EditText) findViewById (R.id.Emailtexto);
		asunto = (EditText) findViewById (R.id.Asuntotexto);
	    
		
		enviar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.email, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if (mensaje.getText().toString() == "wanna_gitgud_at_2hu?");
		
	}

}
