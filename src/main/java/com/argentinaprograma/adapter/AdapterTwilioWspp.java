package com.argentinaprograma.adapter;

import com.argentinaprograma.models.NotificacionMensaje;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class AdapterTwilioWspp implements AdapterRemitenteWhatsApp{
    private static final String ACCOUNT_SID = System.getenv("US96fbb6d49d560e2a9f20a6d1f1561ad7");
    private static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    private static final String remitente = "wthasapp:+541123949138";


    @Override
    public void notificacionWspp(NotificacionMensaje notificacion, String numeroCel) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        String saludos = "Hola, se reporta al cliente lo siguiente: ";
        Message message = Message.creator(
                        new PhoneNumber(numeroCel),
                        new PhoneNumber(remitente),
                         saludos + notificacion.toString())
                .create();

        System.out.println(message.getSid());
    }
}
