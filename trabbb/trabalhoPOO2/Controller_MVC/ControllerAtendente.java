package Controller_MVC;

import Controller_MVC.*;
import Model_MVC.*;
import View_MVC.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControllerAtendente {

    Connection conecta = null;
    PreparedStatement pst;
    ResultSet rs;
    private Atendente atendente;
    TelaAtendente view;
    JanelaPrincipal jPrincipal;
    BuscaCliente buscaCliente;
    CadastraAnimal cadastraA;
    CadastraCliente cadastraC;
    MarcaConsulta marcaC;
    private LinkedList<Cliente> clientesAtivos;
    ClienteTableModel tableModel;
    Boolean cao = false;
    Boolean gato = false;

    public ControllerAtendente(JanelaPrincipal jPrincipal, Atendente model, TelaAtendente view, CadastraCliente cadastraC,
            BuscaCliente buscaCliente, CadastraAnimal cadastraA, MarcaConsulta marcaC, LinkedList<Cliente> cliente) {

        this.jPrincipal = jPrincipal;
        this.atendente = model;
        this.view = view;
        this.cadastraC = cadastraC;
        this.buscaCliente = buscaCliente;
        this.cadastraA = cadastraA;
        this.marcaC = marcaC;
        this.clientesAtivos = cliente;
        this.tableModel = new ClienteTableModel(cliente);
        
        this.view.getTabelaClientes().setModel(tableModel);
        this.view.getTabelaClientes().addMouseListener(new ClicaTabela());
        this.view.getMenuCadastraCliente().addActionListener(new CadastraClienteJanelaListener());
        this.view.getMenuBuscaCliente().addActionListener(new BuscaClienteJanelaListener());
        this.view.getMenCadastraAnimal().addActionListener(new CadastroAnimalJanelaListener());
        this.view.getMenuMarcaConsulta().addActionListener(new MarcaConsultaJanelaListener());

        this.cadastraC.getBotaoConfirma().addActionListener(new AdicionaClienteListener());
        this.cadastraC.getBotaoCancela().addActionListener(new CancelaCadastraListener());

        this.cadastraA.getBotaoConfirmaAnimal().addActionListener(new CadastraAnimalListener());
        this.cadastraA.getBotaoCancelaAnimal().addActionListener(new CancelaAnimalListener());
        this.cadastraA.getRadioButtonCao().addActionListener(new SelecionaCaoListener());
        this.cadastraA.getRadioButtonGato().addActionListener(new SelecionaGatoListener());
    }

    class CadastraClienteJanelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();

            view.getDesktopPanel().add(cadastraC);
            cadastraC.show();

        }
    }

    class BuscaClienteJanelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();

            view.getDesktopPanel().add(buscaCliente);
            buscaCliente.show();

        }
    }

    class CadastroAnimalJanelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();

            view.getDesktopPanel().add(cadastraA);
            cadastraA.show();
        }
    }

    class MarcaConsultaJanelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();

            view.getDesktopPanel().add(marcaC);
            marcaC.show();
        }
    }

    class AdicionaClienteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String Nome, CPF, Telefone, NomeAnimal, Raca;
            Nome = cadastraC.getTextoNome().getText();
            CPF = cadastraC.getTextoCPF().getText();
            Telefone = cadastraC.getTextoTelefone().getText();

            // HADDAD ARRUMA AQUI!!!!!
            if (Nome == "" | CPF == "" | Telefone == "") {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {
                clientesAtivos.add(atendente.atende(Nome, CPF, Telefone));

                limpaBufferCadastra();
                adicionaTabela(clientesAtivos.getLast());
            }
        }
    }

    class CancelaCadastraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            limpaBufferCadastra();
        }

    }

    class CadastraAnimalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Cliente cli = null;
            String nomeAnimal, racaAnimal;
            cli = tableModel.getCliente(view.getTabelaClientes().getSelectedRow());
            if (cli == null) {
                JOptionPane.showMessageDialog(null, "Escolha um cliente");
            } else {

                cadastraA.getDonoCadastraAnimal().setText(cli.getNome());
                nomeAnimal = cadastraA.getTextoNomeAnimal().getText();
                racaAnimal = cadastraA.getTextoRacaAnimal().getText();

                if (nomeAnimal.equals("") || racaAnimal.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                } else {
                    if (cao) {
                        cli.AdicionaAnimal(nomeAnimal, racaAnimal, 1);
                        limpaRadioButton();
                        cao = false;
                    } else if (gato) {
                        cli.AdicionaAnimal(nomeAnimal, racaAnimal, 2);
                        limpaRadioButton();
                        gato = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione o Tipo do Animal");
                    }
                }
            }
        }

    }

    class CancelaAnimalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            limpaBufferCadastraAnimal();
        }

    }

    class SelecionaCaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cao = true;
        }

    }

    class SelecionaGatoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            gato = true;
        }

    }
    
    class ClicaTabela extends MouseAdapter {

        
        public void mouseClicked(MouseEvent e) {
            Cliente cli;
            cli = tableModel.getCliente(view.getTabelaClientes().getSelectedRow());
            cadastraA.getDonoCadastraAnimal().setText(cli.getNome());
            
        }
   
    }

    public void limpaRadioButton() {
        cadastraA.getButtonGroup1().clearSelection();
    }

    private void adicionaTabela(Cliente clientesAtivos) {

        this.tableModel.addCliente(clientesAtivos);
    }

    private void limpaBufferCadastra() {
        cadastraC.getTextoNome().setText("");
        cadastraC.getTextoCPF().setText("");
        cadastraC.getTextoTelefone().setText("");
    }

    private void limpaBufferCadastraAnimal() {
        cadastraA.getTextoNomeAnimal().setText("");
        cadastraA.getTextoRacaAnimal().setText("");
        cadastraA.getDonoCadastraAnimal().setText("");
    }

}
