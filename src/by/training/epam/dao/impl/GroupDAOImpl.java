package by.training.epam.dao.impl;

import by.training.epam.bean.Client;

import java.util.ArrayList;

public class GroupDAOImpl {

    private ArrayList<Client> clientList;

    public GroupDAOImpl() {
        clientList = new ArrayList<>();
    }

    public GroupDAOImpl(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    public boolean addClient(Client client) {
        if (client != null) {
            clientList.add(client);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupDAOImpl group = (GroupDAOImpl) o;
        return clientList.equals(group.clientList);
    }

    @Override
    public int hashCode() {
        return clientList.hashCode();
    }

    @Override
    public String toString() {
        return "Group{" +
                "clientList=" + clientList +
                '}';
    }

}