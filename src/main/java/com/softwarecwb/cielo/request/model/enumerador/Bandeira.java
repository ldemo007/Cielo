package com.softwarecwb.cielo.request.model.enumerador;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum(String.class)
public enum Bandeira {
	visa,mastercard,diners,discover,elo,amex,jcb,aura
}
