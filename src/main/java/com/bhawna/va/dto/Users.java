package com.bhawna.va.dto;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "users", type = "users", shards = 1)

public class Users {
    private Long id;

	private String messages;
	private String vaMessages;
	
	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


	public String getVaMessages() {
		return vaMessages;
	}

	public void setVaMessages(String vaMessages) {
		this.vaMessages = vaMessages;
	}

	public Users(String messages,String vaMessages, Long id) {

        this.messages = messages;
        this.id = id;
        this.vaMessages = vaMessages;

    }

    public Users() {

    }


}
