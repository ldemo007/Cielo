package com.softwarecwb.cielo.request.model.enumerador;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(String.class)
public enum CodigoProduto {

	@XmlEnumValue(value = "1")CODIGO_A_VISTA,
	@XmlEnumValue(value = "2")PARCELADO_LOJA,
	@XmlEnumValue(value = "A")DEBITO
}
