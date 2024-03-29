#include "Shape.h"

class Square:public Shape
{
	private:
	    int side;
	public:
	void Accept();
	float CalcArea();
	float CalcPeri();
};
	
