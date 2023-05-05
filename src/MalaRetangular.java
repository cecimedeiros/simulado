import java.util.Objects;

public class MalaRetangular extends ItemASerEmbaladoIF {
    private String material;
    private double lado1;
    private double lado2;
    private double peso;

    public MalaRetangular(String material, double lado1, double lado2, double peso) throws Exception {
        super();
        testaEntrada(material, lado1, lado2, peso);
        this.material = material;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.peso = peso;
    }

    private void testaEntrada(String material, double lado1, double lado2, double peso) throws Exception {
        if(material == null || material.equals(""))
            throw new Exception("Material tem que ser informado");

        if(lado1 <= 0)
            throw new Exception("Lado1 tem que ser maior que zero");

        if(lado2 <= 0)
            throw new Exception("Lado2 tem que ser maior que zero");

        if(peso <= 0)
            throw new Exception("Peso tem que ser maior que zero");
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public double getArea() {
        return lado1 * lado2;
    }

    public int hashCode() {
        return Objects.hash(material, peso, lado1, lado2);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof MalaRetangular))
            return false;
        MalaRetangular other = (MalaRetangular) obj;
        return Objects.equals(material, other.material)
                && Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
                && Double.doubleToLongBits(lado1) == Double.doubleToLongBits(other.lado1)
                && Double.doubleToLongBits(lado2) == Double.doubleToLongBits(other.lado2);
    }

    public String toString() {
        return "Mala Retangular de " + material + ", com área " + getArea() + " e peso de " + getPeso() + " gramas.";
    }
}
