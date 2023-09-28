#include <stdio.h>

void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
//used to find the heapify ie heap using binary tree

void heapify(int arr[], int n, int i) {
    int largest = i; // Initialize largest as the root
    int left = 2 * i + 1; 
    int right = 2 * i + 2; 

    // If the left child is larger than the root
    if (left < n && arr[left] > arr[largest])
        largest = left;

    // If the right child is larger than the largest so far
    if (right < n && arr[right] > arr[largest])
        largest = right;

    // If the largest is not the root
    if (largest != i) {
        swap(&arr[i], &arr[largest]);

        
        heapify(arr, n, largest);
    }
}

void buildMaxHeap(int arr[], int n) {
    
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }
}

//function to print heap

void printHeap(int arr[], int n) {
    printf("Max Heap: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
//driver code
int main() {
    int arr[] = {4, 10, 3, 5, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("the maximun element is ");
    for (int i = 0; i < n; i++)
    {
      printf("%d ", arr[i]);
    }
     printf("\n");

    buildMaxHeap(arr, n);
    printHeap(arr, n);

    return 0;
}

