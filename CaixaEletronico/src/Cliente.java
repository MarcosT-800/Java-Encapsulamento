public class Cliente {

    private int CPF;
    public Cliente(int cPF, String endereco, int telefone, String nome, int rg) {
        CPF = cPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
        Rg = rg;
    }
    private String endereco;
    private int telefone;
    private String nome;
    private int Rg;
    
    

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRg() {
        return Rg;
    }
    public void setRg(int rg) {
        Rg = rg;
    }
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int cPF) {
        CPF = cPF;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Cliente [CPF=" + CPF + ", endereco=" + endereco + ", telefone=" + telefone + ", nome=" + nome + ", Rg="
                + Rg + "]";
    }
    
}
