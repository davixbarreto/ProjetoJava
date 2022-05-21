package projeto;

public class painelSistema {
    private String usuario;
    private String senha;
    private String funcionarioNome;
    private Integer funcionarioCodigo;
    private Double funcionarioSalario;

    public void painelSistema(String usuario, String senha){   
            this.usuario = usuario;
            this.senha =  senha;
    }

    public painelSistema(String funcionarioNome, Integer funcionarioCodigo,  Double funcionarioSalario){
        this.funcionarioNome = funcionarioNome;
        this.funcionarioCodigo = funcionarioCodigo;
        this.funcionarioSalario =  funcionarioSalario;
    }

    public String getFuncionarioNome(){
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome){
        this.funcionarioNome = funcionarioNome;
    }

    public Integer funcionarioCodigo(){
        return funcionarioCodigo;
    }

    public Double getfuncionarioSalario(){
        return funcionarioSalario;
    }

    public void salarioPorcentagem(double porcentagem){
        funcionarioSalario += funcionarioSalario*(porcentagem/100);
    }

    @Override  
    public String toString(){
        return "NOME : " + funcionarioNome + " CÓDIGO : " + funcionarioCodigo + " SALARIO ATUAL : " + String.format(" R$ %.2f ", funcionarioSalario) + "\n\n";
    }
}