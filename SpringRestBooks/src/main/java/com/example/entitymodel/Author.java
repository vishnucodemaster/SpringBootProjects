package com.example.entitymodel;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//@Embeddable
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int authorId;
	
	@Column(name="first_name")
private String firstName;
private String lastName;
private String language;
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

}
