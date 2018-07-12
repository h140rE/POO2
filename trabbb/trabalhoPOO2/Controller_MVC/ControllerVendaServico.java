package Controller_MVC;

import Model_MVC.SQL;
import View_MVC.TelaVendaServico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerVendaServico {

    private TelaVendaServico view;
    private SQL testesql;
    private int auxButton;

    public ControllerVendaServico(TelaVendaServico view, SQL testesql) {
        this.view = view;
        this.testesql = testesql;

        view.getjButton4().addActionListener(new VoltaListener());
        view.getjButton2().addActionListener(new FinalizaListener());
        view.getjRadioButton1().addActionListener(new RadioB1Listener());
        view.getjRadioButton2().addActionListener(new RadioB2Listener());
        view.getjRadioButton3().addActionListener(new RadioB3Listener());
    }

    class RadioB1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            auxButton = 0;
            
        }
        
        
    }class RadioB2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            auxButton = 1;
            
        }
    }class RadioB3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            auxButton = 2;
        }
    }
    
    class VoltaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
        }
    }

    class FinalizaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String button;
            
            if(auxButton == 0){
                
            }
            
            if(auxButton == 1){
                
            }
            
            if(auxButton == 2){
                
            }
        }
    }

}
