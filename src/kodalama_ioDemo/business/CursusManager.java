package kodalama_ioDemo.business;

import core.loding.Logger;
import kodalama_ioDemo.entities.Cursus;
import kodlama_ioDemo.dataAccess.CursusDao;

public class CursusManager {
    private CursusDao cursusDao;
    private Logger[] loggers;


    public CursusManager(CursusDao cursusDao, Logger[] loggers) {
        this.cursusDao = cursusDao;
       this.loggers=loggers;

    }

    public void add(Cursus cursus) throws Exception {
        if (cursus.getPrice() < 0) {
            throw new Exception("Kursun fiyati 0 dan kucuk olamaz.");
        }

        cursusDao.add(cursus);

        for (Logger logger : loggers) {
            logger.log(cursus.getCategory());
        }
    }

}



