package com.example.mis_aplicaciones_fixv2;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Llamadas extends ListActivity implements OnItemClickListener {

	
	@Override
	public long getSelectedItemId() {
		// TODO Auto-generated method stub
		return super.getSelectedItemId();
	}

	@Override
	public int getSelectedItemPosition() {
		// TODO Auto-generated method stub
		return super.getSelectedItemPosition();
	}
	
	ListView lv;
	Cursor cursor1;
	String  cadena;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_llamadas);
		

		// Crea un cursor para obtener los contactos del dispositivo
		cursor1 = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
		startManagingCursor(cursor1);
		
		String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID}; // get the list items for the listadapter could be TITLE or URI

		
		int[] to = {android.R.id.text1, android.R.id.text2}; // sets the items from above string to listview

		
		SimpleCursorAdapter listadapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, cursor1, from, to);
		
		
		setListAdapter(listadapter);
		
		lv = getListView();
		lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		lv.setOnItemClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	cursor1.moveToPosition(position);
    String name = cursor1.getString(cursor1.getColumnIndex(
    		ContactsContract.CommonDataKinds.Phone.NUMBER));
    Intent i = new Intent(Intent.ACTION_CALL);
    i.setData(Uri.parse("tel:" + name));
    startActivity(i);
	
}
}