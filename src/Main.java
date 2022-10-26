import core.loding.DatabaseLogger;
import core.loding.FileLogger;
import core.loding.Logger;
import core.loding.MailLogger;
import kodalama_ioDemo.business.CursusManager;
import kodalama_ioDemo.entities.Cursus;
import kodlama_ioDemo.dataAccess.CursusDao;
import kodlama_ioDemo.dataAccess.JdbcCursusDao;

public class Main {

    public static void main(String[] args) throws Exception {
        Cursus cursus1 = new Cursus("Java", "Engin", 1000);
        Cursus cursus2= new Cursus("C#+Angular","Murat",5000);
        Cursus cursus3=new Cursus("Java+React","Ahmet",3000);

        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        CursusManager cursusManager = new CursusManager(new JdbcCursusDao(),loggers);
        cursusManager.add(cursus3);


        }
    }

    

