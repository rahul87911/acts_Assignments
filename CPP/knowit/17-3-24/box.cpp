#include<iostream>
using namespace std;

class Book{
	private:
		int length;
		int width;	
		int height;

	public:
		Book(){
			length=0;
			width=0;
			height=0;
	        	}

		void accept()
		{cout<<"Length"<<endl;
			cin>>length;
			cout<<"Bredth"<<endl;
			cin>>width;
			cout<<"Height";
			cin>>height;
		}

		void display()
		{cout<<length<<endl;
			cout<<width<<endl;
			cout<<height;
		}

		int volume(int length, int width, int height)
		{int v=length*width*height;

			return v;
		}
		};

		int main()
		{
                        Book b;                 
		    
                       
			
			return 0;
		}	
		
