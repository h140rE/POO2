/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Model_MVC.*;
/**
 *
 * @author higor
 */
public class TrabalhoPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal1;
        animal1 = new Cao("Pedro", "lilica", "vira-lata");
        animal1.estadoAtual();
        //animal1.getEstado().setEstadoAguardando();
        animal1.getEstado().setEstadoEmBanho();
        animal1.estadoAtual();
        animal1.getEstado().setEstadoEmEstadia();
        animal1.estadoAtual();
        
    }
    
}
