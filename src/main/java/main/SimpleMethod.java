package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.rpc.ServiceException;

import org.apache.commons.io.IOUtils;
import com.google.gson.Gson;

import customPojo.ResultSpedID;
import customPojo.Spedid_idCollo;
import customPojo.shipmentPojo.chiamate.ConfirmRequest;
import customPojo.shipmentPojo.chiamate.CreateRequest;
import customPojo.shipmentPojo.chiamate.DeleteRequest;
import customPojo.shipmentPojo.risposte.ConfirmResult;
import customPojo.shipmentPojo.risposte.CreateResult;
import customPojo.shipmentPojo.risposte.DeleteResult;
import customPojo.trackingPojo.Tracking_Event;
import customPojo.trackingPojo.Tracking_SpedID;
import customPojo.trackingPojo.bolla.Assic;
import customPojo.trackingPojo.bolla.Bolla;
import customPojo.trackingPojo.bolla.Contra;
import customPojo.trackingPojo.bolla.DatiCons;
import customPojo.trackingPojo.bolla.DatiSped;
import customPojo.trackingPojo.bolla.Dest;
import customPojo.trackingPojo.bolla.Merc;
import customPojo.trackingPojo.bolla.Mitt;
import customPojo.trackingPojo.bolla.Rif;
import iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDLocator;
import iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServices;
import iseries.wsbeans.brt_trackingbybrtshipmentid.BrtTRACKINGBYBRTSHIPMENTIDInput;
import iseries.wsbeans.brt_trackingbybrtshipmentid.BrtTRACKINGBYBRTSHIPMENTIDResult;
import iseries.wsbeans.brt_trackingbybrtshipmentid.Eventi;
import iseries.wsbeans.brt_trackingbybrtshipmentid.Note;
import iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloLocator;
import iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServices;
import iseries.wsbeans.getidspedizionebyidcollo.GetidspedizionebyidcolloInput;
import iseries.wsbeans.getidspedizionebyidcollo.GetidspedizionebyidcolloResult;
import iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMALocator;
import iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServices;
import iseries.wsbeans.getidspedizionebyrma.GetidspedizionebyrmaInput;
import iseries.wsbeans.getidspedizionebyrma.GetidspedizionebyrmaResult;
import iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNLocator;
import iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServices;
import iseries.wsbeans.getidspedizionebyrmn.GetidspedizionebyrmnInput;
import iseries.wsbeans.getidspedizionebyrmn.GetidspedizionebyrmnResult;
import iseries.wsbeans.getlegendaesiti.GetLegendaEsitiLocator;
import iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServices;
import iseries.wsbeans.getlegendaesiti.GetlegendaesitiInput;
import iseries.wsbeans.getlegendaesiti.GetlegendaesitiResult;
import iseries.wsbeans.getlegendaesiti.LegendaESITO;
import iseries.wsbeans.getlegendaeventi.GetLegendaEventiLocator;
import iseries.wsbeans.getlegendaeventi.GetLegendaEventiServices;
import iseries.wsbeans.getlegendaeventi.GetlegendaeventiInput;
import iseries.wsbeans.getlegendaeventi.GetlegendaeventiResult;
import iseries.wsbeans.getlegendaeventi.LegendaEVENTO;

public class SimpleMethod {
	
	
	 public static DeleteResult CancellaSpedizione (DeleteRequest deleteRequest) throws IOException {
		 	Gson gsonParse = new Gson();
			URL url = new URL ("https://api.brt.it/rest/v1/shipments/delete");
						
			
		
		        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		        connection.setRequestMethod("PUT");
		        connection.setDoOutput(true);
		        connection.setRequestProperty("Content-Type", "application/json");
		        connection.setRequestProperty("Accept", "application/json");
		        
		        
		        OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
		        osw.write(gsonParse.toJson(deleteRequest));
		        osw.flush();
		        osw.close();
			
		        connection.getResponseCode();
		        
		        StringWriter writer = new StringWriter();
		        IOUtils.copy(connection.getInputStream(), writer,"utf-8");
			
		        return gsonParse.fromJson(writer.toString(), DeleteResult.class);
			
			
		 
	 }
	 
	 
	
