/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

import com.sun.org.apache.bcel.internal.generic.IADD;
import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author a120088
 */
public class Main {

    public static boolean sucesso;
    public static int i, j;
    public static int randomHorario, randomDia;
    public static Random random = new Random();
    public static DiasDaSemana segunda = new DiasDaSemana();
    public static DiasDaSemana terca = new DiasDaSemana();
    public static DiasDaSemana quarta = new DiasDaSemana();
    public static DiasDaSemana quinta = new DiasDaSemana();
    public static DiasDaSemana sexta = new DiasDaSemana();

    public static Turma primeiroAno = new Turma();
    public static Turma segundoAno = new Turma();
    public static Turma terceiroAno = new Turma();
    public static Turma quartoAno = new Turma();

    public static Laboratorio lab1 = new Laboratorio();
    public static Laboratorio lab2 = new Laboratorio();
    public static Laboratorio lab3 = new Laboratorio();
    public static Laboratorio lab4 = new Laboratorio();

    public static Disciplina calculoI = new Disciplina();
    public static Disciplina teoriaEPratica = new Disciplina();
    public static Disciplina matematicaDiscreta = new Disciplina();
    public static Disciplina progI = new Disciplina();
    public static Disciplina sociologia = new Disciplina();
    public static Disciplina sistemasDigitais = new Disciplina();
    public static Disciplina introducaoACC = new Disciplina();
    public static Disciplina adm = new Disciplina();
    public static Disciplina compESoci = new Disciplina();
    public static Disciplina comunic = new Disciplina();
    public static Disciplina calculoII = new Disciplina();
    public static Disciplina estruturaDeDados = new Disciplina();
    public static Disciplina metodologiaPesquisa = new Disciplina();
    public static Disciplina fisica = new Disciplina();
    public static Disciplina algebra = new Disciplina();
    public static Disciplina probEEst = new Disciplina();
    public static Disciplina teoriaDaComp = new Disciplina();
    public static Disciplina arqComp = new Disciplina();
    public static Disciplina progII = new Disciplina();
    public static Disciplina engSoftI = new Disciplina();
    public static Disciplina projEAnalise = new Disciplina();
    public static Disciplina sO = new Disciplina();
    public static Disciplina bD = new Disciplina();
    public static Disciplina lingProg = new Disciplina();
    public static Disciplina engSoftII = new Disciplina();
    public static Disciplina comp = new Disciplina();
    public static Disciplina redes = new Disciplina();
    public static Disciplina iA = new Disciplina();
    public static Disciplina pratEGerenc = new Disciplina();
    public static Disciplina sistDistribuidos = new Disciplina();
    public static Disciplina engSoftIII = new Disciplina();
    public static Disciplina compGraf = new Disciplina();
    public static Disciplina compSimbolica = new Disciplina();
    public static Disciplina empreendedorismo = new Disciplina();
    public static Disciplina segEAuditoria = new Disciplina();
    public static Disciplina informaticaEEducacao = new Disciplina();
    public static Disciplina interfaceHM = new Disciplina();

    public static Professor ailton = new Professor();
    public static Professor andre = new Professor();
    public static Professor brunoMiguel = new Professor();
    public static Professor brunoFaical = new Professor();
    public static Professor carlosEduardo = new Professor();
    public static Professor carlosHenrique = new Professor();
    public static Professor christian = new Professor();
    public static Professor cristiane = new Professor();
    public static Professor daniela = new Professor();
    public static Professor ederson = new Professor();
    public static Professor fabio = new Professor();
    public static Professor glauco = new Professor();
    public static Professor joseMerlin = new Professor();
    public static Professor luizFernando = new Professor();
    public static Professor luizRenato = new Professor();
    public static Professor maisa = new Professor();
    public static Professor marcioHasegawa = new Professor();
    public static Professor mauricio = new Professor();
    public static Professor ricardo = new Professor();
    public static Professor tamara = new Professor();
    public static Professor thiago = new Professor();
    public static Professor wellington = new Professor();

    public static void iniciar() {

    }

