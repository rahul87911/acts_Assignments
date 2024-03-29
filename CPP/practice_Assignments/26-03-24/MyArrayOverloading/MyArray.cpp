#include<iostream>
using namespace std;

class MyArray
{
	private:
		int *p;
		int size;
	public:
	       //constructor
		MyArray(int s)
		{
			size = s;
			p = new int[size];
		}

		//MyArray b(a);  //copy-constructor
	        MyArray(const MyArray& that)
		{
			//Copy size
			this->size = that.size;
			//Create separate memory
			this->p = new int[this->size];
			//Copy contents of memory
			for( int i =0; i < that.size; i++)
			{
				this->p[i] = that.p[i];
			}
		}
		
                //subscript-operator
		int& operator[](int index)
		{
			return p[index];
		}

                //assignment operator
                MyArray& operator=(const MyArray& other)
                {
                  if(this != &other) {
                  delete[] p;
                  size = other.size;
                  p = new int[size];
                  for(int i=0; i< size;++i) {
                  p[i] = other.p[i];
                  }
                }
                return *this;
                }
                
                //equality operator
                bool operator==(const MyArray& other) const
                {
                if(size != other.size) {
                return false;
                }
                for(int i=0 ;i < size; ++i){
                if (p[i] != other.p[i]){
                return false;
                }
                }
                return true;
                }
                
                //inequality operator
                bool operator!=(const MyArray& other) const
                {
                return !(*this==other);
                }
                //destructor		
		~MyArray()
		{
			delete [] p;
		}
};


int main()
{
  MyArray a(2), ar(3) ;
        
        a[0]=100;
        a[1]=200;
        
        ar[0]=50;
        ar[1]=60;
        ar[2]=20;
        
        cout<<"Array 1 == Array 2 result :";
           if(a==ar)
             cout<<"Both are equal !!"<<endl;
           else
             cout<<"Not equal"<<endl;
             
        cout<<"Array 1 != Array 2 result :";
           if(a==ar)
              cout<<"Both are equal !!"<<endl;
           else
              cout<<"Not equal"<<endl;
 
	return 0;
};
