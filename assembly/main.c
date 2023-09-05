#include <stdio.h>
#include <stdlib.h>

#define ZERO_BIT 1
#define ONE_BIT 1
#define MEMORY_SIZE 8

typedef enum bit { zeroBit = 0, oneBit = 1 } bit;

typedef bit registerC[MEMORY_SIZE] ;




bit RAM[MEMORY_SIZE];
registerC* AX;
registerC* BX;
registerC* CX;
registerC* DX;

int operationCount = 0;

const char* ASSIGN_COMMAND = "HRK";
const char* ADD_COMMAND = "TOP";
const char* MULTIPLICATION_COMMAND = "CRP";
const char* SUBTRACT_COMMAND = "CIK";
const char* DIVISION_COMMAND = "BOL";
const char* AND_BOOL_OPERATOR = "VE";
const char* OR_BOOL_OPERATOR = "VEYA";
const char* NEGATION_BOOL_OPERATOR = "DEG";

const char* RAM_ADDRESS = "ADRES";


bit carryBit = zeroBit;



bit addition(bit first, bit second)
{
    bit total = (first + second + carryBit) % 2;
    operationCount++;
    if(operationCount == MEMORY_SIZE)
    {
        carryBit = zeroBit;
        operationCount = 0;

    } else if(first == second)
    {
        if(first == oneBit)
            carryBit = oneBit;
        if(first == zeroBit)
            carryBit = zeroBit;
    }
    return total;
}

bit multiplication(bit first, bit second)
{
    if(first == second && first == oneBit)
    {
        return oneBit;
    }
    return zeroBit;
}

bit subtraction(bit first, bit second)
{
    if(first == second && first == oneBit)
    {
        return oneBit;
    }
    return zeroBit;
}

bit or(bit first, bit second)
{
    if(first == second && first == zeroBit)
    {
        return zeroBit;
    }
    return oneBit;
}

bit and(bit first, bit second)
{
    if(first == second && first == oneBit)
    {
        return oneBit;
    }
    return zeroBit;
}

bit not(bit byte1)
{
    if(byte1 == zeroBit)
        return oneBit;
    return zeroBit;
}



int power(int base, int exponent){

    int result =1 ;
    for(; exponent > 0; exponent--)
    {
        result = result * base;
    }
    return result;
}

// ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------



void intTo8Byte(registerC* numberBuffer, int integer)
{
    int integerCopy = integer;
    int i;

    for (i = 0; i < MEMORY_SIZE; ++i) {
        *numberBuffer[i] = zeroBit;
    }

    for (i = 0; i < MEMORY_SIZE; ++i) {
        *numberBuffer[i] = (bit) (integerCopy % 2);
        integerCopy /= 2;

        if(integerCopy == 0)
            break;

    }

}


int byteToInt(registerC* number)
{
    int output = 0;
	int i;
    for ( i=0; i < MEMORY_SIZE; ++i) {

        output += (int) *number[i] * power(2, i);
    }
    return output;
}


void printRegister(registerC* registerC1)
{
	int i;
    for ( i = MEMORY_SIZE - 1; i >= 0; i--) {
        switch (*registerC1[i]) {
            case zeroBit:
                printf("0"); break;
            case oneBit:
                printf("1"); break;
        }
    }
}


// ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------

// = operator, mov
void assign(registerC* targetRegister, int number)
{

    registerC* numberReg = malloc(1 * sizeof(registerC));

    intTo8Byte(numberReg, number);
	int i;
    for (i = 0; i < MEMORY_SIZE; ++i) {
        *targetRegister[i] = *numberReg[i];
    }
}

void assignReg(registerC* targetRegister, registerC* resourceRegister)
{
	int i;
    for ( i = 0; i < MEMORY_SIZE; ++i) {
        *targetRegister[i] = *resourceRegister[i];
    }
}

// + operator, add
void add(registerC* targetRegister, int number)
{
    registerC* numberReg = malloc(1 * sizeof(registerC));

    intTo8Byte(numberReg, number);
	int i;
    for ( i = 0; i < MEMORY_SIZE; ++i) {

        *targetRegister[i] = addition(*targetRegister[i], *numberReg[i]);
    }
}

void addReg(registerC* targetRegister, registerC* resourceRegister)
{
	int i;
    for ( i = 0; i < MEMORY_SIZE; ++i) {

        *targetRegister[i] = addition(*targetRegister[i], *resourceRegister[i]);
    }
}

