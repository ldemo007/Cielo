package com.softwarecwb.cielo.response.model.enumerator;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(Integer.class)
public enum StatusTransacao {

	@XmlEnumValue(value = "0")TRANSACAO_CRIADA,
	@XmlEnumValue(value = "1")TRANSACAO_EM_ANDAMENTO,
	@XmlEnumValue(value = "2")TRANSACAO_AUTENTICADA,
	@XmlEnumValue(value = "3")TRANSACAO_NAO_AUTENTICADA,
	@XmlEnumValue(value = "4")TRANSACAO_AUTORIZADA,
	@XmlEnumValue(value = "5")TRANSACAO_NAO_AUTORIZADA,
	@XmlEnumValue(value = "6")TRANSACAO_CAPTURADA,
	@XmlEnumValue(value = "9")TRANSACAO_CANCELADA,
	@XmlEnumValue(value = "10")TRANSACAO_EM_AUTENTICACAO,
	@XmlEnumValue(value = "12")TRANSANCAO_EM_CANCELAMENTO
}
