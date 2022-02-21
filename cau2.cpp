#include<iostream>
using namespace std;

void sumint(int q){
    int temp = q*100;
    int a;
    int sum = 0;
    if(temp>1000 && temp<=2000){
        a = temp*0.1;
        sum = q - a;
        cout<<sum;
    } else if (q>2000){
        a = temp*0.15;
        sum = q - a;
        cout<<sum;
    } else {
        cout<<"N";
    }
    
}

int main(){
    int q;
    cin>>q;
    if(q>0 && q<10000){
        sumint(q);
    } else {
        cout<<"N";
    }
    return 0;
}