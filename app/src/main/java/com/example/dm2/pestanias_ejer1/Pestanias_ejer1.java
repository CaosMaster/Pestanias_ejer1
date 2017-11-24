package com.example.dm2.pestanias_ejer1;

import android.content.ClipData;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Pestanias_ejer1 extends AppCompatActivity {

    private TabHost tabs;
    private Menu menu2;
    private MenuItem aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pestanias_ejer1);

        Resources res= getResources();

        aux=(MenuItem) findViewById(R.id.auxiliar);

        tabs= (TabHost) findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec= tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("",res.getDrawable(android.R.drawable.ic_menu_call));
        tabs.addTab(spec);

        spec= tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("",res.getDrawable(android.R.drawable.stat_notify_chat));

        tabs.addTab(spec);

        spec= tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("",res.getDrawable(android.R.drawable.sym_contact_card));
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener(){

            public void onTabChanged(String tabId){

             /*if (tabId.equals("mitab2")){
                    aux.set(android.R.drawable.ic_menu_call);
              }*/
            }


        });



    }

    public boolean onCreateOptionsMenu(Menu menu){


        getMenuInflater().inflate(R.menu.menu_main,menu);


        return true;
    }


}
