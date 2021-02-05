package app.service;

import app.dao.CounterDao;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleRequestCountService implements RequestCountService {
    @Autowired
    private CounterDao counterDao;

    public void incrementCounter() {
        int currentCount = counterDao.getRequestCount() + 1;
        counterDao.setRequestCount(currentCount);
    }

    public int getCountOfRequests() {
        return counterDao.getRequestCount();
    }
}
