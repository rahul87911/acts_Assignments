#include "Rect.h"
#include "Circle.h"
#include "Square.h"
int main()
{
//Shape obj;
Shape *sp = new Rect;


	Shape *s = NULL;
    Rect r;
	Circle c;
	Square sq;
	//Rectanle function
	s = &r; // upcasting
	s->Accept();
    float a= s->CalcArea();
    cout<<"\n Area is ="<<a;
	
	//Circle function
	s = &c; // upcasting
	s->Accept();
    a= s->CalcArea();
    cout<<"\n Area is ="<<a;
	
	//square function
	s=&sq;
	s->Accept();
	a= s->CalcArea();
	cout<<"\n Area is ="<<a; 
	
	return 0;

}
