package Controller_MVC;

import Model_MVC.Atendente;
import Model_MVC.Cliente;
import View_MVC.TelaAtendente;
import View_MVC.TelaVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ControllerAtendente {

    private Atendente model;
    private TelaAtendente view;
    private TelaVendas viewVendas;
    private LinkedList<Cliente> clientesAtivos;

    public ControllerAtendente(Atendente model, TelaAtendente view, LinkedList<Cliente> cliente,TelaVendas viewVendas) {
        this.model = model;
        this.view = view;
        this.clientesAtivos = cliente;
        this.viewVendas = viewVendas;
        view.getJButton_MenuPrincipal_Cadastro_Conformar().addActionListener(new CadastraListener());
        view.getJButton_MenuPrincipal_Cadastro_Cancelar().addActionListener(new CancelaListener());
        view.getJButton_MenuPrincipal_MarcaConsulta_Pesquisar().addActionListener(new ConsultaListener());
        view.getJButton_MenuPrincipal_SistemadeVendas_Carrinho().addActionListener(new AbreVendaListener());

    }

    class CadastraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String Nome, CPF, Telefone, NomeCachorro, Raca;

            Nome = view.getjTextField1().getText();
            CPF = view.getjTextField2().getText();
            Telefone = view.getjTextField3().getText();
            NomeCachorro = view.getjTextField4().getText();
            Raca = view.getjTextField5().getText();

            model.cadastrar(Nome, CPF, Telefone, NomeCachorro, Raca);
            clientesAtivos.add(model.atende(Nome,Integer.parseInt(CPF),Integer.parseInt(Telefone)));
        }
    }

    class CancelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            view.getjTextField1().setText("");
            view.getjTextField2().setText("");
            view.getjTextField3().setText("");
            view.getjTextField4().setText("");
            view.getjTextField5().setText("");
        }
    }

    class ConsultaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPFDono,Data,Hora;
            
            CPFDono = view.getjTextPane1().getText();
            Data = view.getjTextPane2().getText();
            Hora = view.getjTextPane3().getText();
            
            model.marcaConsulta(CPFDono, Data, Hora);
        }
    }

    class AbreVendaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

           
           viewVendas.setVisible(true);
           
            
        }
    }
   
    
}
