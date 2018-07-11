package Controller_MVC;

import View_MVC.JanelaPrincipal;
import View_MVC.CadastraCliente;
import View_MVC.TelaHBT;
import View_MVC.TelaInicial;
import View_MVC.TelaVendaServico;
import View_MVC.TelaVendas;
import View_MVC.TelaVendasProdutos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerVendas {
    
    public TelaVendas view;
    private TelaVendasProdutos viewProdutos;
    private TelaHBT viewBanho;
    private TelaVendaServico viewServico;
    private ControllerVendaProdutos controllerProdutos;
    private ControllerHBT controllerBanho;
    private ControllerVendaServico controllerServico;
    
    CadastraCliente cad = new CadastraCliente();
    
    JanelaPrincipal viewJPrincipal;
    TelaInicial viewTelaInicial;
   
  
    public ControllerVendas(CadastraCliente  cad, JanelaPrincipal viewJPrincipal, TelaVendas viewTelaVendas) {
        this.viewJPrincipal = viewJPrincipal;
         this.view = viewTelaVendas;
            
         
         view.getjButton_Produtos().addActionListener(new AbreListener());
    }
    
    class AbreListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            view.
            
        }
    }
    
    class AbreServicosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

           viewServico = new TelaVendaServico();
           viewServico.setVisible(true);
           controllerServico = new ControllerVendaServico(viewServico);
            
        }
    }
    
    
    
    
}


