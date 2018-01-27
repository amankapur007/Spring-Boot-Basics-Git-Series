package com.learners007.reservations.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROOM_ID")
	private long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "ROOM_NUMBER")
	private String number;
	@Column(name = "BED_INFO")
	private String bedInfo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBedInfo() {
		return bedInfo;
	}

	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Room(long id, String name, String number, String bedInfo) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.bedInfo = bedInfo;
	}

	protected Room() {
	}

}
