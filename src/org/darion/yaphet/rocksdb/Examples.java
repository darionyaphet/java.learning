package org.darion.yaphet.rocksdb;

import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

public class Examples {
	public static void main(String[] args) {
		// a static method that loads the RocksDB C++ library.
		RocksDB.loadLibrary();

		// the Options class contains a set of configurable DB options
		// that determines the behavior of a database.
		Options options = new Options().setCreateIfMissing(true);
		RocksDB db = null;

		try {
			// a factory method that returns a RocksDB instance
			db = RocksDB.open(options, "/tmp/db");
		} catch (RocksDBException e) {
		}
	}
}
