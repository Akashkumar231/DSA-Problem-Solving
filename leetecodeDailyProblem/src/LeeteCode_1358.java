public class LeeteCode_1358 {
    public int numberOfSubstrings(String array) {
        int count = 0;

        int [] lastSeen = {-1,-1,-1};

        for(int i = 0 ; i< array.length() ; i++){

            lastSeen[array.charAt(i) -'a']=i;

            if (lastSeen[0] != -1 && lastSeen[1]!=-1 & lastSeen[2]!=-1){
                count = count  + (1+Integer.min(lastSeen[0], Integer.min(lastSeen[1],lastSeen[2])));
            }

        }

        return count;
    }
}
