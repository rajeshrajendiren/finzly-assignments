

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main  {

    public static void main(String[] args) {

        try {
            Configuration config = new Configuration();
            config.configure();
            SessionFactory sf = config.buildSessionFactory();
            getData(sf);


        }
        catch (Exception e) {
            System.out.println("Exception occured"+ e);
        }


    }
    // to insert Data
    public static void  saveData(SessionFactory sf) {

        Record l =new Record( 2,"virat","virat@gmail");

        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();

        session.save(l);
        tr.commit();
        session.close();

    }


    public static void  updateData(SessionFactory sf) {

        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();

        Record s1 = session.get(Record.class, 3);
        s1.setName("abc");

        session.save(s1);
        tr.commit();
        session.close();

    }
    public static void  getData(SessionFactory sf) {

        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Record s1 = session.get(Record.class,2);

        System.out.println(s1);
        session.close();

    }



    public static void  deleteData(SessionFactory sf) {

        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Record s1 = session.get(Record.class,7);

        session.delete(s1);
        session.close();

    }

}