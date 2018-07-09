package Main;

import Model_MVC.*;
import Controller_MVC.*;
import View_MVC.*;

public class TrabalhoPoo {

    public static void main(String[] args) {

 
        
        
        Cliente cli = new Cliente("Pedro", 123, 3322-1122);
        Atendente at = new Atendente("Joao", 321, 1233-1233, 1);
        ContrataServico c = new ContrataServico();
        ListaConsulta consultas = new ListaConsulta();
        
        cli.AdicionaAnimal("lilica", "vira-lata", "cao");
        cli.AdicionaAnimal("xanim", "siames", "gato");
        cli.AdicionaAnimal("julio", "pit-bull", "cao");
        
        cli.setRecibo(at.criaRecibo());
        cli.listaAnimais();
        cli.setRecibo(c.banho(cli.getRecibo()));
        cli.setRecibo(c.consulta(cli.getRecibo()));
        cli.setRecibo(c.hotel(cli.getRecibo(), 5));
        cli.setRecibo(c.tosa(cli.getRecibo()));
        cli.setRecibo(c.banho(cli.getRecibo()));
        cli.setRecibo(c.venda(cli.getRecibo(),135,"batata"));
        
        at.Imprime(cli);
        

    }

}
