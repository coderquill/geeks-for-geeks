#include <iostream>
using namespace std;

int leftarr(int arr[], int low, int high, int key){
    int mid= low+(high-low) / 2;
    while(low<=high){
        if(arr[mid]==key)
            return mid;
        if(arr[mid]>key)
            high=mid-1;
        else low = mid+1;
    }
    return -1;

}
 int rightarr(int arr[], int low, int high, int key){
     int mid= low+(high-low) / 2;
    while(low<=high){
        if(arr[mid]==key)
            return mid;
        if(arr[mid]>key)
            high=mid+1;
        else low = mid-1;
    }
    return -1;
 }
int main() {
	int t;
	cin>>t;
	int index=0;
	while(t--){
	    int size;
	    cin>>size;
	    int key;
	    cin>>key;
	    int arr[size],max=-32767;
	    for(int i=0;i<size; i++){
	        cin>>arr[i];
	        if(arr[i]>max){
	            max=arr[i];
	            index = i;
	        }
	    }
	    if(key>max)
	        cout<<"OOPS! NOT FOUND"<<endl;
	    else if(key==arr[index])
	            cout<<index<<endl;
	    else {
	       index = leftarr(arr,0,index-1, key);
	       if(index!=-1)
	            cout<<index<<endl;
	       else{
	           index = rightarr(arr, index+1, size-1,key);
	           if(index!=-1)
	                cout<<index<<endl;
	           else cout<<"OOPS! NOT FOUND"<<endl;
	       }
	   }

	}
	return 0;
}

