package modelo;

public class Audio {
    private String titulo;
    private int duracao;
    private int curtidas;
    private int classificacao;

    public void curtir(){
        curtidas+=1;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao += classificacao;
    }

    public void getClassificacao(){
        System.out.println(classificacao/curtidas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
