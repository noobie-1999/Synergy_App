package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.ramotion.foldingcell.FoldingCell;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.ugurtekbas.fadingindicatorlibrary.FadingIndicator;

public class Aboutus extends AppCompatActivity {
    ViewPager pager;
    Contactus_slider adapter;
    LinearLayout sliderlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        Button button = findViewById(R.id.back);

        PushDownAnim.setPushDownAnimTo( button)
                .setOnClickListener( new View.OnClickListener(){
                    @Override
                    public void onClick( View view ){
                        Intent i= new Intent();
                        i.setClass(Aboutus.this,MainActivity.class);
                        startActivity(i);
                    }

                } );
        final FoldingCell aboutVit = (FoldingCell) findViewById(R.id.aboutVit);
        final FoldingCell whoAreWe = (FoldingCell) findViewById(R.id.whoAreWe);
        final FoldingCell whatDoWeDo = (FoldingCell) findViewById(R.id.whatDoWeDo);
        final FoldingCell moreAboutUs = (FoldingCell) findViewById(R.id.moreAboutUs);

        aboutVit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutVit.toggle(false);
            }
        });
        whoAreWe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whoAreWe.toggle(false);
            }
        });
        whatDoWeDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whatDoWeDo.toggle(false);
            }
        });
        moreAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moreAboutUs.toggle(false);
            }
        });
    }
}
