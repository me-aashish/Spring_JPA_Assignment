package com.aashish.springboot.springjpaassignment.entities;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
@EntityListeners(value = { AuditingEntityListener.class })
public class Auditable {
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@Column(name = "created_on", updatable = false)
	private Timestamp created_on;

	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	@Column(name = "updated_on")
	private Timestamp updated_on;

	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
	
	@JsonFormat(pattern = "MM-dd-yyyy HH:mm", timezone = "IST")
	public Timestamp getCreated_on() {

		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}
	@JsonFormat(pattern = "MM-dd-yyyy HH:mm", timezone = "IST")
	public Timestamp getUpdated_on() {
				return updated_on;
	}

	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}
	
	
}
