package Model_MVC;

public class Pessoa {

	private String nome;

	private int CPF;

	private int telefone;

        public Pessoa(String nome, int CPF, int telefone){
            this.nome = nome;
            this.CPF = CPF;
            this.telefone = telefone;
        }
        
        public String getNome(){
            return this.nome;
        }
        public int getCPF(){
            return this.CPF;
        }
        public int getTelefone(){
            return this.telefone;
        }
        
        public void atualizaNome(String s){
            nome = s;
        }
        public void atualizaCPF(int n){
            this.CPF = n;
        }
        public void atualizaTelefone(int n){
            this.telefone = n;
        }


}