	public static ConfirmResult ConfermaSpedizione(ConfirmRequest confirmRequest) throws IOException {
		Gson gsonParse = new Gson();
		URL url = new URL ("https://api.brt.it/rest/v1/shipments/shipment");
		
		
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        
        
        OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
        osw.write(gsonParse.toJson(confirmRequest));
        osw.flush();
        osw.close();
        connection.getResponseCode();
        
   
        StringWriter writer = new StringWriter();
        IOUtils.copy(connection.getInputStream(), writer,"utf-8");
	
        return gsonParse.fromJson(writer.toString(), ConfirmResult.class);
		
		
		
	}
	 
	 
	 
	
	public static CreateResult CreaSpedizione(CreateRequest createRequest) throws IOException {
		
		URL url = new URL ("https://api.brt.it/rest/v1/shipments/shipment");
		
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		
		
		con.setRequestMethod("POST");
		
		con.setRequestProperty("Content-Type", "application/json");
		
		con.setRequestProperty("Accept", "application/json");

		con.setDoOutput(true);
		
		Gson gsonParse = new Gson();
		
		
		try(OutputStream os = con.getOutputStream()) {
		    byte[] input = gsonParse.toJson(createRequest).getBytes("utf-8");
		    os.write(input, 0, input.length);			
		}
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
				    StringBuilder response = new StringBuilder();
				    String responseLine = null;
				    while ((responseLine = br.readLine()) != null) {
				        response.append(responseLine.trim());
				    }
				    
				    
				  return  gsonParse.fromJson(response.toString(),CreateResult.class);
				}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static String GetDescrizioneEsito (String LINGUA_ISO639_ALPHA2,int codiceEsito) throws ServiceException, RemoteException {
		
		GetlegendaesitiInput arg = new GetlegendaesitiInput(LINGUA_ISO639_ALPHA2, 0);
		
		GetLegendaEsitiLocator connector = new GetLegendaEsitiLocator();
		
		GetLegendaEsitiServices service = connector.getGetLegendaEsitiServicesPort();
		
		GetlegendaesitiResult res = service.getlegendaesiti(arg);
		
		
		for (LegendaESITO ev : res.getLEGENDA()) {
			
			if(codiceEsito==ev.getID()){
				return ev.getTESTO1().trim()+" "+ev.getTESTO2().trim();
			}
		}
		
		return "Code not Present In BartoliniCode";
		
	}
	
	
	
	
	public static String GetDescrizioneEvento (String LINGUA_ISO639_ALPHA2,String code) throws ServiceException, RemoteException {
		
		GetlegendaeventiInput arg = new GetlegendaeventiInput(LINGUA_ISO639_ALPHA2, "?");
		
		GetLegendaEventiLocator connector = new GetLegendaEventiLocator();
		
		GetLegendaEventiServices service = connector.getGetLegendaEventiServicesPort();
		
		GetlegendaeventiResult res = service.getlegendaeventi(arg);
		
		
		for (LegendaEVENTO ev : res.getLEGENDA()) {
			
			if(code.equals(ev.getID().trim())){
				return ev.getDESCRIZIONE().trim();
			}
		}
		
		return "Code not Present In BartoliniCode";
		
	}
	
	
	
