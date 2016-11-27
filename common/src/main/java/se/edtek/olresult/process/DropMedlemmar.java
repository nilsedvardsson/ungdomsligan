package se.edtek.olresult.process;

import se.edtek.olresult.db.LopareDAO;

public class DropMedlemmar extends AbstractProcess {

    public void run() {
        getDBI().onDemand(LopareDAO.class).deleteAll();
    }

    public static void main(String[] args) {
        new DropMedlemmar().run();
    }
}
