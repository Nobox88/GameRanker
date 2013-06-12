package se.kth.intnet.gameranker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Set View to register.xml
		setContentView(R.layout.register);

		TextView loginScreen = (TextView) findViewById(R.id.link_to_login);

		// Listening to Login Screen link
		loginScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// Closing registration screen
				// Switching to Login Screen/closing register screen
				finish();
			}
		});
		
		// The login button
				final Button button = (Button) findViewById(R.id.login_button);
				button.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						EditText userText = (EditText) findViewById(R.id.login_username);
						EditText passText = (EditText) findViewById(R.id.login_password);
						String user = userText.getText().toString();
						String pass = passText.getText().toString();
						register(user, pass);
						finish();
					}
				});
	}
	
	private void register(String user, String pass){
		
	}
}
