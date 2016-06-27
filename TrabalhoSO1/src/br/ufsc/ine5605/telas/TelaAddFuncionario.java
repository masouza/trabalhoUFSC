/*
 * Universidade Federal de Santa Catarina
 * Trabalho INE5605
 * 
 */
package br.ufsc.ine5605.telas;

import br.ufsc.ine5605.Controladores.ControladorFuncionario;
import br.ufsc.ine5605.Controladores.ControladorGeral;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Wellington
 */
public class TelaAddFuncionario extends JFrame {

    private ControladorFuncionario owner;

    private JLabel labelMat;
    private JLabel labelNome;
    private JLabel labelTel;
    private JLabel labelNasc;
    private JLabel labelSal;
    private JLabel labelCar;
    private JButton buttonConf;
    private JButton buttonVolt;
    private Container janela;
    private JFormattedTextField jFMatricula;
    private JFormattedTextField jFTelefone;
    private JFormattedTextField jFData;
    private JFormattedTextField jFNome;
    private JFormattedTextField jFSalario;
    private JFormattedTextField jFCargo;

    public TelaAddFuncionario(ControladorFuncionario owner) {
        super("Adicionar Funcionario");
        this.owner = owner;
        labelMat = new JLabel("Matricula: ");
        labelNome = new JLabel("Nome: ");
        labelTel = new JLabel("Telefone: ");
        labelNasc = new JLabel("Nascimento: ");
        labelSal = new JLabel("Salario: ");
        labelCar = new JLabel("Codigo Cargo: ");
        buttonConf = new JButton("Adicionar");
        buttonVolt = new JButton("Voltar");
        janela = getContentPane();
        configura();
    }

    public void configura() {

        setLayout(null);

        //Define os rótulos dos botões
        buttonConf.setBounds(20, 300, 90, 20);
        buttonVolt.setBounds(160, 300, 90, 20);

        labelMat.setBounds(50, 40, 100, 20);
        labelTel.setBounds(50, 80, 100, 20);
        labelNome.setBounds(50, 120, 100, 20);
        labelNasc.setBounds(50, 160, 100, 20);
        labelSal.setBounds(50, 200, 100, 20);
        labelCar.setBounds(50, 240, 100, 20);

        //Define as máscaras
        MaskFormatter mascaraMat = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraData = null;
        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraSal = null;
        MaskFormatter mascaraCar = null;
        try {
            mascaraMat = new MaskFormatter("########");
            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraNome = new MaskFormatter("************************************");
            mascaraSal = new MaskFormatter("#####");
            mascaraCar = new MaskFormatter("########");
            mascaraTel.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');
        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        //Seta as máscaras nos objetos JFormattedTextField
        jFMatricula = new JFormattedTextField(mascaraMat);
        jFTelefone = new JFormattedTextField(mascaraTel);
        jFData = new JFormattedTextField(mascaraData);
        jFNome = new JFormattedTextField(mascaraNome);
        jFSalario = new JFormattedTextField(mascaraSal);
        jFCargo = new JFormattedTextField(mascaraCar);

        jFMatricula.setBounds(150, 40, 100, 20);
        jFTelefone.setBounds(150, 80, 100, 20);
        jFNome.setBounds(150, 120, 100, 20);
        jFData.setBounds(150, 160, 100, 20);
        jFSalario.setBounds(150, 200, 100, 20);
        jFCargo.setBounds(150, 240, 100, 20);

        //Adiciona os rótulos e os campos de textos com máscaras na tela
        janela.add(labelMat);
        janela.add(labelNome);
        janela.add(labelTel);
        janela.add(labelNasc);
        janela.add(labelNome);
        janela.add(labelSal);
        janela.add(labelCar);
        janela.add(buttonConf);
        janela.add(buttonVolt);
        janela.add(jFMatricula);
        janela.add(jFTelefone);
        janela.add(jFData);
        janela.add(jFNome);
        janela.add(jFSalario);
        janela.add(jFCargo);
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonConf.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jFTelefone.getText();
                String words[] = text.split(" #@_\\/.*");
                String teste="";
                
               

                JOptionPane.showMessageDialog(jFData, text);

                int matricula = Integer.parseInt(jFMatricula.getText());
                String nome = jFNome.getText();
                int telefone = Integer.parseInt(text);
                float salario = Float.parseFloat(jFSalario.getText());

                String valida = labelMat.getText();
                if (valida != "") {
                    owner.addFuncionario(matricula, nome, telefone, salario);
                    JOptionPane.showMessageDialog(jFData, labelMat.getText());
                } else {
                    JOptionPane.showMessageDialog(jFData, "Preencha todos os Campos");
                }
            }

        });

    }

    public void inicia() {
        setVisible(true);
    }

}
