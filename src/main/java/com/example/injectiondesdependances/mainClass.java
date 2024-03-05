package com.example.injectiondesdependances;

public class mainClass {

    public static void main(String[] args) {
        Service service = new ServiceB();
        Client client = new ClientA(service);
        client.doSomething();

        ((ClientA) client).setService(new ServiceD());
        client.doSomething();
    }
}
