package com.tafarel.testeaplicattion.datasets;

import org.afree.data.xy.XYSeries;
import org.afree.data.xy.XYSeriesCollection;

public class DataSet {
    public static XYSeriesCollection createDatasetBatimentos() {


    	XYSeries xyS1 = new XYSeries("Batimentos Cardíacos", true, false);
    	
    	xyS1.add(0, 120);
    	xyS1.add(30, 130);
    	xyS1.add(60, 150);
    	xyS1.add(90, 155);
    	xyS1.add(120, 160);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(xyS1);

        return dataset;

    }
    
    public static XYSeriesCollection createDatasetVelocidade() {


    	XYSeries xyS1 = new XYSeries("Velocidade", true, false);
    	
    	xyS1.add(0, 25);
    	xyS1.add(30, 25);
    	xyS1.add(60, 30);
    	xyS1.add(90, 30);
    	xyS1.add(120, 20);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(xyS1);

        return dataset;
    }
}
