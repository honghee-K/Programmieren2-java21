package WS25.Lek16.stack;


import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
//public class StackVererbung extends ArrayList
//{
//
//    public void push(Object o){
//        super.add(o);
//    }
//
//    public Object pop(){
//        int size = super.size();
//        return super.remove(size-1);
//    }
//
//}

public class StackVererbung implements Stack
{
    ArrayList arrList = new ArrayList<>();
    @Override
    public void push(Object o){
        arrList.add(o);
    }

    @Override
    public Object pop(){
        int size = arrList.size();
        return arrList.remove(size-1);
    }

}
