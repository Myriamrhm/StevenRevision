package com.simplon.model.client;

import java.util.ArrayList;

public interface IClientRepository {
	
	public void ajouterClient(Client client);
	public void supprimerClient(String nom);
	public void modifierClient(String nom);
	public Client retournerClient(String nom);
	public ArrayList<Client> listDesClient();
}
