/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.telas;

/**
 *
 * @author Matheus
 */
import br.ufsc.ine5605.Controladores.ControladorFuncionario;
import br.ufsc.ine5605.telas.TelaMenuPrincipal;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import br.ufsc.ine5605.Controladores.ControladorGeral;
import java.awt.FlowLayout;

public class TelaMenuCargo extends JFrame {

    private TelaMenuPrincipal owner;
    private Container container;
    private JButton jbAdd;
    private JButton jbDel;
    private JButton jbEdit;
    private JButton jbList;
    private JButton jbBack;
    private GerenciadorBotoes gerenciadorBotoes;

    private enum comandos {
        ADD, DEL, EDIT, LIST, BACK;
    };

    public TelaMenuCargo(TelaMenuPrincipal owner) {
        super("Menu Cargo");
        this.owner = owner;
        gerenciadorBotoes = new GerenciadorBotoes();
        container = getContentPane();
        configura();
    }

    public void configura() {
        container.setLayout(new FlowLayout());
        jbAdd = new JButton("Cadastrar");
        jbDel = new JButton("Deletar");
        jbEdit = new JButton("Editar");
        jbList = new JButton("Lista");
        jbBack = new JButton("Voltar");

        container.add(jbAdd);
        container.add(jbDel);
        container.add(jbEdit);
        container.add(jbList);
        container.add(jbBack);

        jbAdd.addActionListener(gerenciadorBotoes);
        jbAdd.setActionCommand(comandos.ADD.name());

        jbDel.addActionListener(gerenciadorBotoes);
        jbDel.setActionCommand(comandos.DEL.name());

        jbEdit.addActionListener(gerenciadorBotoes);
        jbEdit.setActionCommand(comandos.EDIT.name());

        jbList.addActionListener(gerenciadorBotoes);
        jbList.setActionCommand(comandos.LIST.name());

        jbBack.addActionListener(gerenciadorBotoes);
        jbBack.setActionCommand(comandos.BACK.name());

        setSize(500, 130);

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

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals(comandos.ADD.name())) {

            } else if (e.getActionCommand().equals(comandos.DEL.name())) {

            } else if (e.getActionCommand().equals(comandos.EDIT.name())) {

            } else if (e.getActionCommand().equals(comandos.LIST.name())) {

            } else if (e.getActionCommand().equals(comandos.BACK.name())) {

            }

        }

    }

}
