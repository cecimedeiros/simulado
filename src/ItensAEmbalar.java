import java.util.ArrayList;

public class ItensAEmbalar {
    ArrayList <ItemASerEmbaladoIF> itens = new ArrayList<>();

    public int adicionaItem(ItemASerEmbaladoIF item){
        itens.add(item);
        return itens.lastIndexOf(item);
    }

    public ItemASerEmbaladoIF calculaQtdeDeEmbalar(int posicao){
        return itens.get(posicao);
    }

    public double calculaQtdeTotalDeEmbalar(){
        return itens.size();
    }

}
