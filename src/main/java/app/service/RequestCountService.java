package app.service;

public interface RequestCountService {
    void incrementCounter();
    int getCountOfRequests();
}
