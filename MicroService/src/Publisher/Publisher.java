package Publisher;

import javax.xml.ws.Endpoint;

import db.Controller;


public class Publisher {

		public static void main(String[] args) {
			Endpoint.publish("http://localhost:1234/MicroService", new Controller());

		}
	}
	

