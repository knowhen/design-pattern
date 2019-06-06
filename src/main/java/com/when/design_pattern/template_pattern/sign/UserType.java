package com.when.design_pattern.template_pattern.sign;

import java.security.InvalidParameterException;

public enum UserType {
	NORMAL(1, "普通用户"), VIP(2, "会员用户");
	private int key;
	private String type;

	UserType(int key, String type) {
		this.key = key;
		this.type = type;
	}

	public int getKey() {
		return key;
	}

	public String getType() {
		return type;
	}

	public static UserType getByKey(int key) {
		for (UserType type : UserType.values()) {
			if (type.getKey() == key) {
				return type;
			}
		}
		throw new InvalidParameterException("无效的参数类型");
	}
}
