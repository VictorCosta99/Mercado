package VictorHugo;


import java.util.Scanner;


public class Limpeza {
public static void main(String[] args) {
System.out.println("Digite o codigo");

System.out.println("Digite a descrição");

}

private int codigo;
private String descricao;
private int datafbr;
private int datavali;
private int valor;
    
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
    private int getvalor() {
        return this.valor;
    }

    private void setvalor(int valor) {
        this.valor = valor;
    }
}


