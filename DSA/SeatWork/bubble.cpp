#include <stdio.h>
#define SIZE 10000
#include <cstdlib>

int myArr[SIZE - 1];

void swap(int x, int y)
{
    int temp;
    temp = myArr[x];
    myArr[x] = myArr[y];
    myArr[y] = temp;

}


void bubbleSort(int x[])
{
    int i, j;

    for(i = 1; i < SIZE; i++)
    {
        for( j = 0; j < SIZE - 1; j++)
        {
            if(myArr[j] > myArr[j+1])
                swap(j, j+1);
        }
    }
}

void printSort()
{
    int i;
    for( i = 0; i < SIZE - 1; i++)
    {
        printf("%d\n", myArr[i]);
    }
}

void init()
{
    int i;
    for( i = 0; i < SIZE - 1; i++)
    {
        myArr[i] = rand()%10000;
    }
}

int main()
{
    init();
    bubbleSort(myArr);
    printSort();
    return 0;
}