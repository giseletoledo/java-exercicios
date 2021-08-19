public class Personagem {
    String nomePersonagem;
    String nomeItem;
    int qtdItens;
    int velocidade;

    public Personagem(){
        this.velocidade = 0;
        this.qtdItens = 0;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomeRecebido) {
        this.nomePersonagem = nomeRecebido;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public void diminuiQtd(int qtdItens){
        if(qtdItens > 0){
            this.qtdItens = this.qtdItens - 1;
        } else {
            this.qtdItens = 0;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int velocidadeRecebida) { //static não aparece no main
        if(velocidadeRecebida <=0) {
            System.out.println("Digite um número maior que 0");
        } else {
            this.velocidade = this.velocidade + velocidadeRecebida;
            System.out.println("Sua velocidade agora é de :" + velocidade);
        }
    }

    public void desacelerar(int velocidadeRecebida){
        if((this.velocidade > 0) && (this.velocidade > velocidadeRecebida)){
            this.velocidade= this.velocidade - velocidadeRecebida;
        } else {
            this.velocidade = 0;
        }
        System.out.println("Sua velocidade agora é de :" + velocidade);
    }

    public String utilizarItem(String nomeItem, int qtdItens){//dúvida aqui não pode ser void, mas só queria mostrar a mensagem e adicionei o return
        System.out.println("Usando item adicionado: " + nomeItem);
        diminuiQtd(qtdItens);
        return nomeItem;
    }

    public String adicionaItem(String nomeItem){
        System.out.println("Item: " + nomeItem + " adicionado");
        this.qtdItens ++;
        return nomeItem;
    }
}
