public class Trie {
    private NodeTrie root;

    public Trie(){
        root = new NodeTrie();
    }

	// Função para inserir uma palavra na Trie
	// Exemplo: Se quisermos inserir a palavra "pdf", a Trie vai ter a seguinte estrutura (apenas as letras de "pdf"): root -> p -> d -> f

    public void inserir(String palavra){
        NodeTrie node = root; // começo pelo nó raiz
        for(int i = 0; i < palavra.length(); i++){ // percorre a palavra para cada caractere da palavra
            int indice = palavra.charAt(i) - 'a'; // calculo do indice correspondente da palavra no array (exemplo 'c' -'a' = 2)
            if(node.filho[indice] == null){ // se o indice correspondente não existir, é criado um novo nó
                node.filho[indice] = new NodeTrie();
            }
            node = node.filho[indice]; // avança para o próximo nó
        }
        node.isFim = true;
    }

	// Função para verificar se uma palavra existe na Trie, percorrendo cada letra da palavra, verificando se há um caminho correspondente
    public String pesquisa(String palavra){
        NodeTrie node = root; // começo pelo nó raiz
        for(int i = 0; i < palavra.length(); i++){ 
            int indice = palavra.charAt(i) - 'a';
            if(node.filho[indice] == null){
                return "A palavra "+palavra+" NÃO EXISTE";
            }
            node = node.filho[indice];
        }
        return "A palavra "+palavra+" EXISTE";
    }

    public void remover(String palavra){
        remover(root, palavra, 0);
    }
    private void remover(NodeTrie node, String palavra, int tamanho){
        if(node == null) {
            return;
        }
        if(tamanho == palavra.length()){
            node.isFim = false;
            return;
        }

        int indice = palavra.charAt(tamanho) - 'a';
        remover(node.filho[indice], palavra, tamanho + 1);

        // Após a chamada recursiva, remove o nó filho
        node.filho[indice] = null;
    }

    public String comecaCom(String prefixo){
        NodeTrie node = root;
        for (int i = 0; i < prefixo.length(); i++) {
            int indice = prefixo.charAt(i) - 'a';
            if (node.filho[indice] == null) {
                return "NÃO há palavras que começam com o prefixo: "+prefixo;
            }
            node = node.filho[indice];
        }
        return "HÁ palavras que começam com o prefixo: "+prefixo;
    }
}
