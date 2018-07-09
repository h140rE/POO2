package Controller_MVC;

import Model_MVC.Veterinario;
import View_MVC.TelaConsulta;

public class ControllerConsulta {
    
    private TelaConsulta view;
    private Veterinario model;
    
    public ControllerConsulta(TelaConsulta view,Veterinario model) {
        this.view = view;
        this.model = model;
    }

}
