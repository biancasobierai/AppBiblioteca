package br.com.biancasobierai.biblioteca.model.livro;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Livro {
    private int id;
    private String nome;
    private String editora;
    private String autor;
    private boolean aceiteTermos;
    private String dataLancamento;
    private String tradutor;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEditora() {return editora;}
    public void setEditora(String editora) {this.editora = editora;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}
    public String getDataLancamento() {return dataLancamento;}
    public void setDataLancamento(String dataLancamento) {this.dataLancamento = dataLancamento;}
    public String getTradutor() {return tradutor;}
    public void setTradutor(String tradutor) {this.tradutor = tradutor;}

}
