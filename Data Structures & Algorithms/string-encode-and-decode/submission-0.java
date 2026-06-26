class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String str : strs){
            encoded += str.length() + "#" + str;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();//3#cat3#dog
        int i =0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int n = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+n+1);
            result.add(word);
            i=j+n+1;
        }
        return result;
    }
}
