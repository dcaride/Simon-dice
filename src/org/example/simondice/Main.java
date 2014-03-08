package org.example.simondice;

import org.example.simondice.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {

	private Button jugar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		jugar = (Button) findViewById(id.bJugar);
	}

	/**
	 * Method to run and play the game
	 * @param view
	 */
	public void runJugar(View view){
		Intent i = new Intent(this, Juego.class);
		startActivity(i);
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
