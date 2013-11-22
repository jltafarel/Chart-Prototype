package com.tafarel.testeaplicattion;

import org.afree.chart.AFreeChart;
import org.afree.chart.ChartFactory;
import org.afree.chart.plot.PlotOrientation;
import org.afree.chart.plot.XYPlot;
import org.afree.data.xy.XYDataset;

import android.content.Context;

import com.tafarel.testeaplicattion.datasets.DataSet;

public class Velocidade extends DemoView {

	public Velocidade(Context context) {
		super(context);

		final AFreeChart chart = createChart(DataSet.createDatasetVelocidade());

		setChart(chart);
	}

	private static AFreeChart createChart(XYDataset dataset) {
		AFreeChart chart = ChartFactory.createXYLineChart("Velocidade", "Tempo (s)", "Velocidade (km/h)", dataset, PlotOrientation.VERTICAL, true, false, false);
		XYPlot plot = (XYPlot)chart.getPlot();
		plot.setDomainCrosshairVisible(true);
		plot.setDomainCrosshairLockedOnData(true);
		plot.setRangeCrosshairVisible(true);
		plot.setRangeCrosshairLockedOnData(true);
		plot.setDomainZeroBaselineVisible(true);
		plot.setRangeZeroBaselineVisible(true);
		return chart;
	}
}