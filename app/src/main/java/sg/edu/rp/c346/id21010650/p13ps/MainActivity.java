package sg.edu.rp.c346.id21010650.p13ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    ListView lvCarpark;
    AsyncHttpClient client;
    ArrayList<CarparkAvailability> alCarparkAvailability;
    CarparkAdapter aaCarpark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCarpark = findViewById(R.id.listView);
        client = new AsyncHttpClient();
    }
    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<CarparkAvailability> alWeather = new ArrayList<CarparkAvailability>();
        aaCarpark = new CarparkAdapter(MainActivity.this,R.layout.row,alWeather);
        lvCarpark.setAdapter((ListAdapter) aaCarpark);

        client.get("https://api.data.gov.sg/v1/transport/carpark-availability",new JsonHttpResponseHandler() {

            String lotType;
            String totalLots;
            String lotsAvailable;
            String carparkNumber;
            String updatedTime;

            @Override
            public void onSuccess(int statusCode,Header[] headers,JSONObject response) {
                try {
                    JSONArray jsonArrItems = response.getJSONArray("items");
                    JSONObject firstObj = jsonArrItems.getJSONObject(0);
                    JSONArray jsonArrData = firstObj.getJSONArray("carpark_data");

                    for(int i = 0; i < jsonArrData.length(); i++) {
                        JSONObject jsonObjInfo = jsonArrData.getJSONObject(i);
                        JSONArray jsonArrInfo  = jsonObjInfo.getJSONArray("carpark_info");
                        JSONObject dataObj = jsonArrInfo.getJSONObject(0);
                        lotType = dataObj.getString("lot_type");
                        totalLots = dataObj.getString("total_lots");
                        lotsAvailable = dataObj.getString("lots_available");
                        carparkNumber = jsonObjInfo.getString("carpark_number");
                        updatedTime = jsonObjInfo.getString("update_datetime");
                        CarparkAvailability carpark = new CarparkAvailability(totalLots, lotType, lotsAvailble, carparkNumber, updatedTime);
                        alCarparkAvailability.add(carpark);
                }
                }
                catch(JSONException e){
                }
                aaCarpark.notifyDataSetChanged();

};};;});}}