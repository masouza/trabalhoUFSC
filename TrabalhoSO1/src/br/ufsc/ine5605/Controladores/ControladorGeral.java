/*
 * Universidade Federal de Santa Catarina
 * Trabalho INE5605
 * 
 */
package br.ufsc.ine5605.Controladores;

import java.util.Date;

/**
 *
 * @author renan
 */
public class ControladorGeral {
    private ControladorAcesso controladorAcesso;
    private ControladorFuncionario controladorFuncionario;
    private Date horaAtual;
    
    
    public ControladorGeral() {
    controladorAcesso= new ControladorAcesso();
    controladorFuncionario= new ControladorFuncionario(this);
    }

    public Date getHoraAtual() {
        return horaAtual;
    }

    public void setHoraAtual(Date horaAtual) {
        this.horaAtual = horaAtual;
    }

    public void entrar(int matricula) {
        
    }

    
    
    
    

    
    
    
    
    
    
    
    
    
    
}
