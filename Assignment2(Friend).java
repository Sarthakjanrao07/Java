
package sarthak;

#include<iostream>
using namespace std;

class feet_inch; // Forward declaration
class meter_centimeter {
		int mt, cm;

public:
    void accept();
	void show();

    friend meter_centimeteradd(meter_centimeter, feet_inch);
    friend meter_centimeter sub(meter_centimeter, feet_inch);
    friend feet_inch add(feet_inch, meter_centimeter);
    friend feet_inch sub(feet_inch, meter_centimeter);
};

class feet_inch {
	int ft, in;

public:
    void getdata();
	void display();

friend meter_centimeteradd(meter_centimeter, feet_inch);
friend meter_centimeter sub(meter_centimeter, feet_inch);
friend feet_inch add(feet_inch, meter_centimeter);
friend feet_inch sub(feet_inch, meter_centimeter);
};

void meter_centimeter::accept() 
{
    cout << "\n Enter value in meters:";
    cin >> mt;
    cout << "\n Enter value in centimeters:";
    cin >> cm;
}
void meter_centimeter::show()
{
    cout << "\n value in meters:" << mt;
    cout << "\n value in centimeters:" << cm;
}
void feet_inch::getdata()
{
    cout << "\n Enter value in feet:";
    cin >> ft;
    cout << "\n Enter value in inches:";
    cin >> in;
}
void feet_inch::display()
{
    cout << "\n Value in feet:" << ft;
    cout << "\n Value in inches:" << in;
}

meter_centimeter add(meter_centimeter m, feet_inch f) 
{
    meter_centimeter temp;
    float cal;
    cal = m.mt * 100 + m.cm + f.ft * 30.48 + f.in * 2.54;
    int result = cal;
    temp.mt = result / 100;

    temp.cm = result % 100;
    return temp;
}

meter_centimeter sub(meter_centimeter m, feet_inch f)
{
    meter_centimeter temp;
    float cal;
    cal = m.mt * 100 + m.cm - (f.ft * 30.48 + f.in * 2.54);
    int result = cal;
    temp.mt = result / 100;
    temp.cm = result % 100;
    return temp;
}

feet_inch add(feet_inch f, meter_centimeter m) 
{
    feet_inch temp;
    float cal;

    cal = m.mt * 39.37 + m.cm * 0.3937 + f.ft + f.in / 12.0;
    int result = cal;
    temp.ft = result;
    temp.in = (cal - result) * 12;
    return temp;
}

feet_inch sub(feet_inch f, meter_centimeter m)
{
    feet_inch temp;
    float cal;
    cal = m.mt * 39.37 + m.cm * 0.3937 - (f.ft + f.in / 12.0);

    int result = cal;
    temp.ft = result;
    temp.in = (cal - result) * 12;
    return temp;
}

int main() 
{
    int ch;
    meter_centimeter m1, m2;
    feet_inch f1, f2;

    m1.accept();
    m1.show();
    f1.getdata();
    f1.display();

    do {
        cout << "\n 1.Addition in meter_centimeter";
        cout << "\n 2.Subtraction in meter_centimeter";
        cout << "\n 3.Addition in feet_inch";
        cout << "\n 4.Subtraction in feet_inch";
        cout << "\n 5.Exit";
        cout << "\n Enter your choice:";
        cin >> ch;
            switch (ch) 
            {

                case 1:
                    m2 = add(m1, f1);
                    m2.show();
                    break;
                case 2:
                    m2 = sub(m1, f1);
                    m2.show();
                    break;
                case 3:
                    f2 = add(f1, m1);
                    f2.display();
                    break;
                case 4:
                    f2 = sub(f1, m1);
                    f2.display();
                    break;
                case 5:
                    cout << "\n Successfully Exited........";
                    break;
            }
        }while (ch != 5);
    return 0;
}
