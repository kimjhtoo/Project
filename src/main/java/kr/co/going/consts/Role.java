package kr.co.going.consts;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER"),
	READY("ROLE_READY");
	
	private String value;
}