	public static Spedid_idCollo GetSpedIDbyIdCollo(BigDecimal CLIENTE_ID,String IDCollo) throws ServiceException, RemoteException{
		
		GetidspedizionebyidcolloInput arg = new GetidspedizionebyidcolloInput(CLIENTE_ID, IDCollo);
		
		GetIdSpedizioneByIdColloLocator connector = new GetIdSpedizioneByIdColloLocator();
		
		GetIdSpedizioneByIdColloServices service = connector.getGetIdSpedizioneByIdColloServicesPort();
		
		GetidspedizionebyidcolloResult res =service.getidspedizionebyidcollo(arg);
		
		Spedid_idCollo result = new Spedid_idCollo();
		try{result.setEsito(res.getESITO());}catch (NullPointerException e) {}
		try{result.setIDSpedizione(res.getSPEDIZIONE_ID());}catch (NullPointerException e) {}
		try{result.setVersione(res.getVERSIONE());}catch (NullPointerException e) {}
		try{result.setAnnoSpedizione(res.getSPEDIZIONE_ANNO());}catch (NullPointerException e) {}
		
		return result;
		
		
	}
	
	
	
	public static ResultSpedID GetSpedIDbyRMN(BigDecimal CLIENTE_ID,BigDecimal RIFERIMENTO_MITTENTE_NUMERICO) throws ServiceException, RemoteException{
		
		GetidspedizionebyrmnInput arg = new GetidspedizionebyrmnInput(CLIENTE_ID, RIFERIMENTO_MITTENTE_NUMERICO);
		
		GetIdSpedizioneByRMNLocator connector = new GetIdSpedizioneByRMNLocator();
		
		GetIdSpedizioneByRMNServices service = connector.getGetIdSpedizioneByRMNServicesPort();
		
		GetidspedizionebyrmnResult res =service.getidspedizionebyrmn(arg);
		
		ResultSpedID result = new ResultSpedID();
		try{result.setEsito(res.getESITO());}catch (NullPointerException e) {}
		try{result.setIDspedizione(res.getSPEDIZIONE_ID());}catch (NullPointerException e) {}
		try{result.setVersione(res.getVERSIONE());}catch (NullPointerException e) {}
		
		
		return result;
		
		
	}

