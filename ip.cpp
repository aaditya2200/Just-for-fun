#include <iostream>
using namespace std;
int i,j;
int main()
{
	int ip[4];
	cout << "Enter the 4 bytes of ip address: ";
	for (i = 0; i < 4; i++)
	{
		cin>>ip[i];
	}

	if (ip[0] >= 0 and ip[0]<=127)
	{
		ip[0] = ip[0] & 255;
		ip[1] = ip[1] & 0;
		ip[2] = ip[2] & 0;
		ip[3] = ip[3] & 0;
	}
	if (ip[0] >= 128 && ip[0]<=191)
	{
		ip[0] = ip[0] & 255;
                ip[1] = ip[1] & 255;
                ip[2] = ip[2] & 0;
                ip[3] = ip[3] & 0;
	}
	if (ip[0] >= 192 && ip[0] <= 223)
	{
		ip[0] = ip[0] & 255;
                ip[1] = ip[1] & 255;
                ip[2] = ip[2] & 255;
                ip[3] = ip[3] & 0;
	}
	cout << "\nNetmask is: ";
	for (j = 0 ; j<4; j++)
	{
		if (j != 3)
			cout << ip[j]<<".";
		else
			cout << ip[j];
	}
cout <<  endl;
return 0;
}
