package com.habuma.spittr.service;

import java.rmi.RemoteException;

public interface GreetService extends java.rmi.Remote {

    String sayHello(String name) throws RemoteException;

}