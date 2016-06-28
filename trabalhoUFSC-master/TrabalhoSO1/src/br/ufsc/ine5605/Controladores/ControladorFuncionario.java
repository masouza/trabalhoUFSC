/*
 * Universidade Federal de Santa Catarina
 * Trabalho INE5605
 * 
 */
package br.ufsc.ine5605.Controladores;

import br.ufsc.ine5605.codigos.Cargo;
import br.ufsc.ine5605.codigos.Funcionario;
import br.ufsc.ine5605.codigos.TipoCargo;
import br.ufsc.ine5605.telas.TelaAddFuncionario;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author renan
 */
public class ControladorFuncionario {

    private HashMap<Integer, Funcionario> funcionarios = new HashMap<>();
    private HashMap<Integer, Cargo> cargos = new HashMap<>();
    private TelaAddFuncionario telaAddFuncionario;
    private ControladorGeral owner;

    public ControladorFuncionario(ControladorGeral owner) {
        this.telaAddFuncionario = new TelaAddFuncionario(this);
        this.owner = owner;
    }

    public HashMap<Integer, Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(HashMap<Integer, Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public HashMap<Integer, Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(HashMap<Integer, Cargo> cargos) {
        this.cargos = cargos;
    }

    public TelaAddFuncionario getTelaFuncionario() {
        return telaAddFuncionario;
    }

    public void setTelaFuncionario(TelaAddFuncionario telaFuncionario) {
        this.telaAddFuncionario = telaFuncionario;
    }

    public ControladorGeral getOwner() {
        return owner;
    }

    public void setOwner(ControladorGeral owner) {
        this.owner = owner;
    }

    public void addFuncionario(Integer matricula, String nome, long telefone, float salario, Date nascimento) {
        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(matricula);
        funcionario.setNome(nome);
        funcionario.setTelefone(telefone);
        funcionario.setSalario(salario);
        funcionario.setNascimento(nascimento);
        //funcionario.setCargo(cargo);
        funcionarios.put(matricula, funcionario);
    }

    public void addCargo(Integer codigo, String nome, TipoCargo tipoCargo){
    Cargo cargo = new Cargo();
        cargo.setCodigo(codigo);
        cargo.setNome(nome);
        cargo.setTipoCargo(tipoCargo);
        cargos.put(codigo, cargo);
    
    }

    public boolean verificaCargo(int codigo) {
        if (!cargos.containsKey(codigo)) {
            return true;
        }

        return false;
    }

}
