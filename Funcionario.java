/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
private int matricula;
private static int proxMatricula = 1;
private String nome;
private String cpf;
private String senha;
public Funcionario(){
    
}
public Funcionario(String nome, String cpf, String senha){
    this.matricula = proxMatricula++;
    setNome(nome);
    setCpf(cpf);
    this.senha = senha;
}


    public int getMatricula() {
        return matricula;
    }

    public static int getProxMatricula() {
        return proxMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
public boolean validarSenha(String senhaDigitada){
  return senha != null && senha.equals(senhaDigitada);
} public abstract String getTipoAcesso();
}
