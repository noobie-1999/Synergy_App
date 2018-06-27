package ambika.android.com.synergy_app_final;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class CardAdapter extends BaseAdapter {
    private Context context;
    private List<Integer> images;

    public CardAdapter(Context context, List<Integer> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.item_card, viewGroup,false);
        view.setBackgroundResource(images.get(position));
        return view;


    }
}
