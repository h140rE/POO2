package Controller_MVC;

import Model_MVC.Servicos;
import View_MVC.TelaVendasProdutos;

public class ControllerVendaProdutos {
    
    
    private Servicos model;
    private TelaVendasProdutos view;
    
     public ControllerVendaProdutos(Servicos model, TelaVendasProdutos view) {
        this.model = model;
        this.view = view;
}
     
}
