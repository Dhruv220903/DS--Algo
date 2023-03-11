#include<iostream>
using namespace std;
int linearsearch(int arr[],int x,int n){
    for(int i=0;i<n;i++){
        if(arr[i]==x){
            cout<<"Element found at index"<<i;
        }
 
    }
   return -1;
}
int main(){
    int n,x;
    
    cout<<"Enter element to be seached:";
    cin>>x;
    cout<<"Enter the size of array";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    linearsearch(arr,x,n);

return 0;
}