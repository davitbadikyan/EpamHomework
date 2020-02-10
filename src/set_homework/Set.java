package set_homework;

/**
 * It is an implementation of set interface which stores elements of any type in sorted order
 * @author Davit Badikyan
 * @version 1.0
 * @since 06.02.2020
 */

public interface Set<T extends Comparable> {

    /**
     * Returns the number of elements in this set.
     */

    int getSize();

    /**
     * Adds the specified element to this set if it is not already present
     * (optional operation).  More formally, adds the specified element
     * {@code item} to this set if the set contains no element {@code item2}
     * such that
     * If this set already contains the element, the call leaves the set
     * unchanged and returns {@code false}.  In combination with the
     * restriction on constructors, this ensures that sets never contain
     * duplicate elements.
     * @param item element to be added to this set
     * @return {@code true} if this set did not already contain the specified
     *         element
     */

    boolean add(T item);

    /**
     * Removes the specified element from this set if it is present
     * (optional operation).  More formally, removes an element {@code item}
     * such that, if this set contains such an element.
     * Returns {@code true} if this set
     * contained the element (or equivalently, if this set changed as a
     * result of the call).  (This set will not contain the element once the
     * call returns.)
     *
     * @param item object to be removed from this set, if present
     * @return {@code true} if this set contained the specified element
     */
    boolean remove(T item);

    /**
     * Returns {@code true} if this set contains the specified element.
     * More formally, returns {@code true} if and only if this set
     * contains an element {@code item} such that.
     *
     * @param item element whose presence in this set is to be tested
     * @return {@code true} if this set contains the specified element.
     */

    boolean contains(T item);

}
