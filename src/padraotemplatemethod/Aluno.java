package padraotemplatemethod;

/**
 *
 * @author claudio
 */
public abstract class Aluno {
    private String nome;
    private String instituicaoOrigem;
    
    public abstract String getOrigem();
    
    public String getDados(){
        return "Aluno: " + getNome() + " - Origem: " + getOrigem() + " " + getInstituicaoOrigem();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getInstituicaoOrigem(){
        return instituicaoOrigem;
    }
    
    public void setInstituicaoOrigem(String instituicaoOrigem){
        this.instituicaoOrigem = instituicaoOrigem;
    }
}
