package org.cns.design.abstractfactory;

public class DbEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving employee to db");
    }
}
