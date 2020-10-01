#include<stdio.h>
                 void array(int arr[],int n){
int i;
for(i=0;i<n;i++){
printf("%d\n", arr[i]);
}
}
void bubble(int arr[], int n){
int i,j;
for(i=0;i<n-1;i++){
for(j=0;j<n-1-i;j++){
if(arr[j]>arr[j+1])
	arr[j+1]= arr[j];

}
}
int main(){
int arr[] = {30,22,12,67,9};
	int n = 5;
	bubble(arr,5);
printf("The sorted array is:\n");
	array(arr,5);
	return 0;
}

