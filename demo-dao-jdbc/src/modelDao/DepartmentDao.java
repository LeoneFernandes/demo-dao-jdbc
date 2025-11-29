package modelDao;

import java.util.List;

import modelEntidade.Department;

public interface DepartmentDao {

    void inserir(Department obj); //responsável por inserir o banco de dados
    void atualizar(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id); //responsável por pegar esse Id e consultar no banco de dados o objeto com esse Id, se existir vai retornar, senao vai retornar nulo;
    List<Department> findAll(); //pra retornar todos os departamentos

}
