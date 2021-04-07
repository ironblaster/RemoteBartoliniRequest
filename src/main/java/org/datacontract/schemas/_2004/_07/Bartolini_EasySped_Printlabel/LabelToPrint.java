/**
 * LabelToPrint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel;

public class LabelToPrint  implements java.io.Serializable {
    private java.lang.Integer annoSpedizione;

    private java.lang.String codiceErrore;

    private java.lang.String codiceIsoNazione;

    private java.lang.String codiceProdotto;

    private java.util.Calendar dataSpedizione;

    private java.lang.String descrizioneErrore;

    private java.lang.String destinatarioCap;

    private java.lang.String destinatarioIndirizzo;

    private java.lang.String destinatarioLocalita;

    private java.lang.String destinatarioProvincia;

    private java.lang.String destinatarioRagioneSociale;

    private java.lang.String flagRistampa;

    private java.lang.String flagVolumeBollettato;

    private java.lang.Integer meseGiornoSpedizione;

    private java.lang.String mittenteProvincia;

    private java.lang.String mittenteRagioneSociale;

    private java.lang.Long numeroRifNumerico;

    private java.lang.Integer numeroSegnaCollo;

    private java.lang.Integer numeroSegnaColloDi;

    private java.lang.Integer numeroSerie;

    private java.lang.Integer numeroSpedizione;

    private java.lang.Integer POArrivo;

    private java.lang.String POArrivoDescrizione;

    private java.lang.Integer POPartenza;

    private java.lang.String POPartenzaDescrizione;

    private java.lang.Integer POSegnacollo;

    private java.math.BigDecimal peso;

    private java.lang.Integer terminalArrivo;

    private org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.LabelToPrintTipiEtichetta tipoEtichetta;

    private java.lang.String tipoServizioBolle;

    private java.lang.String tipoStampaNetwork;

    private java.lang.Integer totaleSegnaColli;

    private java.math.BigDecimal volume;

    private java.lang.Integer zonaSegnaCollo;

    public LabelToPrint() {
    }

    public LabelToPrint(
           java.lang.Integer annoSpedizione,
           java.lang.String codiceErrore,
           java.lang.String codiceIsoNazione,
           java.lang.String codiceProdotto,
           java.util.Calendar dataSpedizione,
           java.lang.String descrizioneErrore,
           java.lang.String destinatarioCap,
           java.lang.String destinatarioIndirizzo,
           java.lang.String destinatarioLocalita,
           java.lang.String destinatarioProvincia,
           java.lang.String destinatarioRagioneSociale,
           java.lang.String flagRistampa,
           java.lang.String flagVolumeBollettato,
           java.lang.Integer meseGiornoSpedizione,
           java.lang.String mittenteProvincia,
           java.lang.String mittenteRagioneSociale,
           java.lang.Long numeroRifNumerico,
           java.lang.Integer numeroSegnaCollo,
           java.lang.Integer numeroSegnaColloDi,
           java.lang.Integer numeroSerie,
           java.lang.Integer numeroSpedizione,
           java.lang.Integer POArrivo,
           java.lang.String POArrivoDescrizione,
           java.lang.Integer POPartenza,
           java.lang.String POPartenzaDescrizione,
           java.lang.Integer POSegnacollo,
           java.math.BigDecimal peso,
           java.lang.Integer terminalArrivo,
           org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.LabelToPrintTipiEtichetta tipoEtichetta,
           java.lang.String tipoServizioBolle,
           java.lang.String tipoStampaNetwork,
           java.lang.Integer totaleSegnaColli,
           java.math.BigDecimal volume,
           java.lang.Integer zonaSegnaCollo) {
           this.annoSpedizione = annoSpedizione;
           this.codiceErrore = codiceErrore;
           this.codiceIsoNazione = codiceIsoNazione;
           this.codiceProdotto = codiceProdotto;
           this.dataSpedizione = dataSpedizione;
           this.descrizioneErrore = descrizioneErrore;
           this.destinatarioCap = destinatarioCap;
           this.destinatarioIndirizzo = destinatarioIndirizzo;
           this.destinatarioLocalita = destinatarioLocalita;
           this.destinatarioProvincia = destinatarioProvincia;
           this.destinatarioRagioneSociale = destinatarioRagioneSociale;
           this.flagRistampa = flagRistampa;
           this.flagVolumeBollettato = flagVolumeBollettato;
           this.meseGiornoSpedizione = meseGiornoSpedizione;
           this.mittenteProvincia = mittenteProvincia;
           this.mittenteRagioneSociale = mittenteRagioneSociale;
           this.numeroRifNumerico = numeroRifNumerico;
           this.numeroSegnaCollo = numeroSegnaCollo;
           this.numeroSegnaColloDi = numeroSegnaColloDi;
           this.numeroSerie = numeroSerie;
           this.numeroSpedizione = numeroSpedizione;
           this.POArrivo = POArrivo;
           this.POArrivoDescrizione = POArrivoDescrizione;
           this.POPartenza = POPartenza;
           this.POPartenzaDescrizione = POPartenzaDescrizione;
           this.POSegnacollo = POSegnacollo;
           this.peso = peso;
           this.terminalArrivo = terminalArrivo;
           this.tipoEtichetta = tipoEtichetta;
           this.tipoServizioBolle = tipoServizioBolle;
           this.tipoStampaNetwork = tipoStampaNetwork;
           this.totaleSegnaColli = totaleSegnaColli;
           this.volume = volume;
           this.zonaSegnaCollo = zonaSegnaCollo;
    }


    /**
     * Gets the annoSpedizione value for this LabelToPrint.
     * 
     * @return annoSpedizione
     */
    public java.lang.Integer getAnnoSpedizione() {
        return annoSpedizione;
    }


    /**
     * Sets the annoSpedizione value for this LabelToPrint.
     * 
     * @param annoSpedizione
     */
    public void setAnnoSpedizione(java.lang.Integer annoSpedizione) {
        this.annoSpedizione = annoSpedizione;
    }


    /**
     * Gets the codiceErrore value for this LabelToPrint.
     * 
     * @return codiceErrore
     */
    public java.lang.String getCodiceErrore() {
        return codiceErrore;
    }


    /**
     * Sets the codiceErrore value for this LabelToPrint.
     * 
     * @param codiceErrore
     */
    public void setCodiceErrore(java.lang.String codiceErrore) {
        this.codiceErrore = codiceErrore;
    }


    /**
     * Gets the codiceIsoNazione value for this LabelToPrint.
     * 
     * @return codiceIsoNazione
     */
    public java.lang.String getCodiceIsoNazione() {
        return codiceIsoNazione;
    }


    /**
     * Sets the codiceIsoNazione value for this LabelToPrint.
     * 
     * @param codiceIsoNazione
     */
    public void setCodiceIsoNazione(java.lang.String codiceIsoNazione) {
        this.codiceIsoNazione = codiceIsoNazione;
    }


    /**
     * Gets the codiceProdotto value for this LabelToPrint.
     * 
     * @return codiceProdotto
     */
    public java.lang.String getCodiceProdotto() {
        return codiceProdotto;
    }


    /**
     * Sets the codiceProdotto value for this LabelToPrint.
     * 
     * @param codiceProdotto
     */
    public void setCodiceProdotto(java.lang.String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }


    /**
     * Gets the dataSpedizione value for this LabelToPrint.
     * 
     * @return dataSpedizione
     */
    public java.util.Calendar getDataSpedizione() {
        return dataSpedizione;
    }


    /**
     * Sets the dataSpedizione value for this LabelToPrint.
     * 
     * @param dataSpedizione
     */
    public void setDataSpedizione(java.util.Calendar dataSpedizione) {
        this.dataSpedizione = dataSpedizione;
    }


    /**
     * Gets the descrizioneErrore value for this LabelToPrint.
     * 
     * @return descrizioneErrore
     */
    public java.lang.String getDescrizioneErrore() {
        return descrizioneErrore;
    }


    /**
     * Sets the descrizioneErrore value for this LabelToPrint.
     * 
     * @param descrizioneErrore
     */
    public void setDescrizioneErrore(java.lang.String descrizioneErrore) {
        this.descrizioneErrore = descrizioneErrore;
    }


    /**
     * Gets the destinatarioCap value for this LabelToPrint.
     * 
     * @return destinatarioCap
     */
    public java.lang.String getDestinatarioCap() {
        return destinatarioCap;
    }


    /**
     * Sets the destinatarioCap value for this LabelToPrint.
     * 
     * @param destinatarioCap
     */
    public void setDestinatarioCap(java.lang.String destinatarioCap) {
        this.destinatarioCap = destinatarioCap;
    }


    /**
     * Gets the destinatarioIndirizzo value for this LabelToPrint.
     * 
     * @return destinatarioIndirizzo
     */
    public java.lang.String getDestinatarioIndirizzo() {
        return destinatarioIndirizzo;
    }


    /**
     * Sets the destinatarioIndirizzo value for this LabelToPrint.
     * 
     * @param destinatarioIndirizzo
     */
    public void setDestinatarioIndirizzo(java.lang.String destinatarioIndirizzo) {
        this.destinatarioIndirizzo = destinatarioIndirizzo;
    }


    /**
     * Gets the destinatarioLocalita value for this LabelToPrint.
     * 
     * @return destinatarioLocalita
     */
    public java.lang.String getDestinatarioLocalita() {
        return destinatarioLocalita;
    }


    /**
     * Sets the destinatarioLocalita value for this LabelToPrint.
     * 
     * @param destinatarioLocalita
     */
    public void setDestinatarioLocalita(java.lang.String destinatarioLocalita) {
        this.destinatarioLocalita = destinatarioLocalita;
    }


    /**
     * Gets the destinatarioProvincia value for this LabelToPrint.
     * 
     * @return destinatarioProvincia
     */
    public java.lang.String getDestinatarioProvincia() {
        return destinatarioProvincia;
    }


    /**
     * Sets the destinatarioProvincia value for this LabelToPrint.
     * 
     * @param destinatarioProvincia
     */
    public void setDestinatarioProvincia(java.lang.String destinatarioProvincia) {
        this.destinatarioProvincia = destinatarioProvincia;
    }


    /**
     * Gets the destinatarioRagioneSociale value for this LabelToPrint.
     * 
     * @return destinatarioRagioneSociale
     */
    public java.lang.String getDestinatarioRagioneSociale() {
        return destinatarioRagioneSociale;
    }


    /**
     * Sets the destinatarioRagioneSociale value for this LabelToPrint.
     * 
     * @param destinatarioRagioneSociale
     */
    public void setDestinatarioRagioneSociale(java.lang.String destinatarioRagioneSociale) {
        this.destinatarioRagioneSociale = destinatarioRagioneSociale;
    }


    /**
     * Gets the flagRistampa value for this LabelToPrint.
     * 
     * @return flagRistampa
     */
    public java.lang.String getFlagRistampa() {
        return flagRistampa;
    }


    /**
     * Sets the flagRistampa value for this LabelToPrint.
     * 
     * @param flagRistampa
     */
    public void setFlagRistampa(java.lang.String flagRistampa) {
        this.flagRistampa = flagRistampa;
    }


    /**
     * Gets the flagVolumeBollettato value for this LabelToPrint.
     * 
     * @return flagVolumeBollettato
     */
    public java.lang.String getFlagVolumeBollettato() {
        return flagVolumeBollettato;
    }


    /**
     * Sets the flagVolumeBollettato value for this LabelToPrint.
     * 
     * @param flagVolumeBollettato
     */
    public void setFlagVolumeBollettato(java.lang.String flagVolumeBollettato) {
        this.flagVolumeBollettato = flagVolumeBollettato;
    }


    /**
     * Gets the meseGiornoSpedizione value for this LabelToPrint.
     * 
     * @return meseGiornoSpedizione
     */
    public java.lang.Integer getMeseGiornoSpedizione() {
        return meseGiornoSpedizione;
    }


    /**
     * Sets the meseGiornoSpedizione value for this LabelToPrint.
     * 
     * @param meseGiornoSpedizione
     */
    public void setMeseGiornoSpedizione(java.lang.Integer meseGiornoSpedizione) {
        this.meseGiornoSpedizione = meseGiornoSpedizione;
    }


    /**
     * Gets the mittenteProvincia value for this LabelToPrint.
     * 
     * @return mittenteProvincia
     */
    public java.lang.String getMittenteProvincia() {
        return mittenteProvincia;
    }


    /**
     * Sets the mittenteProvincia value for this LabelToPrint.
     * 
     * @param mittenteProvincia
     */
    public void setMittenteProvincia(java.lang.String mittenteProvincia) {
        this.mittenteProvincia = mittenteProvincia;
    }


    /**
     * Gets the mittenteRagioneSociale value for this LabelToPrint.
     * 
     * @return mittenteRagioneSociale
     */
    public java.lang.String getMittenteRagioneSociale() {
        return mittenteRagioneSociale;
    }


    /**
     * Sets the mittenteRagioneSociale value for this LabelToPrint.
     * 
     * @param mittenteRagioneSociale
     */
    public void setMittenteRagioneSociale(java.lang.String mittenteRagioneSociale) {
        this.mittenteRagioneSociale = mittenteRagioneSociale;
    }


    /**
     * Gets the numeroRifNumerico value for this LabelToPrint.
     * 
     * @return numeroRifNumerico
     */
    public java.lang.Long getNumeroRifNumerico() {
        return numeroRifNumerico;
    }


    /**
     * Sets the numeroRifNumerico value for this LabelToPrint.
     * 
     * @param numeroRifNumerico
     */
    public void setNumeroRifNumerico(java.lang.Long numeroRifNumerico) {
        this.numeroRifNumerico = numeroRifNumerico;
    }


    /**
     * Gets the numeroSegnaCollo value for this LabelToPrint.
     * 
     * @return numeroSegnaCollo
     */
    public java.lang.Integer getNumeroSegnaCollo() {
        return numeroSegnaCollo;
    }


    /**
     * Sets the numeroSegnaCollo value for this LabelToPrint.
     * 
     * @param numeroSegnaCollo
     */
    public void setNumeroSegnaCollo(java.lang.Integer numeroSegnaCollo) {
        this.numeroSegnaCollo = numeroSegnaCollo;
    }


    /**
     * Gets the numeroSegnaColloDi value for this LabelToPrint.
     * 
     * @return numeroSegnaColloDi
     */
    public java.lang.Integer getNumeroSegnaColloDi() {
        return numeroSegnaColloDi;
    }


    /**
     * Sets the numeroSegnaColloDi value for this LabelToPrint.
     * 
     * @param numeroSegnaColloDi
     */
    public void setNumeroSegnaColloDi(java.lang.Integer numeroSegnaColloDi) {
        this.numeroSegnaColloDi = numeroSegnaColloDi;
    }


    /**
     * Gets the numeroSerie value for this LabelToPrint.
     * 
     * @return numeroSerie
     */
    public java.lang.Integer getNumeroSerie() {
        return numeroSerie;
    }


    /**
     * Sets the numeroSerie value for this LabelToPrint.
     * 
     * @param numeroSerie
     */
    public void setNumeroSerie(java.lang.Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }


    /**
     * Gets the numeroSpedizione value for this LabelToPrint.
     * 
     * @return numeroSpedizione
     */
    public java.lang.Integer getNumeroSpedizione() {
        return numeroSpedizione;
    }


    /**
     * Sets the numeroSpedizione value for this LabelToPrint.
     * 
     * @param numeroSpedizione
     */
    public void setNumeroSpedizione(java.lang.Integer numeroSpedizione) {
        this.numeroSpedizione = numeroSpedizione;
    }


    /**
     * Gets the POArrivo value for this LabelToPrint.
     * 
     * @return POArrivo
     */
    public java.lang.Integer getPOArrivo() {
        return POArrivo;
    }


    /**
     * Sets the POArrivo value for this LabelToPrint.
     * 
     * @param POArrivo
     */
    public void setPOArrivo(java.lang.Integer POArrivo) {
        this.POArrivo = POArrivo;
    }


    /**
     * Gets the POArrivoDescrizione value for this LabelToPrint.
     * 
     * @return POArrivoDescrizione
     */
    public java.lang.String getPOArrivoDescrizione() {
        return POArrivoDescrizione;
    }


    /**
     * Sets the POArrivoDescrizione value for this LabelToPrint.
     * 
     * @param POArrivoDescrizione
     */
    public void setPOArrivoDescrizione(java.lang.String POArrivoDescrizione) {
        this.POArrivoDescrizione = POArrivoDescrizione;
    }


    /**
     * Gets the POPartenza value for this LabelToPrint.
     * 
     * @return POPartenza
     */
    public java.lang.Integer getPOPartenza() {
        return POPartenza;
    }


    /**
     * Sets the POPartenza value for this LabelToPrint.
     * 
     * @param POPartenza
     */
    public void setPOPartenza(java.lang.Integer POPartenza) {
        this.POPartenza = POPartenza;
    }


    /**
     * Gets the POPartenzaDescrizione value for this LabelToPrint.
     * 
     * @return POPartenzaDescrizione
     */
    public java.lang.String getPOPartenzaDescrizione() {
        return POPartenzaDescrizione;
    }


    /**
     * Sets the POPartenzaDescrizione value for this LabelToPrint.
     * 
     * @param POPartenzaDescrizione
     */
    public void setPOPartenzaDescrizione(java.lang.String POPartenzaDescrizione) {
        this.POPartenzaDescrizione = POPartenzaDescrizione;
    }


    /**
     * Gets the POSegnacollo value for this LabelToPrint.
     * 
     * @return POSegnacollo
     */
    public java.lang.Integer getPOSegnacollo() {
        return POSegnacollo;
    }


    /**
     * Sets the POSegnacollo value for this LabelToPrint.
     * 
     * @param POSegnacollo
     */
    public void setPOSegnacollo(java.lang.Integer POSegnacollo) {
        this.POSegnacollo = POSegnacollo;
    }


    /**
     * Gets the peso value for this LabelToPrint.
     * 
     * @return peso
     */
    public java.math.BigDecimal getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this LabelToPrint.
     * 
     * @param peso
     */
    public void setPeso(java.math.BigDecimal peso) {
        this.peso = peso;
    }


    /**
     * Gets the terminalArrivo value for this LabelToPrint.
     * 
     * @return terminalArrivo
     */
    public java.lang.Integer getTerminalArrivo() {
        return terminalArrivo;
    }


    /**
     * Sets the terminalArrivo value for this LabelToPrint.
     * 
     * @param terminalArrivo
     */
    public void setTerminalArrivo(java.lang.Integer terminalArrivo) {
        this.terminalArrivo = terminalArrivo;
    }


    /**
     * Gets the tipoEtichetta value for this LabelToPrint.
     * 
     * @return tipoEtichetta
     */
    public org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.LabelToPrintTipiEtichetta getTipoEtichetta() {
        return tipoEtichetta;
    }


    /**
     * Sets the tipoEtichetta value for this LabelToPrint.
     * 
     * @param tipoEtichetta
     */
    public void setTipoEtichetta(org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.LabelToPrintTipiEtichetta tipoEtichetta) {
        this.tipoEtichetta = tipoEtichetta;
    }


    /**
     * Gets the tipoServizioBolle value for this LabelToPrint.
     * 
     * @return tipoServizioBolle
     */
    public java.lang.String getTipoServizioBolle() {
        return tipoServizioBolle;
    }


    /**
     * Sets the tipoServizioBolle value for this LabelToPrint.
     * 
     * @param tipoServizioBolle
     */
    public void setTipoServizioBolle(java.lang.String tipoServizioBolle) {
        this.tipoServizioBolle = tipoServizioBolle;
    }


    /**
     * Gets the tipoStampaNetwork value for this LabelToPrint.
     * 
     * @return tipoStampaNetwork
     */
    public java.lang.String getTipoStampaNetwork() {
        return tipoStampaNetwork;
    }


    /**
     * Sets the tipoStampaNetwork value for this LabelToPrint.
     * 
     * @param tipoStampaNetwork
     */
    public void setTipoStampaNetwork(java.lang.String tipoStampaNetwork) {
        this.tipoStampaNetwork = tipoStampaNetwork;
    }


    /**
     * Gets the totaleSegnaColli value for this LabelToPrint.
     * 
     * @return totaleSegnaColli
     */
    public java.lang.Integer getTotaleSegnaColli() {
        return totaleSegnaColli;
    }


    /**
     * Sets the totaleSegnaColli value for this LabelToPrint.
     * 
     * @param totaleSegnaColli
     */
    public void setTotaleSegnaColli(java.lang.Integer totaleSegnaColli) {
        this.totaleSegnaColli = totaleSegnaColli;
    }


    /**
     * Gets the volume value for this LabelToPrint.
     * 
     * @return volume
     */
    public java.math.BigDecimal getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this LabelToPrint.
     * 
     * @param volume
     */
    public void setVolume(java.math.BigDecimal volume) {
        this.volume = volume;
    }


    /**
     * Gets the zonaSegnaCollo value for this LabelToPrint.
     * 
     * @return zonaSegnaCollo
     */
    public java.lang.Integer getZonaSegnaCollo() {
        return zonaSegnaCollo;
    }


    /**
     * Sets the zonaSegnaCollo value for this LabelToPrint.
     * 
     * @param zonaSegnaCollo
     */
    public void setZonaSegnaCollo(java.lang.Integer zonaSegnaCollo) {
        this.zonaSegnaCollo = zonaSegnaCollo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LabelToPrint)) return false;
        LabelToPrint other = (LabelToPrint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annoSpedizione==null && other.getAnnoSpedizione()==null) || 
             (this.annoSpedizione!=null &&
              this.annoSpedizione.equals(other.getAnnoSpedizione()))) &&
            ((this.codiceErrore==null && other.getCodiceErrore()==null) || 
             (this.codiceErrore!=null &&
              this.codiceErrore.equals(other.getCodiceErrore()))) &&
            ((this.codiceIsoNazione==null && other.getCodiceIsoNazione()==null) || 
             (this.codiceIsoNazione!=null &&
              this.codiceIsoNazione.equals(other.getCodiceIsoNazione()))) &&
            ((this.codiceProdotto==null && other.getCodiceProdotto()==null) || 
             (this.codiceProdotto!=null &&
              this.codiceProdotto.equals(other.getCodiceProdotto()))) &&
            ((this.dataSpedizione==null && other.getDataSpedizione()==null) || 
             (this.dataSpedizione!=null &&
              this.dataSpedizione.equals(other.getDataSpedizione()))) &&
            ((this.descrizioneErrore==null && other.getDescrizioneErrore()==null) || 
             (this.descrizioneErrore!=null &&
              this.descrizioneErrore.equals(other.getDescrizioneErrore()))) &&
            ((this.destinatarioCap==null && other.getDestinatarioCap()==null) || 
             (this.destinatarioCap!=null &&
              this.destinatarioCap.equals(other.getDestinatarioCap()))) &&
            ((this.destinatarioIndirizzo==null && other.getDestinatarioIndirizzo()==null) || 
             (this.destinatarioIndirizzo!=null &&
              this.destinatarioIndirizzo.equals(other.getDestinatarioIndirizzo()))) &&
            ((this.destinatarioLocalita==null && other.getDestinatarioLocalita()==null) || 
             (this.destinatarioLocalita!=null &&
              this.destinatarioLocalita.equals(other.getDestinatarioLocalita()))) &&
            ((this.destinatarioProvincia==null && other.getDestinatarioProvincia()==null) || 
             (this.destinatarioProvincia!=null &&
              this.destinatarioProvincia.equals(other.getDestinatarioProvincia()))) &&
            ((this.destinatarioRagioneSociale==null && other.getDestinatarioRagioneSociale()==null) || 
             (this.destinatarioRagioneSociale!=null &&
              this.destinatarioRagioneSociale.equals(other.getDestinatarioRagioneSociale()))) &&
            ((this.flagRistampa==null && other.getFlagRistampa()==null) || 
             (this.flagRistampa!=null &&
              this.flagRistampa.equals(other.getFlagRistampa()))) &&
            ((this.flagVolumeBollettato==null && other.getFlagVolumeBollettato()==null) || 
             (this.flagVolumeBollettato!=null &&
              this.flagVolumeBollettato.equals(other.getFlagVolumeBollettato()))) &&
            ((this.meseGiornoSpedizione==null && other.getMeseGiornoSpedizione()==null) || 
             (this.meseGiornoSpedizione!=null &&
              this.meseGiornoSpedizione.equals(other.getMeseGiornoSpedizione()))) &&
            ((this.mittenteProvincia==null && other.getMittenteProvincia()==null) || 
             (this.mittenteProvincia!=null &&
              this.mittenteProvincia.equals(other.getMittenteProvincia()))) &&
            ((this.mittenteRagioneSociale==null && other.getMittenteRagioneSociale()==null) || 
             (this.mittenteRagioneSociale!=null &&
              this.mittenteRagioneSociale.equals(other.getMittenteRagioneSociale()))) &&
            ((this.numeroRifNumerico==null && other.getNumeroRifNumerico()==null) || 
             (this.numeroRifNumerico!=null &&
              this.numeroRifNumerico.equals(other.getNumeroRifNumerico()))) &&
            ((this.numeroSegnaCollo==null && other.getNumeroSegnaCollo()==null) || 
             (this.numeroSegnaCollo!=null &&
              this.numeroSegnaCollo.equals(other.getNumeroSegnaCollo()))) &&
            ((this.numeroSegnaColloDi==null && other.getNumeroSegnaColloDi()==null) || 
             (this.numeroSegnaColloDi!=null &&
              this.numeroSegnaColloDi.equals(other.getNumeroSegnaColloDi()))) &&
            ((this.numeroSerie==null && other.getNumeroSerie()==null) || 
             (this.numeroSerie!=null &&
              this.numeroSerie.equals(other.getNumeroSerie()))) &&
            ((this.numeroSpedizione==null && other.getNumeroSpedizione()==null) || 
             (this.numeroSpedizione!=null &&
              this.numeroSpedizione.equals(other.getNumeroSpedizione()))) &&
            ((this.POArrivo==null && other.getPOArrivo()==null) || 
             (this.POArrivo!=null &&
              this.POArrivo.equals(other.getPOArrivo()))) &&
            ((this.POArrivoDescrizione==null && other.getPOArrivoDescrizione()==null) || 
             (this.POArrivoDescrizione!=null &&
              this.POArrivoDescrizione.equals(other.getPOArrivoDescrizione()))) &&
            ((this.POPartenza==null && other.getPOPartenza()==null) || 
             (this.POPartenza!=null &&
              this.POPartenza.equals(other.getPOPartenza()))) &&
            ((this.POPartenzaDescrizione==null && other.getPOPartenzaDescrizione()==null) || 
             (this.POPartenzaDescrizione!=null &&
              this.POPartenzaDescrizione.equals(other.getPOPartenzaDescrizione()))) &&
            ((this.POSegnacollo==null && other.getPOSegnacollo()==null) || 
             (this.POSegnacollo!=null &&
              this.POSegnacollo.equals(other.getPOSegnacollo()))) &&
            ((this.peso==null && other.getPeso()==null) || 
             (this.peso!=null &&
              this.peso.equals(other.getPeso()))) &&
            ((this.terminalArrivo==null && other.getTerminalArrivo()==null) || 
             (this.terminalArrivo!=null &&
              this.terminalArrivo.equals(other.getTerminalArrivo()))) &&
            ((this.tipoEtichetta==null && other.getTipoEtichetta()==null) || 
             (this.tipoEtichetta!=null &&
              this.tipoEtichetta.equals(other.getTipoEtichetta()))) &&
            ((this.tipoServizioBolle==null && other.getTipoServizioBolle()==null) || 
             (this.tipoServizioBolle!=null &&
              this.tipoServizioBolle.equals(other.getTipoServizioBolle()))) &&
            ((this.tipoStampaNetwork==null && other.getTipoStampaNetwork()==null) || 
             (this.tipoStampaNetwork!=null &&
              this.tipoStampaNetwork.equals(other.getTipoStampaNetwork()))) &&
            ((this.totaleSegnaColli==null && other.getTotaleSegnaColli()==null) || 
             (this.totaleSegnaColli!=null &&
              this.totaleSegnaColli.equals(other.getTotaleSegnaColli()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.zonaSegnaCollo==null && other.getZonaSegnaCollo()==null) || 
             (this.zonaSegnaCollo!=null &&
              this.zonaSegnaCollo.equals(other.getZonaSegnaCollo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAnnoSpedizione() != null) {
            _hashCode += getAnnoSpedizione().hashCode();
        }
        if (getCodiceErrore() != null) {
            _hashCode += getCodiceErrore().hashCode();
        }
        if (getCodiceIsoNazione() != null) {
            _hashCode += getCodiceIsoNazione().hashCode();
        }
        if (getCodiceProdotto() != null) {
            _hashCode += getCodiceProdotto().hashCode();
        }
        if (getDataSpedizione() != null) {
            _hashCode += getDataSpedizione().hashCode();
        }
        if (getDescrizioneErrore() != null) {
            _hashCode += getDescrizioneErrore().hashCode();
        }
        if (getDestinatarioCap() != null) {
            _hashCode += getDestinatarioCap().hashCode();
        }
        if (getDestinatarioIndirizzo() != null) {
            _hashCode += getDestinatarioIndirizzo().hashCode();
        }
        if (getDestinatarioLocalita() != null) {
            _hashCode += getDestinatarioLocalita().hashCode();
        }
        if (getDestinatarioProvincia() != null) {
            _hashCode += getDestinatarioProvincia().hashCode();
        }
        if (getDestinatarioRagioneSociale() != null) {
            _hashCode += getDestinatarioRagioneSociale().hashCode();
        }
        if (getFlagRistampa() != null) {
            _hashCode += getFlagRistampa().hashCode();
        }
        if (getFlagVolumeBollettato() != null) {
            _hashCode += getFlagVolumeBollettato().hashCode();
        }
        if (getMeseGiornoSpedizione() != null) {
            _hashCode += getMeseGiornoSpedizione().hashCode();
        }
        if (getMittenteProvincia() != null) {
            _hashCode += getMittenteProvincia().hashCode();
        }
        if (getMittenteRagioneSociale() != null) {
            _hashCode += getMittenteRagioneSociale().hashCode();
        }
        if (getNumeroRifNumerico() != null) {
            _hashCode += getNumeroRifNumerico().hashCode();
        }
        if (getNumeroSegnaCollo() != null) {
            _hashCode += getNumeroSegnaCollo().hashCode();
        }
        if (getNumeroSegnaColloDi() != null) {
            _hashCode += getNumeroSegnaColloDi().hashCode();
        }
        if (getNumeroSerie() != null) {
            _hashCode += getNumeroSerie().hashCode();
        }
        if (getNumeroSpedizione() != null) {
            _hashCode += getNumeroSpedizione().hashCode();
        }
        if (getPOArrivo() != null) {
            _hashCode += getPOArrivo().hashCode();
        }
        if (getPOArrivoDescrizione() != null) {
            _hashCode += getPOArrivoDescrizione().hashCode();
        }
        if (getPOPartenza() != null) {
            _hashCode += getPOPartenza().hashCode();
        }
        if (getPOPartenzaDescrizione() != null) {
            _hashCode += getPOPartenzaDescrizione().hashCode();
        }
        if (getPOSegnacollo() != null) {
            _hashCode += getPOSegnacollo().hashCode();
        }
        if (getPeso() != null) {
            _hashCode += getPeso().hashCode();
        }
        if (getTerminalArrivo() != null) {
            _hashCode += getTerminalArrivo().hashCode();
        }
        if (getTipoEtichetta() != null) {
            _hashCode += getTipoEtichetta().hashCode();
        }
        if (getTipoServizioBolle() != null) {
            _hashCode += getTipoServizioBolle().hashCode();
        }
        if (getTipoStampaNetwork() != null) {
            _hashCode += getTipoStampaNetwork().hashCode();
        }
        if (getTotaleSegnaColli() != null) {
            _hashCode += getTotaleSegnaColli().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getZonaSegnaCollo() != null) {
            _hashCode += getZonaSegnaCollo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LabelToPrint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "LabelToPrint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "AnnoSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceErrore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "CodiceErrore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIsoNazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "CodiceIsoNazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceProdotto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "CodiceProdotto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "DataSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneErrore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "DescrizioneErrore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioCap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "DestinatarioCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioIndirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "DestinatarioIndirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioLocalita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "DestinatarioLocalita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "DestinatarioProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioRagioneSociale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "DestinatarioRagioneSociale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagRistampa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "FlagRistampa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagVolumeBollettato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "FlagVolumeBollettato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meseGiornoSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "MeseGiornoSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittenteProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "MittenteProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittenteRagioneSociale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "MittenteRagioneSociale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRifNumerico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "NumeroRifNumerico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSegnaCollo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "NumeroSegnaCollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSegnaColloDi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "NumeroSegnaColloDi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "NumeroSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "NumeroSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POArrivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "POArrivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POArrivoDescrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "POArrivoDescrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POPartenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "POPartenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POPartenzaDescrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "POPartenzaDescrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSegnacollo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "POSegnacollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "Peso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalArrivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "TerminalArrivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEtichetta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "TipoEtichetta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "LabelToPrint.tipiEtichetta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServizioBolle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "TipoServizioBolle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoStampaNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "TipoStampaNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleSegnaColli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "TotaleSegnaColli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "Volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zonaSegnaCollo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.Printlabel", "ZonaSegnaCollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
