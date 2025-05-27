import java.util.ArrayList;
import java.util.List;
public class Estado{
    private String nome;
    private List<Time> times;
    
    public Estado(String nome){
        this.nome = nome;
        this.times = new ArrayList<>();
    }
    public String getNome(){
        return nome;
    }
    public List<Time> getTimes(){
        return times;
    }
    public void adicionarTime(Time time){
        times.add(time);
    }
}