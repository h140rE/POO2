package Controller_MVC;

import Model_MVC.Recibo;
import Model_MVC.Servicos;
import View_MVC.TelaHBT;
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

    public ControllerVendas(TelaVendas view) {
        this.view = view;

        view.getjButton1().addActionListener(new AbreProdutosListener());
        view.getjButton2().addActionListener(new AbreServicosListener());

    }
    
    class AbreProdutosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

           viewProdutos = new TelaVendasProdutos();
           viewProdutos.setVisible(true);
           controllerProdutos = new ControllerVendaProdutos(viewProdutos);
            
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


