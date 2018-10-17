package com.model;

import java.io.Serializable;

public class IniConfigDTO implements Serializable{
	private String ini_type;
	private String ini_type_name;
	private String ini_class;
	private String ini_class_name;
	private String ini_code;
	private String ini_code_value;

	public String getIni_type() {
		return ini_type;
	}

	public void setIni_type(String ini_type) {
		this.ini_type = ini_type;
	}

	public String getIni_type_name() {
		return ini_type_name;
	}

	public void setIni_type_name(String ini_type_name) {
		this.ini_type_name = ini_type_name;
	}

	public String getIni_class() {
		return ini_class;
	}

	public void setIni_class(String ini_class) {
		this.ini_class = ini_class;
	}

	public String getIni_class_name() {
		return ini_class_name;
	}

	public void setIni_class_name(String ini_class_name) {
		this.ini_class_name = ini_class_name;
	}

	public String getIni_code() {
		return ini_code;
	}

	public void setIni_code(String ini_code) {
		this.ini_code = ini_code;
	}

	public String getIni_code_value() {
		return ini_code_value;
	}

	public void setIni_code_value(String ini_code_value) {
		this.ini_code_value = ini_code_value;
	}

}
