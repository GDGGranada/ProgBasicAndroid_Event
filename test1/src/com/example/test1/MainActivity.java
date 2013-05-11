package com.example.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv=(TextView) findViewById(R.id.tvHW);
        tv.setText("Hola,hola");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		Toast.makeText(this, "Acitivity 1 en pausa", Toast.LENGTH_LONG).show();
	}


	public void pulsaboton(View v)
    {
    	
    	tv.setText("boton pulsado");
    	
    	EditText ed=(EditText)findViewById(R.id.editText1);
    	String scontenido=ed.getText().toString();
    	Intent i=new Intent(this,SegundaActivity.class);
    	
    	i.putExtra("name",scontenido);
    	startActivity(i);
    }
    
}
