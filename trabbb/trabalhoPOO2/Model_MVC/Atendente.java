package Model_MVC;

import javax.swing.JOptionPane;

public class Atendente extends Funcionario {

	public void atende() {

	}

	public Cliente verificaeCadastra(int CPF) {
		return null;
	}

	public void recebeServicos() {

	}

	public boolean recebePagamento() {
		return false;
	}

	public void Imprime(Recibo r) {

	}

	public void marcaConsulta(String data) {

	}

        public void cadastrar(String Nome,String CPF,String Telefone){
            JOptionPane.showMessageDialog(null,"Cadastrado no Banco: "+ Nome + " " + CPF + " " + Telefone);
        }
        
}
