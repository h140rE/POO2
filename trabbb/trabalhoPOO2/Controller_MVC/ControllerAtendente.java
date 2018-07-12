package Controller_MVC;

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

    SQL testesql;

    public ControllerAtendente(JanelaPrincipal jPrincipal, Atendente model, TelaAtendente view, CadastraCliente cadastraC,
            BuscaCliente buscaCliente, CadastraAnimal cadastraA, MarcaConsulta marcaC, LinkedList<Cliente> cliente, SQL testesql) {

        this.jPrincipal = jPrincipal;
        this.atendente = model;
        this.view = view;
        this.cadastraC = cadastraC;
        this.buscaCliente = buscaCliente;
        this.cadastraA = cadastraA;
        this.marcaC = marcaC;
        this.clientesAtivos = cliente;

        this.tableModel = new ClienteTableModel(cliente);

        this.testesql = testesql;

        this.view.getTabelaClientes().setModel(tableModel);
        this.view.getTabelaClientes().addMouseListener(new ClicaTabela());
        this.view.getMenuCadastraCliente().addActionListener(new CadastraClienteJanelaListener());
        this.view.getMenuBuscaCliente().addActionListener(new BuscaClienteJanelaListener());
        this.view.getMenCadastraAnimal().addActionListener(new CadastroAnimalJanelaListener());
        this.view.getMenuMarcaConsulta().addActionListener(new MarcaConsultaJanelaListener());

        this.cadastraC.getBotaoConfirma().addActionListener(new AdicionaClienteListener());
        this.cadastraC.getBotaoCancela().addActionListener(new CancelaCadastraListener());

        this.buscaCliente.getBotaoCancela().addActionListener(new CancelaBuscaListener());
        this.buscaCliente.getBotaoBusca().addActionListener(new BotaoBuscaListener());

        this.marcaC.getBotaoCancela().addActionListener(new CancelaConsultaListener());
        this.marcaC.getBotaoConfirma().addActionListener(new ConfirmaConsultaListener());

        this.cadastraA.getBotaoConfirma().addActionListener(new CadastraAnimalListener());
        this.cadastraA.getBotaoCancela().addActionListener(new CancelaAnimalListener());
        this.cadastraA.getRadioButtonCao().addActionListener(new SelecionaCaoListener());
        this.cadastraA.getRadioButtonGato().addActionListener(new SelecionaGatoListener());

    }

    class CadastraClienteJanelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();

            view.getDesktopPanel().add(cadastraC);
            cadastraC.setSize(457, 300);
            cadastraC.show();

        }
    }

    class BuscaClienteJanelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();

            view.getDesktopPanel().add(buscaCliente);
            buscaCliente.setSize(457, 300);
            buscaCliente.show();

        }
    }

    class CadastroAnimalJanelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();

            view.getDesktopPanel().add(cadastraA);
            cadastraA.setSize(457, 300);
            cadastraA.show();
        }
    }

    class MarcaConsultaJanelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();

            view.getDesktopPanel().add(marcaC);
            marcaC.setSize(457, 300);
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

            if (Nome.equals("") || CPF.equals("") || Telefone.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {

                clientesAtivos.add(atendente.atende(Nome, CPF, Telefone));

                limpaBufferCadastra();
                

                try {
                    testesql.insereCliente(Nome, CPF, Telefone);
                    clientesAtivos.add(atendente.atende(Nome, CPF, Telefone));
                    limpaBufferCadastra();
                    adicionaTabela(clientesAtivos.getLast());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    class CancelaCadastraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            limpaBufferCadastra();
        }
    }

    private void adicionaTabela(Cliente clientesAtivos) {
        this.tableModel.addCliente(clientesAtivos);

    }

    private void limpaBufferCadastra() {
        cadastraC.getTextoNome().setText("");
        cadastraC.getTextoCPF().setText("");
        cadastraC.getTextoTelefone().setText("");
    }

    private void limpaBufferBusca() {
        buscaCliente.getjTextField1().setText("");
        buscaCliente.getjTextField2().setText("");
        buscaCliente.getjTextField3().setText("");
    }

    class CancelaBuscaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            limpaBufferBusca();
        }

    }

    class ConfirmaBuscaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String NomeCliente = buscaCliente.getjTextField1().getText();

            if (NomeCliente.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            } else {
                clientesAtivos.add(atendente.atende(buscaCliente.getjTextField1().getText(), buscaCliente.getjTextField2().getText(),
                        buscaCliente.getjTextField3().getText()));

            }

        }

    }

    class BotaoBuscaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPF = buscaCliente.getjTextField1().getText();

            if (CPF.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            } else {
                try {
                    Cliente c = testesql.getClienteBanco(CPF);

                    if (c == null) {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!!!");
                    }
                    buscaCliente.getjTextField2().setText(c.getNome());
                    buscaCliente.getjTextField3().setText(c.getTelefone());

                    clientesAtivos.add(atendente.atende(buscaCliente.getjTextField1().getText(), buscaCliente.getjTextField2().getText(),
                            buscaCliente.getjTextField3().getText()));

                    limpaBufferBusca();

                    adicionaTabela(clientesAtivos.getLast());

                    buscaCliente.getjTextField2().setText(c.getNome());
                    buscaCliente.getjTextField3().setText(c.getTelefone());

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    class CancelaConsultaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            marcaC.getjTextField1().setText("");

        }
    }

    class ConfirmaConsultaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "Consulta Marcada!!!");

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

                cadastraA.getjTextField1().setText(cli.getNome());
                nomeAnimal = cadastraA.getjTextField4().getText();
                racaAnimal = cadastraA.getjTextField5().getText();

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
            view.getTabelaClientes().getSelectedRow();
            cadastraA.getjTextField1().setText(cli.getNome());

        }

    }

    public void limpaRadioButton() {
        cadastraA.getButtonGroup1().clearSelection();
    }

    private void limpaBufferCadastraAnimal() {
        cadastraA.getjTextField1().setText("");
        cadastraA.getjTextField4().setText("");
        cadastraA.getjTextField5().setText("");
    }

}
