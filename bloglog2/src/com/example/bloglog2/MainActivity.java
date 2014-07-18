package com.example.bloglog2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.*;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//if (savedInstanceState == null) {
		//getSupportFragmentManager().beginTransaction()
		// .add(R.id.container, new PlaceholderFragment()).commit();
	}
	//}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}


	}



	public void tryLogin(View view) {
		System.out.println("CLICK");

		System.out.println(loginURL());

	}

	public String loginURL() {


		String link = "http://tannercrook.info/android_connect/db_connect.php";

		// SET UP HTTP REQUEST
		try {
			URL url = new URL(link);

			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet();


			request.setURI(new URI(link));



			HttpResponse response = client.execute(request);

			BufferedReader in = new BufferedReader
					(new InputStreamReader(response.getEntity().getContent()));

			StringBuffer sb = new StringBuffer("");
			String line="";
			while ((line = in.readLine()) != null) {
				sb.append(line);
				break;
			}
			in.close();
			return sb.toString();
			

		} catch(Exception e) {
			return new String("Exception: " + e.getMessage());
		}
		

	}




}
