package com.app.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ConsumerClientTest {
	
	public static void main(String[] args) {
		String url="http://localhost:2500/ProviderEx25-05-2018/rest/msg/show";
		Client c=Client.create();
		WebResource wr=c.resource(url);
		ClientResponse cr=wr.get(ClientResponse.class);
		String str=cr.getEntity(String.class);
		System.out.println(str);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		
		
	}

}
