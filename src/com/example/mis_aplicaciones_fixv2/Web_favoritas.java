package com.example.mis_aplicaciones_fixv2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class Web_favoritas extends Activity {
public ListView listaweb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_favoritas);
		listaweb = (ListView) findViewById (R.id.listaweb);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_favoritas, menu);
		return true;
	}

}
