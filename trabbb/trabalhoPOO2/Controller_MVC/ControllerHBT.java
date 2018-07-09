package Controller_MVC;

import Model_MVC.Cuidador;
import View_MVC.TelaHBT;

public class ControllerHBT {
    
    private TelaHBT view;
    private Cuidador model;
    
     public ControllerHBT(TelaHBT view,Cuidador model) {
        this.view = view;
        this.model = model;
     }
    
}
