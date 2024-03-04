package principal;

import modelo.Musica;

public class Main {
    public static void main(String[]args){
        Musica musica1 = new Musica();
        musica1.setAutor("Eminem");
        musica1.setGravadora("VEVO");
        musica1.setClassificacao(10);
        musica1.setClassificacao(8);
        musica1.curtir();
        musica1.curtir();
        musica1.setDuracao(2);
        musica1.setTitulo("Mockingbird");
        musica1.getClassificacao();
    }
}
