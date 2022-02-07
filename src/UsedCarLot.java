/**
 * This class represents a used car lot that documents the cars inside it.
 *
 * @author Dennis Marko
 */
import java.util.ArrayList;
public class UsedCarLot {
    /** The current inventory of the cars inside the lot. */
    private ArrayList<Car> inventory;

    /** Institutes a UsedCarLot object. */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /** Returns the current inventory of the list. */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Adds a new car to the listt.
     *
     * @param newCar The new car being added to the lsit
     */
    public void addCar(Car newCar)
    {
        inventory.add(newCar);
    }

    /**
     * Swaps the positions of the cars in the list.
     *
     * @param firstIdx The index of the first car being selected
     * @param secondIdx The index of the second car being selected
     * @return Returns either true or false depending on if the indexes chosen are available
     */
    public boolean swap(int firstIdx, int secondIdx)
    {
        if (firstIdx < inventory.size() && secondIdx < inventory.size())
        {
            Car car = inventory.get(firstIdx);
            Car car2 = inventory.get(secondIdx);
            inventory.set(firstIdx, car2);
            inventory.set(secondIdx, car);
            return true;
        }
        else
        {
            return false;
        }
    }

    // ADD THESE FOUR NEW METHODS TO UsedCarLot

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */

    /**
    * Adds a car into the list at the index that is specified.
    *<p>
    * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size();
    *
    * @param indexToAdd The index in which the new car is added
    * @param carToAdd The car that is being added into the list.
    */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /**
    *Removes the car from the inventory list and reduces the size of the inventory by one, as well as returning the car that is being sold.
    *<p>
    * PRECONDITION: indexOfCarToSell &lt; inventory.size()
    *
    * @param indexOfCarToSell The index of the car that is being sold
    * @return The car that is being sold
    */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /**
    * Sells the car at the index specified but instead of removing the car and reducing the size of the inventory by one it replaces the empty parking spot with null.
    * <p>
    * PRECONDITION: indexOfCarToSell &lt; inventory.size()
    *
    * @param indexOfCarToSell The index of the car that is being sold
    * @return The car that is being sold
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car newCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return newCar;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */

    /**
    * Moves a car from the index indexOfCarToMove to the destinationIndex, and shifts the other cars according to where the original car is being moved.
    * <p>
    * indexOfCarToMove &lt; inventory.size()
    * destinationIndex &lt; inventory.size()
    *
    * @param indexOfCarToMove The car that is being moved in the list
    * @param destinationIndex The index that the car is being moved to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car car = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, car);
    }

}
