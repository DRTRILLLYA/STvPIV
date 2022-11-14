package task51;

import java.util.ArrayList;

public class Box<T extends Fruit>
{
    float boxWeight;
    ArrayList<T> arrayList = new ArrayList<>();
    void addFruit(T fruit)
    {
        arrayList.add(fruit);

        if (fruit.weigth == 1.5f)
        {
            boxWeight += 1.5f;
        }
        else
        {
            boxWeight += 1f;
        }
    }

    float getWeight()
    {
        return boxWeight;
    }

    public boolean compare(Box box)
    {
        if (boxWeight == box.boxWeight)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void move(Box box1, Box box2, T fruit)
    {
        box2.addFruit(fruit);
        box1.arrayList.remove(box1.arrayList.size());
    }
}
