package modelDao;

import java.util.List;

import modelEntidade.Department;
import modelEntidade.Seller;

public interface SellerDao {

    void insert(Seller obj); //responsável por inserir o banco de dados
    void atualizar(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id); //responsável por pegar esse Id e consultar no banco de dados o objeto com esse Id, se existir vai retornar, senao vai retornar nulo;
    List<Seller> findAll(); //pra retornar todos os Vendedors
    List<Seller> findByDepartment(Department department);
    

}
