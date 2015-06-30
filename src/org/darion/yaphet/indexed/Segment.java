package org.darion.yaphet.indexed;

import java.util.Iterator;

/**
 * 
 * @author darion.yaphet
 * 
 */
public class Segment implements Iterator<Slice> {

	private long start;
	private long end;
	
	

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Slice next() {
		return null;
	}

	@Override
	public void remove() {
	}

}
