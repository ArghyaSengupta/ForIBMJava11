package com.java11.practice;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Feature1 {

	//HTPClient
	//Body Publisher + BodyHandler
	//format of request
	public String post(String url, String data) throws IOException, InterruptedException {
		  HttpClient client = HttpClient.newHttpClient();

		  //atleast 2/3 questions
		  HttpRequest request =
		      HttpRequest.newBuilder()
		          .uri(URI.create(url))
		          .header("Content-Type", "application/json")
		          .POST(BodyPublishers.ofString(data))
		          .build();

		  //body handler
		  HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		  //200,400.404,500
		  if (response.statusCode() != 200) {
		    throw new IOException("HTTP response status: " + response.statusCode());
		  }

		  return response.body();
		}
}
