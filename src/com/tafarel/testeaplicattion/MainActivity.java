package com.tafarel.testeaplicattion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final View all = new All(this);
		final View batimentos = new Batimentos(this);
		final View velocidade = new Velocidade(this);
		final LinearLayout chartWrapper = (LinearLayout)findViewById(R.id.chartWrapper);
		Button buttonAll = (Button)findViewById(R.id.all);
		Button buttonBatimentos = (Button)findViewById(R.id.batimentos);
		Button buttonVelocidade = (Button)findViewById(R.id.velocidade);
		Button buttonExit = (Button)findViewById(R.id.exit);
		buttonAll.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				chartWrapper.removeAllViews();
				chartWrapper.addView(all);
			}
		});
		buttonBatimentos.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				chartWrapper.removeAllViews();
				chartWrapper.addView(batimentos);
			}
		});
		buttonVelocidade.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				chartWrapper.removeAllViews();
				chartWrapper.addView(velocidade);
			}
		});
		buttonExit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}