package org.cns.design.abstractfactory;

public class XmlDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("emp")) {
            dao= new XmlEmpDao();
        }
        if(type.equals("dept")) {
            dao= new XmlDeptDao();
        }
        return dao;
    }
}
