package code.admin.tuan3;

import android.content.Context;
import android.opengl.EGLExt;
import android.widget.ArrayAdapter;

import code.admin.tuan3.LunchList;


 class RestaurantAdapter extends ArrayAdapter<Restaurant> {
    public RestaurantAdapter(Context context , int textViewResouceId){
        super(context,textViewResouceId);
    }
   // public RestaurantAdapter()
    {
        //super(LunchList.this, android.R.layout.simple_list_item_1, listRestaurant);
    }
}
