class Solution {
public:
    bool isFrequencyUnique(int n, int a[]) {
        unordered_map<int,int> primer;
        unordered_set<int> sieve;
        // First store all the elements in a map and their respective frequency
        for(int i=0; i<n; i++) {
            primer[a[i]]++;
        }
        // Then store all the frequecies in a set
        for(const auto &x: primer) {
            // If the element already exists return false
            if(sieve.count(x.second)>0) {
                return false;
            }
            sieve.insert(x.second);
        }
        return true;
    }
};
