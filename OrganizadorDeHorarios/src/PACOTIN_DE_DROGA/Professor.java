/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PACOTIN_DE_DROGA;
import java.util.ArrayList;
/**
 *
 * @author a120088
 */
public class Professor {

    ArrayList<String> disciplinasLecionadas = new ArrayList<>();
     
    private float horasLecionadasSegunda;
    private float horasLecionadasTerca;
    private float horasLecionadasQuarta;
    private float horasLecionadasQuinta;
    private float horasLecionadasSexta;
    
    public Professor(){
        horasLecionadasSegunda=0;
        horasLecionadasTerca=0;
        horasLecionadasQuarta=0;
        horasLecionadasQuinta=0;
        horasLecionadasSexta=0;
    }
    
    public void inicializar(){
        Professor ailton = new Professor();
        ailton.disciplinasLecionadas.add("Banco de Dados");
        ailton.disciplinasLecionadas.add("Introdução a Ciência da Computação");
        
        Professor andre = new Professor();
        andre.disciplinasLecionadas.add("Engenharia de Software I");
        andre.disciplinasLecionadas.add("Engenharia de Software II");
        
        Professor brunoMiguel = new Professor();
        brunoMiguel.disciplinasLecionadas.add("Banco de Dados");
        
        Professor brunoFaical = new Professor();
        brunoFaical.disciplinasLecionadas.add("Programação I");
        brunoFaical.disciplinasLecionadas.add("Projeto e Análise de Algoritmos");
        brunoFaical.disciplinasLecionadas.add("Linguagues de Programação");
        
        Professor carlosEduardo = new Professor();
        carlosEduardo.disciplinasLecionadas.add("Administração");
        carlosEduardo.disciplinasLecionadas.add("Segurança e Auditoria de Sistemas");
        
        Professor carlosHenrique = new Professor();
        carlosHenrique.disciplinasLecionadas.add("Empreendedorismo");
        
        Professor christian = new Professor();
        christian.disciplinasLecionadas.add("Banco de Dados");
        
        Professor daniela = new Professor();
        daniela.disciplinasLecionadas.add("Prática e Gerenciamento de Projetos");
        
        Professor ederson = new Professor();
        ederson.disciplinasLecionadas.add("Banco de Dados");
        
        Professor fabio = new Professor();
        fabio.disciplinasLecionadas.add("Engenharia de Software III");
        fabio.disciplinasLecionadas.add("Informática e Educação");
        
        Professor glauco = new Professor();
        glauco.disciplinasLecionadas.add("Inteligência Artificial");
        
        Professor joseMerlin = new Professor();
        joseMerlin.disciplinasLecionadas.add("Programação II");
        
        Professor luizFernando = new Professor();
        luizFernando.disciplinasLecionadas.add("Matemática Discreta e Lógica Matemática");
        luizFernando.disciplinasLecionadas.add("Computação Simbólica e Numérica");
        
        Professor luizRenato = new Professor();
        luizRenato.disciplinasLecionadas.add("Banco de Dados");
        
        Professor maisa = new Professor();
        maisa.disciplinasLecionadas.add("Cálculo e Geometria Analítica I");
        maisa.disciplinasLecionadas.add("Cálculo e Geometria Analítica II");
        maisa.disciplinasLecionadas.add("Álgebra Linear");
        
        Professor marcioHasegawa = new Professor();
        marcioHasegawa.disciplinasLecionadas.add("Física");
        
        Professor mauricio = new Professor();
        mauricio.disciplinasLecionadas.add("Computadores e Sociedade");
        
        Professor ricardo = new Professor();
        ricardo.disciplinasLecionadas.add("Redes");
        ricardo.disciplinasLecionadas.add("Sistemas Distribuídos");
        
        Professor tamara = new Professor();
        tamara.disciplinasLecionadas.add("Banco de Dados");
        tamara.disciplinasLecionadas.add("Metodologia de Pesquisa");
        
        Professor thiago = new Professor();
        thiago.disciplinasLecionadas.add("Teoria e Prática de Sistema de Informação");
        thiago.disciplinasLecionadas.add("Arquitetura de Computadores");
        thiago.disciplinasLecionadas.add("Sistemas Operacionais");
        thiago.disciplinasLecionadas.add("Interface Homem Máquina");
        
        Professor wellington = new Professor();
        wellington.disciplinasLecionadas.add("Comunicação e Expressão");
        wellington.disciplinasLecionadas.add("Teoria da Computação");
        wellington.disciplinasLecionadas.add("Compiladores");
        wellington.disciplinasLecionadas.add("Computação Gráfica"); 
    }

    /**
     * @return the horasLecionadasTerca
     */
     public float getHorasLecionadasSegunda() {
        return horasLecionadasSegunda;
    }

    public void setHorasLecionadasSegunda(float horasLecionadasSegunda) {
        this.horasLecionadasSegunda = horasLecionadasSegunda;
    }
    
    public float getHorasLecionadasTerca() {
        return horasLecionadasTerca;
    }

    /**
     * @param horasLecionadasTerca the horasLecionadasTerca to set
     */
    public void setHorasLecionadasTerca(float horasLecionadasTerca) {
        this.horasLecionadasTerca = horasLecionadasTerca;
    }

    /**
     * @return the horasLecionadasQuarta
     */
    public float getHorasLecionadasQuarta() {
        return horasLecionadasQuarta;
    }

    /**
     * @param horasLecionadasQuarta the horasLecionadasQuarta to set
     */
    public void setHorasLecionadasQuarta(float horasLecionadasQuarta) {
        this.horasLecionadasQuarta = horasLecionadasQuarta;
    }

    /**
     * @return the horasLecionadasQuinta
     */
    public float getHorasLecionadasQuinta() {
        return horasLecionadasQuinta;
    }

    /**
     * @param horasLecionadasQuinta the horasLecionadasQuinta to set
     */
    public void setHorasLecionadasQuinta(float horasLecionadasQuinta) {
        this.horasLecionadasQuinta = horasLecionadasQuinta;
    }

    /**
     * @return the horasLecionadasSexta
     */
    public float getHorasLecionadasSexta() {
        return horasLecionadasSexta;
    }

    /**
     * @param horasLecionadasSexta the horasLecionadasSexta to set
     */
    public void setHorasLecionadasSexta(float horasLecionadasSexta) {
        this.horasLecionadasSexta = horasLecionadasSexta;
    }
    
    
    
    
}
