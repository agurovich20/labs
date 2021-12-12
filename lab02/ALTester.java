//Header in OrderedArrayList
public class ALTester
{
int[] _data =  new int [23];
private int _size;

public ALTester()
{
System.out.print("{ ");
   for(int i=0; i< 23; i++){
    _data[i]  = (int)(Math.random() * 10);
    _size += 1;
    System.out.print(_data[i]+" ");
  }
System.out.println(" }");
}
public boolean check(){
   for(int i=0;  i+2 < _size; i++){
	if(_data[i] < _data[i+1]){
	return false;
	}
  }
 return true;
}

public static void main(String [] args){
ALTester test = new ALTester();
System.out.println(test.check());
}
}
