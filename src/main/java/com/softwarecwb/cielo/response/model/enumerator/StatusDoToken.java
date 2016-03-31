package com.softwarecwb.cielo.response.model.enumerator;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(Integer.class)
public enum StatusDoToken {

	@XmlEnumValue(value = "0") BLOQUEADO, 
	@XmlEnumValue(value = "1") DESBLOQUEADO
}
