package com.bookstore.springbootlibrary.requestmodels;

import lombok.Data;

@Data
public class AdminQuestionRequest {

    private Long id;

    private String response;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "AdminQuestionRequest [id=" + id + ", response=" + response + "]";
	}

    
    
}
