package org.cns.design.abstractfactory;

public class UnitTest {

    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
        Dao dao = daf.createDao("dept");
        dao.save();
    }
}
