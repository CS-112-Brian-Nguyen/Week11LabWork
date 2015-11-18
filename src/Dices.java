public class Dices {
private int Value, average;
public Dices(){
}

private static int OneThrow;
public static int OneThrow(){
OneThrow = 1 + (int) (Math.random() * 6);
return OneThrow;
}

public int getDices(){
return Value;
}

public void Throw(int bounces, int die){
int X = 0;
int Total = 0;
for (int A=1; A <= die; A++) {
for (int Y=1; Y <= bounces; Y++){
X = 1 + (int) (Math.random() * 6);
Total = Total + X;
}
average = Total/bounces;
Value = Total;
}
}

public Dices (int bounces, int die){
int total = 0, sum = 0;
Dices Roll = new Dices();
for (int i = 0; i <= bounces; i++){
Roll.Throw(bounces, die);
total = Roll.Value();
sum = sum + total;
}
average = sum/bounces;
Value = total;
}

public int Value(){
		return Value;
	}
}