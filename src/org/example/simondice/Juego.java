package org.example.simondice;


import org.example.simondice.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Juego extends Activity {
	//Interfaz
	private Button uno;
	private Button dos;
	private Button tres;
	private Button cuatro;
	private EditText simonInfo;
	private EditText jugadorInfo;
	
	//Variables
	public static int s = 3;
	public static int nivel = 1;
	int count = 0;
	int nivelActual = nivel-1;
	int inputCount = 0;
	int puntuacion = 0;
	int [] entradaCorrecta = new int[300];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jugar);
		//recogida de botones
		uno = (Button) findViewById(id.b1);
		dos = (Button) findViewById(id.b2);
		tres = (Button) findViewById(id.b3);
		cuatro = (Button) findViewById(id.b4);
		//recogida campos de texto
		simonInfo = (EditText) findViewById(id.simonInfo);
		jugadorInfo = (EditText) findViewById(id.jugadorInfo);
	}
	
	
}
