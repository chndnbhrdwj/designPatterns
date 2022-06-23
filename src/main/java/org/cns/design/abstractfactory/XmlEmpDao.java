package org.cns.design.abstractfactory;

public class XmlEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving employee to xml");
    }
}
