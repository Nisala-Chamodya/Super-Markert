package lk.blacky.supermarkert.util;

import lk.blacky.supermarkert.entity.Customer;
import lk.blacky.supermarkert.entity.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguaration {
        private static  FactoryConfiguaration factoryConfiguaration;
        private final SessionFactory sessionFactory;
        private FactoryConfiguaration(){
                Configuration configuration = new Configuration().configure()
                        .addAnnotatedClass(Customer.class)//xml file eka loard karagannawa
                        .addAnnotatedClass(Item.class);//xml file eka loard karagannawa
                sessionFactory= configuration.buildSessionFactory();
        }

        public static FactoryConfiguaration getInstance(){
                return (factoryConfiguaration==null) ? factoryConfiguaration=new FactoryConfiguaration()
                        :  factoryConfiguaration;
        }
  public Session getSession() {
                return sessionFactory.openSession();
  }






}
