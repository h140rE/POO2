package Model_MVC;

import javax.swing.JOptionPane;

public class Atendente extends Funcionario {

    public Atendente(String nome, int cpf, int telefone, int idFunc) {
        super(nome, cpf, telefone, idFunc);
    }

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

	public void marcaConsulta(String CPFDono,String data,String hora) {
            JOptionPane.showMessageDialog(null,"Marcado Consulta: "+ CPFDono + " " + data + " " + hora);
	}

        public void cadastrar(String Nome,String CPF,String Telefone,String NomeCachorro,String Raca){
            JOptionPane.showMessageDialog(null,"Cadastrado no Banco: "+ Nome + " " + CPF + " " + Telefone + " " + NomeCachorro + " " + Raca);
        }
        
        public Recibo criaRecibo(){
            return new Recibo();
        }
}
