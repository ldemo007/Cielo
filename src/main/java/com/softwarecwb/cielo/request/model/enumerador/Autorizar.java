package com.softwarecwb.cielo.request.model.enumerador;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(Integer.class)
public enum Autorizar {

	@XmlEnumValue(value = "0") NAO_AUTORIZAR, 
	@XmlEnumValue(value = "1") AUTORIZAR_SOMENTE_SE_AUTENTICADA, 
	@XmlEnumValue(value = "2") AUTORIZAR_AUTENTICADA_E_NAO_AUTENTICADA, 
	@XmlEnumValue(value = "3") AUTORIZAR_SEM_PASSAR_POR_AUTENTICACAO, 
	@XmlEnumValue(value = "4") TRANSACAO_RECORRENTE,

}
