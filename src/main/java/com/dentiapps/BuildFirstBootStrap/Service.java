package com.dentiapps.BuildFirstBootStrap;

import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

	private String url = "https://jsonplaceholder.typicode.com/posts/1";

	RestTemplate restTemplate = new RestTemplate();

	// Mapping the post model to the JSON object from the remote.
	Post post = restTemplate.getForObject(url, Post.class);

	int showUserId() {
		return post.getUserId();
	}

	int showId() {
		return post.getId();
	}

	String showTitle() {
		return post.getTitle();
	}

	String showBody() {
		return post.getBody();
	}

	public String showName(String name) {

		return name;
	}

}
