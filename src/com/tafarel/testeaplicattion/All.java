package com.tafarel.testeaplicattion;

import org.afree.chart.AFreeChart;
import org.afree.chart.ChartFactory;
import org.afree.chart.axis.NumberAxis;
import org.afree.chart.axis.ValueAxis;
import org.afree.chart.plot.PlotOrientation;
import org.afree.chart.plot.XYPlot;
import org.afree.chart.renderer.xy.StandardXYItemRenderer;
import org.afree.chart.renderer.xy.XYItemRenderer;
import org.afree.data.xy.XYDataset;
import android.content.Context;

import com.tafarel.testeaplicattion.datasets.DataSet;

public class All extends DemoView {
	public All(Context context) {
		super(context);

		final AFreeChart chart = createChart(DataSet.createDatasetBatimentos());

		setChart(chart);
	}

	private static AFreeChart createChart(XYDataset dataset) {
		AFreeChart chart = ChartFactory.createXYLineChart("Exercício", "Tempo (s)", "BPM", DataSet.createDatasetBatimentos(), PlotOrientation.VERTICAL, true, false, false);
		XYPlot plot = (XYPlot)chart.getPlot();
		plot.setDomainCrosshairVisible(true);
		plot.setDomainCrosshairLockedOnData(true);
		plot.setRangeCrosshairVisible(true);
		plot.setRangeCrosshairLockedOnData(true);
		plot.setDomainZeroBaselineVisible(true);
		plot.setRangeZeroBaselineVisible(true);
		plot.setBackgroundAlpha(10);

		ValueAxis axis2 = new NumberAxis("Velocidade");
		axis2.setFixedDimension(10.0);
		axis2.setAutoRange(true);
		plot.setRangeAxis(1, axis2);
		plot.setDataset(1, DataSet.createDatasetVelocidade());
		plot.mapDatasetToRangeAxis(1, 1);
		XYItemRenderer renderer2 = new StandardXYItemRenderer();
		plot.setRenderer(1, renderer2);
		return chart;
	}
}
