package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.thekhaeng.pushdownanim.PushDownAnim;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import org.w3c.dom.Text;

public class Faqspage extends AppCompatActivity {
    TextView ans1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqspage);
        Button button = findViewById(R.id.back);

        PushDownAnim.setPushDownAnimTo( button)
                .setOnClickListener( new View.OnClickListener(){
                    @Override
                    public void onClick( View view ){
                        Intent i= new Intent();
                        i.setClass(Faqspage.this,MainActivity.class);
                        startActivity(i);
                    }

                } );
        ans1 = (TextView) findViewById(R.id.ans1);
        EasyFlipView easyFlipView = (EasyFlipView) findViewById(R.id.flipview1);
        easyFlipView.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {
                if(ans1.getVisibility()==View.GONE){
                    ans1.setVisibility(View.VISIBLE);

                }

                // ...
                // Your code goes here
                // ...

            }
        });
    }
}
