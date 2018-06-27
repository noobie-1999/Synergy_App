package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash2 extends AppCompatActivity {
    private ImageView vit;
    private ImageView iete;
    private TextView tv;
    private ImageView synergy;
    private ImageView delayImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        vit = (ImageView) findViewById(R.id.vit);
        iete = (ImageView) findViewById(R.id.iete);
        tv = (TextView) findViewById(R.id.tv);
        synergy = (ImageView) findViewById(R.id.synergy);
        delayImage = (ImageView) findViewById(R.id.delayImage);
        Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.anim1);
        Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.anim2);
        Animation delayAnim = AnimationUtils.loadAnimation(this,R.anim.anima_delay);
        iete.startAnimation(anim1);
        vit.startAnimation(anim1);
        tv.startAnimation(anim1);
        synergy.startAnimation(anim2);
        delayImage.startAnimation(delayAnim);
        final Intent intent = new Intent(this, MainActivity.class);
        Thread mytimer = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    startActivity(intent);
                    finish();

                }
            }
        };
        mytimer.start();
    }
}
