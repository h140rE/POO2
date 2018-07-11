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
        
        ControllerConsulta controllerConsulta;
        ControllerVendas controllerVendas;
        
        Atendente modelAtendente = new Atendente("nome", "111.222.333-44", "(34) 99999999", 1);
        Veterinario modelVeterinario = new Veterinario("Veterinario", "999.888.777-66", "(34)11111111", 1);
    
        public ControllerJFrame(){
        view = new JanelaPrincipal();
        view.setSize(1000,500);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
        
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
            
             viewAtendente = new TelaAtendente();
             view.getDesktopPanel().add(viewAtendente);
             viewAtendente.show();
             
             
            
            
        }
        }
        
        class MenuConsultaListener implements ActionListener{
               
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().remove(viewTelaInicio);
            view.getDesktopPanel().repaint();
            
            viewConsulta = new TelaConsulta();
            view.getDesktopPanel().add(viewConsulta);
            viewConsulta.show();
            
           // controllerConsulta = new ControllerConsulta(viewConsulta, modelVeterinario);
          
        }
        }
        
          class MenuHotelBanhoTosaListener implements ActionListener{
               
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();
            
             viewHBT = new TelaHBT();
             view.getDesktopPanel().add(viewHBT);
             viewHBT.show();

        }
        }
        
           class MenuVendasListener implements ActionListener{
               
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();
            
             
             controllerVendas = new ControllerVendas(view);
         
        }
        }
       

    public JanelaPrincipal getView() {
        return view;
    }
        
}
