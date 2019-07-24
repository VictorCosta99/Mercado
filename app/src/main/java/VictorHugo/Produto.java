package VictorHugo;

public class Produto {

  public static void main(String[] args) {
 
}
public   int codigo;
public  String descricao;
public int datafbr;
public int datavali;
public float valor;
public String Dono;

 Produto produto = new Produto();

    private int getcodigo() {
        return this.codigo;
    }

    private void setcodigo(int codigo) {
        this.codigo = codigo;
    }
    private String getdescricao() {
        return this.descricao;
    }

    private void setdescricao(String descricao) {
        this.descricao = descricao;
    }
    private int getdatafbr() {
        return this.datafbr;
    }

    private void setdatafbr(int datafbr) {
        this.datafbr = datafbr;
    }
    private int getdatavali() {
        return this.datavali;
    }

    private void setdatavali(int datavali) {
        this.datavali = datavali;
    }
    private float getvalor() {
        return this.valor;
    }

    private void setvalor(int valor) {
        this.valor = valor;
    }

  }

