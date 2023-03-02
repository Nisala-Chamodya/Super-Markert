import lk.blacky.supermarkert.entity.Customer;
import lk.blacky.supermarkert.entity.Item;
import lk.blacky.supermarkert.util.FactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setId("c001");
        customer1.setName("Nisala");
        customer1.setAddress("bandaragama");
        customer1.setSalary(5000);


        Customer customer2 = new Customer();
        customer2.setId("c002");
        customer2.setName("Tharani");
        customer2.setAddress("panadura");
        customer2.setSalary(25000);



        Item item1 = new Item();
        item1.setCode("i001");
        item1.setDescription("biscuit");
        item1.setPrice(500);
        item1.setQty(5);



        Item item2 = new Item();
        item2.setCode("i002");
        item2.setDescription("cake");
        item2.setPrice(600);
        item2.setQty(10);



        Session session = FactoryConfiguaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //customer save
        //session.save(customer2);


        //item save
     //   session.save(item2);

        //customer update
       // session.update(customer1);

        //item update
       // session.update(item1);

        //customer get
       /* Customer c001 = session.get(Customer.class, "c001");
        System.out.println(c001);*/


        //item get
        /*Item i001 = session.get(Item.class, "i001");
        System.out.println(i001);*/


        //customer delete
      /*Customer customer=  new Customer();
      customer.setId("c002");
        session.delete(customer);*/

        //item delete

//        Item i002 = session.get(Item.class, "i002");
//        session.delete(i002);


        transaction.commit();
        session.close();


    }
}
