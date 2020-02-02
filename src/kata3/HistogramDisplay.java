/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Container;
import javax.swing.JPanel;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
      
    
    public HistogramDisplay(){
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartpanel= new ChartPanel(createChart(createDataset()));
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }
    
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart= ChartFactory.createBarChart("Histograma JFreeChart","Dominios email","Nº de emails",dataset,PlotOrientation.VERTICAL,false,false,rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
            
            dataset.addValue(1, "", "ulpgc.es");
            dataset.addValue(9, "", "ull.es");
            dataset.addValue(3, "", "hotmail.com");
            dataset.addValue(15, "", "gmail.com");
        
        return dataset;
    }
    
    
  }