#include<iostream>
using namespace std;

void heapify(int a[],int n,int i)
{
	int large=i;
	int left=2*i+1,right=2*i+2;
	if(left<n && a[left]>a[large])
		large = left;
	if(right<n && a[right]>a[large])
		large = right;
	if(large!=i)
	{
		swap(a[i],a[large]);
		heapify(a,n,large);
	}
}

void build(int a[],int n)
{
	for(int i=n/2-1;i>=0;--i)
	{
		heapify(a,n,0);	
	}
}
void heapSort(int a[],int n)
{
	for(int i=n-1;i>0;--i)
	{
		swap(a[0],a[i]);
		heapify(a,i,0);
	}
}

int main()
{
	int size;
	cout<<"Enter the array size: ";
	cin>>size;

	int array[size];
	for(int i=0;i<size;i++)
	{
		cin>>array[i];
	} 
	
	cout<<"before: ";
	for(int i=0;i<size;i++)
	{
		cout<<" "<<array[i];
	}

	cout<<"After: ";
	heapSort(&array[0],size);
	for(int i=0;i<size;i++)
	{
		cout<<" "<<array[i];
	}
	


















}