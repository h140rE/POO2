/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_MVC;

import Model_MVC.Atendente;
import Model_MVC.Veterinario;
import View_MVC.JanelaPrincipal;
import View_MVC.TelaAtendente;
import View_MVC.TelaConsulta;
import View_MVC.TelaHBT;
import View_MVC.TelaVendas;
import View_MVC.TelaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerJFrame {
        JanelaPrincipal view;
        TelaInicial viewTelaInicio;
        TelaAtendente viewAtendente;
        TelaConsulta viewConsulta;
        TelaHBT viewHBT;
        TelaVendas viewVendas;
        
        
    
        public ControllerJFrame(JanelaPrincipal view,TelaAtendente viewAtendente,TelaConsulta viewConsulta
                                ,TelaHBT viewHBT,TelaVendas viewVendas){
        
        this.view = view;
        this.viewAtendente = viewAtendente;
        this.viewConsulta = viewConsulta;
        this.viewHBT = viewHBT;
        this.viewVendas = viewVendas;
        this.view.setSize(1000,500);
        this.view.setVisible(true);
        this.view.setLocationRelativeTo(null);
        
        
        
        viewTelaInicio = new TelaInicial();
        view.getDesktopPanel().add(viewTelaInicio);
        viewTelaInicio.show();
        
        view.getjMenuItem_Atendente().addActionListener(new MenuAtendenteListener());
        view.getjMenuItem_Consulta().addActionListener(new MenuConsultaListener());
        view.getjMenuItem_HotelBanhoTosa().addActionListener(new MenuHotelBanhoTosaListener());
        view.getjMenuItem_Vendas().addActionListener(new MenuVendasListener());
        
        }
        
        class MenuAtendenteListener implements ActionListener{
               
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();      
            view.getDesktopPanel().add(viewAtendente);
            viewAtendente.show();
            
            
            
         
        }
        }
        
        class MenuConsultaListener implements ActionListener{
               
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().remove(viewTelaInicio);
            view.getDesktopPanel().repaint();                        
            view.getDesktopPanel().add(viewConsulta);
            viewConsulta.show();
            
           
          
        }
        }
        
          class MenuHotelBanhoTosaListener implements ActionListener{
               
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();
            view.getDesktopPanel().add(viewHBT);
            viewHBT.show();

        
            
        }
        }
        
           class MenuVendasListener implements ActionListener{
               
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();
            view.getDesktopPanel().add(viewVendas);
            viewVendas.show();

         
            
        }
        }
       

    public JanelaPrincipal getView() {
        return view;
    }
        
}
