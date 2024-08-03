

// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        
        for (int i = 0; i < mat.length; i++) {
            //Number of people known by each person(row)
            int numPeopleKnown = 0; 
            
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    numPeopleKnown += 1;
                }
            }
            
            //Celebrity knows no one (numPeopleKnown == 0)
            if (numPeopleKnown == 0){
                for (int j = 0; j < mat.length; j++){
                    //Excluding celebrity row
                    if (j != i) {
                        //If someone doesn't know celebrity
                        if (mat[j][i] == 0) {
                            return -1;
                        }
                    }
                }
                return i;
            }
        }
        
        return -1;
    }
}
