package modelDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import modelDao.SellerDao;
import modelEntidade.Department;
import modelEntidade.Seller;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void inserir(Seller obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public void atualizar(Seller obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conn.prepareStatement(
                "SELECT seller.*,department.Name as DepName "
                + "FROM seller INNER JOIN department "
                + "ON seller.DepartmentId = department.Id "
                + "WHERE seller.Id = ?");

                st.setInt(1, id);
                rs = st.executeQuery();
                if(rs.next()){
                    Department dep = new Department();
                    dep.setId(rs.getInt("DepartmentId"));
                    dep.setName(rs.getString("DepName"));
                    Seller obj = new Seller();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Name"));
                    obj.setEmail(rs.getString("Email"));
                    obj.setbaseSalary(rs.getDouble("BaseSalary"));
                    obj.setBirthDate(rs.getDate("BirthDate"));
                    obj.setDepartment(dep);
                    return obj;

                }
                return null;
        }
        catch(SQLException e){
            throw new DbException(e.getMessage());
        }

        finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }

    @Override
    public List<Seller> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    

}
