import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas a ser cadastrado "));

        ClienteCadastrado pessoas[] = new ClienteCadastrado[numero]; //agora array de Pessoas
    
        for (int i = 0; i < pessoas.length; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome: ", null);
            int RG = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: ", null));
            int CPF = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: ", null));
            String endereco = JOptionPane.showInputDialog("Digite o nome: ", null);
            int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: ", null));
            int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: ", null));
            int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: ", null));
            int saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: ", null));
            String banco = JOptionPane.showInputDialog("Digite o nome: ", null);

        


            
    
            //criar a Pessoa e inserir na posição certa do vetor parei aqui
            pessoas[i] = new Cliente(nome, endereco); 
        }
    
        //ordena e mostra de uma só vez utilizando sorted() e forEach()
        Arrays.stream(pessoas).sorted(new Comparator<Pessoa>(){
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getNome().compareTo(p2.getNome());
            }
        }).forEach(x-> System.out.println(x.emTexto()));
    }
}
