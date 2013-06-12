package se.kth.intnet.gameranker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setting default screen to login.xml
		setContentView(R.layout.login);

		TextView registerScreen = (TextView) findViewById(R.id.link_to_register);

		// Listening to register new account link
		registerScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// Switching to Register screen
				Intent i = new Intent(getApplicationContext(),
						RegisterActivity.class);
				startActivity(i);
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
				if (loginAuth(user, pass)) {
					Intent i = new Intent(getApplicationContext(),
							MainActivity.class);
					startActivity(i);
				}
			}
		});
	}

	public boolean loginAuth(String user, String pass) {

		return true;
	}

}
