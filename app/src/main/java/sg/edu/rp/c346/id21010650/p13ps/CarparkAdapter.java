package sg.edu.rp.c346.id21010650.p13ps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarparkAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<CarparkAvailability> weatherArrayList;

    public CarparkAdapter(Context context, int resource, ArrayList<CarparkAvailability> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        CarparkAdapter = objects;
}
    public void getView(int position,View convertView,ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tv = rowView.findViewById(R.id.listView);
        ImageView iv = rowView.findViewById(R.id.iv);


    }}
