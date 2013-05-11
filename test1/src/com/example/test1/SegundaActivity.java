package com.example.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends Activity {

	
	TextView tv2a;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
		
		tv2a=(TextView)findViewById(R.id.tv2a);
		
		
		Intent i=getIntent();
		if(i!=null)
		{
			Bundle b= i.getExtras();
			if(b!=null)
			{
				String sContenido=b.getString("name");
				tv2a.setText("Hola "+sContenido);
			}
		}
	}

	public void botonsalir(View v)
	{
		Toast.makeText(this, "Adios!!!!", Toast.LENGTH_LONG).show();
		finish();
	}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.segunda, menu);
		return true;
	}

}
