package com.example.brainplow.graph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart = (BarChart)findViewById(R.id.barchart);
        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.setMaxVisibleValueCount(50);
        barChart.setPinchZoom(false);
        barChart.setDrawGridBackground(true);

        ArrayList<BarEntry> barEntries = new ArrayList<>();

        barEntries.add(new BarEntry(1, 600f));
        barEntries.add(new BarEntry(2, 500f));
        barEntries.add(new BarEntry(3, 50f));
        barEntries.add(new BarEntry(4, 34f));
        barEntries.add(new BarEntry(5, 900f));

        barEntries.add(new BarEntry(6, 100f));

        barEntries.add(new BarEntry(7, 600f));
        barEntries.add(new BarEntry(8, 500f));
        barEntries.add(new BarEntry(9, 50f));
        barEntries.add(new BarEntry(10, 34f));
        barEntries.add(new BarEntry(11, 900f));

        barEntries.add(new BarEntry(6, 100f));


        BarDataSet barDataSet = new BarDataSet(barEntries, "Data set 1");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(0.9f);

        barChart.setData(barData);


    }
}
