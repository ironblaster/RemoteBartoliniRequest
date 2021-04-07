package main;

import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.RemoteException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.xml.rpc.ServiceException;

import customPojo.ResultSpedID;
import customPojo.Spedid_idCollo;
import customPojo.shipmentPojo.chiamate.ConfirmRequest;
import customPojo.shipmentPojo.chiamate.CreateRequest;
import customPojo.shipmentPojo.chiamate.DeleteRequest;
import customPojo.shipmentPojo.risposte.ConfirmResult;
import customPojo.shipmentPojo.risposte.CreateResult;
import customPojo.shipmentPojo.risposte.DeleteResult;
import customPojo.trackingPojo.Tracking_SpedID;
import remoteRequest.BrtRequestRemote;

@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class BrtRequest implements BrtRequestRemote{

	@Override
	public ResultSpedID GetSpedIDbyRMN(BigDecimal CLIENTE_ID, BigDecimal RIFERIMENTO_MITTENTE_NUMERICO) throws ServiceException, RemoteException {
		return SimpleMethod.GetSpedIDbyRMN(CLIENTE_ID, RIFERIMENTO_MITTENTE_NUMERICO);
	}

	@Override
	public Tracking_SpedID GetTrackingbySpedID(String LINGUA_ISO639_ALPHA2, String SPEDIZIONE_ANNO,String SPEDIZIONE_BRT_ID) throws ServiceException, RemoteException {
		return SimpleMethod.GetTrackingbySpedID(LINGUA_ISO639_ALPHA2, SPEDIZIONE_ANNO, SPEDIZIONE_BRT_ID);
	}
	
	@Override
	public Spedid_idCollo GetSpedIDbyIdCollo(BigDecimal CLIENTE_ID,String IDCollo) throws ServiceException, RemoteException{
		return SimpleMethod.GetSpedIDbyIdCollo(CLIENTE_ID, IDCollo);
	}

	@Override
	public String GetDescrizioneEvento(String LINGUA_ISO639_ALPHA2, String code) throws ServiceException, RemoteException {
		return SimpleMethod.GetDescrizioneEvento(LINGUA_ISO639_ALPHA2, code);
	
	}

	@Override
	public String GetDescrizioneEsito(String LINGUA_ISO639_ALPHA2, int codiceEsito) throws ServiceException, RemoteException {
		return SimpleMethod.GetDescrizioneEsito(LINGUA_ISO639_ALPHA2, codiceEsito);
	}

	@Override
	public ResultSpedID GetSpedIDbyRMA(BigDecimal CLIENTE_ID, String RIFERIMENTO_MITTENTE_ALFABETICO) throws ServiceException, RemoteException {
		return SimpleMethod.GetSpedIDbyRMA(CLIENTE_ID, RIFERIMENTO_MITTENTE_ALFABETICO);
		
	}

	@Override
	public DeleteResult CancellaSpedizione(DeleteRequest deleteRequest) throws IOException {
		return SimpleMethod.CancellaSpedizione(deleteRequest);
	}

	@Override
	public ConfirmResult ConfermaSpedizione(ConfirmRequest confirmRequest) throws IOException {
		return SimpleMethod.ConfermaSpedizione(confirmRequest);
	}

	@Override
	public CreateResult CreaSpedizione(CreateRequest createRequest) throws IOException {
		return SimpleMethod.CreaSpedizione(createRequest);
	}

}
