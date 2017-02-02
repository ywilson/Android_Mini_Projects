package com.example.ywils.ncffactbook;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView fbimg = (ImageView)findViewById(R.id.fblink);

        assert fbimg != null;
        fbimg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/newcollegeofflorida"));
                startActivity(intent);
            }
        });

        ImageView instaimg = (ImageView)findViewById(R.id.insta);

        assert instaimg != null;
        instaimg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/newcollegeoffl/"));
                startActivity(intent);
            }
        });

        ImageView ytimg = (ImageView)findViewById(R.id.youtube);

        assert ytimg != null;
        ytimg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/user/NewCollegeofFL"));
                startActivity(intent);
            }
        });

        ImageView twitterimg = (ImageView)findViewById(R.id.twitter);

        assert twitterimg != null;
        twitterimg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/NewCollegeofFL"));
                startActivity(intent);
            }
        });


    }



}
