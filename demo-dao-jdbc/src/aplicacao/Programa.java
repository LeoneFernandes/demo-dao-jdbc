package aplicacao;

import java.util.Date;

import modelDao.DaoFactory;
import modelDao.SellerDao;
import modelEntidade.Department;
import modelEntidade.Seller;

public class Programa {

    public static void main(String[] args) {
     
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);


    }

}
