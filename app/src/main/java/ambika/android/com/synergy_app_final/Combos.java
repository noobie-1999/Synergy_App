package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.thekhaeng.pushdownanim.PushDownAnim;
import com.ugurtekbas.fadingindicatorlibrary.FadingIndicator;

import java.util.ArrayList;
import java.util.List;


public class Combos extends AppCompatActivity {
    ViewPager pager;
    Combos_slider adapter;
    LinearLayout sliderlayout;
    private ViewPager viewpagercombos;
    private Combosadapter cadapter;
    private List<CombosViewPager> ccontents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combos);
        viewpagercombos = (ViewPager) findViewById(R.id.viewpagercombos);
        ccontents = new ArrayList<>();
        int[] images = {R.drawable.combo1,R.drawable.combo2,R.drawable.combo3,R.drawable.combo4,R.drawable.combo5};
        for(int i=0;i<images.length;i++){
            CombosViewPager c = new CombosViewPager();
            c.images=images[i];
            ccontents.add(c);
        }
        cadapter = new Combosadapter(ccontents,this);
        viewpagercombos.setPageTransformer(true,new ViewPagerStack());
        viewpagercombos.setAdapter(cadapter);


        Button button = findViewById(R.id.back);

        PushDownAnim.setPushDownAnimTo(button)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent();
                        i.setClass(Combos.this, MainActivity.class);
                        startActivity(i);
                    }

                });
        Button button2 = findViewById(R.id.register);

        PushDownAnim.setPushDownAnimTo( button2)
                .setOnClickListener( new View.OnClickListener(){
                    @Override
                    public void onClick( View view ){
                        Intent i = new Intent();
                        i.setAction(Intent.ACTION_VIEW);
                        i.addCategory(Intent.CATEGORY_BROWSABLE);
                        i.setData(Uri.parse("http://synergyietevit.tk/"));
                        startActivity(i);
                    }

                } );
        pager = findViewById(R.id.pager);
        sliderlayout = (LinearLayout) findViewById(R.id.slidedots);
        adapter = new Combos_slider(this);
        pager.setAdapter(adapter);
        FadingIndicator indicator = (FadingIndicator) findViewById(R.id.indicator);
        ViewPager viewpagerDefault = (ViewPager) findViewById(R.id.pager);
//assigning indicator to viewpager
        indicator.setViewPager(viewpagerDefault);

//Set fill color
        indicator.setFillColor(Color.LTGRAY);
//Set stroke color
        indicator.setStrokeColor(Color.CYAN);
    }

    private class ViewPagerStack implements ViewPager.PageTransformer {
        @Override
        public void transformPage(@NonNull View page, float position) {
            if(position>=0){
                page.setScaleX(0.7f-0.05f*position);
                page.setScaleY(0.7f);
                page.setTranslationX(-page.getWidth()*position);
                page.setTranslationY(-30*position);
            }
        }
    }
}
