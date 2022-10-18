// Java program to construct the complex number

class ComplexNumber {

	// variables to hold real and imaginary part of complex
	// number
	int real, image;

	// Constructor which will be used while creating complex
	// number
	public ComplexNumber(int r, int i)
	{
		this.real = r;
		this.image = i;
	}

	// function to print real number
	public void showC()
	{
		System.out.println(this.real + " +i " + this.image);
	}

	// we will implement this function for addition
	public complex add(ComplexNumber, ComplexNumber);
}
