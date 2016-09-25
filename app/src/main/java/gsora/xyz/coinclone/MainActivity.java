package gsora.xyz.coinclone;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lW = (ListView) findViewById(R.id.listView);
        lW.setScrollingCacheEnabled(false);
        CoinCapComm b = new CoinCapComm(this);
        b.execute();

    }

    private String readDataFromCoinCap() {
        StringBuilder content = new StringBuilder();

        try {
            URL url = new URL("https://coincap.io/front");
            URLConnection connection = url.openConnection();
            BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            while((line = bf.readLine()) != null) {
                content.append(line + "\n");
            }

            bf.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }

    private class CoinCapComm extends AsyncTask<Void, Void, String> {

        private Context context;

        public CoinCapComm(Context c) {
            context = c;
        }

        @Override
        protected String doInBackground(Void... params) {
            return readDataFromCoinCap();
        }

        @Override
        protected void onPostExecute(String jsonStr) {
            try {
                JSONArray json = new JSONArray(jsonStr);
                ArrayList<Coin> coinsIGot = Coin.fromJson(json);
                CoinAdapter coinAdapter = new CoinAdapter(context, coinsIGot);
                ListView lW = (ListView) findViewById(R.id.listView);
                lW.setAdapter(coinAdapter);

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
