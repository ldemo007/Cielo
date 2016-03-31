package com.softwarecwb.cielo.request.model.enumerador;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(Integer.class)
public enum Indicador {
	
	@XmlEnumValue(value = "0")NAO_INFORMADO,
	@XmlEnumValue(value = "1")INFORMADO,
	@XmlEnumValue(value = "2")ILEGIVEL,
	@XmlEnumValue(value = "9")INEXISTENTE
	
}
