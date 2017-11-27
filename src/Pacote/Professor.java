/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;
import java.util.ArrayList;
/**
 *
 * @author a120088
 */
public class Professor {

    ArrayList<Integer> horariosLecionadosSegunda = new ArrayList();
     ArrayList<Integer> horariosLecionadosTerca = new ArrayList();
      ArrayList<Integer> horariosLecionadosQuarta = new ArrayList();
       ArrayList<Integer> horariosLecionadosQuinta = new ArrayList();
        ArrayList<Integer> horariosLecionadosSexta = new ArrayList();

    public float getHorasLecionadasSegunda() {
        return horasLecionadasSegunda;
    }

    public void setHorasLecionadasSegunda(float horasLecionadasSegunda) {
        this.horasLecionadasSegunda = horasLecionadasSegunda;
    }

    public float getHorasLecionadasTerca() {
        return horasLecionadasTerca;
    }

    public void setHorasLecionadasTerca(float horasLecionadasTerca) {
        this.horasLecionadasTerca = horasLecionadasTerca;
    }

    public float getHorasLecionadasQuarta() {
        return horasLecionadasQuarta;
    }

    public void setHorasLecionadasQuarta(float horasLecionadasQuarta) {
        this.horasLecionadasQuarta = horasLecionadasQuarta;
    }

    public float getHorasLecionadasQuinta() {
        return horasLecionadasQuinta;
    }

    public void setHorasLecionadasQuinta(float horasLecionadasQuinta) {
        this.horasLecionadasQuinta = horasLecionadasQuinta;
    }

    public float getHorasLecionadasSexta() {
        return horasLecionadasSexta;
    }

    public void setHorasLecionadasSexta(float horasLecionadasSexta) {
        this.horasLecionadasSexta = horasLecionadasSexta;
    }
        
        
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
        
    }
}
