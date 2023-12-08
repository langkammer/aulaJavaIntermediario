package encapsulamento;

public class Animal {
    private String raca;
    private String cor;
    private double altura;
    private double peso;

    private double precoTosa;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecoTosa() {
        return precoTosa;
    }

    public void setPrecoTosa(double precoTosa) {
        this.precoTosa = precoTosa;
    }


    public boolean ehPorteGrande() {
        return this.peso > 1.0 && this.altura > 0.5;
    }
}
