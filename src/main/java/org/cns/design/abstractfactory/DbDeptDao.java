package org.cns.design.abstractfactory;

public class DbDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving dept to db");
    }
}
