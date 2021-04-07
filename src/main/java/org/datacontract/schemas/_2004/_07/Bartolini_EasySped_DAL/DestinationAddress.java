/**
 * DestinationAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Bartolini_EasySped_DAL;

public class DestinationAddress  implements java.io.Serializable {
    private java.lang.Short annoSpedizione;

    private java.lang.String campoInErrore;

    private java.lang.String codiceErrore;

    private java.lang.String codiceProdotto;

    private java.lang.String descrizioneErrore;

    private java.lang.String destinatarioCap;

    private java.lang.String destinatarioIndirizzo;

    private java.lang.String destinatarioLocalita;

    private java.lang.String destinatarioNazione;

    private java.lang.String destinatarioProvincia;

    private java.lang.String destinatarioProvinciaAlt;

    private java.lang.String destinatarioRagioneSociale;

    private java.lang.String fermoDeposito;

    private java.lang.Short filialeSegnaCollo;

    private java.lang.String flagVolumeBollettato;

    private java.lang.String gestParticolaritaConsegna;

    private java.lang.String gestParticolaritaContrassegno;

    private java.lang.String gestParticolaritaGiacenza;

    private java.lang.String gestParticolaritaVarie;

    private java.lang.Short meseGiornoSpedizione;

    private java.lang.String mittenteNazione;

    private java.lang.String mittenteProvincia;

    private java.lang.String mittenteRagioneSociale;

    private java.lang.String network;

    private java.lang.Integer numSegnaColloDi;

    private java.lang.Integer numeroSegnaCollo;

    private java.lang.Short numeroSerie;

    private java.lang.Short POArrivo;

    private java.lang.String POArrivoDes;

    private java.lang.Short POPartenza;

    private java.lang.String POPartenzaDes;

    private java.math.BigDecimal peso;

    private java.lang.String primaConsegnaParticolare;

    private java.lang.String ricercaPOArrivo;

    private java.lang.String ristampa;

    private java.lang.String secondaConsegnaParticolare;

    private java.lang.Short terminalArrivo;

    private java.lang.String tipoContrassegno;

    private java.lang.String tipoLancio;

    private java.lang.String tipoPorto;

    private java.lang.String tipoServizioBolle;

    private java.lang.String tipoStampante;

    private java.lang.Integer totSegnaColli;

    private java.math.BigDecimal volume;

    private java.lang.Short zonaSegnaCollo;

    public DestinationAddress() {
    }

    public DestinationAddress(
           java.lang.Short annoSpedizione,
           java.lang.String campoInErrore,
           java.lang.String codiceErrore,
           java.lang.String codiceProdotto,
           java.lang.String descrizioneErrore,
           java.lang.String destinatarioCap,
           java.lang.String destinatarioIndirizzo,
           java.lang.String destinatarioLocalita,
           java.lang.String destinatarioNazione,
           java.lang.String destinatarioProvincia,
           java.lang.String destinatarioProvinciaAlt,
           java.lang.String destinatarioRagioneSociale,
           java.lang.String fermoDeposito,
           java.lang.Short filialeSegnaCollo,
           java.lang.String flagVolumeBollettato,
           java.lang.String gestParticolaritaConsegna,
           java.lang.String gestParticolaritaContrassegno,
           java.lang.String gestParticolaritaGiacenza,
           java.lang.String gestParticolaritaVarie,
           java.lang.Short meseGiornoSpedizione,
           java.lang.String mittenteNazione,
           java.lang.String mittenteProvincia,
           java.lang.String mittenteRagioneSociale,
           java.lang.String network,
           java.lang.Integer numSegnaColloDi,
           java.lang.Integer numeroSegnaCollo,
           java.lang.Short numeroSerie,
           java.lang.Short POArrivo,
           java.lang.String POArrivoDes,
           java.lang.Short POPartenza,
           java.lang.String POPartenzaDes,
           java.math.BigDecimal peso,
           java.lang.String primaConsegnaParticolare,
           java.lang.String ricercaPOArrivo,
           java.lang.String ristampa,
           java.lang.String secondaConsegnaParticolare,
           java.lang.Short terminalArrivo,
           java.lang.String tipoContrassegno,
           java.lang.String tipoLancio,
           java.lang.String tipoPorto,
           java.lang.String tipoServizioBolle,
           java.lang.String tipoStampante,
           java.lang.Integer totSegnaColli,
           java.math.BigDecimal volume,
           java.lang.Short zonaSegnaCollo) {
           this.annoSpedizione = annoSpedizione;
           this.campoInErrore = campoInErrore;
           this.codiceErrore = codiceErrore;
           this.codiceProdotto = codiceProdotto;
           this.descrizioneErrore = descrizioneErrore;
           this.destinatarioCap = destinatarioCap;
           this.destinatarioIndirizzo = destinatarioIndirizzo;
           this.destinatarioLocalita = destinatarioLocalita;
           this.destinatarioNazione = destinatarioNazione;
           this.destinatarioProvincia = destinatarioProvincia;
           this.destinatarioProvinciaAlt = destinatarioProvinciaAlt;
           this.destinatarioRagioneSociale = destinatarioRagioneSociale;
           this.fermoDeposito = fermoDeposito;
           this.filialeSegnaCollo = filialeSegnaCollo;
           this.flagVolumeBollettato = flagVolumeBollettato;
           this.gestParticolaritaConsegna = gestParticolaritaConsegna;
           this.gestParticolaritaContrassegno = gestParticolaritaContrassegno;
           this.gestParticolaritaGiacenza = gestParticolaritaGiacenza;
           this.gestParticolaritaVarie = gestParticolaritaVarie;
           this.meseGiornoSpedizione = meseGiornoSpedizione;
           this.mittenteNazione = mittenteNazione;
           this.mittenteProvincia = mittenteProvincia;
           this.mittenteRagioneSociale = mittenteRagioneSociale;
           this.network = network;
           this.numSegnaColloDi = numSegnaColloDi;
           this.numeroSegnaCollo = numeroSegnaCollo;
           this.numeroSerie = numeroSerie;
           this.POArrivo = POArrivo;
           this.POArrivoDes = POArrivoDes;
           this.POPartenza = POPartenza;
           this.POPartenzaDes = POPartenzaDes;
           this.peso = peso;
           this.primaConsegnaParticolare = primaConsegnaParticolare;
           this.ricercaPOArrivo = ricercaPOArrivo;
           this.ristampa = ristampa;
           this.secondaConsegnaParticolare = secondaConsegnaParticolare;
           this.terminalArrivo = terminalArrivo;
           this.tipoContrassegno = tipoContrassegno;
           this.tipoLancio = tipoLancio;
           this.tipoPorto = tipoPorto;
           this.tipoServizioBolle = tipoServizioBolle;
           this.tipoStampante = tipoStampante;
           this.totSegnaColli = totSegnaColli;
           this.volume = volume;
           this.zonaSegnaCollo = zonaSegnaCollo;
    }


    /**
     * Gets the annoSpedizione value for this DestinationAddress.
     * 
     * @return annoSpedizione
     */
    public java.lang.Short getAnnoSpedizione() {
        return annoSpedizione;
    }


    /**
     * Sets the annoSpedizione value for this DestinationAddress.
     * 
     * @param annoSpedizione
     */
    public void setAnnoSpedizione(java.lang.Short annoSpedizione) {
        this.annoSpedizione = annoSpedizione;
    }


    /**
     * Gets the campoInErrore value for this DestinationAddress.
     * 
     * @return campoInErrore
     */
    public java.lang.String getCampoInErrore() {
        return campoInErrore;
    }


    /**
     * Sets the campoInErrore value for this DestinationAddress.
     * 
     * @param campoInErrore
     */
    public void setCampoInErrore(java.lang.String campoInErrore) {
        this.campoInErrore = campoInErrore;
    }


    /**
     * Gets the codiceErrore value for this DestinationAddress.
     * 
     * @return codiceErrore
     */
    public java.lang.String getCodiceErrore() {
        return codiceErrore;
    }


    /**
     * Sets the codiceErrore value for this DestinationAddress.
     * 
     * @param codiceErrore
     */
    public void setCodiceErrore(java.lang.String codiceErrore) {
        this.codiceErrore = codiceErrore;
    }


    /**
     * Gets the codiceProdotto value for this DestinationAddress.
     * 
     * @return codiceProdotto
     */
    public java.lang.String getCodiceProdotto() {
        return codiceProdotto;
    }


    /**
     * Sets the codiceProdotto value for this DestinationAddress.
     * 
     * @param codiceProdotto
     */
    public void setCodiceProdotto(java.lang.String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }


    /**
     * Gets the descrizioneErrore value for this DestinationAddress.
     * 
     * @return descrizioneErrore
     */
    public java.lang.String getDescrizioneErrore() {
        return descrizioneErrore;
    }


    /**
     * Sets the descrizioneErrore value for this DestinationAddress.
     * 
     * @param descrizioneErrore
     */
    public void setDescrizioneErrore(java.lang.String descrizioneErrore) {
        this.descrizioneErrore = descrizioneErrore;
    }


    /**
     * Gets the destinatarioCap value for this DestinationAddress.
     * 
     * @return destinatarioCap
     */
    public java.lang.String getDestinatarioCap() {
        return destinatarioCap;
    }


    /**
     * Sets the destinatarioCap value for this DestinationAddress.
     * 
     * @param destinatarioCap
     */
    public void setDestinatarioCap(java.lang.String destinatarioCap) {
        this.destinatarioCap = destinatarioCap;
    }


    /**
     * Gets the destinatarioIndirizzo value for this DestinationAddress.
     * 
     * @return destinatarioIndirizzo
     */
    public java.lang.String getDestinatarioIndirizzo() {
        return destinatarioIndirizzo;
    }


    /**
     * Sets the destinatarioIndirizzo value for this DestinationAddress.
     * 
     * @param destinatarioIndirizzo
     */
    public void setDestinatarioIndirizzo(java.lang.String destinatarioIndirizzo) {
        this.destinatarioIndirizzo = destinatarioIndirizzo;
    }


    /**
     * Gets the destinatarioLocalita value for this DestinationAddress.
     * 
     * @return destinatarioLocalita
     */
    public java.lang.String getDestinatarioLocalita() {
        return destinatarioLocalita;
    }


    /**
     * Sets the destinatarioLocalita value for this DestinationAddress.
     * 
     * @param destinatarioLocalita
     */
    public void setDestinatarioLocalita(java.lang.String destinatarioLocalita) {
        this.destinatarioLocalita = destinatarioLocalita;
    }


    /**
     * Gets the destinatarioNazione value for this DestinationAddress.
     * 
     * @return destinatarioNazione
     */
    public java.lang.String getDestinatarioNazione() {
        return destinatarioNazione;
    }


    /**
     * Sets the destinatarioNazione value for this DestinationAddress.
     * 
     * @param destinatarioNazione
     */
    public void setDestinatarioNazione(java.lang.String destinatarioNazione) {
        this.destinatarioNazione = destinatarioNazione;
    }


    /**
     * Gets the destinatarioProvincia value for this DestinationAddress.
     * 
     * @return destinatarioProvincia
     */
    public java.lang.String getDestinatarioProvincia() {
        return destinatarioProvincia;
    }


    /**
     * Sets the destinatarioProvincia value for this DestinationAddress.
     * 
     * @param destinatarioProvincia
     */
    public void setDestinatarioProvincia(java.lang.String destinatarioProvincia) {
        this.destinatarioProvincia = destinatarioProvincia;
    }


    /**
     * Gets the destinatarioProvinciaAlt value for this DestinationAddress.
     * 
     * @return destinatarioProvinciaAlt
     */
    public java.lang.String getDestinatarioProvinciaAlt() {
        return destinatarioProvinciaAlt;
    }


    /**
     * Sets the destinatarioProvinciaAlt value for this DestinationAddress.
     * 
     * @param destinatarioProvinciaAlt
     */
    public void setDestinatarioProvinciaAlt(java.lang.String destinatarioProvinciaAlt) {
        this.destinatarioProvinciaAlt = destinatarioProvinciaAlt;
    }


    /**
     * Gets the destinatarioRagioneSociale value for this DestinationAddress.
     * 
     * @return destinatarioRagioneSociale
     */
    public java.lang.String getDestinatarioRagioneSociale() {
        return destinatarioRagioneSociale;
    }


    /**
     * Sets the destinatarioRagioneSociale value for this DestinationAddress.
     * 
     * @param destinatarioRagioneSociale
     */
    public void setDestinatarioRagioneSociale(java.lang.String destinatarioRagioneSociale) {
        this.destinatarioRagioneSociale = destinatarioRagioneSociale;
    }


    /**
     * Gets the fermoDeposito value for this DestinationAddress.
     * 
     * @return fermoDeposito
     */
    public java.lang.String getFermoDeposito() {
        return fermoDeposito;
    }


    /**
     * Sets the fermoDeposito value for this DestinationAddress.
     * 
     * @param fermoDeposito
     */
    public void setFermoDeposito(java.lang.String fermoDeposito) {
        this.fermoDeposito = fermoDeposito;
    }


    /**
     * Gets the filialeSegnaCollo value for this DestinationAddress.
     * 
     * @return filialeSegnaCollo
     */
    public java.lang.Short getFilialeSegnaCollo() {
        return filialeSegnaCollo;
    }


    /**
     * Sets the filialeSegnaCollo value for this DestinationAddress.
     * 
     * @param filialeSegnaCollo
     */
    public void setFilialeSegnaCollo(java.lang.Short filialeSegnaCollo) {
        this.filialeSegnaCollo = filialeSegnaCollo;
    }


    /**
     * Gets the flagVolumeBollettato value for this DestinationAddress.
     * 
     * @return flagVolumeBollettato
     */
    public java.lang.String getFlagVolumeBollettato() {
        return flagVolumeBollettato;
    }


    /**
     * Sets the flagVolumeBollettato value for this DestinationAddress.
     * 
     * @param flagVolumeBollettato
     */
    public void setFlagVolumeBollettato(java.lang.String flagVolumeBollettato) {
        this.flagVolumeBollettato = flagVolumeBollettato;
    }


    /**
     * Gets the gestParticolaritaConsegna value for this DestinationAddress.
     * 
     * @return gestParticolaritaConsegna
     */
    public java.lang.String getGestParticolaritaConsegna() {
        return gestParticolaritaConsegna;
    }


    /**
     * Sets the gestParticolaritaConsegna value for this DestinationAddress.
     * 
     * @param gestParticolaritaConsegna
     */
    public void setGestParticolaritaConsegna(java.lang.String gestParticolaritaConsegna) {
        this.gestParticolaritaConsegna = gestParticolaritaConsegna;
    }


    /**
     * Gets the gestParticolaritaContrassegno value for this DestinationAddress.
     * 
     * @return gestParticolaritaContrassegno
     */
    public java.lang.String getGestParticolaritaContrassegno() {
        return gestParticolaritaContrassegno;
    }


    /**
     * Sets the gestParticolaritaContrassegno value for this DestinationAddress.
     * 
     * @param gestParticolaritaContrassegno
     */
    public void setGestParticolaritaContrassegno(java.lang.String gestParticolaritaContrassegno) {
        this.gestParticolaritaContrassegno = gestParticolaritaContrassegno;
    }


    /**
     * Gets the gestParticolaritaGiacenza value for this DestinationAddress.
     * 
     * @return gestParticolaritaGiacenza
     */
    public java.lang.String getGestParticolaritaGiacenza() {
        return gestParticolaritaGiacenza;
    }


    /**
     * Sets the gestParticolaritaGiacenza value for this DestinationAddress.
     * 
     * @param gestParticolaritaGiacenza
     */
    public void setGestParticolaritaGiacenza(java.lang.String gestParticolaritaGiacenza) {
        this.gestParticolaritaGiacenza = gestParticolaritaGiacenza;
    }


    /**
     * Gets the gestParticolaritaVarie value for this DestinationAddress.
     * 
     * @return gestParticolaritaVarie
     */
    public java.lang.String getGestParticolaritaVarie() {
        return gestParticolaritaVarie;
    }


    /**
     * Sets the gestParticolaritaVarie value for this DestinationAddress.
     * 
     * @param gestParticolaritaVarie
     */
    public void setGestParticolaritaVarie(java.lang.String gestParticolaritaVarie) {
        this.gestParticolaritaVarie = gestParticolaritaVarie;
    }


    /**
     * Gets the meseGiornoSpedizione value for this DestinationAddress.
     * 
     * @return meseGiornoSpedizione
     */
    public java.lang.Short getMeseGiornoSpedizione() {
        return meseGiornoSpedizione;
    }


    /**
     * Sets the meseGiornoSpedizione value for this DestinationAddress.
     * 
     * @param meseGiornoSpedizione
     */
    public void setMeseGiornoSpedizione(java.lang.Short meseGiornoSpedizione) {
        this.meseGiornoSpedizione = meseGiornoSpedizione;
    }


    /**
     * Gets the mittenteNazione value for this DestinationAddress.
     * 
     * @return mittenteNazione
     */
    public java.lang.String getMittenteNazione() {
        return mittenteNazione;
    }


    /**
     * Sets the mittenteNazione value for this DestinationAddress.
     * 
     * @param mittenteNazione
     */
    public void setMittenteNazione(java.lang.String mittenteNazione) {
        this.mittenteNazione = mittenteNazione;
    }


    /**
     * Gets the mittenteProvincia value for this DestinationAddress.
     * 
     * @return mittenteProvincia
     */
    public java.lang.String getMittenteProvincia() {
        return mittenteProvincia;
    }


    /**
     * Sets the mittenteProvincia value for this DestinationAddress.
     * 
     * @param mittenteProvincia
     */
    public void setMittenteProvincia(java.lang.String mittenteProvincia) {
        this.mittenteProvincia = mittenteProvincia;
    }


    /**
     * Gets the mittenteRagioneSociale value for this DestinationAddress.
     * 
     * @return mittenteRagioneSociale
     */
    public java.lang.String getMittenteRagioneSociale() {
        return mittenteRagioneSociale;
    }


    /**
     * Sets the mittenteRagioneSociale value for this DestinationAddress.
     * 
     * @param mittenteRagioneSociale
     */
    public void setMittenteRagioneSociale(java.lang.String mittenteRagioneSociale) {
        this.mittenteRagioneSociale = mittenteRagioneSociale;
    }


    /**
     * Gets the network value for this DestinationAddress.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this DestinationAddress.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the numSegnaColloDi value for this DestinationAddress.
     * 
     * @return numSegnaColloDi
     */
    public java.lang.Integer getNumSegnaColloDi() {
        return numSegnaColloDi;
    }


    /**
     * Sets the numSegnaColloDi value for this DestinationAddress.
     * 
     * @param numSegnaColloDi
     */
    public void setNumSegnaColloDi(java.lang.Integer numSegnaColloDi) {
        this.numSegnaColloDi = numSegnaColloDi;
    }


    /**
     * Gets the numeroSegnaCollo value for this DestinationAddress.
     * 
     * @return numeroSegnaCollo
     */
    public java.lang.Integer getNumeroSegnaCollo() {
        return numeroSegnaCollo;
    }


    /**
     * Sets the numeroSegnaCollo value for this DestinationAddress.
     * 
     * @param numeroSegnaCollo
     */
    public void setNumeroSegnaCollo(java.lang.Integer numeroSegnaCollo) {
        this.numeroSegnaCollo = numeroSegnaCollo;
    }


    /**
     * Gets the numeroSerie value for this DestinationAddress.
     * 
     * @return numeroSerie
     */
    public java.lang.Short getNumeroSerie() {
        return numeroSerie;
    }


    /**
     * Sets the numeroSerie value for this DestinationAddress.
     * 
     * @param numeroSerie
     */
    public void setNumeroSerie(java.lang.Short numeroSerie) {
        this.numeroSerie = numeroSerie;
    }


    /**
     * Gets the POArrivo value for this DestinationAddress.
     * 
     * @return POArrivo
     */
    public java.lang.Short getPOArrivo() {
        return POArrivo;
    }


    /**
     * Sets the POArrivo value for this DestinationAddress.
     * 
     * @param POArrivo
     */
    public void setPOArrivo(java.lang.Short POArrivo) {
        this.POArrivo = POArrivo;
    }


    /**
     * Gets the POArrivoDes value for this DestinationAddress.
     * 
     * @return POArrivoDes
     */
    public java.lang.String getPOArrivoDes() {
        return POArrivoDes;
    }


    /**
     * Sets the POArrivoDes value for this DestinationAddress.
     * 
     * @param POArrivoDes
     */
    public void setPOArrivoDes(java.lang.String POArrivoDes) {
        this.POArrivoDes = POArrivoDes;
    }


    /**
     * Gets the POPartenza value for this DestinationAddress.
     * 
     * @return POPartenza
     */
    public java.lang.Short getPOPartenza() {
        return POPartenza;
    }


    /**
     * Sets the POPartenza value for this DestinationAddress.
     * 
     * @param POPartenza
     */
    public void setPOPartenza(java.lang.Short POPartenza) {
        this.POPartenza = POPartenza;
    }


    /**
     * Gets the POPartenzaDes value for this DestinationAddress.
     * 
     * @return POPartenzaDes
     */
    public java.lang.String getPOPartenzaDes() {
        return POPartenzaDes;
    }


    /**
     * Sets the POPartenzaDes value for this DestinationAddress.
     * 
     * @param POPartenzaDes
     */
    public void setPOPartenzaDes(java.lang.String POPartenzaDes) {
        this.POPartenzaDes = POPartenzaDes;
    }


    /**
     * Gets the peso value for this DestinationAddress.
     * 
     * @return peso
     */
    public java.math.BigDecimal getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this DestinationAddress.
     * 
     * @param peso
     */
    public void setPeso(java.math.BigDecimal peso) {
        this.peso = peso;
    }


    /**
     * Gets the primaConsegnaParticolare value for this DestinationAddress.
     * 
     * @return primaConsegnaParticolare
     */
    public java.lang.String getPrimaConsegnaParticolare() {
        return primaConsegnaParticolare;
    }


    /**
     * Sets the primaConsegnaParticolare value for this DestinationAddress.
     * 
     * @param primaConsegnaParticolare
     */
    public void setPrimaConsegnaParticolare(java.lang.String primaConsegnaParticolare) {
        this.primaConsegnaParticolare = primaConsegnaParticolare;
    }


    /**
     * Gets the ricercaPOArrivo value for this DestinationAddress.
     * 
     * @return ricercaPOArrivo
     */
    public java.lang.String getRicercaPOArrivo() {
        return ricercaPOArrivo;
    }


    /**
     * Sets the ricercaPOArrivo value for this DestinationAddress.
     * 
     * @param ricercaPOArrivo
     */
    public void setRicercaPOArrivo(java.lang.String ricercaPOArrivo) {
        this.ricercaPOArrivo = ricercaPOArrivo;
    }


    /**
     * Gets the ristampa value for this DestinationAddress.
     * 
     * @return ristampa
     */
    public java.lang.String getRistampa() {
        return ristampa;
    }


    /**
     * Sets the ristampa value for this DestinationAddress.
     * 
     * @param ristampa
     */
    public void setRistampa(java.lang.String ristampa) {
        this.ristampa = ristampa;
    }


    /**
     * Gets the secondaConsegnaParticolare value for this DestinationAddress.
     * 
     * @return secondaConsegnaParticolare
     */
    public java.lang.String getSecondaConsegnaParticolare() {
        return secondaConsegnaParticolare;
    }


    /**
     * Sets the secondaConsegnaParticolare value for this DestinationAddress.
     * 
     * @param secondaConsegnaParticolare
     */
    public void setSecondaConsegnaParticolare(java.lang.String secondaConsegnaParticolare) {
        this.secondaConsegnaParticolare = secondaConsegnaParticolare;
    }


    /**
     * Gets the terminalArrivo value for this DestinationAddress.
     * 
     * @return terminalArrivo
     */
    public java.lang.Short getTerminalArrivo() {
        return terminalArrivo;
    }


    /**
     * Sets the terminalArrivo value for this DestinationAddress.
     * 
     * @param terminalArrivo
     */
    public void setTerminalArrivo(java.lang.Short terminalArrivo) {
        this.terminalArrivo = terminalArrivo;
    }


    /**
     * Gets the tipoContrassegno value for this DestinationAddress.
     * 
     * @return tipoContrassegno
     */
    public java.lang.String getTipoContrassegno() {
        return tipoContrassegno;
    }


    /**
     * Sets the tipoContrassegno value for this DestinationAddress.
     * 
     * @param tipoContrassegno
     */
    public void setTipoContrassegno(java.lang.String tipoContrassegno) {
        this.tipoContrassegno = tipoContrassegno;
    }


    /**
     * Gets the tipoLancio value for this DestinationAddress.
     * 
     * @return tipoLancio
     */
    public java.lang.String getTipoLancio() {
        return tipoLancio;
    }


    /**
     * Sets the tipoLancio value for this DestinationAddress.
     * 
     * @param tipoLancio
     */
    public void setTipoLancio(java.lang.String tipoLancio) {
        this.tipoLancio = tipoLancio;
    }


    /**
     * Gets the tipoPorto value for this DestinationAddress.
     * 
     * @return tipoPorto
     */
    public java.lang.String getTipoPorto() {
        return tipoPorto;
    }


    /**
     * Sets the tipoPorto value for this DestinationAddress.
     * 
     * @param tipoPorto
     */
    public void setTipoPorto(java.lang.String tipoPorto) {
        this.tipoPorto = tipoPorto;
    }


    /**
     * Gets the tipoServizioBolle value for this DestinationAddress.
     * 
     * @return tipoServizioBolle
     */
    public java.lang.String getTipoServizioBolle() {
        return tipoServizioBolle;
    }


    /**
     * Sets the tipoServizioBolle value for this DestinationAddress.
     * 
     * @param tipoServizioBolle
     */
    public void setTipoServizioBolle(java.lang.String tipoServizioBolle) {
        this.tipoServizioBolle = tipoServizioBolle;
    }


    /**
     * Gets the tipoStampante value for this DestinationAddress.
     * 
     * @return tipoStampante
     */
    public java.lang.String getTipoStampante() {
        return tipoStampante;
    }


    /**
     * Sets the tipoStampante value for this DestinationAddress.
     * 
     * @param tipoStampante
     */
    public void setTipoStampante(java.lang.String tipoStampante) {
        this.tipoStampante = tipoStampante;
    }


    /**
     * Gets the totSegnaColli value for this DestinationAddress.
     * 
     * @return totSegnaColli
     */
    public java.lang.Integer getTotSegnaColli() {
        return totSegnaColli;
    }


    /**
     * Sets the totSegnaColli value for this DestinationAddress.
     * 
     * @param totSegnaColli
     */
    public void setTotSegnaColli(java.lang.Integer totSegnaColli) {
        this.totSegnaColli = totSegnaColli;
    }


    /**
     * Gets the volume value for this DestinationAddress.
     * 
     * @return volume
     */
    public java.math.BigDecimal getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this DestinationAddress.
     * 
     * @param volume
     */
    public void setVolume(java.math.BigDecimal volume) {
        this.volume = volume;
    }


    /**
     * Gets the zonaSegnaCollo value for this DestinationAddress.
     * 
     * @return zonaSegnaCollo
     */
    public java.lang.Short getZonaSegnaCollo() {
        return zonaSegnaCollo;
    }


    /**
     * Sets the zonaSegnaCollo value for this DestinationAddress.
     * 
     * @param zonaSegnaCollo
     */
    public void setZonaSegnaCollo(java.lang.Short zonaSegnaCollo) {
        this.zonaSegnaCollo = zonaSegnaCollo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DestinationAddress)) return false;
        DestinationAddress other = (DestinationAddress) obj;
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
            ((this.campoInErrore==null && other.getCampoInErrore()==null) || 
             (this.campoInErrore!=null &&
              this.campoInErrore.equals(other.getCampoInErrore()))) &&
            ((this.codiceErrore==null && other.getCodiceErrore()==null) || 
             (this.codiceErrore!=null &&
              this.codiceErrore.equals(other.getCodiceErrore()))) &&
            ((this.codiceProdotto==null && other.getCodiceProdotto()==null) || 
             (this.codiceProdotto!=null &&
              this.codiceProdotto.equals(other.getCodiceProdotto()))) &&
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
            ((this.destinatarioNazione==null && other.getDestinatarioNazione()==null) || 
             (this.destinatarioNazione!=null &&
              this.destinatarioNazione.equals(other.getDestinatarioNazione()))) &&
            ((this.destinatarioProvincia==null && other.getDestinatarioProvincia()==null) || 
             (this.destinatarioProvincia!=null &&
              this.destinatarioProvincia.equals(other.getDestinatarioProvincia()))) &&
            ((this.destinatarioProvinciaAlt==null && other.getDestinatarioProvinciaAlt()==null) || 
             (this.destinatarioProvinciaAlt!=null &&
              this.destinatarioProvinciaAlt.equals(other.getDestinatarioProvinciaAlt()))) &&
            ((this.destinatarioRagioneSociale==null && other.getDestinatarioRagioneSociale()==null) || 
             (this.destinatarioRagioneSociale!=null &&
              this.destinatarioRagioneSociale.equals(other.getDestinatarioRagioneSociale()))) &&
            ((this.fermoDeposito==null && other.getFermoDeposito()==null) || 
             (this.fermoDeposito!=null &&
              this.fermoDeposito.equals(other.getFermoDeposito()))) &&
            ((this.filialeSegnaCollo==null && other.getFilialeSegnaCollo()==null) || 
             (this.filialeSegnaCollo!=null &&
              this.filialeSegnaCollo.equals(other.getFilialeSegnaCollo()))) &&
            ((this.flagVolumeBollettato==null && other.getFlagVolumeBollettato()==null) || 
             (this.flagVolumeBollettato!=null &&
              this.flagVolumeBollettato.equals(other.getFlagVolumeBollettato()))) &&
            ((this.gestParticolaritaConsegna==null && other.getGestParticolaritaConsegna()==null) || 
             (this.gestParticolaritaConsegna!=null &&
              this.gestParticolaritaConsegna.equals(other.getGestParticolaritaConsegna()))) &&
            ((this.gestParticolaritaContrassegno==null && other.getGestParticolaritaContrassegno()==null) || 
             (this.gestParticolaritaContrassegno!=null &&
              this.gestParticolaritaContrassegno.equals(other.getGestParticolaritaContrassegno()))) &&
            ((this.gestParticolaritaGiacenza==null && other.getGestParticolaritaGiacenza()==null) || 
             (this.gestParticolaritaGiacenza!=null &&
              this.gestParticolaritaGiacenza.equals(other.getGestParticolaritaGiacenza()))) &&
            ((this.gestParticolaritaVarie==null && other.getGestParticolaritaVarie()==null) || 
             (this.gestParticolaritaVarie!=null &&
              this.gestParticolaritaVarie.equals(other.getGestParticolaritaVarie()))) &&
            ((this.meseGiornoSpedizione==null && other.getMeseGiornoSpedizione()==null) || 
             (this.meseGiornoSpedizione!=null &&
              this.meseGiornoSpedizione.equals(other.getMeseGiornoSpedizione()))) &&
            ((this.mittenteNazione==null && other.getMittenteNazione()==null) || 
             (this.mittenteNazione!=null &&
              this.mittenteNazione.equals(other.getMittenteNazione()))) &&
            ((this.mittenteProvincia==null && other.getMittenteProvincia()==null) || 
             (this.mittenteProvincia!=null &&
              this.mittenteProvincia.equals(other.getMittenteProvincia()))) &&
            ((this.mittenteRagioneSociale==null && other.getMittenteRagioneSociale()==null) || 
             (this.mittenteRagioneSociale!=null &&
              this.mittenteRagioneSociale.equals(other.getMittenteRagioneSociale()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.numSegnaColloDi==null && other.getNumSegnaColloDi()==null) || 
             (this.numSegnaColloDi!=null &&
              this.numSegnaColloDi.equals(other.getNumSegnaColloDi()))) &&
            ((this.numeroSegnaCollo==null && other.getNumeroSegnaCollo()==null) || 
             (this.numeroSegnaCollo!=null &&
              this.numeroSegnaCollo.equals(other.getNumeroSegnaCollo()))) &&
            ((this.numeroSerie==null && other.getNumeroSerie()==null) || 
             (this.numeroSerie!=null &&
              this.numeroSerie.equals(other.getNumeroSerie()))) &&
            ((this.POArrivo==null && other.getPOArrivo()==null) || 
             (this.POArrivo!=null &&
              this.POArrivo.equals(other.getPOArrivo()))) &&
            ((this.POArrivoDes==null && other.getPOArrivoDes()==null) || 
             (this.POArrivoDes!=null &&
              this.POArrivoDes.equals(other.getPOArrivoDes()))) &&
            ((this.POPartenza==null && other.getPOPartenza()==null) || 
             (this.POPartenza!=null &&
              this.POPartenza.equals(other.getPOPartenza()))) &&
            ((this.POPartenzaDes==null && other.getPOPartenzaDes()==null) || 
             (this.POPartenzaDes!=null &&
              this.POPartenzaDes.equals(other.getPOPartenzaDes()))) &&
            ((this.peso==null && other.getPeso()==null) || 
             (this.peso!=null &&
              this.peso.equals(other.getPeso()))) &&
            ((this.primaConsegnaParticolare==null && other.getPrimaConsegnaParticolare()==null) || 
             (this.primaConsegnaParticolare!=null &&
              this.primaConsegnaParticolare.equals(other.getPrimaConsegnaParticolare()))) &&
            ((this.ricercaPOArrivo==null && other.getRicercaPOArrivo()==null) || 
             (this.ricercaPOArrivo!=null &&
              this.ricercaPOArrivo.equals(other.getRicercaPOArrivo()))) &&
            ((this.ristampa==null && other.getRistampa()==null) || 
             (this.ristampa!=null &&
              this.ristampa.equals(other.getRistampa()))) &&
            ((this.secondaConsegnaParticolare==null && other.getSecondaConsegnaParticolare()==null) || 
             (this.secondaConsegnaParticolare!=null &&
              this.secondaConsegnaParticolare.equals(other.getSecondaConsegnaParticolare()))) &&
            ((this.terminalArrivo==null && other.getTerminalArrivo()==null) || 
             (this.terminalArrivo!=null &&
              this.terminalArrivo.equals(other.getTerminalArrivo()))) &&
            ((this.tipoContrassegno==null && other.getTipoContrassegno()==null) || 
             (this.tipoContrassegno!=null &&
              this.tipoContrassegno.equals(other.getTipoContrassegno()))) &&
            ((this.tipoLancio==null && other.getTipoLancio()==null) || 
             (this.tipoLancio!=null &&
              this.tipoLancio.equals(other.getTipoLancio()))) &&
            ((this.tipoPorto==null && other.getTipoPorto()==null) || 
             (this.tipoPorto!=null &&
              this.tipoPorto.equals(other.getTipoPorto()))) &&
            ((this.tipoServizioBolle==null && other.getTipoServizioBolle()==null) || 
             (this.tipoServizioBolle!=null &&
              this.tipoServizioBolle.equals(other.getTipoServizioBolle()))) &&
            ((this.tipoStampante==null && other.getTipoStampante()==null) || 
             (this.tipoStampante!=null &&
              this.tipoStampante.equals(other.getTipoStampante()))) &&
            ((this.totSegnaColli==null && other.getTotSegnaColli()==null) || 
             (this.totSegnaColli!=null &&
              this.totSegnaColli.equals(other.getTotSegnaColli()))) &&
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
        if (getCampoInErrore() != null) {
            _hashCode += getCampoInErrore().hashCode();
        }
        if (getCodiceErrore() != null) {
            _hashCode += getCodiceErrore().hashCode();
        }
        if (getCodiceProdotto() != null) {
            _hashCode += getCodiceProdotto().hashCode();
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
        if (getDestinatarioNazione() != null) {
            _hashCode += getDestinatarioNazione().hashCode();
        }
        if (getDestinatarioProvincia() != null) {
            _hashCode += getDestinatarioProvincia().hashCode();
        }
        if (getDestinatarioProvinciaAlt() != null) {
            _hashCode += getDestinatarioProvinciaAlt().hashCode();
        }
        if (getDestinatarioRagioneSociale() != null) {
            _hashCode += getDestinatarioRagioneSociale().hashCode();
        }
        if (getFermoDeposito() != null) {
            _hashCode += getFermoDeposito().hashCode();
        }
        if (getFilialeSegnaCollo() != null) {
            _hashCode += getFilialeSegnaCollo().hashCode();
        }
        if (getFlagVolumeBollettato() != null) {
            _hashCode += getFlagVolumeBollettato().hashCode();
        }
        if (getGestParticolaritaConsegna() != null) {
            _hashCode += getGestParticolaritaConsegna().hashCode();
        }
        if (getGestParticolaritaContrassegno() != null) {
            _hashCode += getGestParticolaritaContrassegno().hashCode();
        }
        if (getGestParticolaritaGiacenza() != null) {
            _hashCode += getGestParticolaritaGiacenza().hashCode();
        }
        if (getGestParticolaritaVarie() != null) {
            _hashCode += getGestParticolaritaVarie().hashCode();
        }
        if (getMeseGiornoSpedizione() != null) {
            _hashCode += getMeseGiornoSpedizione().hashCode();
        }
        if (getMittenteNazione() != null) {
            _hashCode += getMittenteNazione().hashCode();
        }
        if (getMittenteProvincia() != null) {
            _hashCode += getMittenteProvincia().hashCode();
        }
        if (getMittenteRagioneSociale() != null) {
            _hashCode += getMittenteRagioneSociale().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getNumSegnaColloDi() != null) {
            _hashCode += getNumSegnaColloDi().hashCode();
        }
        if (getNumeroSegnaCollo() != null) {
            _hashCode += getNumeroSegnaCollo().hashCode();
        }
        if (getNumeroSerie() != null) {
            _hashCode += getNumeroSerie().hashCode();
        }
        if (getPOArrivo() != null) {
            _hashCode += getPOArrivo().hashCode();
        }
        if (getPOArrivoDes() != null) {
            _hashCode += getPOArrivoDes().hashCode();
        }
        if (getPOPartenza() != null) {
            _hashCode += getPOPartenza().hashCode();
        }
        if (getPOPartenzaDes() != null) {
            _hashCode += getPOPartenzaDes().hashCode();
        }
        if (getPeso() != null) {
            _hashCode += getPeso().hashCode();
        }
        if (getPrimaConsegnaParticolare() != null) {
            _hashCode += getPrimaConsegnaParticolare().hashCode();
        }
        if (getRicercaPOArrivo() != null) {
            _hashCode += getRicercaPOArrivo().hashCode();
        }
        if (getRistampa() != null) {
            _hashCode += getRistampa().hashCode();
        }
        if (getSecondaConsegnaParticolare() != null) {
            _hashCode += getSecondaConsegnaParticolare().hashCode();
        }
        if (getTerminalArrivo() != null) {
            _hashCode += getTerminalArrivo().hashCode();
        }
        if (getTipoContrassegno() != null) {
            _hashCode += getTipoContrassegno().hashCode();
        }
        if (getTipoLancio() != null) {
            _hashCode += getTipoLancio().hashCode();
        }
        if (getTipoPorto() != null) {
            _hashCode += getTipoPorto().hashCode();
        }
        if (getTipoServizioBolle() != null) {
            _hashCode += getTipoServizioBolle().hashCode();
        }
        if (getTipoStampante() != null) {
            _hashCode += getTipoStampante().hashCode();
        }
        if (getTotSegnaColli() != null) {
            _hashCode += getTotSegnaColli().hashCode();
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
        new org.apache.axis.description.TypeDesc(DestinationAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DestinationAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "AnnoSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campoInErrore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "CampoInErrore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceErrore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "CodiceErrore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceProdotto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "CodiceProdotto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneErrore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DescrizioneErrore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioCap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DestinatarioCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioIndirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DestinatarioIndirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioLocalita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DestinatarioLocalita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioNazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DestinatarioNazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DestinatarioProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioProvinciaAlt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DestinatarioProvinciaAlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarioRagioneSociale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "DestinatarioRagioneSociale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fermoDeposito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "FermoDeposito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filialeSegnaCollo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "FilialeSegnaCollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagVolumeBollettato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "FlagVolumeBollettato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gestParticolaritaConsegna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "GestParticolaritaConsegna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gestParticolaritaContrassegno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "GestParticolaritaContrassegno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gestParticolaritaGiacenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "GestParticolaritaGiacenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gestParticolaritaVarie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "GestParticolaritaVarie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meseGiornoSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "MeseGiornoSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittenteNazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "MittenteNazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittenteProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "MittenteProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittenteRagioneSociale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "MittenteRagioneSociale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "Network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSegnaColloDi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "NumSegnaColloDi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSegnaCollo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "NumeroSegnaCollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "NumeroSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POArrivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "POArrivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POArrivoDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "POArrivoDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POPartenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "POPartenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POPartenzaDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "POPartenzaDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "Peso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaConsegnaParticolare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "PrimaConsegnaParticolare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaPOArrivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "RicercaPOArrivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ristampa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "Ristampa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaConsegnaParticolare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "SecondaConsegnaParticolare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalArrivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "TerminalArrivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoContrassegno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "TipoContrassegno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoLancio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "TipoLancio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPorto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "TipoPorto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServizioBolle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "TipoServizioBolle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoStampante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "TipoStampante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totSegnaColli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "TotSegnaColli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "Volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zonaSegnaCollo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.DAL", "ZonaSegnaCollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
