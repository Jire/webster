package webster;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class Elements implements List<Element> {

	public static Elements get(List<Element> elements) {
		return new Elements(elements);
	}

	private final List<Element> elements;

	private Elements(List<Element> elements) {
		this.elements = elements;
	}
	
	public Stream<Element> filter(Predicate<Element> predicate) {
		return elements.stream().filter(predicate);
	}
	
	public Element first(Predicate<Element> predicate) {
		return filter(predicate).findFirst().get();
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean isEmpty() {
		return elements.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return elements.contains(o);
	}

	@Override
	public Iterator<Element> iterator() {
		return elements.iterator();
	}

	@Override
	public Object[] toArray() {
		return elements.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return elements.toArray(a);
	}

	@Override
	public boolean add(Element e) {
		return elements.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return elements.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return elements.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Element> c) {
		return elements.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends Element> c) {
		return elements.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return elements.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return elements.retainAll(c);
	}

	@Override
	public void clear() {
		elements.clear();
	}

	@Override
	public Element get(int index) {
		return elements.get(index);
	}

	@Override
	public Element set(int index, Element element) {
		return elements.set(index, element);
	}

	@Override
	public void add(int index, Element element) {
		elements.add(index, element);
	}

	@Override
	public Element remove(int index) {
		return elements.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return elements.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return elements.lastIndexOf(o);
	}

	@Override
	public ListIterator<Element> listIterator() {
		return elements.listIterator();
	}

	@Override
	public ListIterator<Element> listIterator(int index) {
		return elements.listIterator(index);
	}

	@Override
	public List<Element> subList(int fromIndex, int toIndex) {
		return elements.subList(fromIndex, toIndex);
	}

}