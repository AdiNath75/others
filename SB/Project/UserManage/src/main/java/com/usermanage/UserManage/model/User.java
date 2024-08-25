package com.usermanage.UserManage.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

@Entity
@ToString
@Table(name = "User_Details")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "User_Name")
	private String username;
	
	@Column(name = "User_Email")
	private String useremail;
	
	@Column(name = "create_date", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;
	
	@Column(name = "update_date", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
	
	@Column(name = "isActive_Switch")
	private Character isActive;
	
	

	public User() {
		
	}

	public User(Integer id, String username, String useremail, LocalDate createDate, LocalDate updateDate,
			Character isActive) {
		super();
		this.id = id;
		this.username = username;
		this.useremail = useremail;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.isActive = isActive;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", useremail=" + useremail + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", isActive=" + isActive + "]";
	}
	
	
	
}
