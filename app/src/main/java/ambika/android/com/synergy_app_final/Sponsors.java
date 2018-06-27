package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.thekhaeng.pushdownanim.PushDownAnim;
import com.ugurtekbas.fadingindicatorlibrary.FadingIndicator;

public class Sponsors extends AppCompatActivity {
    ViewPager pager;
    Sponsors_slider adapter;
    LinearLayout sliderlayout;
    private String[] github ={"https://assets-cdn.github.com/images/modules/open_graph/github-mark.png"};
    private String[] hackerrank ={"https://pbs.twimg.com/profile_images/942929348327194624/IxwXYa82_400x400.jpg"};
    private String[] velji = {"https://s3.amazonaws.com/zaubatrademarks/b2140c17-2ab5-445f-b1a9-23e48309f236.png"};
   /* private String[] college = {"https://s3.amazonaws.com/zaubatrademarks/b2140c17-2ab5-445f-b1a9-23e48309f236.png"};
    private String[] blogging = {"https://s3.amazonaws.com/zaubatrademarks/b2140c17-2ab5-445f-b1a9-23e48309f236.png"};
    private String[] yearbook= {"https://s3.amazonaws.com/zaubatrademarks/b2140c17-2ab5-445f-b1a9-23e48309f236.png"};
    private String[] music = {"https://s3.amazonaws.com/zaubatrademarks/b2140c17-2ab5-445f-b1a9-23e48309f236.png"};
    private String[] dance = {"https://s3.amazonaws.com/zaubatrademarks/b2140c17-2ab5-445f-b1a9-23e48309f236.png"};
    private String[] robot = {"https://s3.amazonaws.com/zaubatrademarks/b2140c17-2ab5-445f-b1a9-23e48309f236.png"};
    private String[] tifac = {"https://s3.amazonaws.com/zaubatrademarks/b2140c17-2ab5-445f-b1a9-23e48309f236.png"};*/
    ViewPager githubview,hackerview,vp,cfever,blogs,book,musicclub,danceclub,robotics,tifaccore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        Button button = findViewById(R.id.back);

        PushDownAnim.setPushDownAnimTo( button)
                .setOnClickListener( new View.OnClickListener(){
                    @Override
                    public void onClick( View view ){
                        Intent i= new Intent();
                        i.setClass(Sponsors.this,MainActivity.class);
                        startActivity(i);
                    }

                } );
        pager = findViewById(R.id.pager);
        sliderlayout = (LinearLayout) findViewById(R.id.slidedots);
        adapter = new Sponsors_slider(this);
        pager.setAdapter(adapter);
        githubview = (ViewPager)findViewById(R.id.github);
        hackerview = (ViewPager)findViewById(R.id.hacker);
        Githubadapter hackeradapter = new Githubadapter(this,hackerrank);
        hackerview.setAdapter(hackeradapter);
        vp = (ViewPager)findViewById(R.id.vp);
        Githubadapter vpadapter = new Githubadapter(this,velji);
        vp.setAdapter(vpadapter);
        Githubadapter githubadapter = new Githubadapter(this,github);
        githubview.setAdapter(githubadapter);
       // cfever = (ViewPager)findViewById(R.id.collegefever);
        //Githubadapter fever = new Githubadapter(this,college);
        //vp.setAdapter(fever);

        /*blogs = (ViewPager)findViewById(R.id.bloggers);
        Githubadapter badapter = new Githubadapter(this,blogging);
        vp.setAdapter(badapter);

        book = (ViewPager)findViewById(R.id.yearbook);
        Githubadapter yadapter = new Githubadapter(this,yearbook);
        vp.setAdapter(yadapter);

        musicclub = (ViewPager)findViewById(R.id.music);
        Githubadapter madapter = new Githubadapter(this,music);
        vp.setAdapter(madapter);

        danceclub = (ViewPager)findViewById(R.id.dance);
        Githubadapter dadapter = new Githubadapter(this,dance);
        vp.setAdapter(dadapter);

        robotics = (ViewPager)findViewById(R.id.robo);
        Githubadapter radapter = new Githubadapter(this,robot);
        vp.setAdapter(radapter);

        tifaccore = (ViewPager)findViewById(R.id.tifac);
        Githubadapter tadapter = new Githubadapter(this,tifac);
        vp.setAdapter(tadapter);*/


        FadingIndicator indicator = (FadingIndicator) findViewById(R.id.indicator);
        ViewPager viewpagerDefault = (ViewPager) findViewById(R.id.pager);
//assigning indicator to viewpager
        indicator.setViewPager(viewpagerDefault);

//Set fill color
        indicator.setFillColor(Color.LTGRAY);
//Set stroke color
        indicator.setStrokeColor(Color.CYAN);
    }
}
