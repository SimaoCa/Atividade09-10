/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;


import java.io.IOException;
import java.util.List;
import model.Funcionario;

/**
 *
 * @author Aluno
 */
public interface IFuncionario {
    public void salvar(Funcionario funcionario) throws IOException;
    public List<Funcionario> listar() throws IOException;
    public void atualizar(Funcionario funcionarioAlterado) throws IOException;
    public void excluir (int id)throws IOException;
}
