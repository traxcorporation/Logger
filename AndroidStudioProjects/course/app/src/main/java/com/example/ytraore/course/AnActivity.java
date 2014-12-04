package com.example.ytraore.course;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Objects;

/**
 * Created by ytraore on 02/12/2014.
 */
public class AnActivity extends Activity{

    public static final String  VALUE="valeur";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        ListView xx = (ListView) findViewById(R.id.ytr_exemple);
        ListView yy = (ListView) findViewById(R.id.ytr_exemple);

        final  String [] XXy ={"test","tetes","ter"};

        // génération des classes suivantes lorsqu'on instancie BaseAdapter
        xx.setAdapter(new BaseAdapter() {

            public int getCount() {
                return XXy.length;
            }


            public Object getItem(int position) {
                return XXy[position];
            }


            //Donne moi l'objet à la position i
            //il sert à réordonner une liste "getItemId"
            public long getItemId(int position) {
                return position;
            }

            @Override
            // c'est là ou notre vue sera créee
            public View getView(int position, View convertView, ViewGroup parent) {

               final  String ms = (String) getItem(position);
                if(convertView==null){

                    convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.test,parent,false);

                }

                TextView tv =(TextView) convertView.findViewById(R.id.tv);
                tv.setOnClickListener(new  View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent i =new Intent(Accueil.this,AnActivity.class );
                        i.putExtra(VALUE,ms);
                        startActivities(i);

                    }



    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_accueil, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}




}