class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;
        
        while (index < words.length) {
            int count = words[index].length();
            int last = index + 1;
            
            while (last < words.length) {
                if (count + 1 + words[last].length() > maxWidth) break;
                count += 1 + words[last].length();
                last++;
            }
            
            StringBuilder sb = new StringBuilder();
            int numberOfWords = last - index;
            
            if (last == words.length || numberOfWords == 1) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                int totalSpaces = maxWidth - count + (numberOfWords - 1);
                int spaceBetween = totalSpaces / (numberOfWords - 1);
                int extraSpaces = totalSpaces % (numberOfWords - 1);
                
                for (int i = index; i < last - 1; i++) {
                    sb.append(words[i]);
                    for (int j = 0; j < spaceBetween; j++) sb.append(" ");
                    if (extraSpaces > 0) {
                        sb.append(" ");
                        extraSpaces--;
                    }
                }
                sb.append(words[last - 1]);
            }
            
            result.add(sb.toString());
            index = last;
        }
        
        return result;
    }
}