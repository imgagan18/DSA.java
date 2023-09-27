#include <stdio.h>

void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void maxHeapify(int arr[], int N, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < N && arr[left] > arr[largest])
        largest = left;

    if (right < N && arr[right] > arr[largest])
        largest = right;

    if (largest != i) {
        swap(&arr[i], &arr[largest]);
        maxHeapify(arr, N, largest);
    }
}

void minHeapify(int arr[], int N, int i) {
    int smallest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < N && arr[left] < arr[smallest])
        smallest = left;

    if (right < N && arr[right] < arr[smallest])
        smallest = right;

    if (smallest != i) {
        swap(&arr[i], &arr[smallest]);
        minHeapify(arr, N, smallest);
    }
}

void buildMaxHeap(int arr[], int N) {
    for (int i = N / 2 - 1; i >= 0; i--)
        maxHeapify(arr, N, i);
}

void buildMinHeap(int arr[], int N) {
    for (int i = N / 2 - 1; i >= 0; i--)
        minHeapify(arr, N, i);
}

void heapSortMax(int arr[], int N) {
    buildMaxHeap(arr, N);
    for (int i = N - 1; i >= 0; i--) {
        swap(&arr[0], &arr[i]);
        maxHeapify(arr, i, 0);
    }
}

void heapSortMin(int arr[], int N) {
    buildMinHeap(arr, N);
    for (int i = N - 1; i >= 0; i--) {
        swap(&arr[0], &arr[i]);
        minHeapify(arr, i, 0);
    }
}

void printArray(int arr[], int N) {
    for (int i = 0; i < N; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

int main() {
    int arrMax[] = {12, 11, 13, 5, 6, 7};
    int arrMin[] = {12, 11, 13, 5, 6, 7};
    int N = sizeof(arrMax) / sizeof(arrMax[0]);

    printf("Original array:\n");
    printArray(arrMax, N);

    printf("\nMax Heap Sort:\n");
    heapSortMax(arrMax, N);
    printArray(arrMax, N);

    printf("\nMin Heap Sort:\n");
    heapSortMin(arrMin, N);
    printArray(arrMin, N);

    return 0;
}