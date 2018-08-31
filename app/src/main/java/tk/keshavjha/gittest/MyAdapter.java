package tk.keshavjha.gittest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    List<Integer> img;
    List<String> profile_name, msg;
    Context context;

    public MyAdapter(List<Integer> img, List<String> profile_name,
                     List<String> msg, Context context) {
        this.img = img;
        this.profile_name = profile_name;
        this.msg = msg;
        this.context = context;
    }

    @Override
    public int getCount() {
        return img.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v= LayoutInflater.from(context).inflate(R.layout.my_adapter_layout,viewGroup,false);
        ImageView iv=(ImageView)v.findViewById(R.id.imageView);
        TextView tv=(TextView)v.findViewById(R.id.textView);
        TextView tv1=(TextView)v.findViewById(R.id.textView2);

        return v;
    }
}
