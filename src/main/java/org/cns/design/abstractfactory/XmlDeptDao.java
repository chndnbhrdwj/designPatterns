package org.cns.design.abstractfactory;

public class XmlDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving dept to xml");
    }
}
