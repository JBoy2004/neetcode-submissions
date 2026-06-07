class Solution 
{
public:
    bool isAnagram(string s, string t) 
    {
        //make two unordered_map s to store characters with their frequency
        std::unordered_map<int, int> listS;
        std::unordered_map<int, int> listT;

        //ensure length matches
        if (s.size() != t.size()) return false;

        //loop through and store values 
        for (int i = 0; i < s.size(); i++)
        {
            listS[s[i]]++;
            listT[t[i]]++;
        }
        
        return listS == listT;
    }
};
