# RemoteBartoliniRequest
War di collegamento al servizio di tracking spedizioni Bartolini funziona con il progetto remoteBartoliniRequestCommon presente nelle mie repository


# GetSpedIDbyRMN

inviato un NumericReferenceNumber (SOLAMENTE NUMERICO)
viene restituito il tracking code (shipment ID)

altre info presenti nei richiami della chiamata.

# GetSpedIDbyRMA

inviato un AlphabeticcReferenceNumber (SOLAMENTE ALFABETICO)
viene restituito il tracking code (shipment ID)

altre info presenti nei richiami della chiamata.


# GetSpedIDbyIdCollo

inviato un IDCollo
viene restituito il tracking code (shipment ID)

altre info presenti nei richiami della chiamata.

# GetTrackingbySpedID

inviato il tracking code (shipment ID), l' anno di spedizione, e il codice lingua ISO639_ALPHA2.
viene restituito l' intero tracking della spedizione con tutte le informazioni che Bartolini comunica.

altre info presenti nei richiami della chiamata.



# GetDescrizioneEvento
inviato il codiceEvento (AVV,AV2,G09,ecc...), e il codice lingua ISO639_ALPHA2.
restituisce in lingua selezionata dal codice lingua iso la descrizione del evento



# GetDescrizioneEsito

inviato il codice Esito presente ai get di ogni chiamata (0,-11,2,ecc...), e il codice lingua ISO639_ALPHA2.
restituisce in lingua selezionata dal codice lingua iso la descrizione del codice esito















# RemoteBartoliniRequest
War of connection to the tracking service Bartolini works with the remoteBartoliniRequestCommon project present in my repositories



# GetSpedIDbyRMN

sent a NumericReferenceNumber (ONLY NUMERICAL)
the tracking code is returned (shipment ID)

other info present in the calls of the call.


# GetSpedIDbyRMA

inviato un AlphabeticcReferenceNumber (SOLAMENTE ALFABETICO)
viene restituito il codice di tracciamento (ID spedizione)

altre info presenti nei richiami della chiamata


# GetSpedIDbyIdCollo

sent a IDCollo
the tracking code is returned (shipment ID)

other info present in the calls of the call.

# GetTrackingbySpedID

sent the tracking code (shipment ID), the year of shipment, and the language code ISO639_ALPHA2.
the entire tracking of the shipment is returned with all the information that Bartolini communicates.

other info present in the calls of the call.


# GetDescriptionEvent
sent theEvent code (AVV, AV2, G09, etc ...), and the language code ISO639_ALPHA2.
returns the description of the event in the language selected by the ISO language code



# GetDescriptionExit

sent the Esito code present at the get of each call (0, -11.2, etc ...), and the language code ISO639_ALPHA2.
returns the description of the outcome code in the language selected by the ISO language code