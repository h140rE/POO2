package Controller_MVC;

import Model_MVC.Servicos;
import View_MVC.TelaBanhoTosa;

public class ControllerBanhoTosa {
    
    private Servicos model;
    private TelaBanhoTosa view;
    
     public ControllerBanhoTosa(Servicos model, TelaBanhoTosa view) {
        this.model = model;
        this.view = view;
     }
    
}
