package Controller_MVC;

import Model_MVC.Recibo;
import Model_MVC.Servicos;
import View_MVC.TelaBanhoTosa;
import View_MVC.TelaVendaServico;
import View_MVC.TelaVendas;
import View_MVC.TelaVendasProdutos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerVendas {
    
    private TelaVendas view;
    private TelaVendasProdutos viewProdutos;
    private TelaBanhoTosa viewBanho;
    private TelaVendaServico viewServico;
    private ControllerVendaProdutos controllerProdutos;
    private ControllerBanhoTosa controllerBanho;
    private ControllerVendaServico controllerServico;
    private Servicos model;

    public ControllerVendas(TelaVendas view,Servicos recibo) {
        this.view = view;
        this.model = recibo;

        view.getjButton1().addActionListener(new AbreProdutosListener());
        view.getjButton2().addActionListener(new AbreBanhoListener());
        view.getjButton3().addActionListener(new AbreServicosListener());

    }
    
    class AbreProdutosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

           viewProdutos = new TelaVendasProdutos();
           viewProdutos.setVisible(true);
           controllerProdutos = new ControllerVendaProdutos(model,viewProdutos);
            
        }
    }
    
    class AbreBanhoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

           viewBanho = new TelaBanhoTosa();
           viewBanho.setVisible(true);
           controllerBanho = new ControllerBanhoTosa(model,viewBanho);
            
        }
    }
    
    class AbreServicosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

           viewServico = new TelaVendaServico();
           viewServico.setVisible(true);
           controllerServico = new ControllerVendaServico(model,viewServico);
            
        }
    }
    
    
    
    
}


