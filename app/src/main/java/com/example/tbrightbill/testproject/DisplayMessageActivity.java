package com.example.tbrightbill.testproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		// This creates that useless little button that appears on the bottom.
		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
						.setAction("Action", null).show();
			}
		});
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		// Get the message passed to this activity
		Intent intent = getIntent();
		String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);


		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);

		RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
		layout.addView(textView);

		TextView dynamicallyAddedText = new TextView(this);
		dynamicallyAddedText.setTextSize(25);
		dynamicallyAddedText.setText(getString(R.string.dynamically_added_text));
		layout.addView(dynamicallyAddedText);
	}

}
