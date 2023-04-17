import java.util.Arrays;

public class ClienteCadastrado extends Cliente{
    private String banco[] = {"itau", "Santander", "Bradesco", "HSBC"};
    private String Conta;
    private int Senha;
    private int Saldo;
    
    
    public ClienteCadastrado(int cPF, String endereco, int telefone, String nome, int rg) {
        super(cPF, endereco, telefone, nome, rg);
        //TODO Auto-generated constructor stub
    }
    
    public ClienteCadastrado(int cPF, String endereco, int telefone, String nome, int rg, String[] banco, String conta,
    int senha, int saldo) {
        super(cPF, endereco, telefone, nome, rg);
        this.banco = banco;
        Conta = conta;
        Senha = senha;
        Saldo = saldo;
    }
    
    public String[] getBanco() {
        return banco;
    }

    public void setBanco(String[] banco) {
        this.banco = banco;
    }
    
    public String getConta() {
        return Conta;
    }
    
    public void setConta(String conta) {
        Conta = conta;
    }
    
    public int getSenha() {
        return Senha;
    }
    
    public void setSenha(int senha) {
        Senha = senha;
    }

    public int getSaldo() {
        return Saldo;
    }
    
    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "ClienteCadastrado [banco=" + Arrays.toString(banco) + ", Conta=" + Conta + ", Senha=" + Senha
                + ", Saldo=" + Saldo + "]";
    }
}
