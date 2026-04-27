package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){ // esconder a implementação
        return new SellerDaoJDBC();
    }
}
