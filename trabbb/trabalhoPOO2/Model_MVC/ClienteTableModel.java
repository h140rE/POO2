/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_MVC;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author higor
 */
public class ClienteTableModel extends AbstractTableModel {

     LinkedList<Cliente> linhas;
     private String[] colunas = new String[] {"Nome","CPF","Telefone"};
     private static final int NOME = 0;
     private static final int CPF = 1;
     private static final int TELEFONE = 2;
    
     public ClienteTableModel(){
         linhas = new LinkedList<Cliente>();
     }
     public ClienteTableModel(LinkedList<Cliente> listaClientes){
         linhas = new LinkedList<Cliente>(listaClientes);
     }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

   


    @Override
    public String getColumnName(int i) {
        return colunas[i]; 
    }
    
     

    @Override
    public Class<?> getColumnClass(int columIndex) {
        switch(columIndex){
        case NOME:
            return String.class;
        case CPF:
            return String.class;
        case TELEFONE:
            return String.class;
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
   

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false; 
    }
    
    
     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        Cliente cliente = linhas.get(rowIndex);
 
         switch (columnIndex) {
            case NOME:
            return cliente.getNome();
            case CPF:
            return cliente.getCPF();
            case TELEFONE:
            return cliente.getTelefone();
        default:
        
        throw new IndexOutOfBoundsException("columnIndex out of bounds");
    }
}
    
    // Retorna o sócio referente a linha especificada
    public Cliente getCliente(int indiceLinha) {
    return linhas.get(indiceLinha);
}
 
// Adiciona o sócio especificado ao modelo
    public void addCliente(Cliente cliente) {
    // Adiciona o registro.
    linhas.add(cliente);
 
    // Pega a quantidade de registros e subtrai 1 para
    // achar o último índice. A subtração é necessária
    // porque os índices começam em zero.
    int ultimoIndice = getRowCount() - 1;
 
    // Notifica a mudança.
    fireTableRowsInserted(ultimoIndice, ultimoIndice);
}
 
// Remove o sócio da linha especificada.
    public void removeCliente(int indiceLinha) {
    // Remove o registro.
    linhas.remove(indiceLinha);
 
    // Notifica a mudança.
    fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
 
// Adiciona uma lista de sócios no final da lista.
    public void addListaDeClientes(LinkedList<Cliente> clientes) {
    // Pega o tamanho antigo da tabela, que servirá
    // como índice para o primeiro dos novos registros
    int indice = getRowCount();
 
    // Adiciona os registros.
    linhas.addAll(clientes);
 
    // Notifica a mudança.
    fireTableRowsInserted(indice, indice + clientes.size());
    }
 
// Remove todos os registros.
    public void limpar() {
    // Remove todos os elementos da lista de sócios.
    linhas.clear();
 
    // Notifica a mudança.
    fireTableDataChanged();
    }
    

}
