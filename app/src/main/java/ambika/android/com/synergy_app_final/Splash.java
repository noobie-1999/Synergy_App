package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Splash extends AppCompatActivity {
    private TextView tv;
    private ImageView synergy;
    private ImageView iete;
    TextView synergytext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        iete = (ImageView) findViewById(R.id.iete);
        synergytext = (TextView) findViewById(R.id.synergytext);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        iete.startAnimation(myanim);
        synergytext.startAnimation(myanim);
        final Intent intent = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    startActivity(intent);
                    finish();

                }
            }
        };
        timer.start();
    }
}
