#include <stdio.h>
#include <math.h>

float calculateSD(float data[]);

int main()
{
    int a;
    float data[10];

    printf("10 eleman giriniz: ");
    for(a=0; a < 10; ++a)
        scanf("%f", &data[a]);

    printf("\nStandart Sapmasi = %f", calculateSD(data));

    return 0;
}

float calculateSD(float data[])
{
    float sum = 0.0, mean, standardDeviation = 0.0;

    int a;

    for(a=0; a<10; ++a)
    {
        sum += data[a];
    }

    mean = sum/10;

    for(a=0; a<10; ++a)
        standardDeviation += pow(data[a] - mean, 2);

    return sqrt(standardDeviation/10);
}

