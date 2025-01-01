#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	int testcase;
	char str[100]; // ch[0] ~ ch[4]
	scanf("%d", &testcase); // 5
	int sum = 0;

	scanf("%s", &str);
	for (int i = 0; i < testcase; i++) {
		sum += str[i] - '0';
	}

	printf("%d", sum);

	return 0;
}