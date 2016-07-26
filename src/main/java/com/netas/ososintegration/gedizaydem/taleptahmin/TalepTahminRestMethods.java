package com.netas.ososintegration.gedizaydem.taleptahmin;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;


public class TalepTahminRestMethods {
	
	public String getServiceTicket(String server, String ticketGrantingTicket, String service) {
        if (ticketGrantingTicket.isEmpty())
            return null;
        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod(server+"/"+ticketGrantingTicket);
        post.setRequestBody(new NameValuePair[]{new NameValuePair("service", service)});
        try {
            client.executeMethod(post);
            String response = post.getResponseBodyAsString();
            switch (post.getStatusCode()) {
                case 200:
                    return response;
                default:
                    System.out.println("Invalid response code ( "+post.getStatusCode()+" ) from CAS server!");
                    System.out.println("Response (1k): " + response.substring(0, Math.min(1024, response.length())));
                    break;
            }
        } catch (final IOException e) {
        	System.err.println(e.getMessage());
        } finally {
            post.releaseConnection();
        }
        return null;
    }


    public String getTicketGrantingTicket(String server, String username, String password) {
        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod(server);
        post.setRequestBody(new NameValuePair[]{new NameValuePair("username", username), new NameValuePair("password", password)});
        try {
            client.executeMethod(post);
            String response = post.getResponseBodyAsString();
            switch (post.getStatusCode()) {
                case 201:
                    int starAction=response.indexOf("v1/tickets/");
                    int endAction=response.indexOf("\" method");
                    if (starAction!=-1 && endAction!=-1){
                    	return response.substring(starAction+11,endAction);                    	
                    }
                    break;
                default:
                	System.out.println("Invalid response code ("+post.getStatusCode()+") from CAS server!");
                	System.out.println("Response:"+ response);
                    break;
            }
        } catch (final IOException e) {
        	System.err.println(e.getMessage());
        } finally {
            post.releaseConnection();
        }
        return null;
    }

}
