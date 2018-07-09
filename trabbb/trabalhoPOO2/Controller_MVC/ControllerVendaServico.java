package Controller_MVC;

import Model_MVC.Servicos;
import View_MVC.TelaVendaServico;

public class ControllerVendaServico {
    
    private Servicos model;
    private TelaVendaServico view;
    
     public ControllerVendaServico(TelaVendaServico view) {
        this.view = view;
     }
}
