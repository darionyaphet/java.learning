package org.darion.yaphet.indexed;

import java.util.Iterator;

/**
 * 
 * @author darion.yaphet
 * 
 */
public class indexedFile implements Iterator<Segment> {

	private long currentPosition = 0;

	public indexedFile(String path) {

	}

	public void append(byte[] value) {

	}

	public byte[] fetch() {
		return null;
	}

	/**
	 * 
	 */
	public void seek(long position) {
		currentPosition = position;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Segment next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		indexedFile file = new indexedFile("");
	}

}