    public static void main(String[] args) {
        primeiroAno.pedirQtdAlunos("primeiro");
        segundoAno.pedirQtdAlunos("segundo");
        terceiroAno.pedirQtdAlunos("terceiro");
        quartoAno.pedirQtdAlunos("quarto");

        //primeiroAno.pedirQtdAlunos(0);
        //segundoAno.pedirQtdAlunos(0);
        //terceiroAno.pedirQtdAlunos(0);
        quartoAno.setQtdAlunos(14);

        //lab1.setCapacidade(24);
        lab2.setCapacidade(24);
        //lab3.setCapacidade(24);
        //lab4.setCapacidade(24);

        calculoI.setCargaHoraria(120);
        calculoI.setDisciplinaAnual(true);
        calculoI.setNomeDisciplina("Cálculo e Geometria Analítica I");
        calculoI.setNomeDoProfessor("Maisa Lucia C. Milani");
        calculoI.setAnoQueADisciplinaPercente(1);
        calculoI.setAulasSemanais(4);

        teoriaEPratica.setCargaHoraria(60);
        teoriaEPratica.setDisciplinaAnual(true);
        teoriaEPratica.setNomeDisciplina("Teoria e Prática de Sistema de Informação");
        teoriaEPratica.setNomeDoProfessor("Thiago Adriano Coleti");
        teoriaEPratica.setAnoQueADisciplinaPercente(1);
        teoriaEPratica.setAulasSemanais(2);

        matematicaDiscreta.setCargaHoraria(90);
        matematicaDiscreta.setDisciplinaAnual(true);
        matematicaDiscreta.setNomeDisciplina("Matemática Discreta e Lógica Matemática");
        matematicaDiscreta.setNomeDoProfessor("Luiz Fernando Legore do Nascimento");
        matematicaDiscreta.setPrecisaDeLab(true);
        matematicaDiscreta.setAnoQueADisciplinaPercente(1);
        matematicaDiscreta.setAulasSemanais(3);

        progI.setCargaHoraria(120);
        progI.setDisciplinaAnual(true);
        progI.setNomeDisciplina("Programação I");
        progI.setNomeDoProfessor("Bruno Squizato Faiçal");
        progI.setPrecisaDeLab(true);
        progI.setAnoQueADisciplinaPercente(1);
        progI.setAulasSemanais(4);

        sociologia.setCargaHoraria(60);
        sociologia.setDisciplinaAnual(false);
        sociologia.setNomeDisciplina("Sociologia");
        sociologia.setNomeDoProfessor("Cristiane Schell Gabriel");
        sociologia.setAnoQueADisciplinaPercente(1);
        sociologia.setAulasSemanais(2);

        sistemasDigitais.setCargaHoraria(120);
        sistemasDigitais.setDisciplinaAnual(true);
        sistemasDigitais.setNomeDisciplina("Sistemas Digitais");
        sistemasDigitais.setNomeDoProfessor("Mauricio Massaru Arimoto");
        sistemasDigitais.setAnoQueADisciplinaPercente(1);
        sistemasDigitais.setAulasSemanais(4);

        introducaoACC.setCargaHoraria(60);
        introducaoACC.setDisciplinaAnual(true);
        introducaoACC.setNomeDisciplina("Introdução a Ciência da Computação");
        introducaoACC.setNomeDoProfessor("Ailton Sergio Bonifácio");
        introducaoACC.setPrecisaDeLab(true);
        introducaoACC.setAnoQueADisciplinaPercente(1);
        introducaoACC.setAulasSemanais(2);

        adm.setCargaHoraria(60);
        adm.setDisciplinaAnual(false);
        adm.setNomeDisciplina("Administração");
        adm.setNomeDoProfessor("Carlos Henrique Machado");
        adm.setAnoQueADisciplinaPercente(1);
        adm.setAulasSemanais(2);

        compESoci.setCargaHoraria(60);
        compESoci.setDisciplinaAnual(false);
        compESoci.setNomeDisciplina("Computadores e Sociedade");
        compESoci.setNomeDoProfessor("Mauricio Massaru Arimoto");
        compESoci.setAnoQueADisciplinaPercente(1);
        compESoci.setAulasSemanais(2);

        comunic.setCargaHoraria(60);
        comunic.setDisciplinaAnual(false);
        comunic.setNomeDisciplina("Comunicação e Expressão");
        comunic.setNomeDoProfessor("Tamara Angélica Baldo");
        comunic.setAnoQueADisciplinaPercente(1);
        comunic.setAulasSemanais(2);

        calculoII.setCargaHoraria(120);
        calculoII.setDisciplinaAnual(true);
        calculoII.setNomeDisciplina("Cálculo e Geometria Analítica II");
        calculoII.setNomeDoProfessor("Maisa Lucia C. Milani");
        calculoII.setAnoQueADisciplinaPercente(2);
        calculoII.setAulasSemanais(4);

        estruturaDeDados.setCargaHoraria(120);
        estruturaDeDados.setDisciplinaAnual(true);
        estruturaDeDados.setNomeDisciplina("Estrutura de Dados");
        estruturaDeDados.setNomeDoProfessor("Tamara Angélica Baldo");
        estruturaDeDados.setPrecisaDeLab(true);
        estruturaDeDados.setAnoQueADisciplinaPercente(2);
        estruturaDeDados.setAulasSemanais(4);

        metodologiaPesquisa.setCargaHoraria(60);
        metodologiaPesquisa.setDisciplinaAnual(false);
        metodologiaPesquisa.setNomeDisciplina("Metodologia de Pesquisa");
        metodologiaPesquisa.setNomeDoProfessor("Tamara Angélica Baldo");
        metodologiaPesquisa.setAnoQueADisciplinaPercente(2);
        metodologiaPesquisa.setAulasSemanais(2);

        fisica.setCargaHoraria(90);
        fisica.setDisciplinaAnual(true);
        fisica.setNomeDisciplina("Física");
        fisica.setNomeDoProfessor("Marcio Massashiko Hasegawa");
        fisica.setAnoQueADisciplinaPercente(2);
        fisica.setAulasSemanais(3);

        algebra.setCargaHoraria(60);
        algebra.setDisciplinaAnual(false);
        algebra.setNomeDisciplina("Álgebra Linear");
        algebra.setNomeDoProfessor("Caroline Subirá Pereira");
        algebra.setAnoQueADisciplinaPercente(2);
        algebra.setAulasSemanais(2);

        probEEst.setCargaHoraria(60);
        probEEst.setDisciplinaAnual(false);
        probEEst.setNomeDisciplina("Probabilidade e Estatística");
        probEEst.setNomeDoProfessor("Luiz Renato Martins da Rocha");
        probEEst.setAnoQueADisciplinaPercente(2);
        probEEst.setAulasSemanais(2);

        teoriaDaComp.setCargaHoraria(120);
        teoriaDaComp.setDisciplinaAnual(true);
        teoriaDaComp.setNomeDisciplina("Teoria da Computação");
        teoriaDaComp.setNomeDoProfessor("Wellington Aparecido Della Mura");
        teoriaDaComp.setPrecisaDeLab(true);
        teoriaDaComp.setAnoQueADisciplinaPercente(2);
        teoriaDaComp.setAulasSemanais(4);

        arqComp.setCargaHoraria(60);
        arqComp.setDisciplinaAnual(true);
        arqComp.setNomeDisciplina("Arquitetura de Computadores");
        arqComp.setNomeDoProfessor("Thiago Adriano Coleti");
        arqComp.setPrecisaDeLab(true);
        arqComp.setAnoQueADisciplinaPercente(2);
        arqComp.setAulasSemanais(2);

        progII.setCargaHoraria(120);
        progII.setDisciplinaAnual(true);
        progII.setNomeDisciplina("Programação II");
        progII.setNomeDoProfessor("José Reinaldo Merlin");
        progII.setPrecisaDeLab(true);
        progII.setAnoQueADisciplinaPercente(2);
        progII.setAulasSemanais(4);

        engSoftI.setCargaHoraria(60);
        engSoftI.setDisciplinaAnual(false);
        engSoftI.setNomeDisciplina("Engenharia de Software II");
        engSoftI.setNomeDoProfessor("André Luis Andrade Menolli");
        engSoftI.setAnoQueADisciplinaPercente(2);
        engSoftI.setAulasSemanais(2);

        projEAnalise.setCargaHoraria(60);
        projEAnalise.setDisciplinaAnual(true);
        projEAnalise.setNomeDisciplina("Projeto e Análise de Algoritmos");
        projEAnalise.setNomeDoProfessor("Bruno Squizato Faiçal");
        projEAnalise.setPrecisaDeLab(true);
        projEAnalise.setAnoQueADisciplinaPercente(3);
        projEAnalise.setAulasSemanais(2);

        sO.setCargaHoraria(120);
        sO.setDisciplinaAnual(true);
        sO.setNomeDisciplina("Sistemas Operacionais");
        sO.setNomeDoProfessor("Thiago Adriano Coleti");
        sO.setPrecisaDeLab(true);
        sO.setAnoQueADisciplinaPercente(3);
        sO.setAulasSemanais(4);

        bD.setCargaHoraria(120);
        bD.setDisciplinaAnual(true);
        bD.setNomeDisciplina("Banco de Dados");
        bD.setNomeDoProfessor("Ailton Sergio Bonifácio");
        bD.setPrecisaDeLab(true);
        bD.setAnoQueADisciplinaPercente(3);
        bD.setAulasSemanais(4);

        lingProg.setCargaHoraria(60);
        lingProg.setDisciplinaAnual(false);
        lingProg.setNomeDisciplina("Linguagues de Programação");
        lingProg.setNomeDoProfessor("Bruno Squizato Faiçal");
        lingProg.setAnoQueADisciplinaPercente(2);

        engSoftII.setCargaHoraria(90);
        engSoftII.setDisciplinaAnual(true);
        engSoftII.setNomeDisciplina("Engenharia de Software II");
        engSoftII.setNomeDoProfessor("André Luis Andrade Menolli");
        engSoftII.setPrecisaDeLab(true);
        engSoftII.setAnoQueADisciplinaPercente(3);
        engSoftII.setAulasSemanais(3);

        comp.setCargaHoraria(120);
        comp.setDisciplinaAnual(true);
        comp.setNomeDisciplina("Compiladores");
        comp.setNomeDoProfessor("Wellington Aparecido Della Mura");
        comp.setPrecisaDeLab(true);
        comp.setAnoQueADisciplinaPercente(3);
        comp.setAulasSemanais(4);

        redes.setCargaHoraria(120);
        redes.setDisciplinaAnual(true);
        redes.setNomeDisciplina("Redes");
        redes.setNomeDoProfessor("Ricardo Gonçalves Coelho");
        redes.setPrecisaDeLab(true);
        redes.setAnoQueADisciplinaPercente(3);
        redes.setAulasSemanais(4);

        iA.setCargaHoraria(120);
        iA.setDisciplinaAnual(true);
        iA.setNomeDisciplina("Inteligência Artificial");
        iA.setNomeDoProfessor("Glauco Carlos Silva");
        iA.setPrecisaDeLab(true);
        iA.setAnoQueADisciplinaPercente(3);
        iA.setAulasSemanais(4);

        pratEGerenc.setCargaHoraria(60);
        pratEGerenc.setDisciplinaAnual(false);
        pratEGerenc.setNomeDisciplina("Prática e Gerenciamento de Projetos");
        pratEGerenc.setNomeDoProfessor("Daniela de Freitas Guilhermino Trindade");
        pratEGerenc.setPrecisaDeLab(true);
        pratEGerenc.setAnoQueADisciplinaPercente(4);
        pratEGerenc.setAulasSemanais(2);

        sistDistribuidos.setCargaHoraria(120);
        sistDistribuidos.setDisciplinaAnual(true);
        sistDistribuidos.setNomeDisciplina("Sistemas Distribuídos");
        sistDistribuidos.setNomeDoProfessor("Ricardo Gonçalves Coelho");
        sistDistribuidos.setPrecisaDeLab(true);
        sistDistribuidos.setAnoQueADisciplinaPercente(4);
        sistDistribuidos.setAulasSemanais(4);

        engSoftIII.setCargaHoraria(60);
        engSoftIII.setDisciplinaAnual(true);
        engSoftIII.setNomeDisciplina("Engenharia de Software III");
        engSoftIII.setNomeDoProfessor("Fabio de Sordi Junior");
        engSoftIII.setAnoQueADisciplinaPercente(4);
        engSoftIII.setAulasSemanais(2);

        compGraf.setCargaHoraria(60);
        compGraf.setDisciplinaAnual(false);
        compGraf.setNomeDisciplina("Computação Gráfica");
        compGraf.setNomeDoProfessor("Wellington Aparecido Della Mura");
        compGraf.setPrecisaDeLab(true);
        compGraf.setAnoQueADisciplinaPercente(4);
        compGraf.setAulasSemanais(2);

        compSimbolica.setCargaHoraria(60);
        compSimbolica.setDisciplinaAnual(false);
        compSimbolica.setNomeDisciplina("Computação Simbólica e Numérica");
        compSimbolica.setNomeDoProfessor("Luiz Fernando Legore do Nascimento");
        compSimbolica.setPrecisaDeLab(true);
        compSimbolica.setAnoQueADisciplinaPercente(4);
        compSimbolica.setAulasSemanais(2);

        empreendedorismo.setCargaHoraria(60);
        empreendedorismo.setDisciplinaAnual(true);
        empreendedorismo.setNomeDisciplina("Empreendedorismo");
        empreendedorismo.setNomeDoProfessor("Carlos Henrique Machado");
        empreendedorismo.setPrecisaDeLab(true);
        empreendedorismo.setAnoQueADisciplinaPercente(4);
        empreendedorismo.setAulasSemanais(2);

        segEAuditoria.setCargaHoraria(60);
        segEAuditoria.setDisciplinaAnual(false);
        segEAuditoria.setNomeDisciplina("Segurança e Auditoria de Sistemas");
        segEAuditoria.setNomeDoProfessor("Carlos Eduardo Ribeiro");
        segEAuditoria.setPrecisaDeLab(true);
        segEAuditoria.setAnoQueADisciplinaPercente(4);
        segEAuditoria.setAulasSemanais(2);

        informaticaEEducacao.setCargaHoraria(60);
        informaticaEEducacao.setDisciplinaAnual(false);
        informaticaEEducacao.setNomeDisciplina("Informática e Educação");
        informaticaEEducacao.setNomeDoProfessor("Fabio de Sordi Junior");
        informaticaEEducacao.setPrecisaDeLab(true);
        informaticaEEducacao.setAnoQueADisciplinaPercente(4);
        informaticaEEducacao.setAulasSemanais(2);

        interfaceHM.setCargaHoraria(60);
        interfaceHM.setDisciplinaAnual(false);
        interfaceHM.setNomeDisciplina("Interface Homem Máquina");
        interfaceHM.setNomeDoProfessor("Thiago Adriano Coleti");
        interfaceHM.setPrecisaDeLab(true);
        interfaceHM.setAnoQueADisciplinaPercente(4);
        interfaceHM.setAulasSemanais(2);

        segunda.setDisciplinaHorario1("Horário Livre");
        segunda.setDisciplinaHorario2("Horário Livre");
        segunda.setDisciplinaHorario3("Horário Livre");
        segunda.setDisciplinaHorario4("Horário Livre");
        segunda.setDisciplinaHorario5("Horário Livre");
        segunda.setDisciplinaHorario6("Horário Livre");
        segunda.setDisciplinaHorario7("Horário Livre");
        segunda.setDisciplinaHorario8("Horário Livre");

        terca.setDisciplinaHorario1("Horário Livre");
        terca.setDisciplinaHorario2("Horário Livre");
        terca.setDisciplinaHorario3("Horário Livre");
        terca.setDisciplinaHorario4("Horário Livre");
        terca.setDisciplinaHorario5("Horário Livre");
        terca.setDisciplinaHorario6("Horário Livre");
        terca.setDisciplinaHorario7("Horário Livre");
        terca.setDisciplinaHorario8("Horário Livre");

        quarta.setDisciplinaHorario1("Horário Livre");
        quarta.setDisciplinaHorario2("Horário Livre");
        quarta.setDisciplinaHorario3("Horário Livre");
        quarta.setDisciplinaHorario4("Horário Livre");
        quarta.setDisciplinaHorario5("Horário Livre");
        quarta.setDisciplinaHorario6("Horário Livre");
        quarta.setDisciplinaHorario7("Horário Livre");
        quarta.setDisciplinaHorario8("Horário Livre");

        quinta.setDisciplinaHorario1("Horário Livre");
        quinta.setDisciplinaHorario2("Horário Livre");
        quinta.setDisciplinaHorario3("Horário Livre");
        quinta.setDisciplinaHorario4("Horário Livre");
        quinta.setDisciplinaHorario5("Horário Livre");
        quinta.setDisciplinaHorario6("Horário Livre");
        quinta.setDisciplinaHorario7("Horário Livre");
        quinta.setDisciplinaHorario8("Horário Livre");

        sexta.setDisciplinaHorario1("Horário Livre");
        sexta.setDisciplinaHorario2("Horário Livre");
        sexta.setDisciplinaHorario3("Horário Livre");
        sexta.setDisciplinaHorario4("Horário Livre");
        sexta.setDisciplinaHorario5("Horário Livre");
        sexta.setDisciplinaHorario6("Horário Livre");
        sexta.setDisciplinaHorario7("Horário Livre");
        sexta.setDisciplinaHorario8("Horário Livre");
        montarHorarioPrimeiroAno();
    }

