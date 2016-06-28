/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.telas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import br.ufsc.ine5605.Controladores.ControladorGeral;
import br.ufsc.ine5606.telas.TelaMenuFuncionario;
import java.awt.FlowLayout;

/**
 *
 * @author Matheus
 */
public class TelaMenuPrincipal extends JFrame {

    private ControladorGeral owner;
    private Container container;
    private JButton jbTelaCargo;
    private JButton jbTelaFuncionario;
    private JButton jbTelaAcesso;
    private JButton jbDefineHoras;
    private GerenciadorBotoes gerenciadorBotoes;

    private enum comandos {
        TELACARGO, TELAFUNCIONARIO, TELAACESSO, DEFINEHORAS;
    };

    public TelaMenuPrincipal(ControladorGeral owner) {
        super("Menu Principal");
        this.owner = owner;
        gerenciadorBotoes = new GerenciadorBotoes(this);
        container = getContentPane();

        configura();
    }
    
    
    public ControladorGeral getControladorGeral(){
        return owner;
    }

    public void configura() {
        container.setLayout(new FlowLayout());
        jbTelaAcesso = new JButton("Acesso");
        jbTelaCargo = new JButton("Cargo");
        jbTelaFuncionario = new JButton("Funcionario");
        jbDefineHoras = new JButton("Hora Atual");

        container.add(jbTelaAcesso);
        container.add(jbTelaCargo);
        container.add(jbTelaFuncionario);
        container.add(jbDefineHoras);

        jbTelaAcesso.addActionListener(gerenciadorBotoes);
        jbTelaAcesso.setActionCommand(comandos.TELAACESSO.name());
        jbTelaCargo.addActionListener(gerenciadorBotoes);
        jbTelaCargo.setActionCommand(comandos.TELACARGO.name());
        jbTelaFuncionario.addActionListener(gerenciadorBotoes);
        jbTelaFuncionario.setActionCommand(comandos.TELAFUNCIONARIO.name());
        jbDefineHoras.addActionListener(gerenciadorBotoes);
        jbDefineHoras.setActionCommand(comandos.DEFINEHORAS.name());

        setResizable(true);
        setSize(400, 80);

        mostra();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void mostra() {
        setVisible(true);
    }

    public void esconde() {
        setVisible(false);
    }

    public class GerenciadorBotoes implements ActionListener {

        private final TelaMenuPrincipal owner;
        private TelaMenuCargo telaMC;
        private TelaMenuFuncionario telaMF;
        private TelaEntrar telaE;

        public GerenciadorBotoes(TelaMenuPrincipal owner) {
            this.owner = owner;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ControladorGeral controladorGeral = owner.getControladorGeral();
            if (e.getActionCommand().equals(comandos.TELAACESSO.name())) {
                owner.esconde();
                telaE = new TelaEntrar(controladorGeral);
                telaE.inicia();
            } else if (e.getActionCommand().equals(comandos.TELACARGO.name())) {
                owner.esconde();
                telaMC = new TelaMenuCargo(owner);
            } else if (e.getActionCommand().equals(comandos.TELAFUNCIONARIO.name())) {
                owner.esconde();
                telaMF = new TelaMenuFuncionario(owner);
            } else if (e.getActionCommand().equals(comandos.DEFINEHORAS.name())) {
                //owner.esconde();
                
            }

        }

    }

}
