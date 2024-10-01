public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Inserindo palavras variadas
        trie.inserir("java");
        trie.inserir("py");
        trie.inserir("c");
        trie.inserir("cpp");
        trie.inserir("js");
        trie.inserir("php");
        trie.inserir("exe");
        trie.inserir("pdf");
        trie.inserir("wordx");

        // Busca por palavras
        System.out.println(trie.pesquisa("java")); 
        System.out.println(trie.pesquisa("py"));      
        System.out.println(trie.pesquisa("c"));      
        System.out.println(trie.pesquisa("cpp"));     
        System.out.println(trie.pesquisa("js"));   
        System.out.println(trie.pesquisa("csv"));  
        System.out.println(trie.pesquisa("php"));  
        System.out.println(trie.pesquisa("exe")); 
        System.out.println(trie.pesquisa("pdf")); 
        System.out.println(trie.pesquisa("xlsx"));
        System.out.println(trie.pesquisa("png"));
        System.out.println(trie.pesquisa("wordx"));

        // Busca por prefixos
        System.out.println(trie.comecaCom("ja"));
        System.out.println(trie.comecaCom("c"));
        System.out.println(trie.comecaCom("pd"));
        System.out.println(trie.comecaCom("ex"));
        System.out.println(trie.comecaCom("wor"));
        System.out.println(trie.comecaCom("xl"));
        System.out.println(trie.comecaCom("pn"));

       trie.remover("pdf");
       trie.remover("exe");

        System.out.println(trie.pesquisa("pdf"));
        System.out.println(trie.pesquisa("exe"));
    }
}
