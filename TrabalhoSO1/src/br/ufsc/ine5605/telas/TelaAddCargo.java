/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.telas;

import br.ufsc.ine5605.codigos.TipoCargo;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author UFSC-420
 */
public class TelaAddCargo extends JFrame {

    private JButton adicionar;
    private JButton voltar;
    private JTextField TFCod;
    private JTextField TFNome;
    private JLabel labelTipo;
    private JLabel labelCod;
    private JLabel labelNome;
    private JComboBox<Object> boxDeCargo;
    private TipoCargo tipo;
    Container janela = getContentPane();

    public TelaAddCargo() {
        super("Adicionar Cargo");
        adicionar = new JButton("Adicionar");
        voltar = new JButton("Voltar");

        TFCod = new JTextField();
        TFNome = new JTextField();
        labelTipo = new JLabel("Tipo: ");
        labelCod = new JLabel("Codigo: ");
        labelNome = new JLabel("Nome: ");
        boxDeCargo = new JComboBox<Object>();
        configurar();
    }

    public void configurar() {

        boxDeCargo.addItem(tipo.Gerencial);
        boxDeCargo.addItem(tipo.Padrao);
        boxDeCargo.addItem(tipo.SemAcesso);

        setLayout(null);
        TFCod.setBounds(95, 40, 100, 20);
        TFNome.setBounds(95, 80, 100, 20);
        boxDeCargo.setBounds(95, 120, 100, 20);
        labelTipo.setBounds(50, 120, 100, 20);
        labelCod.setBounds(50, 40, 100, 20);
        labelNome.setBounds(50, 80, 100, 20);

        adicionar.setBounds(30, 200, 90, 20);
        voltar.setBounds(130, 200, 90, 20);

        janela.add(adicionar);
        janela.add(voltar);
        janela.add(TFCod);
        janela.add(TFNome);
        janela.add(labelCod);
        janela.add(labelNome);
        janela.add(boxDeCargo);
        janela.add(labelTipo);
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void inicia() {
        setVisible(true);
    }

    public static void main(String[] args) {
        TelaAddCargo teste = new TelaAddCargo();
        teste.inicia();
    }

}
