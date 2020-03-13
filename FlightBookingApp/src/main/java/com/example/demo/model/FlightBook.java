package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class FlightBook {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long fid;
private String fname;
private String source;
private String destination;
private int  availableseats;
private Date availabledate;
private Double price;
public Long getFid() {
	return fid;
}
public void setFid(Long fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getAvailableseats() {
	return availableseats;
}
public void setAvailableseats(int availableseats) {
	this.availableseats = availableseats;
}
public Date getAvailabledate() {
	return availabledate;
}
public void setAvailabledate(Date availabledate) {
	this.availabledate = availabledate;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}



}
