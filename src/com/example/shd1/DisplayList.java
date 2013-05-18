package com.example.shd1;

import java.util.BitSet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class DisplayList extends Activity {
	private ListAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_list);
		ListView listView = (ListView) findViewById(R.id.other_stores_list);
		
		BitSet isFav = new BitSet(ScanToDisplay.data.size());
		adapter = new ListAdapter(this, ScanToDisplay.data, isFav);
		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_menu, menu);
		return true;
	}

}