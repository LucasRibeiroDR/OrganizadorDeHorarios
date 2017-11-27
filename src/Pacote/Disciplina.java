/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

/**
 *
 * @author a120088
 */
public class Disciplina {
    private boolean disciplinaAnual;
    private int anoQueADisciplinaPercente;
    private String nomeDisciplina;
    private String nomeDoProfessor;
    private float cargaHoraria;
    private int disciplinaHorario; 
    private boolean precisaDeLab;

    public int getAulasSemanais() {
        return aulasSemanais;
    }

    public void setAulasSemanais(int aulasSemanais) {
        this.aulasSemanais = aulasSemanais;
    }

    public String getDiaLecionado() {
        return diaLecionado;
    }

    public void setDiaLecionado(String diaLecionado) {
        this.diaLecionado = diaLecionado;
    }
    private int aulasSemanais;
    private String diaLecionado;

    public boolean isPrecisaDeLab() {
        return precisaDeLab;
    }

    public void setPrecisaDeLab(boolean precisaDeLab) {
        this.precisaDeLab = precisaDeLab;
    }
    
    public Disciplina(){
        disciplinaAnual = false;
        anoQueADisciplinaPercente = 0;
        nomeDisciplina = "";
        nomeDoProfessor = "";
        cargaHoraria = 0;
        disciplinaHorario = 0;///horario 1 = 8h; horario2 = 8h50;
        precisaDeLab = false;
        diaLecionado = "";
    }

    public int getDisciplinaHorario() {
        return disciplinaHorario;
    }

    public void setDisciplinaHorario(int disciplinaHorario) {
        this.disciplinaHorario = disciplinaHorario;
    }
    
