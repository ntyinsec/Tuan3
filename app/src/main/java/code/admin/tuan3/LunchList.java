package code.admin.tuan3;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LunchList extends Activity {
    List<Restaurant> listRestaurant = new ArrayList<Restaurant>();
    //RestaurantAdapter adapter=null;
    ArrayAdapter<Restaurant> adapter=null;
    @Override
    public void onCreate(Bundle savedInstanceStace){
        super.onCreate(savedInstanceStace);
        setContentView(R.layout.activity_lunch_list);

        Button save=(Button)findViewById(R.id.save);
        save.setOnClickListener(onsave);

        ListView list=(ListView)findViewById(R.id.restaurants);
        adapter= new ArrayAdapter<Restaurant>(this,android.R.layout.simple_list_item_1, listRestaurant);
     //   adapter =new RestaurantAdapter();
        list.setAdapter(adapter);

    }
    public View.OnClickListener onsave = new View.OnClickListener() {
        public void onClick(View v) {
            Restaurant r = new Restaurant();
            EditText name = (EditText) findViewById(R.id.name);
            EditText address = (EditText) findViewById(R.id.addr);

            r.setName(name.getText().toString());
            r.setAddress(address.getText().toString());

            RadioGroup type= (RadioGroup)findViewById(R.id.type);
            switch (type.getCheckedRadioButtonId())
            {
                case R.id.take_out:
                    r.setType("Take out");
                    break;
                case R.id.sit_down:
                    r.setType("Sit down");
                    break;
                case R.id.delivery:
                    r.setType("delivery");
                    break;

            }
            listRestaurant.add(r);
        }
    };
}




