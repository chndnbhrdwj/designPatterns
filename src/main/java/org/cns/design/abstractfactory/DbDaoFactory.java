package org.cns.design.abstractfactory;

public class DbDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("emp")) {
            dao= new DbEmpDao();
        }
        if(type.equals("dept")) {
            dao= new DbDeptDao();
        }
        return dao;
    }
}
