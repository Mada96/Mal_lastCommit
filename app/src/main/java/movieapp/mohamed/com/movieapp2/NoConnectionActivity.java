package movieapp.mohamed.com.movieapp2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class NoConnectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_connection);
        Context c = getApplication();
CheckForConnection checkForConnection = new CheckForConnection();

        if(checkForConnection.isConnected(c))
        {
            Log.v("YESYESYESYES:D","YES");

        }
      else  Toast.makeText(this, "No Connection", Toast.LENGTH_LONG).show();
    }
}
