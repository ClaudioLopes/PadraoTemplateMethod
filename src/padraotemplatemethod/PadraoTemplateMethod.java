package padraotemplatemethod;
/**
 *
 * @author claudio
 */
public class PadraoTemplateMethod {

    public static void main(String[] args) {
        Aluno aluno1 = new AlunoGraduacao();
        Aluno aluno2 = new AlunoPosGraduacao();
        
        aluno1.setNome("Claudio");
        aluno1.setInstituicaoOrigem("Antonio Carlos");
        System.out.println(aluno1.getDados());
        
        aluno2.setNome("Lopes");
        aluno2.setInstituicaoOrigem("UFJF");
        System.out.println(aluno2.getDados());
    }
    
}
