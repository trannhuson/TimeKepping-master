package com.timekeep.timekeeping.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;

	@Id
	private Long code;

	@Column
	private String name;

	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	@OneToMany(mappedBy = "user")
	private List<UserLog> userLogs;

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<UserLog> getUserLogs() {
		return userLogs;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public void setUserLogs(List<UserLog> userLogs) {
		this.userLogs = userLogs;
	}
}
