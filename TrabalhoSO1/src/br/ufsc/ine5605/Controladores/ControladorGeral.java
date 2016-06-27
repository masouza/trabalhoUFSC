/*
 * Universidade Federal de Santa Catarina
 * Trabalho INE5605
 * 
 */
package br.ufsc.ine5605.Controladores;

/**
 *
 * @author renan
 */
public class ControladorGeral {
    private ControladorAcesso controladorAcesso;
    private ControladorFuncionario controladorFuncionario;

    public ControladorGeral() {
    controladorAcesso= new ControladorAcesso();
    controladorFuncionario= new ControladorFuncionario(this);
    }

    
    
    
    

    
    
    
    
    
    
    
    
    
    
}