    public void inicializar(){
        Disciplina calculoI = new Disciplina();
        Disciplina teoriaEPratica = new Disciplina();
        Disciplina matematicaDiscreta = new Disciplina();
        Disciplina progI = new Disciplina();
        Disciplina sociologia = new Disciplina();
        Disciplina sistemasDigitais = new Disciplina();
        Disciplina introducaoACC = new Disciplina();
        Disciplina adm = new Disciplina();
        Disciplina compESoci = new Disciplina();
        Disciplina comunic = new Disciplina();
        Disciplina calculoII = new Disciplina();
        Disciplina estruturaDeDados = new Disciplina();
        Disciplina metodologiaPesquisa = new Disciplina();
        Disciplina fisica = new Disciplina();
        Disciplina algebra = new Disciplina();
        Disciplina probEEst = new Disciplina();
        Disciplina teoriaDaComp = new Disciplina();
        Disciplina arqComp = new Disciplina();
        Disciplina progII = new Disciplina();
        Disciplina engSoftI = new Disciplina();
        Disciplina projEAnalise = new Disciplina();
        Disciplina sO = new Disciplina();
        Disciplina bD = new Disciplina();
        Disciplina lingProg = new Disciplina();
        Disciplina engSoftII = new Disciplina();
        Disciplina comp = new Disciplina();
        Disciplina redes = new Disciplina();
        Disciplina iA = new Disciplina();
        Disciplina pratEGerenc = new Disciplina();
        Disciplina sistDistribuidos = new Disciplina();
        Disciplina engSoftIII = new Disciplina();
        Disciplina compGraf = new Disciplina();
        Disciplina compSimbolica = new Disciplina();
        Disciplina empreendedorismo = new Disciplina();
        Disciplina segEAuditoria = new Disciplina();
        Disciplina informaticaEEducacao = new Disciplina();
        Disciplina interfaceHM = new Disciplina();
        
        calculoI.setCargaHoraria(120);
        calculoI.setDisciplinaAnual(true);
        calculoI.setNomeDisciplina("Cálculo e Geometria Analítica I");
        calculoI.setNomeDoProfessor("Maisa Lucia C. Milani");
        calculoI.setAnoQueADisciplinaPercente(1);
        
        teoriaEPratica.setCargaHoraria(60);
        teoriaEPratica.setDisciplinaAnual(true);
        teoriaEPratica.setNomeDisciplina("Teoria e Prática de Sistema de Informação");
        teoriaEPratica.setNomeDoProfessor("Thiago Adriano Coleti");
        teoriaEPratica.setAnoQueADisciplinaPercente(1);
        
        matematicaDiscreta.setCargaHoraria(90);
        matematicaDiscreta.setDisciplinaAnual(true);
        matematicaDiscreta.setNomeDisciplina("Matemática Discreta e Lógica Matemática");
        matematicaDiscreta.setNomeDoProfessor("Luiz Fernando Legore do Nascimento");
        matematicaDiscreta.setPrecisaDeLab(true);
        matematicaDiscreta.setAnoQueADisciplinaPercente(1);
        
        progI.setCargaHoraria(120);
        progI.setDisciplinaAnual(true);
        progI.setNomeDisciplina("Programação I");
        progI.setNomeDoProfessor("Bruno Squizato Faiçal");
        progI.setPrecisaDeLab(true);
        progI.setAnoQueADisciplinaPercente(1);
        
        sociologia.setCargaHoraria(60);
        sociologia.setDisciplinaAnual(false);
        sociologia.setNomeDisciplina("Sociologia");
        sociologia.setNomeDoProfessor("Cristiane Schell Gabriel");
        sociologia.setAnoQueADisciplinaPercente(1);
        
        sistemasDigitais.setCargaHoraria(120);
        sistemasDigitais.setDisciplinaAnual(true);
        sistemasDigitais.setNomeDisciplina("Sistemas Digitais");
        sistemasDigitais.setNomeDoProfessor("Mauricio Massaru Arimoto");
        sistemasDigitais.setAnoQueADisciplinaPercente(1);
        
        introducaoACC.setCargaHoraria(60);
        introducaoACC.setDisciplinaAnual(true);
        introducaoACC.setNomeDisciplina("Introdução a Ciência da Computação");
        introducaoACC.setNomeDoProfessor("Ailton Sergio Bonifácio");
        introducaoACC.setPrecisaDeLab(true);
        introducaoACC.setAnoQueADisciplinaPercente(1);
        
        adm.setCargaHoraria(60);
        adm.setDisciplinaAnual(false);
        adm.setNomeDisciplina("Administração");
        adm.setNomeDoProfessor("Carlos Henrique Machado");
        adm.setAnoQueADisciplinaPercente(1);
        
        compESoci.setCargaHoraria(60);
        compESoci.setDisciplinaAnual(false);
        compESoci.setNomeDisciplina("Computadores e Sociedade");
        compESoci.setNomeDoProfessor("Mauricio Massaru Arimoto");
        compESoci.setAnoQueADisciplinaPercente(1);
        
        comunic.setCargaHoraria(60);
        comunic.setDisciplinaAnual(true);
        comunic.setNomeDisciplina("Comunicação e Expressão");
        comunic.setNomeDoProfessor("Tamara Angélica Baldo");
        comunic.setAnoQueADisciplinaPercente(1);
        
        calculoII.setCargaHoraria(120);
        calculoII.setDisciplinaAnual(true);
        calculoII.setNomeDisciplina("Cálculo e Geometria Analítica II");
        calculoII.setNomeDoProfessor("Maisa Lucia C. Milani");
        calculoII.setAnoQueADisciplinaPercente(2);
        
        estruturaDeDados.setCargaHoraria(120);
        estruturaDeDados.setDisciplinaAnual(true);
        estruturaDeDados.setNomeDisciplina("Estrutura de Dados");
        estruturaDeDados.setNomeDoProfessor("Tamara Angélica Baldo");
        estruturaDeDados.setPrecisaDeLab(true);
        estruturaDeDados.setAnoQueADisciplinaPercente(2);
        
        metodologiaPesquisa.setCargaHoraria(60);
        metodologiaPesquisa.setDisciplinaAnual(false);
        metodologiaPesquisa.setNomeDisciplina("Metodologia de Pesquisa");
        metodologiaPesquisa.setNomeDoProfessor("Tamara Angélica Baldo");
        metodologiaPesquisa.setAnoQueADisciplinaPercente(2);
        
        fisica.setCargaHoraria(90);
        fisica.setDisciplinaAnual(true);
        fisica.setNomeDisciplina("Física");
        fisica.setNomeDoProfessor("Marcio Massashiko Hasegawa");
        fisica.setAnoQueADisciplinaPercente(2);
        
        algebra.setCargaHoraria(60);
        algebra.setDisciplinaAnual(false);
        algebra.setNomeDisciplina("Álgebra Linear");
        algebra.setNomeDoProfessor("Caroline Subirá Pereira");
        algebra.setAnoQueADisciplinaPercente(2);
        
        probEEst.setCargaHoraria(60);
        probEEst.setDisciplinaAnual(false);
        probEEst.setNomeDisciplina("Probabilidade e Estatística");
        probEEst.setNomeDoProfessor("Luiz Renato Martins da Rocha");
        probEEst.setAnoQueADisciplinaPercente(2);
        
        teoriaDaComp.setCargaHoraria(120);
        teoriaDaComp.setDisciplinaAnual(true);
        teoriaDaComp.setNomeDisciplina("Teoria da Computação");
        teoriaDaComp.setNomeDoProfessor("Wellington Aparecido Della Mura");
        teoriaDaComp.setPrecisaDeLab(true);
        teoriaDaComp.setAnoQueADisciplinaPercente(2);
        
        arqComp.setCargaHoraria(60);
        arqComp.setDisciplinaAnual(true);
        arqComp.setNomeDisciplina("Arquitetura de Computadores");
        arqComp.setNomeDoProfessor("Thiago Adriano Coleti");
        arqComp.setPrecisaDeLab(true);
        arqComp.setAnoQueADisciplinaPercente(2);
        
        progII.setCargaHoraria(120);
        progII.setDisciplinaAnual(true);
        progII.setNomeDisciplina("Programação II");
        progII.setNomeDoProfessor("José Reinaldo Merlin");
        progII.setPrecisaDeLab(true);
        progII.setAnoQueADisciplinaPercente(2);
        
        engSoftI.setCargaHoraria(60);
        engSoftI.setDisciplinaAnual(false);
        engSoftI.setNomeDisciplina("Engenharia de Software II");
        engSoftI.setNomeDoProfessor("André Luis Andrade Menolli");
        engSoftI.setAnoQueADisciplinaPercente(2);
        
        projEAnalise.setCargaHoraria(60);
        projEAnalise.setDisciplinaAnual(true);
        projEAnalise.setNomeDisciplina("Projeto e Análise de Algoritmos");
        projEAnalise.setNomeDoProfessor("Bruno Squizato Faiçal");
        projEAnalise.setPrecisaDeLab(true);
        projEAnalise.setAnoQueADisciplinaPercente(3);
        
        sO.setCargaHoraria(120);
        sO.setDisciplinaAnual(true);
        sO.setNomeDisciplina("Sistemas Operacionais");
        sO.setNomeDoProfessor("Thiago Adriano Coleti");
        sO.setPrecisaDeLab(true);
        sO.setAnoQueADisciplinaPercente(3);
        
        bD.setCargaHoraria(120);
        bD.setDisciplinaAnual(true);
        bD.setNomeDisciplina("Banco de Dados");
        bD.setNomeDoProfessor("Ailton Sergio Bonifácio");
        bD.setPrecisaDeLab(true);
        bD.setAnoQueADisciplinaPercente(3);
        
        lingProg.setCargaHoraria(60);
        lingProg.setDisciplinaAnual(false);
        lingProg.setNomeDisciplina("Linguagues de Programação");
        lingProg.setNomeDoProfessor("Bruno Squizato Faiçal");
        lingProg.setAnoQueADisciplinaPercente(3);
        
        engSoftII.setCargaHoraria(90);
        engSoftII.setDisciplinaAnual(true);
        engSoftII.setNomeDisciplina("Engenharia de Software II");
        engSoftII.setNomeDoProfessor("André Luis Andrade Menolli");
        engSoftII.setPrecisaDeLab(true);
        engSoftII.setAnoQueADisciplinaPercente(3);
        
        comp.setCargaHoraria(120);
        comp.setDisciplinaAnual(true);
        comp.setNomeDisciplina("Compiladores");
        comp.setNomeDoProfessor("Wellington Aparecido Della Mura");
        comp.setPrecisaDeLab(true);
        comp.setAnoQueADisciplinaPercente(3);
        
        redes.setCargaHoraria(120);
        redes.setDisciplinaAnual(true);
        redes.setNomeDisciplina("Redes");
        redes.setNomeDoProfessor("Ricardo Gonçalves Coelho");
        redes.setPrecisaDeLab(true);
        redes.setAnoQueADisciplinaPercente(3);
        
        iA.setCargaHoraria(120);
        iA.setDisciplinaAnual(true);
        iA.setNomeDisciplina("Inteligência Artificial");
        iA.setNomeDoProfessor("Glauco Carlos Silva");
        iA.setPrecisaDeLab(true);
        iA.setAnoQueADisciplinaPercente(3);
        
        pratEGerenc.setCargaHoraria(60);
        pratEGerenc.setDisciplinaAnual(false);
        pratEGerenc.setNomeDisciplina("Prática e Gerenciamento de Projetos");
        pratEGerenc.setNomeDoProfessor("Daniela de Freitas Guilhermino Trindade"); 
        pratEGerenc.setPrecisaDeLab(true);
        pratEGerenc.setAnoQueADisciplinaPercente(4);
        
        sistDistribuidos.setCargaHoraria(120);
        sistDistribuidos.setDisciplinaAnual(true);
        sistDistribuidos.setNomeDisciplina("Sistemas Distribuídos");
        sistDistribuidos.setNomeDoProfessor("Ricardo Gonçalves Coelho");
        sistDistribuidos.setPrecisaDeLab(true);
        sistDistribuidos.setAnoQueADisciplinaPercente(4);
        
        engSoftIII.setCargaHoraria(60);
        engSoftIII.setDisciplinaAnual(true);
        engSoftIII.setNomeDisciplina("Engenharia de Software III");
        engSoftIII.setNomeDoProfessor("Fabio de Sordi Junior");
        engSoftIII.setAnoQueADisciplinaPercente(4);
        
        compGraf.setCargaHoraria(60);
        compGraf.setDisciplinaAnual(false);
        compGraf.setNomeDisciplina("Computação Gráfica");
        compGraf.setNomeDoProfessor("Wellington Aparecido Della Mura");
        compGraf.setPrecisaDeLab(true);
        compGraf.setAnoQueADisciplinaPercente(4);
        
        compSimbolica.setCargaHoraria(60);
        compSimbolica.setDisciplinaAnual(false);
        compSimbolica.setNomeDisciplina("Computação Simbólica e Numérica");
        compSimbolica.setNomeDoProfessor("Luiz Fernando Legore do Nascimento");
        compSimbolica.setPrecisaDeLab(true);
        compSimbolica.setAnoQueADisciplinaPercente(4);
        
        empreendedorismo.setCargaHoraria(60);
        empreendedorismo.setDisciplinaAnual(true);
        empreendedorismo.setNomeDisciplina("Empreendedorismo");
        empreendedorismo.setNomeDoProfessor("Carlos Henrique Machado");
        empreendedorismo.setPrecisaDeLab(true);
        empreendedorismo.setAnoQueADisciplinaPercente(4);
        
        segEAuditoria.setCargaHoraria(60);
        segEAuditoria.setDisciplinaAnual(false);
        segEAuditoria.setNomeDisciplina("Segurança e Auditoria de Sistemas");
        segEAuditoria.setNomeDoProfessor("Carlos Eduardo Ribeiro");
        segEAuditoria.setPrecisaDeLab(true);
        segEAuditoria.setAnoQueADisciplinaPercente(4);
        
        informaticaEEducacao.setCargaHoraria(60);
        informaticaEEducacao.setDisciplinaAnual(false);
        informaticaEEducacao.setNomeDisciplina("Informática e Educação");
        informaticaEEducacao.setNomeDoProfessor("Fabio de Sordi Junior");
        informaticaEEducacao.setPrecisaDeLab(true);
        informaticaEEducacao.setAnoQueADisciplinaPercente(4);
        
        interfaceHM.setCargaHoraria(60);
        interfaceHM.setDisciplinaAnual(false);
        interfaceHM.setNomeDisciplina("Interface Homem Máquina");
        interfaceHM.setNomeDoProfessor("Thiago Adriano Coleti");
        interfaceHM.setPrecisaDeLab(true);
        interfaceHM.setAnoQueADisciplinaPercente(4);
    }

    /**
     * @return the disciplinaAnual
     */
    public boolean getDisciplinaAnual() {
        return disciplinaAnual;
    }

    /**
     * @param disciplinaAnual the disciplinaAnual to set
     */
    public void setDisciplinaAnual(boolean disciplinaAnual) {
        this.disciplinaAnual = disciplinaAnual;
    }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the nomeDoProfessor
     */
    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    /**
     * @param nomeDoProfessor the nomeDoProfessor to set
     */
    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    /**
     * @return the cargaHoraria
     */
    public float getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getAnoQueADisciplinaPercente() {
        return anoQueADisciplinaPercente;
    }

    public void setAnoQueADisciplinaPercente(int anoQueADisciplinaPercente) {
        this.anoQueADisciplinaPercente = anoQueADisciplinaPercente;
    }
}
