package model;

import javax.persistence.Entity;

@Entity
public class Node {
	Long id;
	String hostname;
	
	
	public Node(Long id, String hostname) {
		super();
		this.id = id;
		this.hostname = hostname;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	
}
