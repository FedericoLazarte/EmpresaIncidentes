package com.argentinaprograma.estado;

import com.argentinaprograma.models.Incidente;

public abstract class Estado {
    public abstract void cambiarEstado(Incidente incidente);
    public abstract void marcarResuelto(Incidente incidente, String consideraciones);

}
