package Controller_MVC;

import Model_MVC.Recibo;
import Model_MVC.Servicos;
import View_MVC.JanelaPrincipal;
import View_MVC.TelaHBT;
import View_MVC.TelaInicial;
import View_MVC.TelaVendaServico;
import View_MVC.TelaVendas;
import View_MVC.TelaVendasProdutos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerVendas {
    
    private TelaVendas view;
    private TelaVendasProdutos viewProdutos;
    private TelaHBT viewBanho;
    private TelaVendaServico viewServico;
    private ControllerVendaProdutos controllerProdutos;
    private ControllerHBT controllerBanho;
    private ControllerVendaServico controllerServico;
    
    JanelaPrincipal viewJPrincipal;
    TelaInicial viewTelaInicial;
   
    
    public ControllerVendas(JanelaPrincipal viewJPrincipal) {
        this.viewJPrincipal = viewJPrincipal;
        view = new TelaVendas();
        viewJPrincipal.getDesktopPanel().removeAll();
        viewJPrincipal.getDesktopPanel().repaint();
   
         viewJPrincipal.getDesktopPanel().add(view);
         view.show();
        
        
        
        //viewJPrincipal.getDesktopPanel().removeAll();
       view.getjButton_Produtos().addActionListener(new AbreProdutosListener());
       
       // view.getjButton2().addActionListener(new AbreServicosListener());
    }
    
    class AbreProdutosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("rola");
            viewProdutos = new TelaVendasProdutos();
            
            //viewJPrincipal.getDesktopPanel().removeAll();
           // viewJPrincipal.getDesktopPanel().repaint();
            viewJPrincipal.getDesktopPanel().add(viewProdutos);
            viewProdutos.show();
            

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


