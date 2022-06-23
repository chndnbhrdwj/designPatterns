package org.cns.design.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String type) {
        DaoAbstractFactory daoAbstractFactory = null;
        if(type.equals("xml")) {
            daoAbstractFactory = new XmlDaoFactory();
        }
        if(type.equals("db")) {
            daoAbstractFactory = new DbDaoFactory();
        }
        return daoAbstractFactory;
    }
}
