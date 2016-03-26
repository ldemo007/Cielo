package com.softwarecwb.cielo.request;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;
import org.hibernate.cfg.Environment;

import com.softwarecwb.cielo.response.RespostaTransacao;

public abstract class RequisicaoTransacao {

	private static final int _1_SEGUNDO = 1000;

	private static final int _CONNECTION_TIMEOUT = 10 * _1_SEGUNDO;

	private static final int _READ_TIMEOUT = 40 * _1_SEGUNDO;

	private static HttpClient httpClient;

	static {
		httpClient = new HttpClient();
		httpClient.setHttpConnectionManager(new MultiThreadedHttpConnectionManager());
		httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(_CONNECTION_TIMEOUT);
		httpClient.getHttpConnectionManager().getParams().setSoTimeout(_READ_TIMEOUT);
		httpClient.getHttpConnectionManager().closeIdleConnections(_1_SEGUNDO);
	}

	public RespostaTransacao enviarParaCielo(boolean debug) {

		String url = null;

		if (debug)
			url = "https://qasecommerce.cielo.com.br/servicos/ecommwsec.do";
		else
			url = Environment.getProperties().getProperty("cielo.urlprod");

		String mensagem = this.ToXML();
		System.out.println(mensagem);

		PostMethod httpMethod = new PostMethod(url);
		httpMethod.addParameter("mensagem", mensagem);

		try {
			httpClient.executeMethod(httpMethod);
			String respostaXml = httpMethod.getResponseBodyAsString();

			System.out.println(respostaXml);

		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private String ToXML() {
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(this.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");

			StringWriter writer = new StringWriter();
			jaxbMarshaller.marshal(this, writer);

			return writer.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
			return e.getMessage();
		}

	}
}
