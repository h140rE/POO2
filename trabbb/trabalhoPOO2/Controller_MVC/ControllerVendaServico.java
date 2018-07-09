package Controller_MVC;

import Model_MVC.Servicos;
import View_MVC.TelaVendaServico;

public class ControllerVendaServico {
    
    private Servicos model;
    private TelaVendaServico view;
    
     public ControllerVendaServico(Servicos model, TelaVendaServico view) {
        this.model = model;
        this.view = view;
     }
}
