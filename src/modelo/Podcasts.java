package modelo;

import modelo.Audio;

public class Podcasts extends Audio {
    private String apresentador_1;
    private String apresentador_2;
    private String convidado;

    public String getApresentador_1() {
        return apresentador_1;
    }

    public void setApresentador_1(String apresentador_1) {
        this.apresentador_1 = apresentador_1;
    }

    public String getApresentador_2() {
        return apresentador_2;
    }

    public void setApresentador_2(String apresentador_2) {
        this.apresentador_2 = apresentador_2;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