// * operator, mul
void mul(registerC* targetRegister, int number)
{
    registerC* numberReg = malloc(1 * sizeof(registerC));

    intTo8Byte(numberReg, number);
	int i;
    for ( i = 0; i < MEMORY_SIZE; ++i) {
        *targetRegister[i] = multiplication(*targetRegister[i], *numberReg[i]);
    }
}

void mulReg(registerC* targetRegister, registerC* resourceRegister)
{
	int i;
    for ( i = 0; i < MEMORY_SIZE; ++i) {
        *targetRegister[i] = multiplication(*targetRegister[i], *resourceRegister[i]);
    }
}

// / operator, div
void divMod(registerC* number, int denominator)
{
    int numerator = byteToInt(number);
    int result = numerator / denominator;
    int mod = numerator % denominator;

    intTo8Byte(number, result);
    intTo8Byte(DX, mod);

}

void divModReg(registerC* numeratorRegister, registerC* denominatorRegister)
{
    int numerator = byteToInt(numeratorRegister);
    int denominator = byteToInt(denominatorRegister);
    int result = numerator / denominator;
    int mod = numerator % denominator;

    intTo8Byte(numeratorRegister, result);
    intTo8Byte(DX, mod);
}



// - operator, sub
void subtract(registerC* registerC1, int number){

    int registerNumber = byteToInt(registerC1);
    int result = registerNumber - number;

    intTo8Byte(registerC1, result);
}

void subtractReg(registerC* registerC1, registerC* registerC2)
{
    int registerNumber_1 = byteToInt(registerC1);
    int registerNumber_2 = byteToInt(registerC2);

    int result = registerNumber_1 - registerNumber_2;

    intTo8Byte(registerC1, result);
}

// ! operator, not
void notOperator(registerC* registerC1){
	
	int i;
    for ( i = 0; i < MEMORY_SIZE; ++i) {
        *registerC1[i] = not(*registerC1[i]);
    }
}

// || operator, or
void orOperator(registerC* registerC1, registerC* registerC2){

	int i;
    for ( i = 0; i < MEMORY_SIZE; ++i) {
        *registerC1[i] = or(*registerC1[i], *registerC2[i]);
    }
}

// && operator, and
void andOperator(registerC* registerC1, registerC* registerC2){

	int i;
    for ( i = 0; i < MEMORY_SIZE; ++i) {
        *registerC1[i] = and(*registerC1[i], *registerC2[i]);
    }
}


// ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------

void execute_command(const char* line)
{
    int index = 0;
    char* command = malloc(3 * sizeof(char));
    char comma = ',';

    while(line[index] != '\0')
    {
        command[index] = line[index];
        if(index == 2)
        {

        }
    }
}













// ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------

void initializeRegisters()
{
    AX = malloc(1 * sizeof(registerC));
    BX = malloc(1 * sizeof(registerC));
    CX = malloc(1 * sizeof(registerC));
    DX = malloc(1 * sizeof(registerC));
}

// ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------







int main() {

    initializeRegisters();

    
    intTo8Byte(number, 128);
    intTo8Byte(number, 67);
    intTo8Byte(number, 31);
    intTo8Byte(number, 98);
    

    // toplama test   -   TAMAMDIR
    
    assign(AX, 7);
    printRegister(AX);
    printf("\n");

    assign(BX, 18);
    printRegister(BX);
    printf("\n");

    add(AX, byteToInt(BX));
    printRegister(AX);
    printf("\n");
     

    // çarpma test   -   TAMAMDIR
    
    assign(AX, 7);
    printRegister(AX);
    printf("\n");

    assign(BX, 3);
    printRegister(BX);
    printf("\n");

    mul(AX, byteToInt(BX));
    printRegister(AX);
    printf("\n");
    

    // bölme test   -   TAMAMDIR
    
    assign(AX, 18);
    printRegister(AX);
    printf("\n");

    assign(BX, 7);
    printRegister(BX);
    printf("\n");

    divMod(AX, byteToInt(BX));
    printRegister(AX);
    printf("\nMod--\n");
    printRegister(DX);

    printf("\n");
    

    // çıkarma test  TAMAMDIR
    
    assign(AX, 18);
    printRegister(AX);
    printf("\n");

    assign(BX, 7);
    printRegister(BX);
    printf("\n");

    subtract(AX, byteToInt(BX));
    printRegister(AX);
    printf("\n");
    


    return 0;
}
