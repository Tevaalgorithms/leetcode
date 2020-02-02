class Trie {

    class TrieNode {
        final int alphabets = 26;
        boolean isEndOfWord = false; 
        TrieNode[] children = new TrieNode[alphabets];
    }
    
    TrieNode root; 
    
    /** Initialize your data structure here. */
    public Trie() {
       root = new  TrieNode();        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
       TrieNode pCrawl = root;
       for(int i = 0; i < word.length(); i++) {
           
           int index = word.charAt(i) - 'a';
           
           if(pCrawl.children[index] == null) {
               pCrawl.children[index] = new TrieNode();
           }
           
           pCrawl = pCrawl.children[index];
       }
       pCrawl.isEndOfWord = true; 
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
       TrieNode pCrawl = root;
       for(int i = 0; i < word.length(); i++) {
           
           int index = word.charAt(i) - 'a';
           
           if(pCrawl.children[index] == null) {
              return false;
           }
           
           pCrawl = pCrawl.children[index];
       }
      return (pCrawl != null) &&  (pCrawl.isEndOfWord == true);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
         TrieNode pCrawl = root;
       for(int i = 0; i < prefix.length(); i++) {
           
           int index = prefix.charAt(i) - 'a';
           
           if(pCrawl.children[index] == null) {
              return false;
           }
           
           pCrawl = pCrawl.children[index];
       }
      return (pCrawl != null);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
