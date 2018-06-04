 package com.example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

 public class MainActivity extends AppCompatActivity {
TextView textView;
ShowcaseView.Builder showCaseView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
    showShowCaseView();
    }
    public void showShowCaseView(){
        showCaseView=new ShowcaseView.Builder(this).
        withMaterialShowcase()
        .setTarget(new ViewTarget(R.id.text,this)).
        setContentTitle("Hello World").
        setContentText("Blah,Blah,Blah");
        showCaseView.build();
    }

}
