package kodlama_ioDemo.dataAccess;

import kodalama_ioDemo.entities.Cursus;

public class JdbcCursusDao implements CursusDao {
    @Override
    public void add(Cursus cursus) {
        System.out.println("Jdbc ile veritabanina eklendi.");
    }
}
