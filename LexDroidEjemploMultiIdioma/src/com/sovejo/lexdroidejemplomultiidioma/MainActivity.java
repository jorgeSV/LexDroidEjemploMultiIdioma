package com.sovejo.lexdroidejemplomultiidioma;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity 
{
	TextView textView01;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView01 = (TextView) findViewById(R.id.textView01); 
	}

}
