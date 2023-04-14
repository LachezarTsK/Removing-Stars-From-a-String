
#include <string>
using namespace std;

class Solution {
    
public:
    //C++17: string removeStars(string_view input) const
    string removeStars(const string& input) const {
        string result;
        for (const auto& character : input) {
            if (character == '*') {
                result.pop_back();
            } else {
                result.push_back(character);
            }
        }
        return result;
    }
};
