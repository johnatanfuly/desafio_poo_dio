import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos John" + devJohn.getConteudosInscritos());
        devJohn.progredir();
        devJohn.progredir();
        devJohn.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos John" + devJohn.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos John" + devJohn.getConteudosConcluidos());
        System.out.println("XP" + devJohn.calcularTotalXP());

        System.out.println("--------------------");


        Dev devJohn2 = new Dev();
        devJohn2.setNome("John2");
        devJohn2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos John2" + devJohn2.getConteudosInscritos());
        devJohn2.progredir();
        devJohn2.progredir();
        devJohn2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos John2" + devJohn2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos John2" + devJohn2.getConteudosConcluidos());
        System.out.println("XP" + devJohn2.calcularTotalXP());




    }
}