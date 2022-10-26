package kodlama_ioDemo.dataAccess;

import kodalama_ioDemo.entities.Cursus;

public class HibernateCursusDao implements CursusDao{
    @Override
    public void add(Cursus cursus) {
        System.out.println("Hıbernate ile veritabanina eklendi.");

    }
}
