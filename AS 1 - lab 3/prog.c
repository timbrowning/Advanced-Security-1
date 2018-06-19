#include<stdio.h>
#include<math.h>
 
// gcd
int gcd(int a, int b)
{
    int temp;
    while(1)
    {
        temp = a%b;
        if(temp==0)
        return h;
        a = b;
        b = temp;
    }
}
 
int main()
{
    //2 random numbers
    double p = 5;
    double q = 9;
    double number=p*q;
    double count;
    double totient = (p-1)*(q-1);
 
    //public key
    //e stands for encrypt
    double encrypt1 =2;
 
    //for checking co-prime which satisfies e>1
    while(encrypt1<totient){
    count = gcd(encrypt1,totient);
    if(count==1)
        break;
    else
        e++;
    }
 
    //private key
    double decrypt1;
 
    double k = 2;
 

    decrypt1 = (1 + (k*totient))/encrypt1;
    double message = 12;
    double x = pow(message,encrypt1);
    double y = pow(x,decrypt1);
    x=fmod(x,number);
    y=fmod(y,number);
 
    printf("Message = %lf",message);
    printf("\number p = %lf",p);
    printf("\number q = %lf",q);
    printf("\number = pq = %lf",number);
    printf("\ntotient = %lf",totient);
    printf("\ecrypt number = %lf",ecrypt1);
    printf("\decrypt number = %lf",decrypt1);
    printf("\nEncrypted data = %lf",x);
    printf("\nOriginal Message = %lf",y);
 
    return 0;
}