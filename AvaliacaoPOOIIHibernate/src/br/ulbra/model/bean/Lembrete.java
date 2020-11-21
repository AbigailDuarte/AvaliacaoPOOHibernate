
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
public class Lembrete {
    
      
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
    private int idLembrete;
    private String atividade;
    private String dataLembrete;
    private String horarioLembrete;
    private String corLembrete;

    public int getIdLembrete() {
        return idLembrete;
    }

    public void setIdLembrete(int idLembrete) {
        this.idLembrete = idLembrete;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getDataLembrete() {
        return dataLembrete;
    }

    public void setDataLembrete(String dataLembrete) {
        this.dataLembrete = dataLembrete;
    }

    public String getHorarioLembrete() {
        return horarioLembrete;
    }

    public void setHorarioLembrete(String horarioLembrete) {
        this.horarioLembrete = horarioLembrete;
    }

    public String getCorLembrete() {
        return corLembrete;
    }

    public void setCorLembrete(String corLembrete) {
        this.corLembrete = corLembrete;
    }

    @Override
    public String toString() {
        return "Lembrete{" + "idLembrete=" + idLembrete + ", atividade=" + atividade + ", dataLembrete=" + dataLembrete + ", horarioLembrete=" + horarioLembrete + ", corLembrete=" + corLembrete + '}';
    }
    
    
    
}
