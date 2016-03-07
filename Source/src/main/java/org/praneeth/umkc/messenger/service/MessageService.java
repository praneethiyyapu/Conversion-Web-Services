package org.praneeth.umkc.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.praneeth.umkc.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello World", "Praneeth");
		Message m2 = new Message(2L, "Hello API", "Praneeth");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}

}
