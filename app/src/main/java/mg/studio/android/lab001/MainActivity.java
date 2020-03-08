package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;
    CheckBox cb_mouth,cb_arms,cb_ears,cb_eyebrows,cb_eyes,cb_glasses,cb_hat,cb_mustache,cb_nose,cb_shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);

        cb_mouth = findViewById(R.id.cb_mouth);
        cb_arms = findViewById(R.id.cb_arms);
        cb_ears = findViewById(R.id.cb_ears);
        cb_eyebrows = findViewById(R.id.cb_eyebrows);
        cb_eyes = findViewById(R.id.cb_eyes);
        cb_glasses = findViewById(R.id.cb_glasses);
        cb_hat = findViewById(R.id.cb_hat);
        cb_mustache = findViewById(R.id.cb_mustache);
        cb_nose = findViewById(R.id.cb_nose);
        cb_shoes = findViewById(R.id.cb_shoes);
    }

    public void cbMouth(View v){
        if(cb_mouth.isChecked())
            mouth.setVisibility( View.VISIBLE );
        else
            mouth.setVisibility( View.GONE );
    }
    public void cbArms(View v){
        if(cb_arms.isChecked())
            arms.setVisibility( View.VISIBLE );
        else
            arms.setVisibility( View.GONE );
    }
    public void cbEars(View v){
        if(cb_ears.isChecked())
            ears.setVisibility( View.VISIBLE );
        else
            ears.setVisibility( View.GONE );
    }
    public void cbHat(View v){
        if(cb_hat.isChecked())
            hat.setVisibility( View.VISIBLE );
        else
            hat.setVisibility( View.GONE );
    }
    public void cbEyebrows(View v){
        if(cb_eyebrows.isChecked())
            eyebrows.setVisibility( View.VISIBLE );
        else
            eyebrows.setVisibility( View.GONE );
    }
    public void cbEyes(View v){
        if(cb_eyes.isChecked())
            eyes.setVisibility( View.VISIBLE );
        else
            eyes.setVisibility( View.GONE );
    }
    public void cbGlasses(View v){
        if(cb_glasses.isChecked())
            glasses.setVisibility( View.VISIBLE );
        else
            glasses.setVisibility( View.GONE );
    }
    public void cbMustache(View v){
        if(cb_mustache.isChecked())
            mustache.setVisibility( View.VISIBLE );
        else
            mustache.setVisibility( View.GONE );
    }
    public void cbNose(View v){
        if(cb_nose.isChecked())
            nose.setVisibility( View.VISIBLE );
        else
            nose.setVisibility( View.GONE );
    }
    public void cbShoes(View v){
        if(cb_shoes.isChecked())
            shoes.setVisibility( View.VISIBLE );
        else
            shoes.setVisibility( View.GONE );
    }

}
