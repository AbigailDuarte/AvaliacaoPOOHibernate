
package br.ulbra.model.bean;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.JOptionPane;
/**
 *
 * @author 55519
 */

@Entity 
public class Aula {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String nome;
    private int anoNasc;
    private double p1;
    private double p2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        
        if(nome.length() < 50){
            JOptionPane.showMessageDialog(null, "Nome cadastrado inválido!" + nome.length());
            this.nome = "";
        }else{
            this.nome = nome;
        }
        
    }

    public int getAnoNasc() {
            
        Calendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        
        return  year - anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        
        if(anoNasc < 1940){
            this.anoNasc = 1970;
        }else{
            this.anoNasc = anoNasc;
        }
        
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        
        if(p1 > 0 && p1 <10){
            this.p1 = p1;
        }else{
            this.p1 = 1;
        }
        
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        
         if(p2 > 0 && p2 <10){
            this.p2 = p2;
        }else{
            this.p2 = 1;
        }

    }
    
    public double calcularMedia(){
        
        
        return (p1+p2)/2;
        
    }
    

    @Override
    public String toString() {
        return  getNome() + ", sua idade é " + getAnoNasc() + "– a Nota 1º Bim é"+ getP1() +"e a Nota do 2º Bim é"+ getP2() +"sua média final ficou em" + calcularMedia() ;
    }
    
    
    
}
