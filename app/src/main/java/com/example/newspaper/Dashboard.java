package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void prothomalo_web (View v){
        Intent goToprothomaloweb = new Intent(Dashboard.this, prothomaloweb.class);
        startActivity(goToprothomaloweb);

    }
    public void dailystar_web (View v){
        Intent goTodailystarweb = new Intent(Dashboard.this, dailystarweb.class);
        startActivity(goTodailystarweb);
    }
    public void jugantor_web (View v){
        Intent goTojugantorweb = new Intent(Dashboard.this, jugantorweb.class);
        startActivity(goTojugantorweb);
    }
    public void ittefaq_web (View v){
        Intent goToittefaqweb = new Intent(Dashboard.this, ittefaqweb.class);
        startActivity(goToittefaqweb);
    }
    public void bdpratidin_web (View v){
        Intent goTobdpratidinweb = new Intent(Dashboard.this, bdpratidinweb.class);
        startActivity(goTobdpratidinweb);
    }
    public void amadershomoy_web(View v) {
        Intent goToamadershomoyweb = new Intent(Dashboard.this, amadershomoyweb.class);
        startActivity(goToamadershomoyweb);
    }

    public void samakal_web(View v) {
        Intent goTosamakalweb = new Intent(Dashboard.this, samakalweb.class);
        startActivity(goTosamakalweb);
    }

    public void janakantha_web(View v) {
        Intent goTojanakanthaweb = new Intent(Dashboard.this, janakanthaweb.class);
        startActivity(goTojanakanthaweb);
    }

    public void inqilab_web(View view) {
        Intent goToinqilabweb = new Intent(Dashboard.this, inqilabweb.class);
        startActivity(goToinqilabweb);
    }

    public void independent_web(View view) {
        Intent goToindependentweb = new Intent(Dashboard.this, independentweb.class);
        startActivity(goToindependentweb);
    }

    public void finex_web(View view) {
        Intent goTofinexweb = new Intent(Dashboard.this, finexweb.class);
        startActivity(goTofinexweb);
    }



    public void dsun_web(View view) {
        Intent goTodsunweb = new Intent(Dashboard.this, dsunweb.class);
        startActivity(goTodsunweb);
    }

    public void observer_web(View view) {
        Intent goToobserverweb = new Intent(Dashboard.this, observerweb.class);
        startActivity(goToobserverweb);
    }

    public void prothomalopre_web(View view) {
        Intent goToprothomalopreweb = new Intent(Dashboard.this, prothomalopreweb.class);
        startActivity(goToprothomalopreweb);
    }

    public void newage_web(View view) {
        Intent goTonewageweb = new Intent(Dashboard.this, newageweb.class);
        startActivity(goTonewageweb);
    }

    public void nnation_web(View view) {
        Intent goTonnationweb = new Intent(Dashboard.this, nnationweb.class);
        startActivity(goTonnationweb);
    }

    public void jjdin_web(View view) {
        Intent goTojjdinweb = new Intent(Dashboard.this, jjdinweb.class);
        startActivity(goTojjdinweb);
    }
}
