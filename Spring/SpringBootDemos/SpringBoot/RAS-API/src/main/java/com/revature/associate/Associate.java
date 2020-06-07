package com.revature.associate;

import java.util.Arrays;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Cacheable(true)
public class Associate {
	
	public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer associateId;
	
	@Column
	private String username;
    @JsonIgnore
	private String password;
	private Integer trackId;
	private boolean enabled;

    @JsonIgnore
    private String[] roles;
	
	public Associate() {}

	
	
	public Associate(Integer associateId, String username, String password, Integer trackId, boolean enabled,
			String[] roles) {
		super();
		this.associateId = associateId;
		this.username = username;
		setPassword(password);
		this.trackId = trackId;
		this.enabled = enabled;
		this.roles = roles;
	}
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = PASSWORD_ENCODER.encode(password);
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", username=" + username + ", trackId=" + trackId
				+ ", enabled=" + enabled + ", roles=" + Arrays.toString(roles) + "]";
	}
	
	
	
}
