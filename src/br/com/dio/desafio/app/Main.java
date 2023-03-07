package br.com.dio.desafio.app;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cJava = new Curso();
        cJava.setTitulo("Curso Java Iniciante");
        cJava.setDescricao("Curso voltando para a introdução da linguagem" +
                "de programação Java. ");
        cJava.setCargaHoraria(4);

        Curso cJavaScript = new Curso();

        cJavaScript.setTitulo("Curso JavaScript Iniciante");
        cJavaScript.setDescricao("Curso voltando para a introdução da linguagem" +
                "de programação JavaScript. ");
        cJavaScript.setCargaHoraria(4);

        Mentoria mJava = new Mentoria();
        mJava.setTitulo("Mentoria Java");
        mJava.setDescricao("A nova mentoria para programadores Java");
        mJava.setData(LocalDate.now());

        System.out.println(cJava.toString() +
                "\n" +
                cJavaScript +
                "\n" +
                mJava);
    }
}