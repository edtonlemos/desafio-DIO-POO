package br.com.dio.desafio.app;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

//        System.out.println(cJava.toString() +
//                "\n" +
//                cJavaScript +
//                "\n" +
//                mJava);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(cJava);
        bootcamp.getConteudos().add(cJavaScript);
        bootcamp.getConteudos().add(mJava);

        Dev dev1 = new Dev();
        dev1.setNome("Maria da Silva");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

//        Dev dev2 = new Dev();
//        dev2.setNome("João José");
//        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
//        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());


    }
}