class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char a = magazine.charAt(i);
            have.put(a, have.getOrDefault(a, 0) + 1);
        }
         for(int i = 0; i < ransomNote.length(); i++){
            char b = ransomNote.charAt(i);
            need.put(b, need.getOrDefault(b, 0) + 1);
        }
        return fun(have, need);
    }
     private boolean fun(HashMap<Character, Integer>have,  HashMap<Character, Integer>need){
            for(Map.Entry<Character, Integer> i : need.entrySet()){
                char c = i.getKey();
                int fneed = i.getValue();
                int fhave = have.getOrDefault(c, 0);
                if(fhave < fneed){
                    return false;
                }
            }
            return true;
        }
}