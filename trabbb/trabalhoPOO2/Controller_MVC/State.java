package Controller_MVC;

public abstract class State {

	String descricao;
        private Animal animal;
        
        public State(Animal animal){
            this.animal = animal;
        }
        
        public Animal getAnimal(){
            return animal;
        }
        /*private void setDescricao(String descricao){
            this.descricao = descricao;
        }*/
        public String getDescricao(){
            return descricao;
        }
	public abstract void setEstadoAguardando();
        public abstract void setEstadoEmBanho();
        public abstract void setEstadoEmConsulta();
        public abstract void setEstadoEmEstadia();
        public abstract void setEstadoFinalizado();

}
