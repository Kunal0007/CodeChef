#include <iostream>
using namespace std;

int main() {
	long long n;
    cin >> n;
    for (long long i = 0; i < n; i++){
        long long x;
        cin >> x;
        if ((x-1)%4 == 1 || (x-1)%4 == 2){
            cout << 3 << endl;
        }
        else if ((x-1)%4 == 3){
            cout << 3 + 4*(x/4) << endl;
        }
        else {
            cout << x << endl;
        }
    }
	return 0;
}