    public static void montarHorarioPrimeiroAno() {
        String matrizHorarioPrimeiroAno[][] = new String[8][5];
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 5; j++) {
                matrizHorarioPrimeiroAno[i][j] = "Horário Livre";
            }
        }
        
        for (i = 0; i < calculoI.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (maisa.horariosLecionadosSegunda.contains(randomHorario) || maisa.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Calculo I / Maisa";
                            maisa.horariosLecionadosSegunda.add(randomHorario);
                            maisa.setHorasLecionadasSegunda((float) (maisa.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (maisa.horariosLecionadosTerca.contains(randomHorario)|| maisa.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Calculo I / Maisa";
                            maisa.horariosLecionadosTerca.add(randomHorario);
                            maisa.setHorasLecionadasTerca((float) (maisa.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (maisa.horariosLecionadosQuarta.contains(randomHorario)|| maisa.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Calculo I / Maisa";
                            maisa.horariosLecionadosQuarta.add(randomHorario);
                            maisa.setHorasLecionadasQuarta((float) (maisa.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (maisa.horariosLecionadosQuinta.contains(randomHorario)|| maisa.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Calculo I / Maisa";
                            maisa.horariosLecionadosQuinta.add(randomHorario);
                            maisa.setHorasLecionadasQuinta((float) (maisa.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (maisa.horariosLecionadosSexta.contains(randomHorario)|| maisa.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Calculo I / Maisa";
                            maisa.horariosLecionadosSexta.add(randomHorario);
                            maisa.setHorasLecionadasSegunda((float) (maisa.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < teoriaEPratica.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (thiago.horariosLecionadosSegunda.contains(randomHorario) || thiago.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Teoria e Prática de S.I. / Thiago Coleti";
                            thiago.horariosLecionadosSegunda.add(randomHorario);
                            thiago.setHorasLecionadasSegunda((float) (thiago.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (thiago.horariosLecionadosTerca.contains(randomHorario)|| thiago.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Teoria e Prática de S.I. / Thiago Coleti";
                            thiago.horariosLecionadosTerca.add(randomHorario);
                            thiago.setHorasLecionadasSegunda((float) (thiago.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (thiago.horariosLecionadosQuarta.contains(randomHorario)|| thiago.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Teoria e Prática de S.I. / Thiago Coleti";
                            thiago.horariosLecionadosQuarta.add(randomHorario);
                            thiago.setHorasLecionadasQuarta((float) (thiago.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (thiago.horariosLecionadosQuinta.contains(randomHorario)|| thiago.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Teoria e Prática de S.I. / Thiago Coleti";
                            thiago.horariosLecionadosTerca.add(randomHorario);
                            thiago.setHorasLecionadasQuinta((float) (thiago.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (thiago.horariosLecionadosSexta.contains(randomHorario)|| thiago.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Teoria e Prática de S.I. / Thiago Coleti";
                            thiago.horariosLecionadosSexta.add(randomHorario);
                            thiago.setHorasLecionadasSexta((float) (thiago.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < matematicaDiscreta.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (luizFernando.horariosLecionadosSegunda.contains(randomHorario) || luizFernando.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Matemática Discreta e Lógica Matemática / Luiz Fernando Legore do Nascimento";
                            luizFernando.horariosLecionadosSegunda.add(randomHorario);
                            luizFernando.setHorasLecionadasSegunda((float) (luizFernando.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (luizFernando.horariosLecionadosTerca.contains(randomHorario)|| luizFernando.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Matemática Discreta e Lógica Matemática / Luiz Fernando Legore do Nascimento	";
                            luizFernando.horariosLecionadosTerca.add(randomHorario);
                            luizFernando.setHorasLecionadasSegunda((float) (luizFernando.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (luizFernando.horariosLecionadosQuarta.contains(randomHorario)|| luizFernando.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Matemática Discreta e Lógica Matemática / Luiz Fernando Legore do Nascimento	";
                            luizFernando.horariosLecionadosQuarta.add(randomHorario);
                            luizFernando.setHorasLecionadasQuarta((float) (luizFernando.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (luizFernando.horariosLecionadosQuinta.contains(randomHorario)|| luizFernando.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Matemática Discreta e Lógica Matemática / Luiz Fernando Legore do Nascimento	";
                            luizFernando.horariosLecionadosTerca.add(randomHorario);
                            luizFernando.setHorasLecionadasQuinta((float) (luizFernando.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (luizFernando.horariosLecionadosSexta.contains(randomHorario)|| luizFernando.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Matemática Discreta e Lógica Matemática / Luiz Fernando Legore do Nascimento	";
                            luizFernando.horariosLecionadosSexta.add(randomHorario);
                            luizFernando.setHorasLecionadasSexta((float) (luizFernando.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < progI.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (joseMerlin.horariosLecionadosSegunda.contains(randomHorario) || joseMerlin.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Programação I / José Reinaldo Merlin";
                            joseMerlin.horariosLecionadosSegunda.add(randomHorario);
                            joseMerlin.setHorasLecionadasSegunda((float) (joseMerlin.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (joseMerlin.horariosLecionadosTerca.contains(randomHorario)|| joseMerlin.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Programação I / José Reinaldo Merlin	";
                            joseMerlin.horariosLecionadosTerca.add(randomHorario);
                            joseMerlin.setHorasLecionadasSegunda((float) (joseMerlin.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (joseMerlin.horariosLecionadosQuarta.contains(randomHorario)|| joseMerlin.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Programação I / José Reinaldo Merlin	";
                            joseMerlin.horariosLecionadosQuarta.add(randomHorario);
                            joseMerlin.setHorasLecionadasQuarta((float) (joseMerlin.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (joseMerlin.horariosLecionadosQuinta.contains(randomHorario)|| joseMerlin.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Programação I / José Reinaldo Merlin	";
                            joseMerlin.horariosLecionadosTerca.add(randomHorario);
                            joseMerlin.setHorasLecionadasQuinta((float) (joseMerlin.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (joseMerlin.horariosLecionadosSexta.contains(randomHorario)|| joseMerlin.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Programação I / José Reinaldo Merlin	";
                            joseMerlin.horariosLecionadosSexta.add(randomHorario);
                            joseMerlin.setHorasLecionadasSexta((float) (joseMerlin.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < sociologia.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (cristiane.horariosLecionadosSegunda.contains(randomHorario) || cristiane.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sociologia / Cristiane Schell Gabriel";
                            cristiane.horariosLecionadosSegunda.add(randomHorario);
                            cristiane.setHorasLecionadasSegunda((float) (cristiane.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (cristiane.horariosLecionadosTerca.contains(randomHorario)|| cristiane.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sociologia / Cristiane Schell Gabriel";
                            cristiane.horariosLecionadosTerca.add(randomHorario);
                            cristiane.setHorasLecionadasSegunda((float) (cristiane.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (cristiane.horariosLecionadosQuarta.contains(randomHorario)|| cristiane.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sociologia / Cristiane Schell Gabriel";
                            cristiane.horariosLecionadosQuarta.add(randomHorario);
                            cristiane.setHorasLecionadasQuarta((float) (cristiane.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (cristiane.horariosLecionadosQuinta.contains(randomHorario)|| cristiane.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sociologia / Cristiane Schell Gabriel";
                            cristiane.horariosLecionadosTerca.add(randomHorario);
                            cristiane.setHorasLecionadasQuinta((float) (cristiane.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (cristiane.horariosLecionadosSexta.contains(randomHorario)|| cristiane.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sociologia / Cristiane Schell Gabriel";
                            cristiane.horariosLecionadosSexta.add(randomHorario);
                            cristiane.setHorasLecionadasSexta((float) (cristiane.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < introducaoACC.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (ailton.horariosLecionadosSegunda.contains(randomHorario) || ailton.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Introdução a Ciência da Computação / Ailton Sergio Bonifácio";
                            ailton.horariosLecionadosSegunda.add(randomHorario);
                            ailton.setHorasLecionadasSegunda((float) (ailton.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (ailton.horariosLecionadosTerca.contains(randomHorario)|| ailton.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Introdução a Ciência da Computação / Ailton Sergio Bonifácio";
                            ailton.horariosLecionadosTerca.add(randomHorario);
                            ailton.setHorasLecionadasSegunda((float) (ailton.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (ailton.horariosLecionadosQuarta.contains(randomHorario)|| ailton.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Introdução a Ciência da Computação / Ailton Sergio Bonifácio";
                            ailton.horariosLecionadosQuarta.add(randomHorario);
                            ailton.setHorasLecionadasQuarta((float) (ailton.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (ailton.horariosLecionadosQuinta.contains(randomHorario)|| ailton.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Introdução a Ciência da Computação / Ailton Sergio Bonifácio";
                            ailton.horariosLecionadosTerca.add(randomHorario);
                            ailton.setHorasLecionadasQuinta((float) (ailton.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (ailton.horariosLecionadosSexta.contains(randomHorario)|| ailton.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Introdução a Ciência da Computação / Ailton Sergio Bonifácio";
                            ailton.horariosLecionadosSexta.add(randomHorario);
                            ailton.setHorasLecionadasSexta((float) (ailton.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < adm.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (carlosHenrique.horariosLecionadosSegunda.contains(randomHorario) || carlosHenrique.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Administração / Carlos Henrique Machado";
                            carlosHenrique.horariosLecionadosSegunda.add(randomHorario);
                            carlosHenrique.setHorasLecionadasSegunda((float) (carlosHenrique.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (carlosHenrique.horariosLecionadosTerca.contains(randomHorario)|| carlosHenrique.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Administração / Carlos Henrique Machado";
                            carlosHenrique.horariosLecionadosTerca.add(randomHorario);
                            carlosHenrique.setHorasLecionadasSegunda((float) (carlosHenrique.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (carlosHenrique.horariosLecionadosQuarta.contains(randomHorario)|| carlosHenrique.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Administração / Carlos Henrique Machado";
                            carlosHenrique.horariosLecionadosQuarta.add(randomHorario);
                            carlosHenrique.setHorasLecionadasQuarta((float) (carlosHenrique.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (carlosHenrique.horariosLecionadosQuinta.contains(randomHorario)|| carlosHenrique.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Administração / Carlos Henrique Machado";
                            carlosHenrique.horariosLecionadosTerca.add(randomHorario);
                            carlosHenrique.setHorasLecionadasQuinta((float) (carlosHenrique.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (carlosHenrique.horariosLecionadosSexta.contains(randomHorario)|| carlosHenrique.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Administração / Carlos Henrique Machado";
                            carlosHenrique.horariosLecionadosSexta.add(randomHorario);
                            carlosHenrique.setHorasLecionadasSexta((float) (carlosHenrique.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < compESoci.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (carlosEduardo.horariosLecionadosSegunda.contains(randomHorario) || carlosEduardo.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Computadores e Sociedade / Carlos Eduardo Ribeiro";
                            carlosEduardo.horariosLecionadosSegunda.add(randomHorario);
                            carlosEduardo.setHorasLecionadasSegunda((float) (carlosEduardo.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (carlosEduardo.horariosLecionadosTerca.contains(randomHorario)|| carlosEduardo.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Computadores e Sociedade / Carlos Eduardo Ribeiro";
                            carlosEduardo.horariosLecionadosTerca.add(randomHorario);
                            carlosEduardo.setHorasLecionadasSegunda((float) (carlosEduardo.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (carlosEduardo.horariosLecionadosQuarta.contains(randomHorario)|| carlosEduardo.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Computadores e Sociedade / Carlos Eduardo Ribeiro";
                            carlosEduardo.horariosLecionadosQuarta.add(randomHorario);
                            carlosEduardo.setHorasLecionadasQuarta((float) (carlosEduardo.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (carlosHenrique.horariosLecionadosQuinta.contains(randomHorario)|| carlosEduardo.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Computadores e Sociedade / Carlos Eduardo Ribeiro";
                            carlosEduardo.horariosLecionadosTerca.add(randomHorario);
                            carlosEduardo.setHorasLecionadasQuinta((float) (carlosEduardo.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (carlosEduardo.horariosLecionadosSexta.contains(randomHorario)|| carlosEduardo.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Computadores e Sociedade / Carlos Eduardo Ribeiro";
                            carlosEduardo.horariosLecionadosSexta.add(randomHorario);
                            carlosEduardo.setHorasLecionadasSexta((float) (carlosEduardo.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < comunic.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (maisa.horariosLecionadosSegunda.contains(randomHorario) || maisa.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Comunicação e Expressão / Maisa";
                            maisa.horariosLecionadosSegunda.add(randomHorario);
                            maisa.setHorasLecionadasSegunda((float) (maisa.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (maisa.horariosLecionadosTerca.contains(randomHorario)|| maisa.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Comunicação e Expressão / Maisa";
                            maisa.horariosLecionadosTerca.add(randomHorario);
                            maisa.setHorasLecionadasTerca((float) (maisa.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (maisa.horariosLecionadosQuarta.contains(randomHorario)|| maisa.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Comunicação e Expressão / Maisa";
                            maisa.horariosLecionadosQuarta.add(randomHorario);
                            maisa.setHorasLecionadasQuarta((float) (maisa.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (maisa.horariosLecionadosQuinta.contains(randomHorario)|| maisa.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Comunicação e Expressão / Maisa";
                            maisa.horariosLecionadosQuinta.add(randomHorario);
                            maisa.setHorasLecionadasQuinta((float) (maisa.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (maisa.horariosLecionadosSexta.contains(randomHorario)|| maisa.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Comunicação e Expressão / Maisa";
                            maisa.horariosLecionadosSexta.add(randomHorario);
                            maisa.setHorasLecionadasSegunda((float) (maisa.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < sistemasDigitais.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioPrimeiroAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (mauricio.horariosLecionadosSegunda.contains(randomHorario) || mauricio.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sistemas Digitais / Mauricio Massaru Arimoto";
                            mauricio.horariosLecionadosSegunda.add(randomHorario);
                            mauricio.setHorasLecionadasSegunda((float) (mauricio.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (mauricio.horariosLecionadosTerca.contains(randomHorario)|| mauricio.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sistemas Digitais / Mauricio Massaru Arimoto";
                            mauricio.horariosLecionadosTerca.add(randomHorario);
                            mauricio.setHorasLecionadasTerca((float) (mauricio.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (mauricio.horariosLecionadosQuarta.contains(randomHorario)|| mauricio.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sistemas Digitais / Mauricio Massaru Arimoto";
                            mauricio.horariosLecionadosQuarta.add(randomHorario);
                            mauricio.setHorasLecionadasQuarta((float) (mauricio.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (mauricio.horariosLecionadosQuinta.contains(randomHorario)|| mauricio.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sistemas Digitais / Mauricio Massaru Arimoto";
                            mauricio.horariosLecionadosQuinta.add(randomHorario);
                            mauricio.setHorasLecionadasQuinta((float) (mauricio.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (mauricio.horariosLecionadosSexta.contains(randomHorario)|| mauricio.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioPrimeiroAno[randomHorario][randomDia] = "Sistemas Digitais / Mauricio Massaru Arimoto";
                            mauricio.horariosLecionadosSexta.add(randomHorario);
                            mauricio.setHorasLecionadasSegunda((float) (mauricio.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        System.out.println("teste");
    }

    public void montarHorarioSegundoAno() {
        String matrizHorarioSegundoAno[][] = new String[8][5];
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 5; j++) {
                matrizHorarioSegundoAno[i][j] = "Horario Livre";
            }
        }
        
        for (i = 0; i < calculoII.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioSegundoAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (maisa.horariosLecionadosSegunda.contains(randomHorario) || maisa.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Calculo II / Maisa";
                            maisa.horariosLecionadosSegunda.add(randomHorario);
                            maisa.setHorasLecionadasSegunda((float) (maisa.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (maisa.horariosLecionadosTerca.contains(randomHorario)|| maisa.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Calculo II / Maisa";
                            maisa.horariosLecionadosTerca.add(randomHorario);
                            maisa.setHorasLecionadasTerca((float) (maisa.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (maisa.horariosLecionadosQuarta.contains(randomHorario)|| maisa.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Calculo II / Maisa";
                            maisa.horariosLecionadosQuarta.add(randomHorario);
                            maisa.setHorasLecionadasQuarta((float) (maisa.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (maisa.horariosLecionadosQuinta.contains(randomHorario)|| maisa.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Calculo II / Maisa";
                            maisa.horariosLecionadosQuinta.add(randomHorario);
                            maisa.setHorasLecionadasQuinta((float) (maisa.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (maisa.horariosLecionadosSexta.contains(randomHorario)|| maisa.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Calculo II / Maisa";
                            maisa.horariosLecionadosSexta.add(randomHorario);
                            maisa.setHorasLecionadasSegunda((float) (maisa.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < estruturaDeDados.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioSegundoAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (tamara.horariosLecionadosSegunda.contains(randomHorario) || tamara.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Estrutura de Dados / Tamara";
                            tamara.horariosLecionadosSegunda.add(randomHorario);
                            tamara.setHorasLecionadasSegunda((float) (tamara.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (tamara.horariosLecionadosTerca.contains(randomHorario)|| tamara.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Estrutura de Dados / Tamara";
                            tamara.horariosLecionadosTerca.add(randomHorario);
                            tamara.setHorasLecionadasTerca((float) (tamara.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (tamara.horariosLecionadosQuarta.contains(randomHorario)|| tamara.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Estrutura de Dados / Tamara";
                            tamara.horariosLecionadosQuarta.add(randomHorario);
                            tamara.setHorasLecionadasQuarta((float) (tamara.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (tamara.horariosLecionadosQuinta.contains(randomHorario)|| tamara.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Estrutura de Dados / Tamara";
                            tamara.horariosLecionadosQuinta.add(randomHorario);
                            tamara.setHorasLecionadasQuinta((float) (tamara.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (tamara.horariosLecionadosSexta.contains(randomHorario)|| tamara.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Estrutura de Dados / Tamara";
                            tamara.horariosLecionadosSexta.add(randomHorario);
                            tamara.setHorasLecionadasSegunda((float) (tamara.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
         for (i = 0; i < metodologiaPesquisa.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioSegundoAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (tamara.horariosLecionadosSegunda.contains(randomHorario) || tamara.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Metodologia E Pesquisa / Tamara";
                            tamara.horariosLecionadosSegunda.add(randomHorario);
                            tamara.setHorasLecionadasSegunda((float) (tamara.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (tamara.horariosLecionadosTerca.contains(randomHorario)|| tamara.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Metodologia E Pesquisa / Tamara";
                            tamara.horariosLecionadosTerca.add(randomHorario);
                            tamara.setHorasLecionadasTerca((float) (tamara.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (tamara.horariosLecionadosQuarta.contains(randomHorario)|| tamara.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Metodologia E Pesquisa / Tamara";
                            tamara.horariosLecionadosQuarta.add(randomHorario);
                            tamara.setHorasLecionadasQuarta((float) (tamara.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (tamara.horariosLecionadosQuinta.contains(randomHorario)|| tamara.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Metodologia E Pesquisa / Tamara";
                            tamara.horariosLecionadosQuinta.add(randomHorario);
                            tamara.setHorasLecionadasQuinta((float) (tamara.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (tamara.horariosLecionadosSexta.contains(randomHorario)|| tamara.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Metodologia E Pesquisa / Tamara";
                            tamara.horariosLecionadosSexta.add(randomHorario);
                            tamara.setHorasLecionadasSegunda((float) (tamara.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
         
        for (i = 0; i < fisica.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioSegundoAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (marcioHasegawa.horariosLecionadosSegunda.contains(randomHorario) || marcioHasegawa.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
                            marcioHasegawa.horariosLecionadosSegunda.add(randomHorario);
                            marcioHasegawa.setHorasLecionadasSegunda((float) (marcioHasegawa.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (marcioHasegawa.horariosLecionadosTerca.contains(randomHorario)|| marcioHasegawa.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
                            marcioHasegawa.horariosLecionadosTerca.add(randomHorario);
                            marcioHasegawa.setHorasLecionadasTerca((float) (marcioHasegawa.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (marcioHasegawa.horariosLecionadosQuarta.contains(randomHorario)|| marcioHasegawa.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
                            marcioHasegawa.horariosLecionadosQuarta.add(randomHorario);
                            marcioHasegawa.setHorasLecionadasQuarta((float) (marcioHasegawa.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (marcioHasegawa.horariosLecionadosQuinta.contains(randomHorario)|| marcioHasegawa.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
                            marcioHasegawa.horariosLecionadosQuinta.add(randomHorario);
                            marcioHasegawa.setHorasLecionadasQuinta((float) (marcioHasegawa.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (marcioHasegawa.horariosLecionadosSexta.contains(randomHorario)|| marcioHasegawa.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
                            marcioHasegawa.horariosLecionadosSexta.add(randomHorario);
                            marcioHasegawa.setHorasLecionadasSegunda((float) (marcioHasegawa.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
//        for (i = 0; i < algebra.getAulasSemanais(); i++) {
//            sucesso = false;
//            while (sucesso == false) {
//                randomHorario = 0 + random.nextInt(8);
//                randomDia = 0 + random.nextInt(5);
//                while (matrizHorarioSegundoAno[randomHorario][randomDia] == "Horário Livre") {
//                    if (randomDia == 0) {
//                        if (marcioHasegawa.horariosLecionadosSegunda.contains(randomHorario) || marcioHasegawa.getHorasLecionadasSegunda() >= 8) {
//
//                        } else {
//                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
//                            marcioHasegawa.horariosLecionadosSegunda.add(randomHorario);
//                            marcioHasegawa.setHorasLecionadasSegunda((float) (marcioHasegawa.getHorasLecionadasSegunda()+0.83));
//                            sucesso = true;
//                        }
//                    }
//                    if (randomDia == 1) {
//                        if (marcioHasegawa.horariosLecionadosTerca.contains(randomHorario)|| marcioHasegawa.getHorasLecionadasTerca() >= 8) {
//
//                        } else {
//                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
//                            marcioHasegawa.horariosLecionadosTerca.add(randomHorario);
//                            marcioHasegawa.setHorasLecionadasTerca((float) (marcioHasegawa.getHorasLecionadasTerca()+0.83));
//                            sucesso = true;
//                        }
//
//                    }
//                    if (randomDia == 2) {
//                        if (marcioHasegawa.horariosLecionadosQuarta.contains(randomHorario)|| marcioHasegawa.getHorasLecionadasQuarta() >= 8) {
//
//                        } else {
//                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
//                            marcioHasegawa.horariosLecionadosQuarta.add(randomHorario);
//                            marcioHasegawa.setHorasLecionadasQuarta((float) (marcioHasegawa.getHorasLecionadasQuarta()+0.83));
//                            sucesso = true;
//                        }
//                    }
//                    if (randomDia == 3) {
//                        if (marcioHasegawa.horariosLecionadosQuinta.contains(randomHorario)|| marcioHasegawa.getHorasLecionadasQuinta() >= 8) {
//
//                        } else {
//                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
//                            marcioHasegawa.horariosLecionadosQuinta.add(randomHorario);
//                            marcioHasegawa.setHorasLecionadasQuinta((float) (marcioHasegawa.getHorasLecionadasQuinta()+0.83));
//                            sucesso = true;
//                        }
//                    }
//                    if (randomDia == 4) {
//                        if (marcioHasegawa.horariosLecionadosSexta.contains(randomHorario)|| marcioHasegawa.getHorasLecionadasSexta() >= 8) {
//
//                        } else {
//                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Física / Marcio Hasegawa";
//                            marcioHasegawa.horariosLecionadosSexta.add(randomHorario);
//                            marcioHasegawa.setHorasLecionadasSegunda((float) (marcioHasegawa.getHorasLecionadasSexta()+0.83));
//                            sucesso = true;
//                        }
//                    }
//                }
//            }
//        }

        for (i = 0; i < probEEst.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioSegundoAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (luizRenato.horariosLecionadosSegunda.contains(randomHorario) || luizRenato.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Probabilidade E Estatística / Luiz Renato";
                            luizRenato.horariosLecionadosSegunda.add(randomHorario);
                            luizRenato.setHorasLecionadasSegunda((float) (luizRenato.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (luizRenato.horariosLecionadosTerca.contains(randomHorario)|| luizRenato.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Probabilidade E Estatística / Luiz Renato";
                            luizRenato.horariosLecionadosTerca.add(randomHorario);
                            luizRenato.setHorasLecionadasTerca((float) (luizRenato.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (luizRenato.horariosLecionadosQuarta.contains(randomHorario)|| luizRenato.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Probabilidade E Estatística / Luiz Renato";
                            luizRenato.horariosLecionadosQuarta.add(randomHorario);
                            luizRenato.setHorasLecionadasQuarta((float) (luizRenato.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (luizRenato.horariosLecionadosQuinta.contains(randomHorario)|| luizRenato.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Probabilidade E Estatística / Luiz Renato";
                            luizRenato.horariosLecionadosQuinta.add(randomHorario);
                            luizRenato.setHorasLecionadasQuinta((float) (luizRenato.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (luizRenato.horariosLecionadosSexta.contains(randomHorario)|| luizRenato.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Probabilidade E Estatística / Luiz Renato";
                            luizRenato.horariosLecionadosSexta.add(randomHorario);
                            luizRenato.setHorasLecionadasSegunda((float) (luizRenato.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
        for (i = 0; i < comp.getAulasSemanais(); i++) {
            sucesso = false;
            while (sucesso == false) {
                randomHorario = 0 + random.nextInt(8);
                randomDia = 0 + random.nextInt(5);
                while (matrizHorarioSegundoAno[randomHorario][randomDia] == "Horário Livre") {
                    if (randomDia == 0) {
                        if (wellington.horariosLecionadosSegunda.contains(randomHorario) || wellington.getHorasLecionadasSegunda() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Compiladores / Wellington Dellamura";
                            wellington.horariosLecionadosSegunda.add(randomHorario);
                            wellington.setHorasLecionadasSegunda((float) (wellington.getHorasLecionadasSegunda()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 1) {
                        if (wellington.horariosLecionadosTerca.contains(randomHorario)|| wellington.getHorasLecionadasTerca() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Compiladores / Wellington Dellamura";
                            wellington.horariosLecionadosTerca.add(randomHorario);
                            wellington.setHorasLecionadasTerca((float) (wellington.getHorasLecionadasTerca()+0.83));
                            sucesso = true;
                        }

                    }
                    if (randomDia == 2) {
                        if (wellington.horariosLecionadosQuarta.contains(randomHorario)|| wellington.getHorasLecionadasQuarta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Compiladores / Wellington Dellamura";
                            wellington.horariosLecionadosQuarta.add(randomHorario);
                            wellington.setHorasLecionadasQuarta((float) (wellington.getHorasLecionadasQuarta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 3) {
                        if (wellington.horariosLecionadosQuinta.contains(randomHorario)|| wellington.getHorasLecionadasQuinta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Compiladores / Wellington Dellamura";
                            wellington.horariosLecionadosQuinta.add(randomHorario);
                            wellington.setHorasLecionadasQuinta((float) (wellington.getHorasLecionadasQuinta()+0.83));
                            sucesso = true;
                        }
                    }
                    if (randomDia == 4) {
                        if (wellington.horariosLecionadosSexta.contains(randomHorario)|| wellington.getHorasLecionadasSexta() >= 8) {

                        } else {
                            matrizHorarioSegundoAno[randomHorario][randomDia] = "Compiladores / Wellington Dellamura";
                            wellington.horariosLecionadosSexta.add(randomHorario);
                            wellington.setHorasLecionadasSegunda((float) (wellington.getHorasLecionadasSexta()+0.83));
                            sucesso = true;
                        }
                    }
                }
            }
        }
        
    }

    public void montarHorarioTerceiroAno() {
        String matrizHorarioTerceiroAno[][] = new String[8][5];
        for (i = 0; i < 8; i++) {
            for (j = 0; i < 5; i++) {
                matrizHorarioTerceiroAno[i][j] = "Horario Livre";
            }
        }
    }

    public void montarHorarioQuartoAno() {
        String matrizHorarioQuartoAno[][] = new String[8][5];
        for (i = 0; i < 8; i++) {
            for (j = 0; i < 5; i++) {
                matrizHorarioQuartoAno[i][j] = "Horario Livre";
            }
        }
    }
}
