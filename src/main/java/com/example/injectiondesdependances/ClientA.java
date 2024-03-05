package com.example.injectiondesdependances;

public class ClientA implements Client{
    Service service;
    public ClientA(Service service) {
        this.service = service;
    }
    @Override
    public void doSomething() {
        String info = service.getInfo();
    }
    public void setService(Service service) {
        this.service = service;
    }
}