	public static ResultSpedID GetSpedIDbyRMA(BigDecimal CLIENTE_ID,String RIFERIMENTO_MITTENTE_ALFABETICO) throws ServiceException, RemoteException{
		
		GetidspedizionebyrmaInput arg = new GetidspedizionebyrmaInput(CLIENTE_ID, RIFERIMENTO_MITTENTE_ALFABETICO);
		
		GetIdSpedizioneByRMALocator connector = new GetIdSpedizioneByRMALocator();
		
		GetIdSpedizioneByRMAServices service = connector.getGetIdSpedizioneByRMAServicesPort();
		
		GetidspedizionebyrmaResult res =service.getidspedizionebyrma(arg);
		
		ResultSpedID result = new ResultSpedID();
		
		try{result.setEsito(res.getESITO());}catch (NullPointerException e) {}
		try{result.setIDspedizione(res.getSPEDIZIONE_ID());}catch (NullPointerException e) {}
		try{result.setVersione(res.getVERSIONE());}catch (NullPointerException e) {}
		
		
		return result;
		
		
	}
	
	
	
	
	public static Tracking_SpedID GetTrackingbySpedID(String LINGUA_ISO639_ALPHA2,String SPEDIZIONE_ANNO,String SPEDIZIONE_BRT_ID) throws ServiceException, RemoteException {
		
		BrtTRACKINGBYBRTSHIPMENTIDInput arg = new BrtTRACKINGBYBRTSHIPMENTIDInput(LINGUA_ISO639_ALPHA2, SPEDIZIONE_ANNO, SPEDIZIONE_BRT_ID);
		
		BRT_TrackingByBRTshipmentIDLocator connector = new BRT_TrackingByBRTshipmentIDLocator();
		
		BRT_TrackingByBRTshipmentIDServices service = connector.getBRT_TrackingByBRTshipmentIDServicesPort();
		
		BrtTRACKINGBYBRTSHIPMENTIDResult res = service.brt_trackingbybrtshipmentid(arg);
		
	
		Tracking_SpedID result = new Tracking_SpedID();
		
		
		
		
		
		Collection<String> note = new ArrayList<String>();
		
	try {	
		for (Note n : res.getLISTA_NOTE()) {
			
			try{note.add(n.getNOTA().getDESCRIZIONE());}catch (NullPointerException e) {}
		}} catch (NullPointerException e) {}
		
		
		result.setNote(note);
		
		Collection<Tracking_Event> eventi = new ArrayList<Tracking_Event>();
		
		try {
		for (Eventi even : res.getLISTA_EVENTI()) {
			Tracking_Event evento = new Tracking_Event();
			try{evento.setData(even.getEVENTO().getDATA());}catch (NullPointerException e) {}
			try{evento.setDescrizione(even.getEVENTO().getDESCRIZIONE());}catch (NullPointerException e) {}
			try{evento.setFiliale(even.getEVENTO().getFILIALE());}catch (NullPointerException e) {}
			try{evento.setID(even.getEVENTO().getID());}catch (NullPointerException e) {}
			try{evento.setOra(even.getEVENTO().getORA());}catch (NullPointerException e) {}
			eventi.add(evento);
		}} catch (NullPointerException e) {}
		result.setEventi(eventi);
		
	
		try{result.setContatore_eventi(res.getCONTATORE_EVENTI());}catch (NullPointerException e) {}
		try{result.setContatore_note(res.getCONTATORE_NOTE());}catch (NullPointerException e) {}
		try{result.setEsito(res.getESITO());}catch (NullPointerException e) {}
		try{result.setRisposta_timestamp(res.getRISPOSTA_TIMESTAMP());}catch (NullPointerException e) {}
		try{result.setVersione(res.getVERSIONE());}catch (NullPointerException e) {}
		
		//TODO BOLLA
		
		Bolla bolladoc = new Bolla();
		
		
		
		Assic assicurazione = new Assic();
		try{assicurazione.setAssicurazioneDivisa(res.getBOLLA().getASSICURAZIONE().getASSICURAZIONE_DIVISA());}catch (NullPointerException e) {}
		try{assicurazione.setImportoAssicurazione(res.getBOLLA().getASSICURAZIONE().getASSICURAZIONE_IMPORTO());}catch (NullPointerException e) {}
		bolladoc.setAssicurazione(assicurazione);
		
		
		
		Contra contrassegno = new Contra();
		try{contrassegno.setContrassegnoDivisa(res.getBOLLA().getCONTRASSEGNO().getCONTRASSEGNO_DIVISA());}catch (NullPointerException e) {}
		try{contrassegno.setContrassegnoImporto(res.getBOLLA().getCONTRASSEGNO().getCONTRASSEGNO_IMPORTO());}catch (NullPointerException e) {}
		try{contrassegno.setContrassegnoIncasso(res.getBOLLA().getCONTRASSEGNO().getCONTRASSEGNO_INCASSO());}catch (NullPointerException e) {}
		try{contrassegno.setContrassegnoParticolarita(res.getBOLLA().getCONTRASSEGNO().getCONTRASSEGNO_PARTICOLARITA());}catch (NullPointerException e) {}
		bolladoc.setContrassegno(contrassegno);
		
		
		
		DatiCons datiConsegna = new DatiCons();
		try{datiConsegna.setDataConsegnaMerce(res.getBOLLA().getDATI_CONSEGNA().getDATA_CONSEGNA_MERCE());}catch (NullPointerException e) {}
		try{datiConsegna.setDataConsegnaRichiesta(res.getBOLLA().getDATI_CONSEGNA().getDATA_CONS_RICHIESTA());}catch (NullPointerException e) {}
		try{datiConsegna.setDataTeoricaConsegna(res.getBOLLA().getDATI_CONSEGNA().getDATA_TEORICA_CONSEGNA());}catch (NullPointerException e) {}
		try{datiConsegna.setDescrizioneConsegnaRichiesta(res.getBOLLA().getDATI_CONSEGNA().getDESCRIZIONE_CONS_RICHIESTA());}catch (NullPointerException e) {}
		try{datiConsegna.setFirmatarioConsegna(res.getBOLLA().getDATI_CONSEGNA().getFIRMATARIO_CONSEGNA());}catch (NullPointerException e) {}
		try{datiConsegna.setOraConsegnaMerce(res.getBOLLA().getDATI_CONSEGNA().getORA_CONSEGNA_MERCE());}catch (NullPointerException e) {}
		try{datiConsegna.setOraConsegnaRichiesta(res.getBOLLA().getDATI_CONSEGNA().getORA_CONS_RICHIESTA());}catch (NullPointerException e) {}
		try{datiConsegna.setOraTeoricaConsegna_A(res.getBOLLA().getDATI_CONSEGNA().getORA_TEORICA_CONSEGNA_A());}catch (NullPointerException e) {}
		try{datiConsegna.setOraTeoricaConsegna_DA(res.getBOLLA().getDATI_CONSEGNA().getORA_TEORICA_CONSEGNA_DA());}catch (NullPointerException e) {}
		try{datiConsegna.setTipoConsegnaRichiesta(res.getBOLLA().getDATI_CONSEGNA().getTIPO_CONS_RICHIESTA());}catch (NullPointerException e) {}
		bolladoc.setDatiConsegna(datiConsegna);
		
		
		
		DatiSped datiSpedizione = new DatiSped();
		try{datiSpedizione.setCodiceFilialeArrivo(res.getBOLLA().getDATI_SPEDIZIONE().getCOD_FILIALE_ARRIVO());}catch (NullPointerException e) {}
		try{datiSpedizione.setDescrizioneStatoSpedizioneParte1(res.getBOLLA().getDATI_SPEDIZIONE().getDESCRIZIONE_STATO_SPED_PARTE1());}catch (NullPointerException e) {}
		try{datiSpedizione.setDescrizioneStatoSpedizioneParte2(res.getBOLLA().getDATI_SPEDIZIONE().getDESCRIZIONE_STATO_SPED_PARTE2());}catch (NullPointerException e) {}
		try{datiSpedizione.setFilialeArrivo(res.getBOLLA().getDATI_SPEDIZIONE().getFILIALE_ARRIVO());}catch (NullPointerException e) {}
		try{datiSpedizione.setFilialeArrivoURL(res.getBOLLA().getDATI_SPEDIZIONE().getFILIALE_ARRIVO_URL());}catch (NullPointerException e) {}
		try{datiSpedizione.setPorto(res.getBOLLA().getDATI_SPEDIZIONE().getPORTO());}catch (NullPointerException e) {}
		try{datiSpedizione.setServizio(res.getBOLLA().getDATI_SPEDIZIONE().getSERVIZIO());}catch (NullPointerException e) {}
		try{datiSpedizione.setSpedizioneData(res.getBOLLA().getDATI_SPEDIZIONE().getSPEDIZIONE_DATA());}catch (NullPointerException e) {}
		try{datiSpedizione.setSpedizioneID(res.getBOLLA().getDATI_SPEDIZIONE().getSPEDIZIONE_ID());}catch (NullPointerException e) {}
		try{datiSpedizione.setStatoSpedizioneParte1(res.getBOLLA().getDATI_SPEDIZIONE().getSTATO_SPED_PARTE1());}catch (NullPointerException e) {}
		try{datiSpedizione.setStatoSpedizioneParte2(res.getBOLLA().getDATI_SPEDIZIONE().getSTATO_SPED_PARTE2());}catch (NullPointerException e) {}
		try{datiSpedizione.setTipoPorto(res.getBOLLA().getDATI_SPEDIZIONE().getTIPO_PORTO());}catch (NullPointerException e) {}
		try{datiSpedizione.setTipoServizio(res.getBOLLA().getDATI_SPEDIZIONE().getTIPO_SERVIZIO());}catch (NullPointerException e) {}
		bolladoc.setDatiSpedizione(datiSpedizione);
		
		
		
		Dest destinatario = new Dest();
		try{destinatario.setCap(res.getBOLLA().getDESTINATARIO().getCAP());}catch (NullPointerException e) {}
		try{destinatario.setIndirizzo(res.getBOLLA().getDESTINATARIO().getINDIRIZZO());}catch (NullPointerException e) {}
		try{destinatario.setLocalita(res.getBOLLA().getDESTINATARIO().getLOCALITA());}catch (NullPointerException e) {}
		try{destinatario.setRagioneSociale(res.getBOLLA().getDESTINATARIO().getRAGIONE_SOCIALE());}catch (NullPointerException e) {}
		try{destinatario.setReferenteConsegna(res.getBOLLA().getDESTINATARIO().getREFERENTE_CONSEGNA());}catch (NullPointerException e) {}
		try{destinatario.setSiglaNazione(res.getBOLLA().getDESTINATARIO().getSIGLA_NAZIONE());}catch (NullPointerException e) {}
		try{destinatario.setSiglaProvincia(res.getBOLLA().getDESTINATARIO().getSIGLA_PROVINCIA());}catch (NullPointerException e) {}
		try{destinatario.setTelefonoReferente(res.getBOLLA().getDESTINATARIO().getTELEFONO_REFERENTE());}catch (NullPointerException e) {}
		bolladoc.setDestinatario(destinatario);
		
		
		
		
		Merc merce = new Merc();
		try{merce.setColli(res.getBOLLA().getMERCE().getCOLLI());}catch (NullPointerException e) {}
		try{merce.setNaturaMerce(res.getBOLLA().getMERCE().getNATURA_MERCE());}catch (NullPointerException e) {}
		try{merce.setPesoKG(res.getBOLLA().getMERCE().getPESO_KG());}catch (NullPointerException e) {}
		try{merce.setVolumeM3(res.getBOLLA().getMERCE().getVOLUME_M3());}catch (NullPointerException e) {}
		bolladoc.setMerce(merce);
		
		
		
		
		Mitt mittente = new Mitt();
		try{mittente.setCap(res.getBOLLA().getMITTENTE().getCAP());}catch (NullPointerException e) {}
		try{mittente.setCodice(res.getBOLLA().getMITTENTE().getCODICE());}catch (NullPointerException e) {}
		try{mittente.setIndirizzo(res.getBOLLA().getMITTENTE().getINDIRIZZO());}catch (NullPointerException e) {}
		try{mittente.setLocalita(res.getBOLLA().getMITTENTE().getLOCALITA());}catch (NullPointerException e) {}
		try{mittente.setRagioneSociale(res.getBOLLA().getMITTENTE().getRAGIONE_SOCIALE());}catch (NullPointerException e) {}
		try{mittente.setSiglaArea(res.getBOLLA().getMITTENTE().getSIGLA_AREA());}catch (NullPointerException e) {}
		bolladoc.setMittente(mittente);
		
		
		Rif riferimenti = new Rif();
		try{riferimenti.setRiferimentoMittenteAlfabetico(res.getBOLLA().getRIFERIMENTI().getRIFERIMENTO_MITTENTE_ALFABETICO());}catch (NullPointerException e) {}
		try{riferimenti.setRiferimentoMittenteNumerico(res.getBOLLA().getRIFERIMENTI().getRIFERIMENTO_MITTENTE_NUMERICO());}catch (NullPointerException e) {}
		try{riferimenti.setRiferimentoPartnerEstero(res.getBOLLA().getRIFERIMENTI().getRIFERIMENTO_PARTNER_ESTERO());}catch (NullPointerException e) {}
		bolladoc.setRiferimenti(riferimenti);
		

		
		result.setBolla(bolladoc);
		
		
		return result;
	}
	
	
	

}
