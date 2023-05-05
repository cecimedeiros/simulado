public class Estatua {
    private String STRING_VAZIA = "";
    private String material;
    private int base;
    private int altura;
    private int peso;

    public Estatua(String material, int base, int altura, int peso) throws Exception {
        super();
        if (material == null || material.equals(STRING_VAZIA)) {
            throw new Exception("Material nao pode ser nulo ou vazio");
        }
        if (base == 0) {
            throw new Exception("Base não pode ser 0");
        }
        if (altura == 0) {
            throw new Exception("Altura não pode ser 0");
        }
        if (peso == 0) {
            throw new Exception("Peso não pode ser 0");
        }
        this.material = material;
        this.base = base;
        this.altura = altura;
        this.peso = peso;
    }
    public String getMaterial(){
        return material;
    }
    public int getBase(){
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }
}
