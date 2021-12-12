// Oscar Breen - Consonants - Eric, Ari
// APCS pd00
// Lab02
// 2021-12-13

import java.util.ArrayList;

public class OrderedArrayList
{
  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;
  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
_data = new ArrayList<Integer>();
  }

  public String toString()
  {
return _data.toString();
  }

  public boolean remove( int i )
  {
    _data.remove(i);
   return true;

  }

  public int size()
  {
return _data.size();
  }

  public Integer get( int i )
  {
return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
for(int i = 0; i < size(); i++){
    if(_data.get(i) > newVal){
    _data.add(i, newVal);
  }
}
_data.add(newVal);

}
  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
int lst = _data.size;
int fst = _data.get(1);
int mdl = (fst + lst)/2;
int i = 0;
   while(i <= _data.size){
	if( _data[mdl] < newVal){
	fst = mdl +1;
	}
	else if(_data[mdl] == newVal){
	_data.add(mdl , newVal);
	} else { 
	lst = mdl -1;
	}
	mdl = (fst + lst)/2;
	}
}

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
     
  }//end main()

}//end class OrderedArrayList
