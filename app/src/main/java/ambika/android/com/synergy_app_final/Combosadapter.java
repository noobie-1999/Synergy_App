package ambika.android.com.synergy_app_final;

import android.content.Context;
import android.graphics.pdf.PdfDocument;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.List;

public class Combosadapter extends PagerAdapter {
    private List<CombosViewPager> contents;
    private Context context;

    public Combosadapter(List<CombosViewPager> contents, Context context) {
        this.contents = contents;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contents.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.view_combos,container,false);
        ImageView image_view = (ImageView)item_view.findViewById(R.id.ivcombos);
        image_view.setImageResource(contents.get(position).getImages());
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(LinearLayout)object;
    }
}
