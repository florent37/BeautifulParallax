package com.github.florent37.beautifulparallax.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.github.florent37.beautifulparallax.sample.model.SampleObject;
import com.github.florent37.carpaccio.Carpaccio;
import com.github.florent37.carpaccio.CarpaccioLogger;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.carpaccio)
    Carpaccio carpaccio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(0xFFFFFFFF);

        CarpaccioLogger.ENABLE_LOG = true;

        List<SampleObject> objects = SampleObjectsFactory.generateList();
        carpaccio.mapList("object",objects);
    }




}
