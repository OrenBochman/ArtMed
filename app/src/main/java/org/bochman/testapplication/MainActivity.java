package org.bochman.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {


    private DataPoint data[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new DataPoint[200];
        int i;
        for(i=0;i<200;i++){
            data[i]=new DataPoint((double)i,((double)i) / 2);
        }

        GraphView graph =  findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(data);

        graph.addSeries(series);
    }
}
